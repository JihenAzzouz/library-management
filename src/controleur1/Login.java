package controleur1;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import modele1.MyConnexion;
import modele1.modeleHello;
import vue1.Adherant;
import vue1.Employe;
import vue1.Gerant;
import vue1.Hello;
import vue1.Login1;

public class Login {

	private Login1 view;
	private modeleHello model;

	public Login(Login1 view, modeleHello model) {
		this.view = view;
		this.model = model;

	}

	public void initControl() throws SQLException , HeadlessException , ClassNotFoundException , IOException {

		Login1.getB1().addActionListener(e -> {
			try {
				if(Login1.c1.isSelected())
			    	goFrame();
				else if(Login1.c2.isSelected())
					goFrame1();	
				else
					goFrame2();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

	}
	
	private void goFrame() throws HeadlessException, ClassNotFoundException, SQLException  {
		 String r="";
      
        if(MyConnexion.verif(Login1.getLogin(),"employe","idEm")&&(!Login1.getLogin().equals("")))
    	{r ="select idEm, m2p,emploie from bibliotheque.employe order by idEm";
		if (MyConnexion.login(r,"gerant")) {
			close();
			new Gerant();}
	   else if(!MyConnexion.verif(Login1.getLogin(),"employe","idEm"))
			{
				String message = "\"Erreur!\"\n" + " ID n existe pas ";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
			}
	    else if(!MyConnexion.verif(Login1.getMdp(),"employe","m2p"))
		{
			String message = "\"Erreur!\"\n" + " mot de passe incorrecte ";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
		}}
		
       	
	
	}
	private void goFrame1()  {
	      try{
	    	  String r="select idEm, m2p,emploie from bibliotheque.employe order by m2p";
			if (MyConnexion.login1(r,"employee")) {
				
				close();
				new Employe();}
				else
				{
					String message = "\"Erreur!\"\n" + "Veuillez entrer vos cordonnees correctement!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
				}
			 }catch(SQLException | HeadlessException | ClassNotFoundException s) {
				String message = "\"Erreur!\"\n" + "Veuillez entrer vos cordonnees correctement!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
			}
		}
	private void goFrame2()  {
	      try{
	    	  String r="select id, m2p from bibliotheque.adherant order by m2p";
			if (MyConnexion.login2(r)) {
				close();
				new Adherant();}
				else
				{
					String message = "\"Erreur!\"\n" + "Veuillez entrer vos cordonnees correctement!";
					JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
				}
			 }catch(SQLException | HeadlessException | ClassNotFoundException s) {
				String message = "\"Erreur!\"\n" + "Veuillez entrer vos cordonnees correctement!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	public boolean Verif() {
		if (Login1.getLogin().equals("")) {
			String message = "\"Erreur!\"\n" + "Veuillez entrer votre ID correctement le champ est vide!";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (Login1.getMdp().equals("")) {
			String message = "\"Erreur!\"\n" + "Veuillez entrer votre mot de passe correctement!le champ est vide!";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
		
	}

	public void close() {
		Login1.f1.setVisible(false);
	}

}
