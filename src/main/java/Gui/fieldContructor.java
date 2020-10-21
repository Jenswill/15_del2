package Gui;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class fieldContructor {


    public GUI_Field[] Construct() {

        // Nedenstående koder er fra:
        // CDIO1, af os, gruppe 15.

        // Opretter array af felter fra antal
        GUI_Field[] fields = new GUI_Field[2];

        // Opretter felter af forskellige typer
        GUI_Start infoField = new GUI_Start();
        GUI_Street carField = new GUI_Street();

        // Definere felt information
        infoField.setForeGroundColor(Color.BLACK);
        infoField.setBackGroundColor(Color.WHITE);
        infoField.setTitle("INFO");
        infoField.setSubText("Tryk her");
        infoField.setDescription("Insert description");
        carField.setTitle("tur!");
        carField.setSubText("tur nu!");
        carField.setDescription("Det er denne spillers tur nu.");
        carField.setBackGroundColor(Color.WHITE);
        fields[0] = infoField;
        fields[1] = carField;
        return fields;
    }
}
