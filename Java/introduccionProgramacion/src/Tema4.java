public class Tema4 {
    public static void ejercicios_tema4() {
        //Ejercicio #1
        System.out.println("Ejercicio IF");
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        //Ejercicio #2
        System.out.println("Ejercicio While");
        int numeroWhile = 1;

        while (numeroWhile <= 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }


        //Ejercicio #3
        System.out.println("Ejercicio Do While");
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);


        //Ejercicio #4
        System.out.println("Ejercicio for");
        for (int numeroFor=0; numeroFor <= 3; numeroFor +=1 ) {
            System.out.println(numeroFor);
        }

        //Ejercicio #5
        System.out.println("Ejercicio switch");
        String estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("Estamos en verano!!");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno!!");
                break;
            case "primavera":
                System.out.println("Estamos en Primavera!!");
                break;
            case "otoño":
                System.out.println("Estamos en otoño!!");
                break;
            default:
                System.out.println("El valor no es una estancion del año");
                break;
        }
    }
}
