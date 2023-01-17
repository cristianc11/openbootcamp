public class Tema8 {
    public static void ejercicios_tema8(){
        Persona Persona1 = new Persona();
        Persona1.setNombre("Juan");
        Persona1.setEdad(20);
        Persona1.setTelefono(123456);
        System.out.println("Nombre: "+Persona1.getNombre());
        System.out.println("Edad: "+Persona1.getEdad());
        System.out.println("Telefono: "+Persona1.getTelefono());
    }

}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad (){
        return this.edad;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getTelefono (){
        return this.telefono;
    }
}
