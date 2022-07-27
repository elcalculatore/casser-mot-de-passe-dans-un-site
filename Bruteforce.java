import java.util.*;
public class Bruteforce implements Attaque{
    public Bruteforce(){
    }
    public ArrayList<String> CreerAttaque(){
        String[] alphabet = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M","1","2","3","4","5","6","7","8","9","0","q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","m","n"};
    ArrayList<String> password = new ArrayList<String>();
	for(String c : alphabet){
		for(String c1 : alphabet){
			for(String c2 : alphabet){
				for(String c3 : alphabet){
					String mot =c+c1+c2+c3;
					password.add(mot);
					if(mot.equals("nnnn")){
						String mot1;
						for(String c4 : alphabet){
							mot1 = mot+c4;password.add(mot1);
							if(mot1.equals("nnnnn")){
								String mot2;
								for(String c5 : alphabet){
									mot2 = mot1+c5;password.add(mot2);
									if(mot2.equals("nnnnnn")){
										String mot3;
										for(String c6 : alphabet){
											mot3 = mot2+c6;password.add(mot3);
											if(mot3.equals("nnnnnnn")){
												String mot4;
												for(String c7 : alphabet){
													mot4 = mot3+c7;password.add(mot4);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}	
		}
	}
	return (password);
}
}