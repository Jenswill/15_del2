package Spil;

import Gui.Interface;


public class gameController {

    public static void main(String[] args) {

        Language test = new Language("Danish");

        test.helloWorld();

        Interface.createGui("Mogens", "Preben");
        //Interface.movePlayer();


    }
}
