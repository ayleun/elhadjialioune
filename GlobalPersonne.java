
import java.util.*;

import MaBD.ConnB;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GlobalPersonne implements Serializable {
 
    private Vector listePersonne;
    public GlobalPersonne() {
       listePersonne= new Vector();   
    }
    
    public void ajouterPersonne()
    {
        listePersonne.addElement(new Personne());
    }
    public void rechercherPersonne()
    {
        String verifNom;
        String verifPrenom;
        String catchNom;
        String catchPrenom;
        int size;
        int i;
        int present=0;
        Personne temp;
        System.out.println( "Veillez entrer le nom : ");
        verifNom=Lire.S();
        System.out.println("Veillez entrer le prenom : ");
        verifPrenom=Lire.S();
        size=listePersonne.size();
        /*Cette boucle va me permettre de verifier le nom et le prenom de la 
         * personne à rechercher*/
        
        for(i=0;i<size;i++)
        {
            temp=(Personne)listePersonne.elementAt(i);//cast
            catchNom=temp.envoyerNom();//recupere le nom de la classe personne
            catchPrenom=temp.envoyerPrenom();//recupere le prenom de la classe personne
            if((verifNom.equals(catchNom))&&(verifPrenom.equals(catchPrenom)))
            {
            present++;
            //incremente si nom et prenom egale//
            temp.afficherPersonne();
            }
        }
        if(present==0)
            System.out.println("La personne n'est pas presente dans la liste !");     
    }
    
    
    public void afficherListe()
    {
        int i;
        int size;
        Personne temp;
        size=listePersonne.size();
        if(size==0)
            System.out.println(" Liste vide !");
        else
        {
            System.out.print("\n");   
        for(i=0;i<size;i++)
        {
            temp=(Personne)listePersonne.elementAt(i);
            temp.afficherPersonne();
        }
        }
            
    }
    
    
}
