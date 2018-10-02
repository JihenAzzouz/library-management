package controleur1;

import java.sql.SQLException;

import javax.swing.JFrame;

import modele1.MyConnexion;
import modele1.modeleHello;
import vue1.Employe;
import vue1.GestionP;
import vue1.Login1;
import vue1.Z;

public class Control2 {
	private Login1 view;
	private modeleHello model;

	public Control2(Login1 v1, modeleHello model) {
		this.view = v1;
		this.model = model;

	}

	public void initControlEmploye() {
Employe.getPret().addActionListener(e->{
	try {
		affichePret(Employe.getF());
	} catch (ClassNotFoundException | SQLException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
});
Employe.getAdherant().addActionListener(e->{
	try {
		Control1.afficheA(Employe.getF());
	} catch (ClassNotFoundException | SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
});
		Employe.getPresent().addActionListener(e -> {
			try {
				affiche(Employe.getF());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getEmprunte().addActionListener(e -> {
			try {
				affiche1(Employe.getF());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getGestion().addActionListener(e->modeleHello.afficheM(Employe.getF()));
		
		Employe.getNom().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nom", "'" + Employe.getRech1() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getNature1().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nature", "'" + Employe.getRech1() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getEcrivain().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "ecrivain", "'" + Employe.getRech1() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		GestionP.getB1().addActionListener(e->{
			try {
				MyConnexion.ajoutPret();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		GestionP.getB2().addActionListener(e->{
			try {
				MyConnexion.annulPret();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getNom().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "titre", "'" + Employe.getRech1() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getEcrivain().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "ecrivain", "'" + Employe.getRech1() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getNature1().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nature", "'" + Employe.getRech1() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getNature2().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nature", "'" + Employe.getRech1() + "'","livre");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Employe.getLo().addActionListener(e->model.logout(Employe.getF()));
		Employe.getNature3().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nature", "'" + Employe.getRech1() + "'","livre");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			
		});
		Employe.getGestion1().addActionListener(e->new Z());
		Employe.getNomA().addActionListener(e->{
			try {
				recherche(Employe.getF(), "nom", "'" + Employe.getRech1() + "'","adherant");
			} catch (ClassNotFoundException | SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		});
	
	}

	public static void recherche(JFrame fr, String r, String champ,String table) throws ClassNotFoundException, SQLException {

		MyConnexion.affiche("select* from "+table+" where " + r + "=" + champ, fr);
	}

	private void affichePret(JFrame f) throws ClassNotFoundException, SQLException {
		
		MyConnexion.affiche("select a.nom,l.titre,p.date_res ,p.date_exp,p.rendu from pret p ,adherant a,livre l where p.idL=l.idL and p.idA=a.id", f);
	}

	private void recherche(JFrame fr, String r, String champ) throws ClassNotFoundException, SQLException {

		MyConnexion.affiche("select* from bibliotheque.livre where " + r + "=" + champ, fr);
	}

	private void affiche1(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.livre where etat='R'", f);
	}

	private void affiche(JFrame f) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MyConnexion.affiche("select * from bibliotheque.livre where etat='D'", f);
	}
}
