import java.util.Scanner;
public class Modul3Fase1 {

	public static void main(String[] args) {
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		Scanner nomCiutat = new Scanner(System.in);

	    System.out.println("Introduiex el nom de la ciutat1");
	    ciutat1 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la ciutat2");
	    ciutat2 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la ciutat3");
	    ciutat3 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la ciutat4");
	    ciutat4 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la ciutat5");
	    ciutat5 = nomCiutat.nextLine();
	    System.out.println("Introduiex el nom de la ciutat6");
	    ciutat6 = nomCiutat.nextLine();
	    nomCiutat.close();
	    
	    System.out.println("Les ciutats són: "+ciutat1+" "+ciutat2+" "+ciutat3+" "+ciutat4+" "+ciutat5+" "+ciutat6);
		

	
		
	}

}
