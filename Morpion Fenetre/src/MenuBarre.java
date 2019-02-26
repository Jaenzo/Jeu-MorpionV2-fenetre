import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;



public class MenuBarre extends JMenuBar {
	
	private static final String messageAide = ""+
			"Ce programme vous permet de jouer au Morpion \n"+
			"Les joueurs inscrivent tour à tour leur symbole sur une grille\n"+
			"\nLe premier qui parvient à aligner trois de ses symboles horizontalement, verticalement ou en diagonale gagne\n"; 
	
	private static final String messageApd = ""+
	
"Projet d'ISN réalisé par Enzo Jany et Flavien Sabathier\n";
	
	
	public MenuBarre (){
		super();
		
		JMenu option = new JMenu("Option");
		option.setMnemonic(KeyEvent.VK_0);
		JMenuItem Nouveau = new JMenuItem("Nouvelle Partie");
		Nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
		Nouveau.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int k =JOptionPane.showConfirmDialog(null,"Nouvelle Partie ?","Nouvelle partie",JOptionPane.YES_NO_OPTION);
			if (k == JOptionPane.OK_OPTION); 
			
			
		}
	});
			
		option.add(Nouveau);
		JMenuItem quitter = new JMenuItem("Quitter");
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.CTRL_MASK));
		quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		option.add(quitter);
		this.add(option);
		JMenu information = new JMenu("Information");
		JMenuItem regle = new JMenuItem("Regle");
		regle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
		regle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,messageAide,"Regle",JOptionPane.INFORMATION_MESSAGE);
			}
		});	
		information.add(regle);
		JMenuItem apd = new JMenuItem("A propos de ...");
		apd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		apd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,messageApd,"A propos de ...",JOptionPane.INFORMATION_MESSAGE);
			}
		});	
		information.add(apd);
		this.add(information);
	}


			
	
}		