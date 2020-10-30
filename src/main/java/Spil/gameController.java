package Spil;

import Gui.Interface;


public class gameController {

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
