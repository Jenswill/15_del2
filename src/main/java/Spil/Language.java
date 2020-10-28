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
        } catch (FileNotFoundException e){

        } catch (IOException e){

        }

    }
    public void helloWorld(){

        System.out.println(Helloworld);
    }
    public String getFieldName(String name){
        switch (name){
            case "tower":
                return tower;
            case "crater":
                return crater;
            default:
                return "error";
        }
    }
}
