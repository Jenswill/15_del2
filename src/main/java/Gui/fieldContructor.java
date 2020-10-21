package Gui;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class fieldContructor {

    public GUI_Field[] Construct() {
        GUI_Field[] fields = new GUI_Field[2];
        GUI_Start infoField = new GUI_Start();
        GUI_Street carField = new GUI_Street();

        // Definere felt information
        infoField.setForeGroundColor(Color.BLACK);
        infoField.setBackGroundColor(Color.WHITE);
        infoField.setTitle("INFO");
        infoField.setSubText("Tryk her");
        infoField.setDescription("Sådan spiller du spillet.\n I toppen af skærmen ses rul knappen, den ruller" +
                " terningen. Hvis tur det er ses i feltet ved siden af info knappen. Den hvis bil er i feltetet," +
                " tur er det.");
        carField.setTitle("tur!");
        carField.setSubText("tur nu!");
        carField.setDescription("Det er denne spillers tur nu.");
        carField.setBackGroundColor(Color.WHITE);
        fields[0] = infoField;
        fields[1] = carField;
        return fields;
    }
}
