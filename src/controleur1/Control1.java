package controleur1;

import java.awt.Color;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modele1.Modele;
import modele1.MyConnexion;
import modele1.modeleHello;
import vue1.Adherant;
import vue1.Employe;
import vue1.Gerant;
import vue1.Login1;
import vue1.X;
import vue1.Y;
import vue1.Z;

public class Control1 {
	private Login1 view;
	private modeleHello model;

	public Control1(Login1 v1, modeleHello model) {
		this.view = v1;
		this.model = model;

	}

	public void initControlGerant() throws SQLException {
		Gerant.getB().addActionListener(e->model.logout(Gerant.getFr()));
		Gerant.getAf().addActionListener(e -> {
			try {
				afficheE(Gerant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getMaj().addActionListener(e -> new X());
		Gerant.getMaj1().addActionListener(e -> new Y());
		Gerant.getMaj2().addActionListener(e -> new Z());
		Gerant.getAf1().addActionListener(e -> {
			try {
				afficheA(Gerant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Gerant.getD().addActionListener(e -> {
			try {
				affiche(Gerant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getR().addActionListener(e -> {
			try {
				affiche1(Gerant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getNom().addActionListener(e -> {
			try {
				recherche(Gerant.getFr(), "titre", "'" + Gerant.getRech() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getEcrivain().addActionListener(e -> {
			try {
				recherche(Gerant.getFr(), "ecrivain", "'" + Gerant.getRech() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getNature1().addActionListener(e -> {
			try {
				recherche(Gerant.getFr(), "nature", "'" + Gerant.getRech() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getNature2().addActionListener(e -> {
			try {
				recherche(Gerant.getFr(), "nature", "'" + Gerant.getRech() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Gerant.getNature3().addActionListener(e -> {
			try {
				recherche(Gerant.getFr(), "nature", "'" + Gerant.getRech() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		Gerant.getNomA().addActionListener(e->{
			try {
				recherche(Gerant.getFr(), "nom", "'" + Gerant.getRech() + "'","adherant");
			} catch (ClassNotFoundException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
		Gerant.getNomE().addActionListener(e->{
			try {
				recherche(Gerant.getFr(), "nom", "'" + Gerant.getRech() + "'","employe");
			} catch (ClassNotFoundException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
		X.getB1().addActionListener(e->{
			try {
				MyConnexion.ajout();
				Modele.estAjout();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		X.getB2().addActionListener(e->{
			try {
				MyConnexion.supprimer();
				Modele.estSupp();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		X.getB4().addActionListener(e->{
			try {
				MyConnexion.modifier();
				Modele.estModif();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		X.getB3().addActionListener(e->{
			try {
				String id = X.getItem_name();
				if(MyConnexion.verif(id,"employe","idEm"))
					X.Item_name.setBackground(Color.green);
				else
					{
					X.Item_name.setBackground(Color.red);
					String message = "\"Erreur!\"\n" + "Cet Employe n existe pas!!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);}	
			} catch (ClassNotFoundException | SQLException e1) {
				String message = "\"Erreur!\"\n" + "Cet Employe n existe pas!!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
				
			}
		});
		Y.getB1().addActionListener(e->{
			try {
				MyConnexion.ajout1();
				Modele.estAjout();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Y.getB2().addActionListener(e->{
			String id=Y.getIdSupp();
			Modele.estSupp();
			try {if(MyConnexion.verif(id,"adherant","idEm"))
				MyConnexion.supprimer1();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Y.getB4().addActionListener(e->{
			try {
				String id = Y.getItem_name();
				MyConnexion.modifier1(id);
				Modele.estModif();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Y.getB3().addActionListener(e->{
			try {
				String id = Y.getItem_name();
				if(MyConnexion.verif(id,"adherant","id"))
					Y.Item_name.setBackground(Color.green);
				else
					{
					Y.Item_name.setBackground(Color.red);
					String message = "\"Erreur!\"\n" + "Cet Adherant n existe pas!!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);}	
			} catch (ClassNotFoundException | SQLException e1) {
				
				e1.printStackTrace();
				
			}
		});
		Z.getB1().addActionListener(e->{
			try {
				MyConnexion.ajout2();
				Modele.estAjout();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Z.getB2().addActionListener(e->{
		
				String id=Z.getIdSupp();
				try {
				if(MyConnexion.verif(id,"livre","idL"))
				
				MyConnexion.supprimer2();
				Modele.estSupp();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Z.getB4().addActionListener(e->{
			try {
				String id = Z.getItem_name();
				MyConnexion.modifier2(id);
				Modele.estModif();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Z.getB3().addActionListener(e->{
			try {
				String id = Z.getItem_name();
				if(MyConnexion.verif(id,"livre","idL"))
					Z.Item_name.setBackground(Color.green);
				else
					{
					Z.Item_name.setBackground(Color.red);
					String message = "\"Erreur!\"\n" + "Ce livre n existe pas!!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);}	
			} catch (ClassNotFoundException | SQLException e1) {
				
				e1.printStackTrace();
				
			}
		});
	}

	




	public static void recherche(JFrame fr, String r, String champ,String table) throws ClassNotFoundException, SQLException {

		MyConnexion.affiche("select* from "+table+" where " + r + "=" + champ, fr);
	}

	private void affiche1(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.livre where etat='R'", f);
	}

	private void affiche(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.livre where etat='D'", f);
	}

	private void afficheE(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.employe", f);
	}

	public static void afficheA(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.adherant", f);
	}
}
