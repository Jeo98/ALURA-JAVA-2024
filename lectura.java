
import java.util.Scanner;


public class lectura{

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Escribre el nombre de tu pelicula favorita: ");
        String nombrePelicula= teclado.nextLine();
        System.out.println("Escribe el año de lanzamiento: ");
        int fechaDelanzamiento = teclado.nextInt();
        System.out.println("califica la pelicula: ");
        double nota=teclado.nextDouble();

        System.out.println("Pelicula: " + nombrePelicula+ "\nLanzamiento: " + fechaDelanzamiento + "\n calificacion: " + nota);

        teclado.close();
    }


}