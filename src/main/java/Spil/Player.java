package Spil;
// Nedenstående koder er en modificeret udgave, med udgangspunkt i:
// CDIO1, af os, gruppe 15.

public class Player {
    private String name;
    private int money;

    public Player(String n){
        this.name = n;
        this.money = 1000;
    }
    // Definerer spillerens navn
    public void setName(String p_name){
        this.name = p_name;
    }

    // Tilføjer penge til nuværende formue
    public void addMoney(int p_money){
        this.money += p_money; if(this.money < 0){this.money = 0;}
    }

    // Retunerer navn
    public String getName(){
        return this.name;
    }

    // Retunerer antal penge spilleren har
    public int getMoney(){
        return this.money;
    }
}
