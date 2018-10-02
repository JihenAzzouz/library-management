package vue1;

import java.awt.*;

import javax.swing.*;

public class GestionP extends JPanel {
	private static final long serialVersionUID = 1L;
public	static JPanel panel = new JPanel(new GridBagLayout());
	public static GridBagConstraints gbc = new GridBagConstraints();
	public static JPanel zone_outil = new JPanel();
	public static JPanel zone_dyna = new JPanel();
	static JFrame f = new JFrame();
	public static JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		GestionP.f = f;
	}

	public static JTextField idL = new JTextField(10);
	public static JTextField idLm = new JTextField(10);
	public static JTextField idA = new JTextField(10);
	public static JTextField idAm = new JTextField(10);
	public static JButton b1 = new JButton("Reserver");
	public static JButton b2 = new JButton("annuler reservation");

	// public static Container contenu = new
	// JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	public GestionP() {

		setSize(800, 600);
		// ou
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0; // VERTICAL_SPLIT
		Box hBox1 = Box.createHorizontalBox();
		JLabel idLabel = new JLabel("ID de livre");
		hBox1.add(idLabel);
		hBox1.add(Box.createHorizontalStrut(25));
		hBox1.add(idL);
		Box hBox2 = Box.createHorizontalBox();
		JLabel idLabela = new JLabel("ID de adherant");
		hBox2.add(idLabela);
		hBox2.add(Box.createHorizontalStrut(8));
		hBox2.add(idA);
		Box hBox3 = Box.createHorizontalBox();
		hBox3.add(b1);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		zone_outil.setBackground(Color.LIGHT_GRAY);
		zone_dyna.setBackground(Color.pink);
		zone_outil.add(vBox);
		Box hBox0 = Box.createHorizontalBox();
		JLabel idLabeld = new JLabel("ID de livre");
		hBox0.add(idLabeld);
		hBox0.add(Box.createHorizontalStrut(25));
		hBox0.add(idLm);
		Box hBox00 = Box.createHorizontalBox();
		JLabel idLabelaa = new JLabel("ID de adherant");
		hBox00.add(idLabelaa);
		hBox00.add(Box.createHorizontalStrut(5));
		hBox00.add(idAm);
		Box hBox000 = Box.createHorizontalBox();
		hBox000.add(b2);
		Box vBox0 = Box.createVerticalBox();
		vBox0.add(hBox0);
		vBox0.add(hBox00);
		vBox0.add(hBox000);
		zone_dyna.add(vBox0);
		add(zone_outil, gbc);
		add(zone_dyna, gbc);
		
		/*
		 * f.add(panel); f.setContentPane(panel); 
		 */  f.add(this);
		 
	}

	public static String getIdL() {
		return idL.getText();
	}

	public static JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		GestionP.panel = panel;
	}

	public void setIdL(JTextField idL) {
		GestionP.idL = idL;
	}

	public static String getIdLm() {
		return idLm.getText();
	}

	public void setIdLm(JTextField idLm) {
		GestionP.idLm = idLm;
	}

	public static String getIdA() {
		return idA.getText();
	}

	public void setIdA(JTextField idA) {
		GestionP.idA = idA;
	}

	public static String getIdAm() {
		return idAm.getText();
	}

	public void setIdAm(JTextField idAm) {
		GestionP.idAm = idAm;
	}

	public static JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		GestionP.b1 = b1;
	}

	public static JButton getB2() {
		return b2;
	}

	public static void setB2(JButton b2) {
		GestionP.b2 = b2;
	}

	public static void main(String[] argc) {
		new GestionP();
	}
}
