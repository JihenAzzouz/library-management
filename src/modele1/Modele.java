package modele1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Modele {
 public static void estVide()
 {
	 String message = "\"Erreur!\"\n" + "le champs est vide!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
 public static void estNombre()
 {
	 String message = "\"Erreur!\"\n" + "le champs doit contenir des valeurs numerique!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
 public static void estExist()
 {
	 String message = "\"Erreur!\"\n" + "Cet ID n existe pas!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
 public static void estAjout()
 {
	 String message = "\"Secces!\"\n" + "Succes d ajout!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
 public static void estSupp()
 {
	 String message = "\"Secces!\"\n" + "Succes de supprission!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
 public static void estModif()
 {
	 String message = "\"Secces!\"\n" + "Succes de modification!";
		JOptionPane.showMessageDialog(new JFrame(), message, "Message", JOptionPane.ERROR_MESSAGE);
 }
}
