public class Persona
{
    private String nombre;
    private int edad;
    private String identificacion;

    // Constructor
    public Persona(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public void informacion() {
        System.out.println("Nombre: " + nombre + "\n Edad:" + edad + "\nidentificacion:" + identificacion);
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getIdentificacion(){
        return identificacion;
    }
}
