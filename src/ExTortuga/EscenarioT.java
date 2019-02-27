/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExTortuga;

/**
 *
 * @author dmadero
 */
import ch.aplu.turtle.Turtle;
import java.awt.Color;

public class EscenarioT extends Thread{
    Turtle tortuga1;
    Turtle tortuga;

    public EscenarioT(Turtle tortuga1, Turtle tortuga) {
        this.tortuga1 = tortuga1;
        this.tortuga = tortuga;
    }


    
    
}
