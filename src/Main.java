public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la primera inmersion de Java!");
        // System.out.println("Matrix");

        // Declaracion de variables para Matrix :
        int fechaDelanzamiento =  1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacion = (4.8 + 4.1 + 2.6) / 3;
        String nombre = "Matrix";
        String sinopsis = """
                Es una pelicula que a tenido buena recepcion tanto del publico como  de la critica
                """;
        double mediaEvaluacionUsuario = 0;

        if (fechaDelanzamiento >= 2023){
            System.out.println("Actualmente buena");
        } else{
            System.out.println("Retro buena");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Califica la pelicula");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula" +
                "Matrix calculada es: " + mediaEvaluacionUsuario / 3);



        // Impresion en pantalla
        System.out.println("Pelicula:" + nombre);
        System.out.println("Fecha de lanzamiento:" + fechaDelanzamiento);
        System.out.println("Evaluacion:" + evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println("Sinopsis:" + sinopsis);




    }
}