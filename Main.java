/*
 * Main.java
 *
 * Created on 14 août 2004, 10:44
 */

/**
 *
 * @author  maramorosz
 */
/*Classe Main
 *la classe main permet de se diriger a l'aide du meu vers 
 *les differentes partie du programme*/
import java.io.*;
public class Main {
    /** Creation new instance  */
   public Main() {
    }
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException,ClassNotFoundException{
        int choix;
        GlobalPersonne c = new GlobalPersonne();
        Fichier f=new Fichier();
        if(f.ouvrir("lecture"))
        {
        c=f.lire();
        f.fermer();
        }
        do
        {
            System.out.println("\n");
            choix=menu();
            switch(choix)
            {
                case 1 : c.ajouterPersonne();
                break;
                
                case 2 : c.rechercherPersonne();
                break;
                
                case 3 : c.afficherListe();
                break;
                
                case 4 : f.ouvrir("ecriture");
                f.ecrire(c);
                f.fermer();
                System.out.println("fichier sauvegarder!");
                break;
                
                case 5 : System.exit(0);
                break;       
            }
        } while(choix!=5);
    	
    }
   
    /** Le menu vers les differentes partie de l'app */
    public static int menu()
    {
        
        int choix;
        System.out.println(" ''''             MENU PRINCIPAL          ''''");
        System.out.println("        ----------------------------------");
        System.out.println("        1 .Ajouter une personne");
        System.out.println("        2.Rechercher une personne");
        System.out.println("        3.Afficher la liste");
        System.out.println("        4.Sauvegarder");
        System.out.println("        5.Sortir");
        System.out.println("        -----------------------------------");
        System.out.print("          votre choix : ");
        choix=Lire.i();
        return choix;
    }
    	
    
}

    
    

