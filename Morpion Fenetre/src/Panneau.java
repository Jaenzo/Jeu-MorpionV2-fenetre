import java.awt.*;
import javax.swing.*;





public class Panneau extends JPanel { 
	
	
	
  public void paintComponent(Graphics g){
   
    
   
    Font font = new Font("Courrier", Font.PLAIN, 40);
    g.setFont(font);
    g.setColor(Color.red);  
    g.drawString("MORPION", 150, 50);    
   
       
      }               
    }
  