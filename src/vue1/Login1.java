package vue1;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class Login1 {
	JLabel hello0 = new JLabel("Bonjour Mr/s vou etes :");
	JLabel h0 = new JLabel("Gerant ");
	public static JCheckBox c1 = new JCheckBox();
	JLabel h1 = new JLabel("Employe ");
	public static JCheckBox c2 = new JCheckBox();
	JLabel h2 = new JLabel("Adherant");
	public static JCheckBox c3 = new JCheckBox();
	JLabel hello = new JLabel("Bonjour Mr/s veuillez remplir vos cordonnees :");
	public static JFrame getF1() {
		return f1;
	}

	public static void setF1(JFrame f1) {
		Login1.f1 = f1;
	}

	public static JLabel l = new JLabel("Login");
	public static Button b1 = new Button("login");
	public static JLabel m = new JLabel("Mot de passe");
	public static TextField login = new TextField(10);
	public static JPasswordField mdp = new JPasswordField(10);
	public static JFrame f1 = new JFrame();
	JPanel cont = new JPanel();

	public Login1() throws HeadlessException, IOException {
		f1.setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("view02.png"));

		f1.setSize(750, 600);
		f1.setTitle("Gestion de Bibliotheque");
		Box hBox00 = Box.createHorizontalBox();
		hBox00.add(hello0);

		Box hBox11 = Box.createHorizontalBox();
		hBox11.add(c1);
		hBox11.add(h0);
		hBox11.add(Box.createHorizontalStrut(10));
		;
		hBox11.add(c2);
		hBox11.add(h1);
		hBox11.add(Box.createHorizontalStrut(10));
		;
		hBox11.add(c3);
		hBox11.add(h2);

		Box hBox0 = Box.createHorizontalBox();
		hBox0.add(hello);

		Box hBox1 = Box.createHorizontalBox();
		hBox1.add(l);
		hBox1.add(Box.createHorizontalStrut(54));
		;
		hBox1.add(login);

		Box hBox2 = Box.createHorizontalBox();
		hBox2.add(m);
		hBox2.add(Box.createHorizontalStrut(10));
		hBox2.add(mdp);

		Box hBox3 = Box.createHorizontalBox();
		hBox3.add(b1);
		Box vBox = Box.createVerticalBox();
		vBox.add(hBox00);
		vBox.add(hBox11);
		vBox.add(hBox0);
		vBox.add(hBox1);
		vBox.add(hBox2);
		vBox.add(hBox3);
		cont.add(vBox);
		cont.add(background);

		f1.setContentPane(cont);

		f1.setVisible(true);
	}

	public static JCheckBox getC1() {
		return c1;
	}

	public static void setC1(JCheckBox c1) {
		Login1.c1 = c1;
	}

	public static JCheckBox getC2() {
		return c2;
	}

	public static void setC2(JCheckBox c2) {
		Login1.c2 = c2;
	}

	public static JCheckBox getC3() {
		return c3;
	}

	public static void setC3(JCheckBox c3) {
		Login1.c3 = c3;
	}

	public static Button getB1() {
		return b1;
	}

	public static void setB1(Button b1) {
		Login1.b1 = b1;
	}

	public static String getLogin() {
		return login.getText();
	}

	public static void setLogin(TextField login) {
		Login1.login = login;
	}

	public static String getMdp() {
		return mdp.getText();
	}

	public static void setMdp(JPasswordField mdp) {
		Login1.mdp = mdp;
	}

}
