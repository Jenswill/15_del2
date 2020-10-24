package Spil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;


public class Language {
    private String Helloworld;


    public Language(String language){
        // The following code is made by the help of following link
        //https://stackoverflow.com/questions/41628486/java-io-filenotfoundexception-when-creating-fileinputstream
        // Accessed (24.10.2020)
        try {
            FileInputStream input = new FileInputStream("./Language/"+ language +".properties");
            System.out.println(System.getProperty("user.dir"));

            Properties prop = new Properties();
            prop.load(input);
            Helloworld = prop.getProperty("helloworld");
        } catch (FileNotFoundException e){
            System.out.println("Error! File not found");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
    public void helloWorld(){

        System.out.println(Helloworld);
    }
}
