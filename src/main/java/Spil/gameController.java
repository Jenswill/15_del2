package main.java.Spil;

import main.java.Gui.Interface;

import java.util.Scanner;


public class gameController {
    private static Player playerOne;
    private static Player playerTwo;
    private static Dice diceOne;
    private static Dice diceTwo;

    private static void gameStart() {
        // Opretter navne
        Scanner input = new Scanner(System.in);
        System.out.println("Angiv navnet på spiller 1");
        String nameOne = input.nextLine();
        System.out.println("Angiv navnet på spiller 2");
        String nameTwo = input.nextLine();

        // Opretter players
        playerOne = new Player(nameOne, 0);
        playerTwo = new Player(nameTwo, 0);
    }
    private static void rollDices() {
        diceOne.Roll();
        diceTwo.Roll();
    }

    public static void main(String[] args) {
        Language lang = new Language("Danish");
        lang.helloWorld();
        gameStart();

        Interface.createGui(playerOne.getName(), playerTwo.getName());
        Interface.movePlayer(playerOne.getName(), 0);
        Interface.movePlayer(playerTwo.getName(), 0);
        Interface.displayMessage("Spillet starter nu!");

        while (true) {

        }




        // Eksempler
        //Interface.createGui("Mogens", "Preben");
        //Interface.movePlayer("Mogens", 5);
        //Interface.displayMessage("Hejsa");
        //Interface.setBoardDice(5, 3);
        //Interface.addPlayerBalance("Mogens", 500);




    }
}
