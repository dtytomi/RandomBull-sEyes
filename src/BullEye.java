/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author tomix
 */
public class BullEye  extends JPanel {
    
    Random randomNumbers = new Random();
    
   int red = randomNumbers.nextInt(100);
   int blue = randomNumbers.nextInt(130);
   int green = randomNumbers.nextInt(200);
   
   int red2 = randomNumbers.nextInt(200);
   int blue2 = randomNumbers.nextInt(300);
   int green2 = randomNumbers.nextInt(150);
    
    
    Color myColor1 = new Color(red, green, blue);
    Color myColor2 = new Color(red2, green2, blue2);
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        //  bull's eye
            g.setColor(myColor1);
            g.fillOval(10, 10, 240, 240);

            g.setColor(myColor2);
            g.fillOval(30, 30, 200, 200);

            g.setColor(myColor1);
            g.fillOval(55, 55, 150, 150);

            g.setColor(myColor2);
            g.fillOval(80, 80, 100, 100);

            g.setColor(myColor1);
            g.fillOval(105, 105, 50, 50);
    }
    
    
}
