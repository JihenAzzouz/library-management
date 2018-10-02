package vue1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hello {
	public static JLabel hello = new JLabel("Bonjour Mr/s vous etes :");
	public static Button b11 = new Button("Le Gerant :)");
	public static Button b12 = new Button("un adherant");
	public static JPanel cont = new JPanel();

	public static JFrame fr = new JFrame();

	public Hello() throws IOException {

		fr.setSize(350, 500);
		fr.setTitle("Gestion de Bibliotheque");
		fr.setLocationRelativeTo(null);
		fr.setLayout(new BorderLayout());
	    JLabel background=new JLabel(new ImageIcon("b1.png"));;
		cont.add(hello);
		cont.add(b11);
		cont.add(b12);
		cont.add(background);
	    background.setLayout(new FlowLayout());
		
		fr.setContentPane(cont);
		fr.setVisible(true);

	}

	public static Button getBouton() {
		return b11;
	}

	public static Button getBouton1() {
		return b12;
	}
	public static void main(String[] argc) throws IOException
	{
		new Hello();
	}

}
