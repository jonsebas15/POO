public class Administrativo extends Persona
{
   private String puesto;
   
   public Administrativo(String nombre, int edad, String identificacion, String puesto) {
        super(nombre, edad, identificacion);
        this.puesto = puesto;
    }

    public void mostrarPuesto() {
        System.out.println("Puesto: " + puesto);
    }
    
    public void organizarHorarioProfesor(Profesor profesor, String curso, String hora) {
        System.out.println(getNombre() + " ha asignado el curso " + curso + " al profesor " + profesor.getNombre() + " a las " + hora);
    }
}
