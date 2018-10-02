package controleur1;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;

import modele1.MyConnexion;
import modele1.modeleHello;
import vue1.Adherant;
import vue1.Employe;
import vue1.Login1;

public class Control3 {
	private Login1 view;
	private modeleHello model;

	public Control3(Login1 v1, modeleHello model) {
		this.view = v1;
		this.model = model;

	}

	public void initControlAdherant() {
		Adherant.getPresent().addActionListener(e -> {
			try {
				affiche(Adherant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Adherant.getEmprunte().addActionListener(e -> {
			try {
				affiche1(Adherant.getFr());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Adherant.getNom().addActionListener(e -> {
			try {
				recherche(Adherant.getFr(), "titre", "'" + Adherant.getRech() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Adherant.getNature().addActionListener(e -> {
			try {
				recherche(Adherant.getFr(), "nature", "'" + Adherant.getRech() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Adherant.getEcrivain().addActionListener(e -> {
			try {
				recherche(Adherant.getFr(), "auteur", "'" + Adherant.getRech() + "'");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Adherant.getNature1().addActionListener(e -> {
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
		Adherant.getNature2().addActionListener(e -> {
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
		Adherant.getNature3().addActionListener(e -> {
			try {
				recherche(Employe.getF(), "nature", "'" + Employe.getRech1() + "'");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			
		});
		Adherant.getB1().addActionListener(e->model.logout(Adherant.getFr()));
		Adherant.getB().addActionListener(e->{
			try {
				MyConnexion.affiche("select a.nom,l.titre,p.date_res,p.date_exp from adherant a, pret p ,livre l where p.idL=l.idL and a.id=p.idA and idA='"+Login1.getLogin()+"'",Adherant.getFr());
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
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
