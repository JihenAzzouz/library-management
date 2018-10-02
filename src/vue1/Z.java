package vue1;

import javax.swing.*;
import java.awt.*;

public class Z {

	private static JFrame mainFrame;
	private static JPanel Outer_panel1;
	private static JPanel Outer_panel2;
	private static JPanel Panel1;
	private static JPanel Panel2;
	private static JPanel Panel3;
	private static JPanel Panel4;
	private static JButton b1 = new JButton("Ajouter");
	private static JButton b2 = new JButton("OK");
	private static JButton b3 = new JButton("Search");
	private static JButton b4 = new JButton("Modifier");

	public static JButton getB4() {
		return b4;
	}

	public static void setB4(JButton b4) {
		Z.b4 = b4;
	}

	public static String getIdSupp() {
		return idSupp.getText();
	}

	public static void setIdSupp(JTextField idSupp) {
		Z.idSupp = idSupp;
	}

	public static JTextField Item_name = new JTextField(25);
	static double xsize;
	static double ysize;
	public static JTextField idL = new JTextField(10);
	private static JTextField titre = new JTextField(10);
	private static JTextField auteur = new JTextField(10);
	private static JTextField editeur = new JTextField(10);
	private static JTextField dateE = new JTextField(10);
	public static JCheckBox c1 = new JCheckBox();
	public static JTextField idLm = new JTextField(10);
	public static JCheckBox c2 = new JCheckBox();
	private static JTextField titreM = new JTextField(10);
	public static JCheckBox c3 = new JCheckBox();
	private static JTextField auteurM = new JTextField(10);
	public static JCheckBox c4 = new JCheckBox();
	private static JTextField editeurM = new JTextField(10);
	public static JCheckBox c5 = new JCheckBox();
	private static JTextField dateEm = new JTextField(10);
	ButtonGroup b=new ButtonGroup();
	public static JRadioButton br1 = new JRadioButton("Disponible",false);
	public static JRadioButton br2 = new JRadioButton("Reserve",false);
	public static JRadioButton getBr1() {
		return br1;
	}

	public static void setBr1(JRadioButton br1) {
		Z.br1 = br1;
	}

	public static JRadioButton getBr2() {
		return br2;
	}

	public static void setBr2(JRadioButton br2) {
		Z.br2 = br2;
	}

	public static JCheckBox getC5() {
		return c5;
	}

	public static void setC5(JCheckBox c5) {
		Z.c5 = c5;
	}

	public static String getDateEm() {
		return dateEm.getText();
	}

	public static void setDateEm(JTextField dateEm) {
		Z.dateEm = dateEm;
	}

	

	private static JTextField idSupp = new JTextField(10);

	public Z() {
		gui();
	}

	public void gui() {
		mainFrame = new JFrame("gestionnaire Livres");
		GridBagConstraints Con = new GridBagConstraints();

		// Left Panel

		Box hBox1 = Box.createHorizontalBox();
		JLabel idLabel = new JLabel("ID___________");
		hBox1.add(idLabel);
		hBox1.add(Box.createHorizontalStrut(10));

		hBox1.add(idL);

		Box hBox2 = Box.createHorizontalBox();
		JLabel m2pLabel = new JLabel("Titre_________");
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(9));

		hBox2.add(titre);

		Box hBox3 = Box.createHorizontalBox();
		JLabel nomLabel = new JLabel("Auteur______");
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(19));

		hBox3.add(auteur);

		Box hBox4 = Box.createHorizontalBox();
		JLabel empLabel = new JLabel("Editeur_____");
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(24));

		hBox4.add(editeur);

		Box hBox44 = Box.createHorizontalBox();
		JLabel date = new JLabel("Date d Edition ");
		hBox44.add(date);
		hBox44.add(Box.createHorizontalStrut(20));
		hBox44.add(dateE);

		Box hBox5 = Box.createHorizontalBox();

		hBox5.add(b1);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		vBox.add(hBox4);
		vBox.add(hBox44);
		vBox.add(hBox5);

		JLabel modif = new JLabel("entrer l ID du livre que vous voulez le supprimer");

		Outer_panel1 = new JPanel(new GridBagLayout());
		Outer_panel1.setBackground(Color.decode("#EFD8C4"));

		Panel1 = new JPanel();
		Panel1.setBackground(Color.decode("#EFD8C4"));
		Panel2 = new JPanel();
		Panel2.setBackground(Color.decode("#EDC4BD"));

		Outer_panel1.add(b1);
		Outer_panel1.add(b2);

		Panel1.add(vBox);
		Panel2.add(modif);
		Panel2.add(idSupp);
		Panel2.add(b2);

		Con.gridx = 0;
		Con.gridy = 0;
		Con.ipady = 300;
		Con.fill = GridBagConstraints.VERTICAL;
		Outer_panel1.add(Panel1, Con);
		Con.gridx = 0;
		Con.gridy = 1;
		Con.ipady = 0;
		Con.weighty = 1.0;
		Outer_panel1.add(Panel2, Con);

		mainFrame.add(Outer_panel1, BorderLayout.LINE_START);

		// right panel
		Outer_panel2 = new JPanel(new GridBagLayout());
		Outer_panel2.setBackground(Color.decode("#EFD8C4"));

		Panel3 = new JPanel();
		Panel3.setBackground(Color.decode("#EFD8C4"));
		Panel4 = new JPanel();
		Panel4.setBackground(Color.decode("#EFD8C4"));

		// Panel3

		// Panel4 and Table

		modif();

		Con.gridx = 0;
		Con.gridy = 0;
		Con.ipady = 0;
		Con.weighty = 0;
		Outer_panel2.add(Panel3, Con);
		Con.gridx = 0;
		Con.gridy = 1;
		Con.ipady = 0;
		Con.fill = GridBagConstraints.BOTH;
		Con.weighty = 1.0;
		Outer_panel2.add(Panel4, Con);
		mainFrame.add(Outer_panel2, BorderLayout.EAST);
		mainFrame.setBackground(Color.decode("#EFD8C4"));
		mainFrame.setVisible(true);
		mainFrame.setSize(900, 500);
		mainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}

	public void modif() {
		Box hBox0 = Box.createHorizontalBox();

		Item_name.setText("entrer l Id du livre ");
		hBox0.add(Item_name);
		hBox0.add(Box.createHorizontalStrut(8));

		hBox0.add(b3);
		Box hBox00 = Box.createHorizontalBox();
		JLabel b = new JLabel("----------------------------------------------------------------");
		hBox00.add(b);
		Box hBox1 = Box.createHorizontalBox();

		JLabel id = new JLabel("ID__________");
		hBox1.add(c1);
		hBox1.add(id);
		hBox1.add(Box.createHorizontalStrut(8));

		hBox1.add(idLm);

		Box hBox2 = Box.createHorizontalBox();

		JLabel m2pLabel = new JLabel("Titre________");
		hBox2.add(c2);
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(8));
		hBox2.add(titreM);

		Box hBox3 = Box.createHorizontalBox();
		JLabel nomLabel = new JLabel("Auteur______ ");
		hBox3.add(c3);
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(5));
		hBox3.add(auteurM);

		Box hBox4 = Box.createHorizontalBox();
		JLabel empLabel = new JLabel("Editeur______ ");
		hBox4.add(c4);
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(5));
		hBox4.add(editeurM);
		Box hBox44 = Box.createHorizontalBox();
		JLabel empdLabel = new JLabel("Date d edition______ ");
		hBox44.add(c5);
		hBox44.add(empdLabel);
		hBox44.add(Box.createHorizontalStrut(5));
		hBox44.add(dateEm);
		dateEm.setText("jj/mm/aaaa");
		Box hBox444 = Box.createHorizontalBox();
		b.add(br1);
		hBox444.add(br1);
		hBox444.add(Box.createHorizontalStrut(30));
		b.add(br2);
		hBox444.add(br2);
		
		Box hBox5 = Box.createHorizontalBox();
		hBox5.add(b4);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox0);
		vBox.add(hBox00);
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		vBox.add(hBox4);
		vBox.add(hBox44);
		vBox.add(hBox444);
		vBox.add(hBox5);
		Panel3.add(vBox);

	}

	public static JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		Z.mainFrame = mainFrame;
	}

	public static JButton getB1() {
		return b1;
	}

	public static void setB1(JButton b1) {
		Z.b1 = b1;
	}

	public static JButton getB2() {
		return b2;
	}

	public static void setB2(JButton b2) {
		Z.b2 = b2;
	}

	public static JButton getB3() {
		return b3;
	}

	public static void setB3(JButton b3) {
		Z.b3 = b3;
	}

	public static String getItem_name() {
		return Item_name.getText();
	}

	public void setItem_name(JTextField item_name) {
		Item_name = item_name;
	}

	public static JCheckBox getC1() {
		return c1;
	}

	public static String getIdL() {
		return idL.getText();
	}

	public static void setIdL(JTextField idL) {
		Z.idL = idL;
	}

	public static String getTitre() {
		return titre.getText();
	}

	public static void setTitre(JTextField titre) {
		Z.titre = titre;
	}

	public static String getAuteur() {
		return auteur.getText();
	}

	public static void setAuteur(JTextField auteur) {
		Z.auteur = auteur;
	}

	public static String getEditeur() {
		return editeur.getText();
	}

	public static void setEditeur(JTextField editeur) {
		Z.editeur = editeur;
	}

	public static String getDateE() {
		return dateE.getText();
	}

	public static void setDateE(JTextField dateE) {
		Z.dateE = dateE;
	}

	public static String getIdLm() {
		return idLm.getText();
	}

	public static void setIdLm(JTextField idLm) {
		Z.idLm = idLm;
	}

	public static String getTitreM() {
		return titreM.getText();
	}

	public static void setTitreM(JTextField titreM) {
		Z.titreM = titreM;
	}

	public static String getAuteurM() {
		return auteurM.getText();
	}

	public static void setAuteurM(JTextField auteurM) {
		Z.auteurM = auteurM;
	}

	public static String getEditeurM() {
		return editeurM.getText();
	}

	public static void setEditeurM(JTextField editeurM) {
		Z.editeurM = editeurM;
	}

	public void setC1(JCheckBox c1) {
		Z.c1 = c1;
	}

	public static JCheckBox getC2() {
		return c2;
	}

	public void setC2(JCheckBox c2) {
		Z.c2 = c2;
	}

	public static JCheckBox getC3() {
		return c3;
	}

	public void setC3(JCheckBox c3) {
		Z.c3 = c3;
	}

	public static JPanel getPanel1() {
		return Panel1;
	}

	public static void setPanel1(JPanel panel1) {
		Panel1 = panel1;
	}

	public static JPanel getPanel2() {
		return Panel2;
	}

	public static void setPanel2(JPanel panel2) {
		Panel2 = panel2;
	}

	public static JPanel getPanel3() {
		return Panel3;
	}

	public static void setPanel3(JPanel panel3) {
		Panel3 = panel3;
	}

	public static JPanel getPanel4() {
		return Panel4;
	}

	public static void setPanel4(JPanel panel4) {
		Panel4 = panel4;
	}

	public static JCheckBox getC4() {
		return c4;
	}

	public void setC4(JCheckBox c4) {
		Z.c4 = c4;
	}

	public static void main(String[] args) {
		new Z();
	}
}
