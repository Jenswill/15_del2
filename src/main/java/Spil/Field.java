package main.java.Spil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Field {
    private String fieldName;
    private int fieldPoints;
    private boolean extraTurn;
    private boolean movePlayer;

public Field(String name, String language){
    // The following code is made by the help of following link
    //https://stackoverflow.com/questions/41628486/java-io-filenotfoundexception-when-creating-fileinputstream
    // Accessed (26.10.2020)
    try {
        FileInputStream input = new FileInputStream("./Fields/"+ name +".properties");


        Properties prop = new Properties();
        prop.load(input);
        switch (language){
            case "Danish":
                fieldName = prop.getProperty("dkName");
                break;
            case  "English":
                fieldName = prop.getProperty("engName");
                break;
            default: fieldName = "Error!";
        }

        fieldPoints = Integer.parseInt(prop.getProperty("fieldPoints"));
        extraTurn = Boolean.parseBoolean(prop.getProperty("extraTurn"));
        movePlayer = Boolean.parseBoolean(prop.getProperty("movePlayer"));


    } catch (FileNotFoundException e){

    } catch (IOException e){

    }


}

    public boolean isExtraTurn() {
        return extraTurn;
    }

    public boolean isMovePlayer() {
        return movePlayer;
    }

    public int getFieldPoints() {
        return fieldPoints;
    }

    public String getFieldName() {
        return fieldName;
    }
}