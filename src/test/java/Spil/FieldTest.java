package test.java.Spil;

import main.java.Spil.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {


    Field tårn = new Field("Tower","Danish");
    Field tower = new Field("Tower","English");
    String dkName = tårn.getFieldName();
    String engName = tower.getFieldName();


    @Test
    void Field() {


        assertEquals(engName.equals("Tower"),true);
        assertEquals(tower.getFieldPoints() == 250,true);
        assertEquals(tower.isExtraTurn() == false,true);
        assertEquals(tower.isMovePlayer() == false,true);

        assertEquals(dkName.equals("Tårn"),true);
        assertEquals(tårn.getFieldPoints() == 250,true);
        assertEquals(tårn.isExtraTurn() == false,true);
        assertEquals(tårn.isMovePlayer() == false,true);

    }

    @Test
    void LanguageDK(){
        Field t = new Field("Tower", "Danish");
        assertEquals(t.getFieldName(), "Tårn");

        Field bc = new Field("BlackCave", "Danish");
        assertEquals(bc.getFieldName(), "Mørk Hule");

        Field cd = new Field("ColdDesert", "Danish");
        assertEquals(cd.getFieldName(), "Kold Ørken");

        Field k = new Field("Crater", "Danish");
        assertEquals(k.getFieldName(), "Krater");

        Field GM = new Field("Goldmine", "Danish");
        assertEquals(GM.getFieldName(), "Guldmine");

        Field HITM = new Field("HutsInTheMountain", "Danish");
        assertEquals(HITM.getFieldName(), "Hytter på Bjerget");

        Field M = new Field("Monastery", "Danish");
        assertEquals(M.getFieldName(), "Kloster");

        Field PG = new Field("PalaceGates", "Danish");
        assertEquals(PG.getFieldName(), "Palads Porte");

        Field TP = new Field("ThePit", "Danish");
        assertEquals(TP.getFieldName(), "Hullet");

        Field TWW = new Field("TheWerewall", "Danish");
        assertEquals(TWW.getFieldName(), "Vareulve-muren");

        Field WC = new Field("WalledCity", "Danish");
        assertEquals(WC.getFieldName(), "By med omkringliggende mur");
    }

    @Test
    void LanguageENG(){
        Field t = new Field("Tower", "English");
        assertEquals(t.getFieldName(), "Tower");

        Field bc = new Field("BlackCave", "English");
        assertEquals(bc.getFieldName(), "Black Cave");

        Field cd = new Field("ColdDesert", "English");
        assertEquals(cd.getFieldName(), "Cold Desert");

        Field k = new Field("Crater", "English");
        assertEquals(k.getFieldName(), "Crater");

        Field GM = new Field("Goldmine", "English");
        assertEquals(GM.getFieldName(), "Goldmine");

        Field HITM = new Field("HutsInTheMountain", "English");
        assertEquals(HITM.getFieldName(), "Huts in the Mountain");

        Field M = new Field("Monastery", "English");
        assertEquals(M.getFieldName(), "Monastery");

        Field PG = new Field("PalaceGates", "English");
        assertEquals(PG.getFieldName(), "Palace Gates");

        Field TP = new Field("ThePit", "English");
        assertEquals(TP.getFieldName(), "The Pit");

        Field TWW = new Field("TheWerewall", "English");
        assertEquals(TWW.getFieldName(), "The Werewall");

        Field WC = new Field("WalledCity", "English");
        assertEquals(WC.getFieldName(), "Walled City");
    }

}