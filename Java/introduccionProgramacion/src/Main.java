public class Main {
    public static void main(String[] args) {
        suma(4, 3, 13);
        Coche miCoche = new Coche();
        miCoche.puertasAum();
        miCoche.puertasAum();
        System.out.println(miCoche.numPuertas);
    }

    //Ejercicio #1
    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //Ejercicio #2
    static class Coche{
        public int numPuertas = 0;

        public void puertasAum (){
            this.numPuertas++;
        }

    }
}