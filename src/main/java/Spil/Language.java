package java.Spil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;


public class Language {
    private String Helloworld;
    private String tower;
    private String crater;
    private String PalaceGates;
    private String coldDesert;
    private String WalledCity;
    private String Monastary;
    private String BlackCave;


    public Language(String language){
        // The following code is made by the help of following link
        //https://stackoverflow.com/questions/41628486/java-io-filenotfoundexception-when-creating-fileinputstream
        // Accessed (26.10.2020)
        try {
            FileInputStream input = new FileInputStream("./Languages/"+ language +".properties");


            Properties prop = new Properties();
            prop.load(input);
            Helloworld = prop.getProperty("helloworld");
            tower = prop.getProperty("tower");
            crater = prop.getProperty("Crater");
            PalaceGates = prop.getProperty("PalaceGates");
            coldDesert = prop.getProperty("ColdDesert");
            WalledCity = prop.getProperty("WalledCity");
            Monastary = prop.getProperty("Monastary");
            BlackCave = prop.getProperty("BlackCave");
        } catch (FileNotFoundException e){

        } catch (IOException e){

        }

    }
    public void helloWorld(){

        System.out.println(Helloworld);
    }
    public String getFieldName(String name){
        return switch (name) {
            case "Tower" -> tower;
            case "Crater" -> crater;
            case "PalaceGates" -> PalaceGates;
            case "ColdDesert" -> coldDesert;
            case "WalledCity" -> WalledCity;
            case "Monastary" -> Monastary;
            case "BlackCave" -> BlackCave;
            default -> "error";
        };
    }
}
