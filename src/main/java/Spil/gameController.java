package main.java.Spil;

import main.java.Gui.Interface;

import java.util.Scanner;


public class gameController {
    public void gameStart() {
        // Opretter navne
        Scanner input = new Scanner(System.in);
        System.out.println("Angiv navnet på spiller 1");
        String nameOne = input.nextLine();
        System.out.println("Angiv navnet på spiller 2");
        String nameTwo = input.nextLine();

        // Opretter players
        Player playerOne = new Player(nameOne, 0);
        Player playerTwo = new Player(nameTwo, 0);
    }
    public static void main(String[] args) {

        Language test = new Language("Danish");

        test.helloWorld();

        // Eksempler
        Interface.createGui("Mogens", "Preben");
        Interface.movePlayer("Mogens", 5);
        Interface.displayMessage("Hejsa");
        Interface.setBoardDice(5, 3);
        Interface.addPlayerBalance("Mogens", 500);




    }
}
