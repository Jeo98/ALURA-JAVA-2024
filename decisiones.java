public class decisiones{

    public static void main(String[] args) {

        int fechaLanzamiento = 1999;
        double calificacion= 7.1;
        boolean incluidoEnPlan= false;
        String tipoPlan="plus";

        if (fechaLanzamiento >= 2022){
            System.out.println("Peliculas más actuales");
        }
        else{
            System.out.println("Peliculas Retro");
        }

        if( incluidoEnPlan && tipoPlan.equals("plus")){

            System.out.println("Disfrute de su pelicula🙌");
        }
        else{
            System.out.println("Pelicula no disponible, actualice su plan");
        }
    }
}