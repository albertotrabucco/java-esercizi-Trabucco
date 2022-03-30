package calculator;
import java.util.Scanner;
import java.lang.Math;


public class Calculator {

    //funzione della somma di due numeri

    public static int addiction(int primoPar, int secondoPar){
        return primoPar + secondoPar;
    }

    //funzione della differenza di due numeri
    public static int subtracton(int primoPar, int secondoPar){
        return primoPar - secondoPar;
    }

    //funzione della moltiplicazione di due numeri
    public static int multiplication(int primoPar, int secondoPar){
        return primoPar * secondoPar;
    }

    //funzione della divisione di due numeri
    public static int division(int primoPar, int secondoPar){
        if(secondoPar != 0)
            return primoPar / secondoPar;
        else{
            System.out.println("Errore! Non si può dividere per zero!");
            System.exit(1);
        }
        return 0;
    }

    //funzione per controllare la divisibilità di un numero rispetto ad un altro
    public static boolean isDivisible(int parDivisibile, int parDiDivisibilita){
        return parDivisibile % parDiDivisibilita == 0;
    }


    public static void main(String[] args){
        int primoParametro;
        int secondoParametro;
        double angolo;
        char nextOperation;

        do{
            System.out.println("\t****SCEGLIERE TRA LE SEGUENTI OPERAZIONI:\n" +
                    "1)SOMMA\n" +
                    "2)DIFFERENZA\n" +
                    "3)MOLTIPLICAZIONE\n" +
                    "4)DIVISIONE\n" +
                    "5)SENO\n" +
                    "6)COSENO\n" +
                    "7)TANGENTE\n" +
                    "8)DIVISIBILITA'");

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Scegli l'operazione da eseguire:\t");
            int operatore = keyboard.nextInt();

            switch(operatore){
                case 1: //somma
                    System.out.println("Inserisci il primo parametro");
                    primoParametro = keyboard.nextInt();
                    System.out.println("Inserisci il secondo parametro");
                    secondoParametro = keyboard.nextInt();
                    System.out.println("Il risultato è: " + addiction(primoParametro,secondoParametro));
                    break;

                case 2: //differenza
                    System.out.println("Inserisci il primo parametro");
                    primoParametro = keyboard.nextInt();
                    System.out.println("Inserisci il secondo parametro");
                    secondoParametro = keyboard.nextInt();
                    System.out.println("Il risultato è: " + subtracton(primoParametro,secondoParametro));
                    break;

                case 3: //moltiplicazione
                    System.out.println("Inserisci il primo parametro");
                    primoParametro = keyboard.nextInt();
                    System.out.println("Inserisci il secondo parametro");
                    secondoParametro = keyboard.nextInt();
                    System.out.println("Il risultato è: " + multiplication(primoParametro,secondoParametro));
                    break;

                case 4: //divisione
                    System.out.println("Inserisci il primo parametro");
                    primoParametro = keyboard.nextInt();
                    System.out.println("Inserisci il secondo parametro");
                    secondoParametro = keyboard.nextInt();
                System.out.println("Il risultato è: " + division(primoParametro,secondoParametro));
                    break;

                case 5: //seno
                    System.out.println("Inserisci il valore dell'angolo");
                    angolo = keyboard.nextDouble();
                    double sinResult = Math.sin(Math.toRadians(angolo));
                    System.out.println("Il risultato del seno è: " + sinResult);
                    break;

                case 6: //coseno
                    System.out.println("Inserisci il valore dell'angolo");
                    angolo = keyboard.nextDouble();
                    double cosResult = Math.cos(Math.toRadians(angolo));
                    System.out.println("Il risultato del coseno è: " + cosResult);
                    break;

                case 7: //tangente
                    System.out.println("Inserisci il valore dell'angolo:");
                    angolo = keyboard.nextDouble();
                    double tanResult = Math.tan(Math.toRadians(angolo));
                    System.out.println("Il risultato della tangente è: " + tanResult);
                    break;

                case 8: //check divisibilità
                    System.out.println("Inserisci il numero di cui vuoi controllare la divisibilità");
                    primoParametro = keyboard.nextInt();
                    System.out.println("Inserisci il criterio di divisibilità");
                    secondoParametro = keyboard.nextInt();
                    if(isDivisible(primoParametro,secondoParametro))
                        System.out.println(primoParametro + " è divisibile per " + secondoParametro);
                    else
                        System.out.println(primoParametro + " non è divisibile per " + secondoParametro);
                    break;

                default:
                    System.out.println("OPERAZIONE NON PRESENTE!");
                    break;
            }

            System.out.println("Eseguire una nuova operazione? [y/n] ");
            nextOperation = keyboard.next().charAt(0);

            //pulizia della console
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }while(nextOperation == 'y');
    }
}
