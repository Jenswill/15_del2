package Gui;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;

public class Interface {


    // Definering af variable
    // TODO: Fix adgangen til disser vars
    private static GUI gui;
    private static GUI_Field[] fields;
    private static GUI_Player player1;
    private static GUI_Player player2;

    /**
     * Laver laver et gui element
     * @param namePlayer1 Navnet af spiller 1
     * @param namePlayer2 Navnet af spiller 2
     */
    public static void createGui(String namePlayer1, String namePlayer2) {

        // Opretter fields der skal bruges i spillet.

        fieldContructor contruct = new fieldContructor();
        fields = contruct.Construct();

        // Opretter gui elementet
        gui = new GUI(fields, Color.WHITE);
        gui.setChanceCard("Velkommen til raffelspil");


        //Opretter spillere til spillet
        GUI_Car car = new GUI_Car();
        car.setPrimaryColor(Color.BLUE);
        player1 = new GUI_Player(namePlayer1,0, car);
        GUI_Car car2 = new GUI_Car();
        car2.setPrimaryColor(Color.YELLOW);
        player2 = new GUI_Player(namePlayer2,0, car2);

        // Implementere spillet
        gui.addPlayer(player1);
        gui.addPlayer(player2);

    }
    public static void movePlayer(String playerName, int playerPos){

        fields[2].setCar(player1, true);
        fields[2].setCar(player2, true);

    }

}
