package java.Spil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Field {
    private String fieldName;
    private int fieldPoints;
    private boolean extraTurn;
    private boolean movePlayer;

public Field(String name, Language language){
    try {
        FileInputStream input = new FileInputStream("./Fields/"+ name +".properties");


        Properties prop = new Properties();
        prop.load(input);
        fieldName = language.getFieldName(name);
        fieldPoints = Integer.parseInt(prop.getProperty("fieldPoints"));
        extraTurn = Boolean.parseBoolean(prop.getProperty("extraTurn"));
        movePlayer = Boolean.parseBoolean(prop.getProperty("movePlayer"));


    } catch (FileNotFoundException e){

    } catch (IOException e){

    }


}


}