public class Tema3 {
    public static void ejercicios_tema3(){
        suma(4, 3, 13);
        Coche miCoche = new Coche();
        miCoche.puertasAum();
        miCoche.puertasAum();
        System.out.println(miCoche.numPuertas);

    }

    //Ejercicio #1
    private static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }
    //Ejercicio #2
    public static class Coche{
        public int numPuertas = 0;

        public void puertasAum (){
            this.numPuertas++;
        }

    }
}
