package vue1;

import javax.swing.*;
import java.awt.*;

public class Y {

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
	private static JTextField idSupp = new JTextField(10);
	public static String getIdSupp() {
		return idSupp.getText();
	}

	public static void setIdSupp(JTextField idSupp) {
		Y.idSupp = idSupp;
	}

	private static JButton b4 = new JButton("Modifier");
	public static JTextField Item_name;

	static double xsize;
	static double ysize;
	public static JTextField idA = new JTextField(10);
	public static JTextField m2p = new JTextField(10);
	public static JTextField nom = new JTextField(10);
	public static JTextField email = new JTextField(10);
	public static JTextField nb = new JTextField(10);
	public static JCheckBox c1 = new JCheckBox();
	public static JTextField idAm = new JTextField(10);
	public static JCheckBox c2 = new JCheckBox();
	public static JTextField m2pM = new JTextField(10);
	public static JCheckBox c3 = new JCheckBox();
	public static JTextField nomM = new JTextField(10);
	public static JCheckBox c4 = new JCheckBox();
	public static JTextField emailM = new JTextField(10);
	public static JCheckBox c5 = new JCheckBox();
	public static JTextField nbM = new JTextField(10);

	public Y() {
		gui();
	}

	public void gui() {
		mainFrame = new JFrame("gestionnaire Employee");
		GridBagConstraints Con = new GridBagConstraints();

		// Left Panel
		
		Box hBox1 = Box.createHorizontalBox();
		JLabel idLabel = new JLabel("ID__________");
		
		hBox1.add(idLabel);
		hBox1.add(Box.createHorizontalStrut(40));
		;
		hBox1.add(idA);

		Box hBox2 = Box.createHorizontalBox();
		JLabel m2pLabel = new JLabel("mot de passe:");
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(40));

		hBox2.add(m2p);

		Box hBox3 = Box.createHorizontalBox();
		JLabel nomLabel = new JLabel("Nom________: ");
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(35));

		hBox3.add(nom);

		Box hBox4 = Box.createHorizontalBox();
		JLabel empLabel = new JLabel("Email_____: ");
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(50));
		hBox4.add(email);
		Box hBox5 = Box.createHorizontalBox();
		JLabel abel = new JLabel("nbr de livre reserve");
		hBox5.add(abel);
		hBox5.add(Box.createHorizontalStrut(15));
		hBox5.add(nb);

		Box hBox6 = Box.createHorizontalBox();
		
		hBox6.add(b1);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		vBox.add(hBox4);
		vBox.add(hBox5);
		vBox.add(hBox6);
		JLabel modif = new JLabel("entrer l ID de l Adherant que vous voulez le supprimer");
		
		

		Outer_panel1 = new JPanel(new GridBagLayout());
		Outer_panel1.setBackground(Color.decode("#EFD8C4"));

		Panel1 = new JPanel();
		
		Panel2 = new JPanel();
		

		Outer_panel1.add(b1);
		Outer_panel1.add(b2);

		Panel1.add(vBox);
		Panel2.add(modif);
		Panel2.add(idSupp);
		Panel2.add(b2);
		Panel1.setBackground(Color.decode("#EFD8C4"));
		Panel2.setBackground(Color.decode("#EDC4BD"));
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
		mainFrame.setSize(900, 500);
		mainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}

	public void modif() {
		Box hBox0 = Box.createHorizontalBox();
		Item_name = new JTextField(25);
		Item_name.setText("entrer l Id de l Adherant ");
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
		hBox1.add(Box.createHorizontalStrut(28));

		hBox1.add(idAm);

		Box hBox2 = Box.createHorizontalBox();

		JLabel m2pLabel = new JLabel("mot de passe:");
		hBox2.add(c2);
		hBox2.add(m2pLabel);
		hBox2.add(Box.createHorizontalStrut(28));
		hBox2.add(m2pM);

		Box hBox3 = Box.createHorizontalBox();
		JLabel nomLabel = new JLabel("Nom________: ");
		hBox3.add(c3);
		hBox3.add(nomLabel);
		hBox3.add(Box.createHorizontalStrut(22));
		hBox3.add(nomM);

		Box hBox4 = Box.createHorizontalBox();
		JLabel empLabel = new JLabel("Email_____: ");
		hBox4.add(c4);
		hBox4.add(empLabel);
		hBox4.add(Box.createHorizontalStrut(36));
		hBox4.add(emailM);

		Box hBox44 = Box.createHorizontalBox();
		JLabel nbMlabel = new JLabel("nb de livre reserve");
		hBox44.add(c5);
		hBox44.add(nbMlabel);
		hBox44.add(Box.createHorizontalStrut(5));
		hBox44.add(nbM);

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
		vBox.add(hBox5);
		Panel3.add(vBox);

	}

	public static JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		Y.mainFrame = mainFrame;
	}

	public static JButton getB1() {
		return b1;
	}

	public  void setB1(JButton b1) {
		Y.b1 = b1;
	}

	public static JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		Y.b2 = b2;
	}

	public static JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		Y.b3 = b3;
	}

	public static String getItem_name() {
		return Item_name.getText();
	}

	public void setItem_name(JTextField item_name) {
		Item_name = item_name;
	}

	public static String getIdEm() {
		return idA.getText();
	}

	public static void setIdEm(JTextField idEm) {
		Y.idA = idEm;
	}

	public static String getM2p() {
		return m2p.getText();
	}

	public  void setM2p(JTextField m2p) {
		Y.m2p = m2p;
	}

	public static String getNom() {
		return nom.getText();
	}

	public void setNom(JTextField nom) {
		Y.nom = nom;
	}

	public static String getEmploie() {
		return email.getText();
	}

	public void setEmploie(JTextField emploie) {
		Y.email = emploie;
	}

	public static JCheckBox getC1() {
		return c1;
	}

	public void setC1(JCheckBox c1) {
		Y.c1 = c1;
	}

	public static String getIdEmM() {
		return idAm.getText();
	}

	public void setIdEmM(JTextField idEmM) {
		Y.idAm = idEmM;
	}

	public static JCheckBox getC2() {
		return c2;
	}

	public void setC2(JCheckBox c2) {
		Y.c2 = c2;
	}

	public static String getM2pM() {
		return m2pM.getText();
	}

	public void setM2pM(JTextField m2pM) {
		Y.m2pM = m2pM;
	}

	public static JCheckBox getC3() {
		return c3;
	}

	public void setC3(JCheckBox c3) {
		Y.c3 = c3;
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

	public static String getNomM() {
		return nomM.getText();
	}

	public void setNomM(JTextField nomM) {
		Y.nomM = nomM;
	}

	public JCheckBox getC4() {
		return c4;
	}

	public void setC4(JCheckBox c4) {
		Y.c4 = c4;
	}

	public static String getNb() {
		return nb.getText();
	}

	public static void setNb(JTextField nb) {
		Y.nb = nb;
	}

	public static JCheckBox getC5() {
		return c5;
	}

	public static void setC5(JCheckBox c5) {
		Y.c5 = c5;
	}

	public static String getNbM() {
		return nbM.getText();
	}

	public static void setNbM(JTextField nbM) {
		Y.nbM = nbM;
	}


	public static void main(String[] args) {
		new Y();
	}
	public static JButton getB4() {
		return b4;
	}

	public static void setB4(JButton b4) {
		Y.b4 = b4;
	}

	public static String getIdA() {
		return idA.getText();
	}

	public static void setIdA(JTextField idA) {
		Y.idA = idA;
	}

	public static String getEmail() {
		return email.getText();
	}

	public static void setEmail(JTextField email) {
		Y.email = email;
	}

	public static String getIdAm() {
		return idAm.getText();
	}

	public static void setIdAm(JTextField idAm) {
		Y.idAm = idAm;
	}

	public static String getEmailM() {
		return emailM.getText();
	}

	public static void setEmailM(JTextField emailM) {
		Y.emailM = emailM;
	}

}
