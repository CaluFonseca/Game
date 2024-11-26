import java.util.Random;
import java.util.Scanner;

// Indentificação: Cláudio dos Santos Fonseca
// Número aluno: 20240628
// Jogo Pedra, Papel, Tesoura

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir o nome do jogador
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Please enter your name : ");
        String playerName = scanner.nextLine();

        System.out.println("\nHello, " + playerName + "! Let´s start the game.\n");

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            // Pedir ao jogador para jogar
            while (true) {
                System.out.println("Please enter your move (r, p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            // Exibir a jogada do computador
            System.out.println("Computer played: " + computerMove);

            // Determinar vencedor ou perdedor
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if ((playerMove.equals("r") && computerMove.equals("s")) ||
                    (playerMove.equals("p") && computerMove.equals("r")) ||
                    (playerMove.equals("s") && computerMove.equals("p"))) {
                System.out.println("Congratulation, " + playerName + "! You win!");
            } else {
                System.out.println("You lose!");
            }

            // Exibir resultado
            System.out.println("Do you want yo play again? (y/n)");
            String playAgain = scanner.nextLine();

            // Perguntar ao jogador se pretende continuar o jogo
            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Goodbye, " + playerName + "! Thanks for playing!");
                break;
            }
        }
        scanner.close();
    }
}

// Conclusões: Programa simples com jogo de pedra, papel e tesoura. Sem problemas encontrados durante o desenvolvimento no programa!