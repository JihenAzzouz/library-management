package vue1;

import java.awt.*;

import java.sql.SQLException;

import javax.swing.*;

public class Employe {

	public static JFrame f = new JFrame();
	public static JPanel cont = new JPanel();
	public static JMenuItem present = new JMenuItem("Present");
	public static JMenuItem emprunte = new JMenuItem("Emprunte");
	public static JMenuItem gestion = new JMenuItem("Gestionnaire reservation");
	public static JButton pret = new JButton("afficher les pret");
	public static JButton adherant = new JButton("afficher les adherant");
	public static JButton lo = new JButton("log out");
	public static JButton getLo() {
		return lo;
	}

	public static void setLo(JButton lo) {
		Employe.lo = lo;
	}

	public static JMenuItem nom = new JMenuItem("Par titre");
	public static JMenuItem ecrivain = new JMenuItem("Par ecrivain");
	public static JMenu nature = new JMenu("Par la nature du livre");
	public static JMenuItem nature1 = new JMenuItem("Roman");
	public static JMenuItem nature2 = new JMenuItem("livre scientifique");
	public static JMenuItem nature3 = new JMenuItem("dictionnaire");
	public static JMenuItem nomA = new JMenuItem("par son nom");
	public static JMenuItem gestion1 = new JMenuItem("gestion des livres");

	public static JMenuItem getAjout() {
		return gestion;
	}

	public static JButton getPret() {
		return pret;
	}

	public static void setPret(JButton pret) {
		Employe.pret = pret;
	}

	public static JMenuItem getNature2() {
		return nature2;
	}

	public static void setNature2(JMenuItem nature2) {
		Employe.nature2 = nature2;
	}

	public static JMenuItem getNature3() {
		return nature3;
	}

	public static JMenuItem getGestion1() {
		return gestion1;
	}

	public static void setGestion1(JMenuItem gestion1) {
		Employe.gestion1 = gestion1;
	}

	public static void setNature3(JMenuItem nature3) {
		Employe.nature3 = nature3;
	}

	public static JMenuItem getNomA() {
		return nomA;
	}

	public static void setNomA(JMenuItem nomA) {
		Employe.nomA = nomA;
	}



	public static JButton getAdherant() {
		return adherant;
	}

	public static void setAdherant(JButton adherant) {
		Employe.adherant = adherant;
	}

	public static void setAjout(JMenuItem ajout) {
		Employe.gestion = ajout;
	}

	public static JTextField rech1 = new JTextField();
	public static JButton btnRechercher1 = new JButton("Rechercher");

	public static JMenuItem getNom() {
		return nom;
	}

	public static void setNom(JMenuItem nom) {
		Employe.nom = nom;
	}

	public static JMenuItem getEcrivain() {
		return ecrivain;
	}

	public static void setEcrivain(JMenuItem ecrivain) {
		Employe.ecrivain = ecrivain;
	}

	public static JMenuItem getNature1() {
		return nature1;
	}

	public static void setNature1(JMenuItem nature1) {
		Employe.nature1 = nature1;
	}

	public static JFrame getF() {
		return f;
	}

	public static void setF(JFrame f) {
		Employe.f = f;
	}

	public static JPanel getCont() {
		return cont;
	}

	public static void setCont(JPanel cont) {
		Employe.cont = cont;
	}

	public static JMenuItem getPresent() {
		return present;
	}

	public static void setPresent(JMenuItem present) {
		Employe.present = present;
	}

	public static JMenuItem getEmprunte() {
		return emprunte;
	}

	public static void setEmprunte(JMenuItem emprunte) {
		Employe.emprunte = emprunte;
	}

	public static String getRech1() {
		return rech1.getText();
	}

	public static void setRech1(JTextField rech1) {
		Employe.rech1 = rech1;
	}

	public static JButton getBtnRechercher1() {
		return btnRechercher1;
	}

	public static void setBtnRechercher1(JButton btnRechercher1) {
		Employe.btnRechercher1 = btnRechercher1;
	}

	public Employe() throws HeadlessException, SQLException, ClassNotFoundException {
		f.setLayout(new BorderLayout());

		JLabel background = new JLabel(new ImageIcon("view03.png"));
		cont.add(background);
		background.setLayout(new FlowLayout());

		JMenuBar menuBar = new JMenuBar();
		f.setJMenuBar(menuBar);
		JMenu mnLivre1 = new JMenu("Livre");
		mnLivre1.setBackground(Color.LIGHT_GRAY);
		mnLivre1.setFont(new Font("Verdana", Font.PLAIN, 16));
		menuBar.add(mnLivre1);

		present.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre1.add(present);

		emprunte.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre1.add(emprunte);
		gestion1.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre1.add(gestion1);
		gestion.setFont(new Font("Verdana", Font.PLAIN, 14));
		mnLivre1.add(gestion);
		adherant.setFont(new Font("Verdana", Font.PLAIN, 14));
		menuBar.add(adherant);
		pret.setFont(new Font("Verdana", Font.PLAIN, 14));
		menuBar.add(pret);
		

		menuBar.add(rech1);

		JMenu recherche = new JMenu("Recherche?");
		menuBar.add(recherche);
		menuBar.add(lo);
		nom.setFont(new Font("Verdana", Font.PLAIN, 14));
		JMenu livre = new JMenu("Livre");
		recherche.add(livre);
		livre.add(nom);
		nature.setFont(new Font("Verdana", Font.PLAIN, 14));
		livre.add(nature);
		nature.add(nature1);
		nature.add(nature2);
		nature.add(nature3);
		ecrivain.setFont(new Font("Verdana", Font.PLAIN, 14));
		recherche.add(ecrivain);
		livre.add(ecrivain);

		
		JMenu adherant = new JMenu("Adherant");
		recherche.add(adherant);
		adherant.add(nomA);
		f.setSize(750, 600);
		f.setTitle("Gestion de Bibliotheque");
		f.setContentPane(cont);
		f.setVisible(true);

	}

	public static void main(String[] argv) throws HeadlessException, ClassNotFoundException, SQLException {
		new Employe();
	}

	public static JMenuItem getGestion() {
		return gestion;
	}

	public static void setGestion(JMenuItem gestion) {
		Employe.gestion = gestion;
	}

}
