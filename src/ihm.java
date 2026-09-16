import clavier.In;

import java.text.DecimalFormat;

public class ihm {
    public static void main(String[] args) {
        // Initialisation des variables notes
        float noteCulture = 0;
        float noteAnglais = 0;
        float noteMaths = 0;
        float noteEtude = 0;
        float noteExploitation = 0;
        float noteValorisation = 0;
        float noteLv = 0;

        // Initialisation des variables coefficient
        int coefCulture = 2;
        int coefAnglais = 3;
        int coefMaths = 2;
        int coefEtude = 4;
        int coefExploitation = 3;
        int coefValorisation = 7;
        int coefPro = coefValorisation + coefExploitation + coefEtude;
        int coefTotal = (coefCulture + coefAnglais + coefMaths + coefEtude + coefExploitation + coefValorisation);

        // Initialisation des variables min & max
        int pointsMin = (coefTotal * 10);
        int pointsMax = (coefTotal * 20);

        // Initialisation des strings
        char lV = 0;

        // Initialisation des variables rattrapges ratrap = Choix de la matière ; repTrap = notes rattrapages
        char raTrap1 = 0;
        char raTrap2 = 0;
        float repAng = 0;
        float repCult = 0;
        float repMath = 0;

        // Initialisation du DecimalFormat
        DecimalFormat monFormat = new DecimalFormat("00.00");


        // Demande des notes
        System.out.print("Votre note en Culture Générale :\t");
        noteCulture = In.readFloat();
        System.out.print("Votre note en Anglais :\t");
        noteAnglais = In.readFloat();
        System.out.print("Votre note en Mathématiques :\t");
        noteMaths = In.readFloat();
        System.out.print("Votre note en Étude et Conception de réseaux informatiques :\t");
        noteEtude = In.readFloat();
        System.out.print("Votre note en Exploitation et maintenance des réseaux informatiques :\t");
        noteExploitation = In.readFloat();
        System.out.print("Votre note en Valorisation de la donnée et cybersécurité :\t");
        noteValorisation = In.readFloat();
        System.out.println("Avez-vous choisi une Langue vivante ?: y / n");
        lV = In.readChar();
        if ((lV == 'y') || (lV == 'Y')) {
            System.out.print("Votre note en Langue vivante :\t");
            noteLv = In.readFloat();
        }

        // Initialisation des Totaux & calculs
        float pointsTotaux, moyenneTotal;
        pointsTotaux = ((noteCulture * coefCulture) + (noteAnglais * coefAnglais) + (noteMaths * coefMaths) + (noteEtude * coefEtude) + (noteExploitation * coefExploitation) + (noteValorisation * coefValorisation));
        if (noteLv > 10) {
            pointsTotaux += (noteLv - 10);
        }
        moyenneTotal = pointsTotaux / coefTotal;

        // Descriptions
        System.out.println("\t|Épreuve" + "\t\t\t\t|Durée" + "\t\t\t\t\t\t|Coefficient" + "\t\t|Type d'épreuve" + "\t\t|Notes");
        System.out.println("_".repeat(140));

        // Culture Générale
        System.out.println("\tCulture générale et" + "\t\t4 heures" + "\t\t\t\t\t" + coefCulture + "\t\t\t\t\t\tÉcrit" + "\t\t\tVotre note : " + noteCulture);
        System.out.println("\t\texpression\n");
        System.out.println(".".repeat(140));

        // Anglais
        System.out.println("\t\tAnglais" + "\t\t\t\tCompréhension :" + "\t\t\t\t" + coefAnglais + "\t\t\t\t\t\tCCF" + "\t\t\t\tVotre note : " + noteAnglais);
        System.out.println("\t\t\t\t\t" + "\t\t30 min sans préparation\t\t" + "\t\t" + "\t\t\t2 situations");
        System.out.println("\t\t\t\t\t" + "\t\tExpression :" + "\t\t\t\t" + "\t\t\t\t\t");
        System.out.println("\t\t\t\t\t" + "\t\t15 min sans préparation" + "\t\t\t\t" + "\t\t\t\t\t\t\n");
        System.out.println(".".repeat(140));
        // Mathématiques
        System.out.println("\tMathématiques" + "\t\t\t1 heures par CCF" + "\t\t\t" + coefMaths + "\t\t\t\t\t\tCCF" + "\t\t\t\tVotre note : " + noteMaths);
        System.out.println("\t\t\t\t\t" + "\t\t" + "\t\t\t\t\t\t\t\t\t" + "\t\t\t2 situations\n");
        System.out.println(".".repeat(140));

        // Étude & Conception de réseaux informatiques
        System.out.println("\tÉtude et conception" + "\t\t6 heures" + "\t\t\t\t\t" + coefEtude + "\t\t\t\t\t\tÉcrit" + "\t\t\tVotre note : " + noteEtude);
        System.out.println("\tde réseaux\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t");
        System.out.println("\tinformatiques\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t\n");
        System.out.println(".".repeat(140));

        // Exploitation & Maintenance des réseaux
        System.out.println("\tExploitation et" + "\t\t\t\t\t\t" + "\t\t\t\t" + coefExploitation + "\t\t\t\t\t\tCCF" + "\t\t\t\tVotre note : " + noteExploitation);
        System.out.println("\tmaintenance des\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t");
        System.out.println("\tréseaux\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t\n");
        System.out.println(".".repeat(140));

        // Valorisation de la donnée & Cybersécurité
        System.out.println("\tValorisation de la\t" + "\t1 heures\t" + "\t\t\t\t" + coefValorisation + "\t\t\t\t\t\tOral" + "\t\t\tVotre note : " + noteValorisation);
        System.out.println("\tdonnée et\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t");
        System.out.println("\tcybersécurité\t\t\t" + "\t\t" + "\t\t\t\t" + "\t\t\t\t\t\n");
        System.out.println(".".repeat(140));

        // Langue Vivante
        System.out.println("\tLangue vivante" + "\t\t\t15 minutes" + "\t\t\t\t\tPoint au" + "\t\t\t\tOral" + "\t\t\tVotre note : " + noteLv);
        System.out.println("\tfacultative" + "\t\t\t\t\t\t" + "\t\t\t\t\tdessus de 10");
        System.out.println("=".repeat(140));

        // Calcul moyenne pro pour la gestion des mentions
        float moyennePro = (((noteEtude * coefEtude) + (noteExploitation * coefExploitation) + (noteValorisation * coefValorisation)) / coefPro);


        // Coefficient total, Points minimaux & Points totaux
        System.out.println("\t|Points minimums" + "\t\t|Coefficient Total" + "\t\t\t|Points Maximums" + "\t\t" + "|Points Totaux" + "\t\t|Moyenne de l'étudiant");
        System.out.println("\t " + pointsMin + "\t\t\t\t\t " + coefTotal + "\t\t\t\t\t\t\t " + pointsMax + "\t\t\t\t\t " + monFormat.format(pointsTotaux) + "\t\t\t\t " + monFormat.format(moyenneTotal));
        System.out.println("Moyenne Pro : " + moyennePro);

        // Gestion des mentions
        if (moyenneTotal >= 16) {
            System.out.println("Vous avez votre BTS CIEL, mention très bien !");
        } else if (moyenneTotal >= 14) {
            System.out.println("Vous avez votre BTS CIEL, mention bien !");
        } else if (moyenneTotal >= 12) {
            System.out.println("Vous avez votre BTS CIEL, mention assez bien !");
        } else if (moyenneTotal >= 10) {
            System.out.println("Vous avez votre BTS CIEL, sans mention");
        } else if ((moyennePro >= 10) && (moyenneTotal >= 8)) {
            System.out.println("Vous allez au rattrapage, choisissez 2 matières parmis ces 3: \nAnglais\nCulture Générale\nMathématiques");


            // Demande pour l'Anglais
            System.out.println("Avez-vous choisi le rattrapage de Culture Générale ? : y / n");
            raTrap1 = In.readChar();

            // Boucle note rattrapage Anglais
            if ((raTrap1 == 'y') || (raTrap1 == 'Y')) {
                System.out.println("Saisissez votre nouvelle note de Culture Générale : ");
                noteCulture = In.readFloat();
                if (repAng > noteAnglais) {
                    noteAnglais = repAng;
                }
            }

            // Demande pour la culture générale
            System.out.println("Avez-vous choisi le rattrapage de Culture Générale ? : y / n");
            raTrap2 = In.readChar();

            // Boucle note rattrapage Culture G
            if ((raTrap2 == 'y') || (raTrap2 == 'Y')) {
                System.out.println("Saisissez votre nouvelle note de Culture Générale : ");
                noteCulture = In.readFloat();
                if (repCult > noteCulture) {
                    noteCulture = repCult;
                }
            }
            // Demande pour les Maths, avec omission de cette partie si Anglais et Culture G. ont été choisi
            if (!((raTrap1 == 'y') || (raTrap1 == 'Y') && (raTrap2 == 'y') || (raTrap2 == 'Y'))) {
                System.out.println("Avez-vous choisi le rattrapage de Mathématiques ? : y / n");
                raTrap1 = In.readChar();
                // Boucle note rattrapage Maths
                if ((raTrap1 == 'y') || (raTrap1 == 'Y')) {
                    System.out.println("Saisissez votre nouvelle note de Mathématiques : ");
                    if (repMath > noteMaths) {
                        noteMaths = repMath;
                    }
                }
            }
            /* Traitement de la première note de rattrapage (Machine à gaz)
            if (ratrap1.equalsIgnoreCase("Anglais")) {
                System.out.print("Votre note de rattrapage en " + ratrap1 + " si elle est supérieur à l'ancienne:");
                noteAnglais = In.readFloat();
            } else if (ratrap1.equalsIgnoreCase("Culture générale")) {
                System.out.print("Votre note de rattrapage en " + ratrap1 + " si elle est supérieur à l'ancienne:");
                noteCulture = In.readFloat();
            } else {
                System.out.print("Votre note de rattrapage en Mathématiques si elle est supérieur à l'ancienne:");
                noteMaths = In.readFloat();
            }

            // Traitement de la deuxième note de rattrapage
            if (ratrap2.equalsIgnoreCase("Anglais")) {
                System.out.print("Votre note de rattrapage en " + ratrap2 + " si elle est supérieur à l'ancienne:");
                noteAnglais = In.readFloat();
            } else if (ratrap2.equalsIgnoreCase("Culture générale")) {
                System.out.print("Votre note de rattrapage en " + ratrap2 + " si elle est supérieur à l'ancienne:");
                noteCulture = In.readFloat();
            } else {
                System.out.print("Votre note de rattrapage en Mathématiques si elle est supérieur à l'ancienne:");
                noteMaths = In.readFloat();
            } */

            // Update post-rattrapage
            pointsTotaux = ((noteCulture * coefCulture) + (noteAnglais * coefAnglais) + (noteMaths * coefMaths) + (noteEtude * coefEtude) + (noteExploitation * coefExploitation) + (noteValorisation * coefValorisation));
            moyenneTotal = pointsTotaux / coefTotal;

            // Affichage de fin post-rattrapage
            System.out.println("Après les rattrapages vous avez: " + pointsTotaux + " points" + "\nAinsi qu'une moyenne générale de: " + monFormat.format(moyenneTotal));
            if (moyenneTotal >= 10) {
                System.out.println("Vous avez votre BTS CIEL !");
            } else {
                System.out.println("Rapprochez-vous de votre professeur afin de réaliser une procédure de redoublement.");
            }
        }


    }


}
