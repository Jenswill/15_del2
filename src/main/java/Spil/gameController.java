package Spil;

import Gui.Interface;


public class gameController {

    public static void main(String[] args) {

        String l = "English";
    Language test = new Language(l);
    Language test2 = new Language("Danish");

    test.helloWorld();
    test2.helloWorld();


    }
}
