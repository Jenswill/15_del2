package main.java.Spil;

import main.java.Gui.Interface;
import main.java.Spil.Field;

import java.util.Scanner;




public class gameController {
    private static Player playerOne;
    private static Player playerTwo;
    private static Dice diceOne;
    private static Dice diceTwo;
    private static Player[] playerList;
    private static Field[] fieldList= new Field[11];
    private static String stringLang;

    private static void gameStart() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a language, (english, danish)");
        stringLang = input.nextLine();

        // Opretter navne

        System.out.println("Angiv navnet på spiller 1");
        String nameOne = input.nextLine();
        // TODO: Tilføj logik til afvise ens navne
        System.out.println("Angiv navnet på spiller 2");
        String nameTwo = input.nextLine();

        // Opretter players
        playerOne = new Player(nameOne, 0);
        playerTwo = new Player(nameTwo, 0);

        // Opretter dices
        diceOne = new Dice(1);
        diceTwo = new Dice(1);

        // Opretter player List
        playerList = new Player[]{playerOne,playerTwo};

    }
    private static int rollDices() {
        int val1 = diceOne.Roll();
        int val2 = diceTwo.Roll();
        return val1+val2;
    }

    private static void generateFieldArray() {
        String[] fieldNameArray = new String[]{"Tower", "Crater", "PalaceGates", "ColdDesert", "WalledCity", "Monastery", "BlackCave", "HutsInTheMountain", "TheWerewall", "ThePit","Goldmine"};
        for (int i = 0; i < fieldNameArray.length; i++) {
            Field tempField = new Field(fieldNameArray[i], stringLang);
            fieldList[i] = tempField;
        }
    }

    public static void main(String[] args) {
        Language lang = new Language(stringLang);
        lang.helloWorld();
        gameStart();
        generateFieldArray();

        Interface.createGui(playerOne.getName(), playerTwo.getName());
        Interface.movePlayer(playerOne.getName(), 0);
        Interface.movePlayer(playerTwo.getName(), 0);
        Interface.displayMessage("Spillet starter nu!");

        int rollVal;
        while (true) {
            for (int i = 0; i < 2; i++) {
                Interface.movePlayer(playerList[i].getName(), 0);
                Interface.displayMessage("Det er spiller "+ playerList[i].getName() +" tur!");
                rollVal = rollDices();
                Interface.movePlayer(playerList[i].getName(), rollVal-1);
                System.out.println(fieldList[rollVal-2].getFieldPoints());
                Interface.setBoardDice(diceOne.getValue(),diceTwo.getValue());
                Interface.displayMessage("Spiller "+ playerList[i].getName() +" rullede: "+rollVal);

            }
        }




        // Eksempler
        //Interface.createGui("Mogens", "Preben");
        //Interface.movePlayer("Mogens", 5);
        //Interface.displayMessage("Hejsa");
        //Interface.setBoardDice(5, 3);
        //Interface.addPlayerBalance("Mogens", 500);




    }
}
