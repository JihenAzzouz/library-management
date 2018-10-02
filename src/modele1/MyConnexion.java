package modele1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele1.Modele;
import modele1.modeleHello;
import vue1.GestionP;
import vue1.Login1;
import modele1.Table;
import vue1.TablePanel;
import vue1.X;
import vue1.Y;
import vue1.Z;

public class MyConnexion {

	private static Connection connect = null;
	private static Statement statement = null;
	private static ResultSet rs = null;
	final private static String host = "localhost";
	final private static String user = "root";
	final private static String passwd = "";

	public static boolean login(String request, String emp) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		System.out.println("connection secceeded");
		rs = statement.executeQuery(request);
		System.out.println("its going...");
		if (verif1(rs, emp))
			return true;

		return false;

	}

	public static boolean login1(String request, String emp) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		rs = statement.executeQuery(request);
		System.out.println("its going...");
		while (rs.next()) {
			String id1 = rs.getString("idEm");
			System.out.println("getting id...");
			String m2p1 = rs.getString("m2p");
			System.out.println("getting m2p...");
			String emploie = rs.getString("emploie");
			System.out.println("getting emploi..");
			String id = Login1.getLogin();
			System.out.println("getting id.." + id);
			if ((id.equals(id1)) && (Login1.getMdp().equals(m2p1)) && (emploie.equals(emp))) {
				System.out.println("its going...");
				return true;
			}

			else {
				System.out.println("its not going...");
				return false;

			}
		}
		return false;

	}

	public static boolean login2(String request) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		rs = statement.executeQuery(request);
		System.out.println("its going...");
		if (verif2(rs))
			return true;

		return false;

	}

	public static boolean verif1(ResultSet resultat, String emp) throws SQLException {
		while (resultat.next()) {
			String l = Login1.getLogin();
			String m = Login1.getMdp();
			System.out.println(l + m);
			String id1 = resultat.getString("idEm");
			System.out.println(id1);
			String m2p1 = resultat.getString("m2p");
			System.out.println(m2p1);
			String emploie = resultat.getString("emploie");
			System.out.println(emploie);
			if ((l.equals(id1)) && (m.equals(m2p1)) && (emploie.equals(emp))) {
				System.out.println("its going...");
				return true;
			}

			else {
				System.out.println("its not going...");
				return false;

			}
		}
		return false;
	}

	public static boolean verif2(ResultSet resultat) throws SQLException {
		while (resultat.next()) {

			String id1 = resultat.getString("id");
			String m2p1 = resultat.getString("m2p");

			if ((Login1.getLogin().equals(id1)) && (Login1.getMdp().equals(m2p1))) {
				System.out.println("its goingg...");
				return true;
			}

			else {
				System.out.println("its not going...");
				return false;

			}
		}
		return false;
	}

	public static void affiche(String request, JFrame f) throws SQLException, ClassNotFoundException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

			statement = connect.createStatement();

			System.out.println("connection secceeded");

			rs = statement.executeQuery(request);

			Table rtm = new Table(rs);

			TablePanel tablePanel = new TablePanel(rtm);
			f.setContentPane(tablePanel);
			f.repaint();
			f.revalidate();

			/*
			 * mainFrame.setVisible( true );
			 * mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erreur!");
		}
	}

	public static void ajout2() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);
		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String id1 = modeleHello.generate(6);
		System.out.println(id1);
		Z.idL.setText(id1);
		System.out.println("getting id...");
		String titre = Z.getTitre();
		String auteur = Z.getAuteur();
		String editeur = Z.getEditeur();
		;
		String dateE = Z.getDateE();
		String req = "insert into livre values('" + id1 + "','" + titre + "','" + auteur + "','" + editeur + "','"+ dateE +"','roman','D')";
		statement.executeUpdate(req);
		System.out.println("its going...");

	}

	public static void ajout1() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String id1 = modeleHello.generate(6);
		System.out.println(id1);
		Y.idA.setText(id1);
		System.out.println("getting id...");
		String m2p1 = modeleHello.generate(6);
		Y.m2p.setText(m2p1);
		System.out.println("getting m2p...");
		String nom = Y.getNom();
		String email = Y.getEmail();
		System.out.println("getting emploi..");
		String nb = Y.getNb();
		String req = "insert into adherant values('" + id1 + "','" + m2p1 + "','" + nom + "','" + email + "','" + nb
				+ "','manara')";
		statement.executeUpdate(req);
		System.out.println("its going...");

	}

	public static void ajout() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");

		String id1 = modeleHello.generate(6);
		System.out.println(id1);
		X.idEm.setText(id1);
		System.out.println("getting id...");
		String m2p1 = modeleHello.generate(6);
		X.m2p.setText(m2p1);
		System.out.println("getting m2p...");
		String emploie = X.getEmploie();
		System.out.println("getting emploi..");
		String nom = X.getNom();

		String req = "insert into employe values('" + id1 + "','" + m2p1 + "','" + nom + "','" + emploie
				+ "','manara')";
		statement.executeUpdate(req);
		System.out.println("its going...");
	}

	public static void modifier2(String id) throws ClassNotFoundException, SQLException {
		if (verif(id, "livre", "idL")) {

			if (Z.c1.isSelected()) {
				String id1 = modeleHello.generate(6);
				System.out.println(id1);
				Z.idLm.setText(id1);
				System.out.println("getting id...");
				String req = "update livre set idL='" + id1 + "' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Z.c2.isSelected()) {
				String titre = Z.getTitreM();
				System.out.println("getting tit...");
				String req = "update livre set titre='" + titre + "' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Z.c3.isSelected()) {
				String auteur = Z.getAuteurM();

				String req = "update livre set auteur='" + auteur + "' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Z.c4.isSelected()) {
				String editeur = Z.getEditeurM();
				System.out.println("getting emploi..");
				String req = "update livre set editeur='" + editeur + "' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Z.c5.isSelected()) {
				String date = Z.getDateEm();
				System.out.println("getting emploi..");
				String req = "update livre set date_E='" + date + "' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Z.br1.isSelected()) {
				Z.br2.setSelected(false);
				String req = "update livre set etat='D' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			} else if (Z.br2.isSelected()) {
				Z.br1.setSelected(false);
				String req = "update livre set etat='R' where idL='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
		}

	}

	public static void modifier1(String id) throws ClassNotFoundException, SQLException {

		if (verif(id, "adherant", "id")) {

			if (Y.c1.isSelected()) {
				String id1 = modeleHello.generate(6);
				System.out.println(id1);
				Y.idAm.setText(id1);
				System.out.println("getting id...");
				String req = "update adherant set id='" + id1 + "' where id='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Y.c2.isSelected()) {
				String m2p1 = modeleHello.generate(6);
				Y.m2pM.setText(m2p1);
				System.out.println("getting m2p...");
				String req = "update adherant set m2p='" + m2p1 + "' where id='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Y.c3.isSelected()) {
				String nom = Y.getNomM();
				System.out.println(nom);
				String req = "update adherant set nom='" + nom + "' where id='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Y.c4.isSelected()) {
				String email = Y.getEmailM();
				System.out.println("getting emploi..");
				String req = "update adherant set emploie='" + email + "' where id='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (Y.c5.isSelected()) {
				String nb = Y.getNbM();
				System.out.println("getting emploi..");
				String req = "update adherant set nbL='" + nb + "' where id='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
		}

	}

	public static boolean verif(String id, String table, String cle) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String req1 = "select " + cle + " from " + table + " where " + cle + "='" + id + "'";
		rs = statement.executeQuery(req1);
		while (rs.next()) {
			String id1 = rs.getString(cle);
			if (id.equals(id1))
				return true;
			else {
				System.out.println("no");
				return false;
			}
		}
		return false;
	}

	public static void modifier() throws SQLException, ClassNotFoundException {

		String id = X.getItem_name();
		if (verif(id, "employe", "idEm")) {

			if (X.c1.isSelected()) {
				String id1 = modeleHello.generate(6);
				System.out.println(id1);
				X.idEmM.setText(id1);
				System.out.println("getting id...");
				String req = "update employe set idEm='" + id1 + "' where idEm='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (X.c2.isSelected()) {
				String m2p1 = modeleHello.generate(6);
				X.m2pM.setText(m2p1);
				System.out.println("getting m2p...");
				String req = "update employe set m2p='" + m2p1 + "' where idEm='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (X.c3.isSelected()) {
				String nom = X.getNomM();
				System.out.println(nom);
				String req = "update employe set nom='" + nom + "' where idEm='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
			if (X.c4.isSelected()) {
				String emploie = X.getEmploieM();
				System.out.println("getting emploi..");
				String req = "update employe set emploie='" + emploie + "' where idEm='" + id + "'";
				statement.executeUpdate(req);
				System.out.println("its going...");
			}
		} else
			System.out.println("dont exist");
	}

	public static void supprimer2() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String id = Z.getIdSupp();
		System.out.println("getting id..");
		String req = "delete from livre where idL='" + id + "'";
		statement.executeUpdate(req);
		System.out.println("its going...");

	}

	public static void supprimer1() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String id = Y.getIdSupp();
		System.out.println("getting id..");
		String req = "delete from adherant where id='" + id + "'";
		statement.executeUpdate(req);
		System.out.println("its going...");

	}

	public static void supprimer() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		System.out.println("connection secceeded");
		String id = null;
		if (!X.getIdSupp().equals("")) {
			if (verif(X.getIdSupp(), "employe", "idEm"))
				id = X.getIdSupp();
			else
				X.idSupp.setBackground(Color.red);
			Modele.estExist();
		} else
			Modele.estVide();
		System.out.println("getting id..");
		String req = "delete from employe where idEm='" + id + "'";
		statement.executeUpdate(req);
		System.out.println("its going...");
	}

	public static void ajoutPret() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);
		Statement statement1 = null;
		Statement statement2 = null;
		Statement statement3 = null;
		statement = connect.createStatement();
		statement1 = connect.createStatement();
		statement2 = connect.createStatement();
		statement3 = connect.createStatement();
		System.out.println("connection secceeded");
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yy");
		String d1 = form.format(calendar.getTime());
		String d2 = modeleHello.calculDate(calendar);
		String idA = null;
		if (!GestionP.getIdA().equals(""))
			idA = GestionP.getIdA();
		else
			Modele.estVide();
		String idL = null;
		if (!GestionP.getIdL().equals(""))
			idL = GestionP.getIdL();
		else
			Modele.estVide();
		ResultSet rs = statement1.executeQuery("select etat from livre where idL='" + idL + "'");
		ResultSet rs1 = statement2.executeQuery("select nbL from adherant where id='" + idA + "'");
		ResultSet rs2 = statement3.executeQuery("select date_exp from pret where idA='" + idA + "' and idL='"+idL+"'");
		    if (verifEtat(rs) && verifNB(rs1) && verifdate(rs2)) {
			int nbl = rs1.getInt("nbL");
			String req1 = "insert into pret values ('" + d1 + "','" + d2 + "','" + idA + "','" + idL + "','non')";
			String req2 = "update livre set etat='R' where idL='" + idL + "'";
			nbl++;
			String req3 = "update adherant set nbL=" + nbl + " where id='" + idA + "'";
			statement.executeUpdate(req1);
			statement.executeUpdate(req2);
			statement.executeUpdate(req3);
			System.out.println("oumourha wadh7a");
			
			
		}else if (!verifdate(rs)) {
			JOptionPane.showMessageDialog(new JFrame(), "vous n avez pas rendu le 1er livre!", "Message",
					JOptionPane.ERROR_MESSAGE);
		}

		    else if (!verifNB(rs1)) {
			JOptionPane.showMessageDialog(new JFrame(), "vous avez atteint le nb max de pret!", "Message",
					JOptionPane.ERROR_MESSAGE);
		}
		    else if (!verifEtat(rs)) {
			JOptionPane.showMessageDialog(new JFrame(), "ce livre n est pas disponible!", "Message",
					JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	private static boolean verifExist(ResultSet rs, String id) throws SQLException {
		while (rs.next()) {

			String id1 = rs.getString(id);
			if (id1.equals(id))
				return true;
			return false;
		}
		return false;
	}

	private static boolean verifEtat(ResultSet rs) throws SQLException {
		while (rs.next()) {

			String etat = rs.getString("etat");
			if (etat.equals("D"))
				return true;
			return false;
		}
		return false;
	}

	private static boolean verifNB(ResultSet rs) throws SQLException {

		while (rs.next()) {

			int nb = rs.getInt("nbL");
			if (nb < 2)
				return true;
			return false;
		}
		return false;
	}

	private static boolean verifdate(ResultSet rs) throws SQLException {
		String d = modeleHello.date();
		while (rs.next()) {

			int d1 = rs.getInt("date_exp");
			if (!d.equals(d1))
				return true;
			return false;
		}
		return false;
	}

	public static void annulPret() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager
				.getConnection("jdbc:mysql://" + host + "/bibliotheque?" + "user=" + user + "&password=" + passwd);

		statement = connect.createStatement();
		Statement statement1 = connect.createStatement();
		Statement statement2 = connect.createStatement();
		Statement statement3 = connect.createStatement();
		System.out.println("connection secceeded");

		String id = "";

		if (!GestionP.getIdLm().equals("")) {
			ResultSet rs0 = statement1.executeQuery("select nbL from adherant where id='" + GestionP.getIdLm() + "'");
			if (verifExist(rs0, GestionP.getIdLm()))
				id = GestionP.getIdLm();
			else
				Modele.estExist();
		} else
			Modele.estVide();
		String id1 = "";
		if (!GestionP.getIdAm().equals(""))
			id1 = GestionP.getIdAm();
		else
			Modele.estVide();
		System.out.println("getting id..");
		ResultSet rs1 = statement1.executeQuery("select nbL from adherant where id='" + id1 + "'");
		int n = NB(rs1);
		String req = "delete from pret where idL='" + id + "' and idA='" + id1 + "'";
		statement.executeUpdate(req);
		statement2.executeUpdate("update adherant set nbL=" + n + " where id='" + id1 + "'");
		statement3.executeUpdate("update livre set etat='D' where idL='" + id + "'");
		System.out.println("its going...");
	}

	private static int NB(ResultSet rs) throws SQLException {
		int n = 0;
		while (rs.next())
			n = rs.getInt("nbL");
		return n - 1;

	}

	

}
