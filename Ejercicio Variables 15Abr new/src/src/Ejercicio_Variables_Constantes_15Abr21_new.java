package src;
public class Ejercicio_Variables_Constantes_15Abr21_new {

	public static void main(String[] args) {
		String nom="Frederic";
		String cognom1="Campínyez";
		String cognom2="Martínez";
		int dia = 14;
		int mes = 6;
		int any = 1975;
		
		System.out.println("El meu nom és " + nom+" i els meus cognoms son "+cognom1+" "+cognom2+".");
		System.out.println("Vaig nèixer el "+dia+" / "+mes+" / "+any+".");
		System.out.print("Els anys ");
		final int inicio = 1948;
		final int ciclo = 4;
		int anysTraspas = 0;
		int limite = any-inicio;
		boolean bisext = false;
		for (int i=0 ; i<=limite; i++) {
			int resto = i%ciclo;
			if (resto == 0) {
				System.out.print((inicio+i)+" ");
				anysTraspas ++;
			}
			if (i==limite) {
				resto = i%ciclo;
				if (resto == 0) {
					bisext=true;
				}
				
			}
		}
		System.out.print("son de traspàs. ");
		System.out.println("El nombre d'anys de traspàs desde "+inicio+" fins a "+any+" son "+anysTraspas+ " anys.");
		if (bisext==true) {
			System.out.print("L'any " + any + " que és el del meu naixement, és de traspàs.");
		}else {System.out.print("L'any " + any + " que és el del meu naixement, no és de traspàs.");
		
		}
	}
}
