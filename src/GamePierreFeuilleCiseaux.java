import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class GamePierreFeuilleCiseaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] symbole = {"P", "F", "C"};
            String computerMove = symbole[new Random().nextInt(symbole.length)];

            String playermove;

            while (true) {
                System.out.println("entre ton choix : P:pierre / F:feuille / C:Ciseaux");

                playermove = scanner.nextLine();
                if (playermove.equals("P") || playermove.equals("F") || playermove.equals("C")) {
                    break; //sorti
                }
                System.out.println(playermove + " est pas un choix valide");
            }
            System.out.println("La machine a choisie : " + computerMove);


            if (playermove.equals(computerMove)) {
                System.out.println("Égalité !");
            } else if (playermove.equals("P")) {
                if (computerMove.equals("F")) {
                    System.out.println("Perdu !");
                } else if (computerMove.equals("C")) {
                    System.out.println("Gagné !");
                }
            } else if (playermove.equals("F")) {
                if (computerMove.equals("C")) {
                    System.out.println("Perdu !");
                } else if (computerMove.equals("P")) {
                    System.out.println("Gagné !");
                }
            } else if (playermove.equals("C")) {
                if (computerMove.equals("P")) {
                    System.out.println("Perdu !");
                } else if (computerMove.equals("F")) {
                    System.out.println("Gagné !");
                }
            }
            System.out.println("Veux-tu encore jouer ? (Oui/Non)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("Oui")){
                break;
            }
            scanner.close();
        }
    }
}
