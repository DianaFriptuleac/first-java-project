import java.util.Scanner;

//il metodo main() è il punto di ingresso del programma.
// È il metodo che viene eseguito per primo quando avvii il programma.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("---------------------EX1-IF-----------------------");
        //Un programma che chieda all'utente di inserire 3 nr. e determini il piu grande tra i 3.

        System.out.println("Inserisci il primo numero");
        int x = myScanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int y = myScanner.nextInt();
        System.out.println("Inserisci il terzo numero");
        int z = myScanner.nextInt();

        if(x > y && x > z ) {
            System.out.println(x +" e il numero piu grande");
        } else if(y > x && y > z) {
            System.out.println(y +" e il numero piu grande");
        } else if (z > x && z > y) {
            System.out.println(z +" e il numero piu grande");
        } else if (x == y && x > z) {
            System.out.println(x + " e " + y  +" sono uguali e sono i piu grandi");
        } else if (x == z && x > y) {
            System.out.println(x + " e " + z  +" sono uguali e sono i piu grandi");
        } else if (z == y && z > x) {
            System.out.println(z + " e " + y  +" sono uguali e sono i piu grandi");
        } else {
            System.out.println(" I numeri sono uguali");
        }

        System.out.println("---------------------EX2-Switch-----------------------");
        //Un programma che chieda all'utente di inserire 2 nr. ed un'operazione e si stami il risultato dell'operazione scelta.

        System.out.println("Inserisci il primo numero");
        // legge un numero intero (di tipo int) inserito dall'utente e lo memorizza nella variabile num1.
        int num1 = myScanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int num2 = myScanner.nextInt();
        System.out.println("Inserisci l'operazione");
       //myScanner.next() - legge una stringa (l'operazione inserita dall'utente),
        //charAt(0) - prende il primo carattere di quella stringa.
        // Questo carattere viene salvato nella variabile oper, che è di tipo char.
        char oper = myScanner.next().charAt(0);

       int result = 0;
       boolean validOperation = true; //gestisco le operazioni non valide

       switch (oper) {
           case '+':
               result = num1 + num2;
               break;
           case '-':
               result = num1 - num2;
               break;
           case '/':
               if (num2 != 0) {
                   result = num1 / num2;
               } else {
                   System.out.println("Errore: divisione per zero");
                   validOperation = false;
               }
               break;
           case '*':
               result = num1 * num2;
               break;
           default:
               System.out.println("operazione non valida!");
               validOperation = false;
               break;
       }
       //stampo il result solo se l'operatione e valida
        if(validOperation) {
            System.out.println("Result: " + result);
        }

        System.out.println("---------------------EX3-While-----------------------");
        //Scrivi un programma che chieda all'utente di inserire dei numeri e conti quanti di questi sono pari.
        //Il programma chiedera i nr fino a quando non verra inserito lo zero.

        int myNr;
        int sumNr =0;
        int sumDis = 0;
        System.out.println("Inserisci i numeri, zero per uscire");
        while(true) {
            System.out.println("Inserisci un nr");
            myNr = myScanner.nextInt();
            if(myNr % 2 ==0){
               sumNr ++;
               System.out.println("Il nr dei numeri pari e: "+sumNr);
            }
        if(myNr % 2 != 0) {
            sumDis++;
            System.out.println("Il nr dei numeri dispari e: "+sumDis);
        }
        if(myNr == 0){
            break;
        }

    }
        System.out.println("---------------------EX4-For-----------------------");
        //Scrivi un programma che chieda all'utente di inserire 10 nr. e memorizzi questi nr in un array.
        //Deve calcolare e sttampare la media dei nr e anche il nr massimo

        int[] numbers = new int[10];
        int sumOfNr = 0;  //la somma dei nr
        int max = Integer.MIN_VALUE; //per trovare in nr. massimo
        //Integer.MIN_VALUE è una costante definita nella classe Integer di Java.
        //appresenta il valore più piccolo che può essere memorizzato in una variabile di tipo int, ovvero -2^31, che è -2.147.483.648.

        // Ciclo per inserire i numeri e calcolare somma e massimo
        for(int i = 0; i < numbers.length; i++ ) {
            System.out.println("Inserisci un numero");
            numbers[i] = myScanner.nextInt();
            //Aggiungo il nr. alla somma
            sumOfNr += numbers[i];
            //Verifico se il nr coorente e il massimo
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        //Cacola la media
        int media = (int) sumOfNr / numbers.length;
    //Stampo l'array
        System.out.println("Stampo l'array di numeri");
        for(int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }
        //stampo la media e la somma
        System.out.println("La media dei nr: "+ media);
        System.out.println("Il nr massimo e: "+ max);

    }
}