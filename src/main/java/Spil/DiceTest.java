package java.Spil;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @RepeatedTest(100)
    void roll() {
        Dice dice_one = new Dice(6);
        Dice dice_two = new Dice(6);
        int a = 100000; // antal gange vi slår med de to terninger
        int[] slag = new int[a];
        int[] hyppighed = new int[10];

        for(int i=0; i<a;i++) {
            slag[i] = dice_one.Roll() + dice_two.Roll();
            switch(slag[i]){
                case 2: hyppighed[0]++;
                case 3: hyppighed[1]++;
                case 4: hyppighed[2]++;
                case 5: hyppighed[3]++;
                case 6: hyppighed[4]++;
                case 7: hyppighed[5]++;
                case 8: hyppighed[6]++;
                case 9: hyppighed[7]++;
                case 10: hyppighed[8]++;
                case 11: hyppighed[9]++;
                case 12: hyppighed[10]++;
            }
        }
        // Først udregnes den virtuelle ternings sigma:
        //Her udregnes sandsynlighederne for alle mulige antal viste øjne
        double[] p = new double[hyppighed.length];
        for(int i=0; i<= hyppighed.length;i++){
            p[i] = (double) hyppighed[i]/a;
        }
        // Nu udregnes 'the expecte value', mu
        double mu = 0.00;
        for(int i=0; i<=hyppighed.length;i++){
            mu += (i+2) * p[i];
        }
        // Nu udregnes sigma^2
        double sigma = 0.00;
        for(int i = 0; i<= hyppighed.length;i++){
            sigma += Math.pow(i+2 - mu,2) * p[i];
        }
        sigma = Math.sqrt(sigma); // her omregnes det til sigma

        // Så udregnes den teoretiske sigma.
        // Nu udregnes sandsynlighederne for alle mulige antal viste øjne;

        double[] px = new double[10];
        for(int i=2; i<=7;i++){
            px[i-2] = (double) (i-1)/36;
        }
        for(int i=1; i<=5;i++){
            px[i+5]= (double) (6-i)/36;
        }
        double muT = 0.00;
        // Nu udregnes 'the expecte value', muT
        for(int i=0; i<=px.length;i++){
            muT += (i+2) * px[i];
        }
        double sigmaT = 0.00;
        // Nu udregnes sigma^2
        for (int i =0; i<=px.length;i++){
            sigmaT += Math.pow(i+2 - muT,2) * px[i];
        }
        sigmaT = Math.sqrt(sigmaT); //Her udregnes sigma

        //nu sammenlignes de to sigma og mu
        double afvigelseMu = Math.abs(muT-mu)/muT;
        double afvigelseSigma = Math.abs(sigmaT-sigma)/sigmaT;

        assertTrue(afvigelseSigma < 0.05 && afvigelseMu < 0.05);




    }

    @Test
    void getValue() {
    }
}