package vue1;

import javax.swing.*;
import java.awt.*;

public class X {

	private static JFrame mainFrame;
	private static JPanel Outer_panel1;
	private static JPanel Outer_panel2;
	private static JPanel Panel1;
	private static JPanel Panel2;
	private static JPanel Panel3;
	private static JPanel Panel4;
	public static JButton b1 = new JButton("Ajouter");;
	public static JButton b2 = new JButton("OK");
	public static JButton b3 = new JButton("Search");
	public static JButton b4 = new JButton("modifier");
	public static JTextField Item_name;

	 double xsize;
	 double ysize;
	public static JTextField idEm = new JTextField(10);
	public static JTextField m2p = new JTextField(10);
	public static JTextField nom = new JTextField(10);
	public static JTextField emploie = new JTextField(10);
	public static JCheckBox c1 = new JCheckBox();
	public static JTextField idEmM = new JTextField(10);
	public static JCheckBox c2 = new JCheckBox();
	public static JTextField m2pM = new JTextField(5);
	public static JCheckBox c3 = new JCheckBox();
	public static JTextField nomM = new JTextField(5);
	public static JCheckBox c4 = new JCheckBox();
	public static JTextField emploieM = new JTextField(5);
	public static JTextField idSupp = new JTextField(5);
	public static JButton getB4() {
		return b4;
	}

	public static void setB4(JButton b4) {
		X.b4 = b4;
	}

	public static String getIdSupp() {
		return idSupp.getText();
	}

	public static void setIdSupp(JTextField idSupp) {
		X.idSupp = idSupp;
	}

	public X() {
		gui();
	}

	public void gui() {
		mainFrame = new JFrame("gestionnaire Employee");
		GridBagConstraints Con = new GridBagConstraints();

		// Left Panel
		JLabel ajout = new JLabel("AJOUT");
		Box hBox1 = Box.createHorizontalBox();
		JLabel idLabel = new JLabel("ID__________");
		hBox1.add(idLabel);
		hBox1.add(Box.createHorizontalStrut(8));
		hBox1.add(idEm);

		Box hBox2 = Box.createHorizontalBox();
		JLabel m2pLabel = new JLabel("mot de passe:");
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(8));

		hBox2.add(m2p);

		Box hBox3 = Box.createHorizontalBox();
		JLabel nomLabel = new JLabel("Nom________: ");
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(5));

		hBox3.add(nom);

		Box hBox4 = Box.createHorizontalBox();
		JLabel empLabel = new JLabel("Emploie_____: ");
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(5));

		hBox4.add(emploie);

		Box hBox5 = Box.createHorizontalBox();
		
		hBox5.add(b1);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		vBox.add(hBox4);
		vBox.add(hBox5);

		JLabel modif = new JLabel("entrer l ID de l Emloyee que vous voulez le supprimer");
		
		

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
		
		Panel4 = new JPanel();
		

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
		
		mainFrame.setVisible(true);
		mainFrame.setSize(870,500);
		mainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
;
	}

	public void modif() {
		Box hBox0 = Box.createHorizontalBox();
		Item_name = new JTextField(25);
		Item_name.setText("entrer l Id d Employe ");
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
		
		hBox1.add(idEmM);

		Box hBox2 = Box.createHorizontalBox();
		
		JLabel m2pLabel = new JLabel("mot de passe:");
		hBox2.add(c2);
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(8));

		hBox2.add(m2pM);

		Box hBox3 = Box.createHorizontalBox();
		
		JLabel nomLabel = new JLabel("Nom________: ");
		hBox3.add(c3);
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(5));
		
		hBox3.add(nomM);

		Box hBox4 = Box.createHorizontalBox();
		
		JLabel empLabel = new JLabel("Emploie_____: ");
		hBox4.add(c4);
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(5));
		
		hBox4.add(emploieM);

		Box hBox5 = Box.createHorizontalBox();
		hBox5.add(b4);
		
		
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox0);
		vBox.add(hBox00);
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		vBox.add(hBox4);
		vBox.add(hBox5);
	
		Panel3.add(vBox);
		
	}

	public static JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		X.mainFrame = mainFrame;
	}

	public static JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		X.b1 = b1;
	}

	public static JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		X.b2 = b2;
	}

	public static JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		X.b3 = b3;
	}

	public static String getItem_name() {
		return Item_name.getText();
	}

	public void setItem_name(JTextField item_name) {
		Item_name = item_name;
	}

	public static String getIdEm() {
		return idEm.getText();
	}

	public  static void setIdEm1(JTextField id1) {
		X.idEm = id1;
	}

	public static String getM2p() {
		return m2p.getText();
	}

	public  static void setM2p(JTextField m2p) {
		X.m2p = m2p;
	}

	public static String getNom() {
		return nom.getText();
	}

	public void setNom(JTextField nom) {
		X.nom = nom;
	}

	public static String getEmploie() {
		return emploie.getText();
	}

	public void setEmploie(JTextField emploie) {
		X.emploie = emploie;
	}

	public static JCheckBox getC1() {
		return c1;
	}

	public void setC1(JCheckBox c1) {
		X.c1 = c1;
	}

	public static String getIdEmM() {
		return idEmM.getText();
	}

	public  static void setIdEmM(JTextField idEmM) {
		X.idEmM = idEmM;
	}

	public static JCheckBox getC2() {
		return c2;
	}

	public void setC2(JCheckBox c2) {
		X.c2 = c2;
	}

	public static String getM2pM() {
		return m2pM.getText();
	}

	public  static void setM2pM(JTextField m2pM) {
		X.m2pM = m2pM;
	}

	public static JCheckBox getC3() {
		return c3;
	}

	public void setC3(JCheckBox c3) {
		X.c3 = c3;
	}

	public  JPanel getPanel1() {
		return Panel1;
	}

	public  void setPanel1(JPanel panel1) {
		Panel1 = panel1;
	}

	public  JPanel getPanel2() {
		return Panel2;
	}

	public  void setPanel2(JPanel panel2) {
		Panel2 = panel2;
	}

	public  JPanel getPanel3() {
		return Panel3;
	}

	public  void setPanel3(JPanel panel3) {
		Panel3 = panel3;
	}

	public  JPanel getPanel4() {
		return Panel4;
	}

	public  void setPanel4(JPanel panel4) {
		Panel4 = panel4;
	}

	public static String getNomM() {
		return nomM.getText();
	}

	public void setNomM(JTextField nomM) {
		X.nomM = nomM;
	}

	public static JCheckBox getC4() {
		return c4;
	}

	public void setC4(JCheckBox c4) {
		X.c4 = c4;
	}

	public static String getEmploieM() {
		return emploieM.getText();
	}

	public void setEmploieM(JTextField emploieM) {
		X.emploieM = emploieM;
	}

	public static void main(String[] args) {
		new X();
	}

	public static void setIdEm(JTextField idEm) {
		X.idEm = idEm;
	}
}