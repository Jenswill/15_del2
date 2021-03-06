package main.java.Spil;

import main.java.Gui.Interface;

import java.util.Scanner;

public class gameController {
    private static Player playerOne;
    private static Player playerTwo;
    private static Dice diceOne;
    private static Dice diceTwo;
    private static Player[] playerList;
    private static Field[] fieldList= new Field[11];
    private static String stringLang;
    private static Language lang;

    private static void gameStart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose language");
        System.out.println("Press 1 for danish. Press 2 for english. Default: english");
        String langInt = input.nextLine();
        switch (langInt) {
            case "1": stringLang="Danish";
                break;
            case "2": stringLang="English";
                break;
            default: stringLang="English";
        }

        lang = new Language(stringLang);
        // Opretter navne

        System.out.println(lang.getGiveName1());
        String nameOne = input.nextLine();
        // TODO: Tilføj logik til afvise ens navne
        System.out.println(lang.getGiveName2());
        String nameTwo = input.nextLine();

        // Opretter players
        playerOne = new Player(nameOne, 1000);
        playerTwo = new Player(nameTwo, 1000);

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


        // Init funktioner
        gameStart();
        generateFieldArray();

        // Opretter gui
        Interface.createGui(playerOne.getName(), playerTwo.getName(), fieldList);
        Interface.movePlayer(playerOne.getName(), 0);
        Interface.movePlayer(playerTwo.getName(), 0);
        Interface.displayMessage(lang.getWelcome());

        int rollVal;
        boolean gameOver = false;

        // Main game loop
        while (true) {
            if (gameOver) {break;}
            for (int i = 0; i < 2; i++) {
                Interface.movePlayer(playerList[i].getName(), 0);
                Interface.displayMessage(playerList[i].getName() +" "+ lang.getPlayerTurn());

                // Håndtere terninger
                rollVal = rollDices();
                Interface.movePlayer(playerList[i].getName(), rollVal-1);
                Interface.setBoardDice(diceOne.getValue(),diceTwo.getValue());

                // Håndtere points
                int points = fieldList[rollVal-2].getFieldPoints();
                playerList[i].addMoney(points);
                Interface.addPlayerBalance(playerList[i].getName(), points);

                Interface.displayMessage(playerList[i].getName() +" "+ lang.getRoll() +" "+rollVal);

                // Håndtere winning criteria
                if (playerList[i].getMoney() >= 3000) {
                    Interface.displayMessage(playerList[i].getName() +" "+ lang.getWin());
                    Interface.displayMessage(lang.getGameOver());
                    gameOver = true;
                    break;
                }

                // Håndtere ekstra tur
                if (fieldList[rollVal-2].isExtraTurn()) {
                    i = 0;
                    Interface.displayMessage(lang.getLandedOn() +" "+ fieldList[9].getFieldName() +" "+ lang.getExtraTur());
                }



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
