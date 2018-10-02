package vue1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gerant {
	public static JTextField rech = new JTextField("recherche");

	public static JFrame fr = new JFrame();
	public static JPanel cont = new JPanel();
	JMenu ge = new JMenu("Gestionnaire Des Employes");
	static JMenuItem af = new JMenuItem("Afficher");
	public static JMenuItem maj = new JMenuItem("Mise A Jour");
	
	JMenu ga = new JMenu("Gestionnaire Des Adherant");
	public static JMenuItem af1 = new JMenuItem("Afficher");
	public static JMenuItem maj1 = new JMenuItem("Mise A Jour");
	
	JMenu gl = new JMenu("Gestionnaire Des Livres");
    JMenu af2 = new JMenu("Afficher..");
	public static JMenuItem d = new JMenuItem("livres disponibles");
	public static JMenuItem r = new JMenuItem("livres reserves");
	public static JMenuItem maj2 = new JMenuItem("Mise A Jour");
	
	public static JMenuItem nom = new JMenuItem("Par nom du livre");
	public static JMenuItem ecrivain = new JMenuItem("Par ecrivain");
	JMenu nature = new JMenu("Par la nature du livre");
	public static JMenuItem nature1 = new JMenuItem("Roman");
	public static JMenuItem nature2 = new JMenuItem("livre scientifique");
	public static JMenuItem nature3 = new JMenuItem("dictionnaire");
	public static JMenuItem nomA = new JMenuItem("par son nom");
	public static JMenuItem nomE = new JMenuItem("par son nom");
public static JButton b =new JButton("log out");
	public Gerant() {
		;
		fr.setLayout(new BorderLayout());

		JLabel background = new JLabel(new ImageIcon("view03.png"));

		cont.add(background);
		background.setLayout(new FlowLayout());
		JMenuBar menuBar = new JMenuBar();

		fr.setJMenuBar(menuBar);

		ge.setBackground(Color.LIGHT_GRAY);

		menuBar.add(ge);
		ge.add(af);
		ge.add(maj);

		menuBar.add(ga);

		ga.add(af1);
		ga.add(maj1);

		menuBar.add(gl);

		gl.add(af2);
		af2.add(d);
		af2.add(r);

		gl.add(maj2);
		
		menuBar.add(rech);
		JMenu recherche = new JMenu("Recherche?");
		menuBar.add(recherche);
		menuBar.add(b);
		JMenu livre = new JMenu("Livre");
		recherche.add(livre);

		livre.add(nom);
        livre.add(ecrivain);
		livre.add(nature);
		nature.add(nature1);
		nature.add(nature2);
		nature.add(nature3);


		JMenu employe = new JMenu("Employe");

		recherche.add(employe);
		employe.add(nomE);
		JMenu adherant = new JMenu("Adherant");
		recherche.add(adherant);
		adherant.add(nomA);
		fr.setSize(750, 600);
		fr.setTitle("Gestion de Bibliotheque");
		fr.setContentPane(cont);
		fr.setVisible(true);

	}

	public static JButton getB() {
		return b;
	}

	public static void setB(JButton b) {
		Gerant.b = b;
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

	public static JMenuItem getNom() {
		return nom;
	}

	public static JMenuItem getD() {
		return d;
	}

	public static void setD(JMenuItem d) {
		Gerant.d = d;
	}

	public static JMenuItem getR() {
		return r;
	}

	public static void setR(JMenuItem r) {
		Gerant.r = r;
	}



	public static JMenuItem getMaj() {
		return maj;
	}

	public static void setMaj(JMenuItem maj) {
		Gerant.maj = maj;
	}

	public static JMenuItem getAf1() {
		return af1;
	}

	public static void setAf1(JMenuItem af1) {
		Gerant.af1 = af1;
	}

	public static JMenuItem getAf() {
		return af;
	}

	public static void setAf(JMenuItem a1) {
		Gerant.af = af;
	}

	

	public static JMenuItem getMaj1() {
		return maj1;
	}

	public static void setMaj1(JMenuItem maj1) {
		Gerant.maj1 = maj1;
	}





	public static JMenuItem getMaj2() {
		return maj2;
	}

	public static void setMaj2(JMenuItem maj2) {
		Gerant.maj2 = maj2;
	}

	public static JMenuItem getNature1() {
		return nature1;
	}

	public static void setNature1(JMenuItem nature1) {
		Gerant.nature1 = nature1;
	}

	public static JMenuItem getNature2() {
		return nature2;
	}

	public static void setNature2(JMenuItem nature2) {
		Gerant.nature2 = nature2;
	}

	public static JMenuItem getNature3() {
		return nature3;
	}

	public static void setNature3(JMenuItem nature3) {
		Gerant.nature3 = nature3;
	}

	public static JMenuItem getNomA() {
		return nomA;
	}

	public static void setNomA(JMenuItem nomA) {
		Gerant.nomA = nomA;
	}

	public static JMenuItem getNomE() {
		return nomE;
	}

	public static void setNomE(JMenuItem nomE) {
		Gerant.nomE = nomE;
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

	public static void main(String[] argv) {
		new Gerant();
	}
}
