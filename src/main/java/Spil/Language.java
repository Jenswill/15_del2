package main.java.Spil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Language {
   private String welcome;


    public Language(String language){
        // The following code is made by the help of following link
        //https://stackoverflow.com/questions/41628486/java-io-filenotfoundexception-when-creating-fileinputstream
        // Accessed (26.10.2020)
        try {
            FileInputStream input = new FileInputStream("./Languages/"+ language +".properties");


            Properties prop = new Properties();
            prop.load(input);
            welcome = prop.getProperty("welcome");

        } catch (FileNotFoundException e){

        } catch (IOException e){

        }

    }

    public String getWelcome() {
        return welcome;
    }
}

