package vue1;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class Adherant {
	public static JTextField rech = new JTextField("recherche");

	public static JFrame fr = new JFrame();
	public static JPanel cont = new JPanel();
	public static JMenuItem present1 = new JMenuItem("Present");
	public static JMenuItem emprunte1= new JMenuItem("Emprunte");
	public static JMenuItem nom = new JMenuItem("Par titre du livre");
	public static JMenuItem ecrivain= new JMenuItem("Par ecrivain");
	public static JMenu nature = new JMenu("Par la nature du livre");
	public static JMenuItem nature1 = new JMenuItem("Roman");
	public static JMenuItem nature2 = new JMenuItem("livre scientifique");
	public static JMenuItem nature3 = new JMenuItem("dictionnaire");
	public static JButton b1=new JButton("log out");
	public static JButton getB1() {
		return b1;
	}



	public static void setB1(JButton b1) {
		Adherant.b1 = b1;
	}

	public static JButton b=new JButton("mes prets");
	
	public Adherant() throws HeadlessException, IOException {
	
		fr.setLayout(new BorderLayout());

		JLabel background = new JLabel(new ImageIcon("view03.png"));
		
		cont.add(background);
		background.setLayout(new FlowLayout());
		JMenuBar menuBar = new JMenuBar();

		fr.setJMenuBar(menuBar);

		JMenu mnLivre = new JMenu("Livre");
		mnLivre.setBackground(Color.LIGHT_GRAY);
		mnLivre.setFont(new Font("Verdana", Font.PLAIN, 16));
		menuBar.add(mnLivre);

		
		present1.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre.add(present1);

		
		emprunte1.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre.add(emprunte1);
        menuBar.add(b);
		/*JMenu m = new JMenu("_____________");
		m.setBackground(Color.LIGHT_GRAY);
		m.setFont(new Font("Verdana", Font.PLAIN, 16));
		m.setForeground(Color.LIGHT_GRAY);
		menuBar.add(m);
		*/
		
		menuBar.add(rech);
		
		JMenu recherche = new JMenu("Recherche?");
		menuBar.add(recherche);
		nom.setFont(new Font("Verdana", Font.PLAIN, 14));
		recherche.add(nom);
		nature.setFont(new Font("Verdana", Font.PLAIN, 14));
		recherche.add(nature);
		nature.add(nature1);
		nature.add(nature2);
		nature.add(nature3);
		ecrivain.setFont(new Font("Verdana", Font.PLAIN, 14));
		recherche.add(ecrivain);
		menuBar.add(b1);
		
	
		fr.setSize(750, 600);
		fr.setTitle("Gestion de Bibliotheque");
		fr.setContentPane(cont);
		fr.setVisible(true);

	}

	

	public static JMenuItem getNature1() {
		return nature1;
	}

	public static void setNature1(JMenuItem nature1) {
		Adherant.nature1 = nature1;
	}

	public static JMenuItem getNature2() {
		return nature2;
	}

	public static void setNature2(JMenuItem nature2) {
		Adherant.nature2 = nature2;
	}

	public static JMenuItem getNature3() {
		return nature3;
	}

	public static void setNature3(JMenuItem nature3) {
		Adherant.nature3 = nature3;
	}

	public static JButton getB() {
		return b;
	}

	public static void setB(JButton b) {
		Adherant.b = b;
	}

	public static JFrame getFr() {
		return fr;
	}

	public static void setFr(JFrame fr) {
		Adherant.fr = fr;
	}

	public static JPanel getCont() {
		return cont;
	}

	public static void setCont(JPanel cont) {
		Adherant.cont = cont;
	}

	public static JMenuItem getPresent() {
		return present1;
	}

	public static void setPresent(JMenuItem present) {
		Adherant.present1 = present;
	}

	public static JMenuItem getEmprunte() {
		return emprunte1;
	}

	public static void setEmprunte(JMenuItem emprunte) {
		Adherant.emprunte1 = emprunte;
	}
	

	public static JMenuItem getNom() {
		return nom;
	}

	public static void setNom(JMenuItem nom) {
		Adherant.nom = nom;
	}

	public static JMenuItem getEcrivain() {
		return ecrivain;
	}

	public static void setEcrivain(JMenuItem ecrivain) {
		Adherant.ecrivain = ecrivain;
	}

	public static JMenuItem getNature() {
		return nature1;
	}

	public static void setNature(JMenuItem nature1) {
		Adherant.nature1 = nature1;
	}

	public static String getRech() {
		return rech.getText();
	}

	public static void setRech(JTextField rech) {
		Adherant.rech = rech;
	}

}
