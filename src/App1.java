
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.SQLException;
import controleur1.Control1;
import controleur1.Control2;
import controleur1.Control3;
import controleur1.Login;
import modele1.modeleHello;
import vue1.Login1;

public class App1 {
	public static void main(String argv[]) throws IOException, HeadlessException, ClassNotFoundException, SQLException {

		Login1 v1 = new Login1();
		modeleHello m = null;
		Login l = new Login(v1, m);
		Control1 c1 = new Control1(v1, m);
		Control2 c2 = new Control2(v1, m);
		Control3 c3 = new Control3(v1, m);
		l.initControl();
		c2.initControlEmploye();
		c3.initControlAdherant();
		c1.initControlGerant();
	}

}
