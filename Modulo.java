	//Modulo.java

import java.io.*;

public class Modulo{
	
	//Impostiamo lo stream di input
	
	public static void main(String[] args){
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
	
	//Area dichiarativa
	
		String numeroLetto;
		int x, y, risultatoDifferenza, risultatoModulo;
		
	//Area esecutiva
	
		do{
			System.out.print("Inserisci un numero x maggiore di 50: ");
			try{
				numeroLetto = tastiera.readLine();
				x = Integer.valueOf(numeroLetto).intValue();
			}catch(Exception e){
				return;
			}
		}while(x<=50);
		do{
			System.out.print("Inserisci un numero y compreso tra 1 e 10: ");
			try{
				numeroLetto = tastiera.readLine();
				y = Integer.valueOf(numeroLetto).intValue();
			}catch(Exception e){
				return;
			}
		}while(y < 1 || y > 10);
		risultatoModulo = x%y;
		risultatoDifferenza = x;
		do{
			risultatoDifferenza -= y;
		}while(risultatoDifferenza != risultatoModulo);
		System.out.println("Usando l'operazione aritmetica, x%y vale: "+risultatoDifferenza);
		System.out.println("e anche l'algoritmo trova il valore: "+risultatoModulo);
	}
}