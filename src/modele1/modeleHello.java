package modele1;

import java.awt.HeadlessException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;

import vue1.Adherant;
import vue1.Gerant;
import vue1.GestionP;
import vue1.Login1;

public class modeleHello {
	private String login;
	private String m2p;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getM2p() {
		return m2p;
	}

	public void setM2p(String m2p) {
		this.m2p = m2p;
	}

	public boolean isEmploye(String e, String s) {
		if (e.equals(s))
			return true;
		else
			return false;

	}

	public boolean isAdherant(String e, String s) {
		if (e.equals(s))
			return true;
		else
			return false;
	}

	public boolean isGerant(String e, String s) {
		if (e.equals(s))
			return true;
		else
			return false;
	}

	public boolean verif(String mdp, String s) {
		if (mdp.equals(s))
			return true;
		else
			return false;
	}

	public static String generate(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String pass = "";
		for (int x = 0; x < length; x++) {
			int i = (int) Math.floor(Math.random() * chars.length() - 1);
			pass += chars.charAt(i);
		}
		System.out.println(pass);
		return pass;
	}

	public static String date() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yy");
		 return form.format(calendar.getTime());
	}
	public static void logout(JFrame f) {
		f.setVisible(false);
		try {
			new Login1();
		} catch (HeadlessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	public static void afficheM(JFrame f)

	{ 
		System.out.println("enter");
		GestionP g=new GestionP();
		g.getF().getContentPane();
		f.setContentPane(g.getF().getContentPane());
		System.out.println("enter");
		f.repaint();
		System.out.println("enter");
		f.revalidate();
	}
	public static void afficheG(JFrame f)

	{ 
		System.out.println("enter");
		Gerant g=new Gerant();
		g.getFr().getContentPane();
		f.setContentPane(g.getFr().getContentPane());
		System.out.println("enter");
		f.repaint();
		System.out.println("enter");
		f.revalidate();
	}
	public static String calculDate(Calendar c) {

		c.add(Calendar.DATE, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		return sdf.format(c.getTime());
	}
}