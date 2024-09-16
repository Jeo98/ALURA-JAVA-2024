import java.util.Random;
import java.util.Scanner;
public class desafioclase03{

    public static void main(String[] args) {
        
        /**
         * 
         * Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que 
         * intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que 
         * el número generado.

            Consejos:

            Para generar un número aleatorio en Java: new Random().nextInt(100);

            Utiliza el Scanner para obtener los datos del usuario.

            Utiliza una variable para contar los intentos.

            Utiliza un bucle para controlar los intentos.

            Utiliza la instrucción ‘break;’ para salir del bucle.
         * 
         */
        Scanner lectura=new Scanner(System.in);

        int menu=0, opcion=0;

        while(menu == 0 ){

            System.out.println("JUEGO DE ADIVINANZA\n\n");
            System.out.println("1 - jugar\n2 - salir");
            opcion=lectura.nextInt();
            int numeroaleatorio= new Random().nextInt(100), numerousuario=0, intentos=0, intentosmaximos=3;
            boolean control=true;
            

            switch(opcion){

                case 1: 
                    while(intentos <intentosmaximos && control){
                        
                        System.out.println("ingresa el numero: ");
                        numerousuario=lectura.nextInt();
                        if(numerousuario == numeroaleatorio){
                            System.out.println("ACERTASTE!! EL NUMERO ES " + numeroaleatorio);
                            control=false;
                        }
                        else{
                            System.out.println("INCORRECTO...\n Te quedan " + intentos +1 + " de "+ (intentosmaximos+1) +" intentos"); 

                            if(intentos == intentosmaximos){
                                System.out.println("Perdiste! te quedaste sin intentos... El numero era: " + numeroaleatorio);
                                System.out.println("Vuelve a intentarlo!");
                            }

                        }

                        intentos++;    
                        
                    }
                break;

                case 2:
                        System.out.println("¡Gracias por jugar!");
                        menu=1; //salida de bucle menu
                break;


            }

        }

    }

}