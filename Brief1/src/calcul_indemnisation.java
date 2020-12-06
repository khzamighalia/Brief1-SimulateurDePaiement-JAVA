/*** 
 */
package Brief1;
 
import java.util.Scanner;
/**
 * @author Admin
 *
 */
public class calcul_indemnisation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Bonjour ");
	    System.out.println("Quel est votre prénom ?");
	    String prenom = reader.nextLine();
	    System.out.println("Quel est votre nom ?");
	    String nom = reader.nextLine();
	    System.out.println("Bonjour, "+prenom+" "+nom);
	    System.out.println("Quel est le nombre d'heures travaillés ?");
	    int heures = reader.nextInt();
	    if (heures <=60) {
	    	System.out.println("Quel est le tarif ?");
		    double tarif = reader.nextDouble();
		   if(heures<= 40) {
			   System.out.println("Votre tarif est de"+(tarif*heures));
		   }
		   else {
			  double tt=tarif*40 +(tarif+ 0.5*tarif)*(heures-40);
			  System.out.println("Votre tarif est de"+tt);
		   }
		    
	    }
	    else if (heures > 70) {
	    	System.out.println("informations erronés !");
	    }
	    reader.close();
	}

}
