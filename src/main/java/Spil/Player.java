package Spil;
// Nedenstående koder er en modificeret udgave, med udgangspunkt i:
// CDIO1, af os, gruppe 15.

public class Player {
    private String name;
    private int money = 0;

    public Player(String n, int p){
        name = n;
        money = p;
    }
    // Definerer spillerens navn
    public void setName(String p_name){
        name = p_name;
    }

    // Tilføjer penge til nuværende point
    public void addPoint(int p_money){
        money += p_money; if(money < 0){money = 0;}
    }

    // Retunerer navn
    public String getName(){
        return name;
    }

    // Retunerer antal penge spilleren har
    public int getMoney(){
        return money;
    }
}
