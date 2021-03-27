/*
 * Fichier.java
 *
 * Created on 14 août 2004, 16:25
 */

/**
 *
 * @author  maramorosz
 */
import java.io.*;
public class Fichier {
    
    /** Creation new instance  */
    private ObjectOutputStream fW;
    private ObjectInputStream fR;
    private String nomDeFichier="Fichier.dat";
    private char mode;
    public Fichier() {
        
    }

    public boolean ouvrir(String s)throws IOException
    {
        try
        {
        mode=(s.toUpperCase()).charAt(0);
        if(mode=='R'||mode=='L')
            fR=new ObjectInputStream(new FileInputStream(nomDeFichier));
        else if(mode=='W'||mode=='E')
            fW=new ObjectOutputStream(new FileOutputStream(nomDeFichier));
        return true;
        }
        catch( IOException e) 
        {
            return false;
        }
    }
    public void ecrire(GlobalPersonne tmp) throws IOException
    {
        if(tmp!=null)fW.writeObject(tmp);
    }
    public GlobalPersonne lire()throws IOException,ClassNotFoundException
    {
      GlobalPersonne tmp=( GlobalPersonne)fR.readObject();
      return tmp;
    }
    public void fermer()throws IOException
    {
       if(mode=='R'||mode=='L')
            fR.close();
        else if(mode=='W'||mode=='E')
            fW.close();
    }
}
