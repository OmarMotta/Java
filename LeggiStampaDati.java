//leggi StampaDati.Java
//Programma per leggere e stampare dati di diverso tipo (stringhe e numeri)

import java.io.*;

class leggiStampaDati {
    public static void main(String args[]){
        
        //Impostazione di stream di input
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        //Area dichiarativa
        String nome, numeroLetto;
        int eta;
        Float media;

        //Area esecutiva
        //Lettura di una stringa senza controllo, sull'input
        System.out.print ("Inserisci il tuo nome: ");
        try{
            nome = tastiera.readLine();
        }catch(IOException e){
            System.out.println("Errore di inserimento del nome");
            return;
        }
        //Lettura di un valore intero con controllo sull'input 
        System.out.print ("Inserisci la tua età: ");
        try{
            numeroLetto = tastiera.readLine();
            eta = Integer.valueOf(numeroLetto).intValue();
        }catch(Exception e){
            System.out.println("L'età deve essere un numero interno");
            return;
        }
        //Lettura di un valore reale con cntrollo sull'Input
        System.out.print("Inserisci la media dei tuoi voti: ");
        try{
            numeroLetto = tastiera.readLine();
            media = Float.valueOf(numeroLetto).floatValue();
        }catch(Exception e){
            System.out.println("Inserisci un valore corretto per la media");
            return;
        }
        //Stampa dei dati concatenati
        System.out.println("Nome: " +nome +" Età: " + eta + " Media voti: " + media);
    }
}