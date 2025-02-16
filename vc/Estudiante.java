public class Estudiante {
    private String nombre;
    private String codigo;
    private Asignatura asignatura;
    public Estudiante(String nombre, String codigo, Asignatura asignatura) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asignatura = asignatura;
    }

    public void info(){
        System.out.println("Estudiante "+ nombre + " identificado con codigo "+codigo+ " tiene asignado la materia "+ asignatura.getNombre() + " con el profesor "+ asignatura.nombreProfesor());
    }

}
