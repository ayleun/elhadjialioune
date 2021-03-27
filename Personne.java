/*
 * Personne.java
 */
/**
 *
 * @author  Elaz
 */
import java.io.*;
public class Personne implements Serializable{ 
	private static final long serialVersionUID = 1L;	
	private String nom, prenom, numero;
    /**Initialisation de mes variables */
	
	
    public Personne() 
    {
        System.out.println("Nom : ");
    nom=Lire.S();
    System.out.println("Prenom : ");
    prenom=Lire.S();
    System.out.println("Numero telephone ) : ");
    numero=Lire.S();
    }
    public void afficherPersonne()
    {
        System.out.println(nom+"/"+prenom+"/"+numero);
    }
    public String envoyerNom()
    {
        return nom;
    }
     public String envoyerPrenom()
    {
        return prenom;
    }
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    public String toString() {
    	return "Prenom: " + prenom + ", " + "Nom: " + nom + ", " + "Tel: " + numero; 
    }
}
