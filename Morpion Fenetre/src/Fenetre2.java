import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import  javax.swing.*;

public class Fenetre2 extends JFrame implements ActionListener {
	
	JButton bouton[]=new JButton [9];
	Icon iconO = new ImageIcon("O.png");
	Icon iconX = new ImageIcon("X.png");
	int carreau[] = new int [9];
	boolean verrou [] = new boolean [9];
	boolean joueur=false;
	
	String messageO = "Le joueur O à vaincu";
	String messageX = "Le joueur X à vaincu";	
	
			
			public Fenetre2(){
			Container c = getContentPane();
			c.setLayout(new GridLayout(3,3));
			this.setTitle("Morp.io");
			this.setSize(500,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			this.setResizable(false);
			
			this.setJMenuBar(new MenuBarre ());
			
			
			
			
			for(int i=0;i<9;i++)
				
			{
				bouton[i]=new JButton();
				bouton[i].addActionListener(this);
				c.add(bouton[i]);	
		    }
							  
		
		}
		

				public void nouveauJeu()
				{
				for(int i=0;i<9;i++)
				{
					verrou[i]=false;
					carreau[i]=0;
					bouton[i].setIcon(null);
				}	
					
				}
				
				public boolean verifie()
			{	
				boolean a=false;
				if(
					(carreau[0]==1 && carreau[1]==1 && carreau[2]==1) ||
					(carreau[0]==2 && carreau[1]==2 && carreau[2]==2) ||
					
					(carreau[3]==1 && carreau[4]==1 && carreau[5]==1) ||
					(carreau[3]==2 && carreau[4]==2 && carreau[5]==2) ||
					
					(carreau[6]==1 && carreau[7]==1 && carreau[8]==1) ||
					(carreau[6]==2 && carreau[7]==2 && carreau[8]==2) ||
					
					(carreau[0]==1 && carreau[3]==1 && carreau[6]==1) ||
					(carreau[0]==2 && carreau[3]==2 && carreau[6]==2) ||
					
					(carreau[1]==1 && carreau[4]==1 && carreau[7]==1) ||
					(carreau[1]==2 && carreau[4]==2 && carreau[7]==2) ||
					
					(carreau[2]==1 && carreau[5]==1 && carreau[8]==1) ||
					(carreau[2]==2 && carreau[5]==2 && carreau[8]==2) ||
					
					(carreau[0]==1 && carreau[4]==1 && carreau[8]==1) ||
					(carreau[0]==2 && carreau[4]==2 && carreau[8]==2) ||
					
					(carreau[2]==1 && carreau[4]==1 && carreau[6]==1) ||
					(carreau[2]==2 && carreau[4]==2 && carreau[6]==2) 
				)
				a = true;
				return a;
			}

			public void actionPerformed(ActionEvent e)
			{
				
				
				
				for(int j=0;j<9;j++)
				if(e.getSource()==bouton[j])
				{
					if(verrou[j]==false)
					{
						verrou[j]=true;
						
						if(joueur==false)
						{
						
						bouton[j].setIcon(iconX);
						carreau[j]=1;
						}
						else 
						{
						
						bouton[j].setIcon(iconO);
						carreau[j]=2;
						}
						if(verifie()==true)
						{	if(joueur==true)
							JOptionPane.showMessageDialog(null,messageO,"Win",JOptionPane.INFORMATION_MESSAGE);
							else
							JOptionPane.showMessageDialog(null,messageX,"Win",JOptionPane.INFORMATION_MESSAGE);
							
							if(JOptionPane.showConfirmDialog(null,"Vous voulez vous rejouer", "Nouvelle Partie", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
							nouveauJeu();
							else
							System.exit(0);
	 					}
						if(verifie()==false && 
						carreau[0]!=0 && carreau[1]!=0 && carreau[2]!=0 && 
						carreau[3]!=0 && carreau[4]!=0 && carreau[5]!=0 && 
						carreau[6]!=0 && carreau[7]!=0 && carreau[8]!=0 )
						{ 
							
							if(JOptionPane.showConfirmDialog(null,"Vous voulez vous rejouer", "Nouvelle Partie", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
							nouveauJeu();
							else
							System.exit(0);}
							
					joueur=!joueur;
					}
					else
					JOptionPane.showMessageDialog(null,"Case invalide","Mauvaise case",JOptionPane.ERROR_MESSAGE);
				
				
				
				
				
				
				
				}
			
			
			
			
			}
			
			
					{
			
		}
	}