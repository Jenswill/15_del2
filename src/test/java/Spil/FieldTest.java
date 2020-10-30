package Spil;

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
}