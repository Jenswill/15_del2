package Gui;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.util.Scanner;

public class Interface {

    // Nedenstående koder er fra:
    // CDIO1, af os, gruppe 15.
    // Definering af variable
    // TODO: Fix adgangen til disser vars
    private static String p_one;
    private static String p_two;
    private static GUI gui;
    private static GUI_Field[] fields;
    private static GUI_Player player1;
    private static GUI_Player player2;

    public Interface() {
        //Presets
        Scanner input = new Scanner(System.in);


        System.out.println("Angiv navnet på spiller 1");

        p_one = input.nextLine();

        System.out.println("Angiv navnet på spiller 2");

        p_two = input.nextLine();
    }
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

}
