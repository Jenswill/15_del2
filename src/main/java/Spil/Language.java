package main.java.Spil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;


public class Language {
   private String welcome;
   private String giveName1;
   private String giveName2;
   private String playerTurn;
   private String roll;
   private String win;
    public Language(String language){
        // The following code is made by the help of following link
        //https://stackoverflow.com/questions/41628486/java-io-filenotfoundexception-when-creating-fileinputstream
        // Accessed (26.10.2020)
        try {
            FileInputStream input = new FileInputStream("./Languages/"+ language +".properties");


            Properties prop = new Properties();
            prop.load(input);
            welcome = prop.getProperty(welcome);
            giveName1 = prop.getProperty(giveName1);
            giveName2 = prop.getProperty(giveName2);
            playerTurn = prop.getProperty(playerTurn);
            roll = prop.getProperty(roll);
            win = prop.getProperty(win);
        } catch (FileNotFoundException e){

        } catch (IOException e){

        }

    }

    public String getWelcome() {
        return welcome;
    }

    public String getGiveName1() {
        return giveName1;
    }

    public String getGiveName2() {
        return giveName2;
    }

    public String getPlayerTurn() {
        return playerTurn;
    }

    public String getRoll() {
        return roll;
    }

    public String getWin() {
        return win;
    }
}

