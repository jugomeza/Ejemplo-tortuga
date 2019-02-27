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

public class HiloBody extends Thread{
    private Turtle tortuga;

    public HiloBody(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
       this.tortuga.setColor(Color.yellow);
       this.tortuga.setPos(50,50);
        for (int i = 0; i < 5; i++) {
            this.tortuga.forward(20);
            this.tortuga.right(90);
            
        }

    }

    
}
