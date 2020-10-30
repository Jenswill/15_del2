package main.java.Gui;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;

import java.awt.*;

public class fieldContructor {
    public GUI_Field[] Construct() {


        // Definere felt information

        String[] fieldNameArray = new String[]{"","Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black Cave", "Huts in the mountain", "The Werewall", "The pit","Goldmine"};
        String[] fieldPointArray = new String[]{"","250", "-100", "100", "-20", "180", "0", "-70", "60", "-80", "-50", "650","250","250"};

        // Opretter array af felter fra antal
        GUI_Field[] fields = new GUI_Field[fieldNameArray.length];

        // Opretter start felt
        GUI_Start startField = new GUI_Start("Start", "", "", Color.WHITE, Color.BLACK);
        fields[0] = startField;

        // Looper gennem felterne og opretter dem.
        // Muligvis lav dette om til at læse en .prop eller json fil.
        for (int i = 1; i < fieldNameArray.length; i++) {
            //System.out.println("Building field:"+fieldNameArray[i]+":"+fieldPointArray[i]);
            GUI_Street Field = new GUI_Street();
            Field.setForeGroundColor(Color.BLACK);
            Field.setBackGroundColor(Color.WHITE);
            Field.setTitle(fieldNameArray[i]);
            Field.setSubText(fieldPointArray[i]);
            // Tilføjere ændrigere til fields.
            fields[i] = Field;

        }
        return fields;
    }
}
