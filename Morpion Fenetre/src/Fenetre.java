import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;
        
public class Fenetre extends JFrame implements ActionListener {

    	
    	
	private Fenetre2 fen;
    public Fenetre()
    {
    	
    	JPanel pan = new JPanel();
		JButton bouton1 = new JButton("Quitter");
		JButton bouton2 = new JButton("Start");
		
    	this.setTitle("Morpion");
    	this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
        this.setContentPane(new Panneau());
        
        this.setLayout(new BorderLayout());
        pan.add(bouton1);
        pan.add(bouton2);
        JPanel panneauBoutons = new JPanel(new GridLayout(0,3));
        panneauBoutons.add(new JLabel(""));
        panneauBoutons.add(pan);
        getContentPane().add(panneauBoutons, BorderLayout.SOUTH);
        
        bouton1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { System.exit(0);}});
   
        
        this.setVisible(true);
		this.setResizable(false);
		
		bouton2.addActionListener(this);
		this.setVisible(true);;
		}
		public void actionPerformed(ActionEvent arg0) {

		this.dispose();
		fen = new Fenetre2();;
		}
		
		
	
		
	    };

		
	
		
	
		
        
        
			
			