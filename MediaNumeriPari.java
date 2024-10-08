import java.io.*;

public class MediaNumeriPari {
	public static void main(String args[]) {
	//Impostazione dello stream di input
	
	InputStreamReader input = new InputStreamReader (System.in);
	BufferedReader tastiera = new BufferedReader(input);

	//Area dichiarativa 
	
	int sommaPari = 0, contaPari = 0, num, i;
	float media;
	String numeroLetto;
	
	//Area esecutiva
	
	for(i=0;i<10;i++){
		System.out.print("Numero " + (i+1) + ":");
	try{
		numeroLetto = tastiera.readLine();
		num = Integer.valueOf(numeroLetto).intValue();
	}catch(Exception e){
		System.out.println("E' necessario inserire un numero intero :");
		return;
	}
	
	//Controllo numero pari
	
	if(num%2 == 0){
		sommaPari += num;
		contaPari +=1;
	}
}
	
	//Calcolo la media 
	
	media = sommaPari/contaPari;
	System.out.print("la media dei numeri pari è: "+media);
	
	}
}
	
	