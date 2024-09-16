
import java.util.Scanner;

public class loops{

    public static void main(String[] args) {
        
        Scanner lectura=new Scanner(System.in);
        double nota=0;
        double mediaEvaluaciones=0;
        int i=0;
        for (i = 0 ; i < 3 ; i++) {

            System.out.println("Ingresa la nota que le darias a la pelicula Matrix: ");
            nota = lectura.nextDouble();
            mediaEvaluaciones += nota;

        }
        System.out.println("Media: " + mediaEvaluaciones/i+1);
            
     }

    }
