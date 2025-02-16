public class Asignatura {
    private String nombre;
    private String horas;
    private String dias;
    private Profesor profesor;
    public Asignatura(String nombre, String horas, String dias, Profesor profesor) {
        this.nombre = nombre;
        this.horas = horas;
        this.dias = dias;
        this.profesor = profesor;
    }
    public String getNombre() {
        return nombre;
    }

    public String nombreProfesor(){
        return profesor.getNombre();
    }

    public void info(){
        System.out.println("Asignatura de "+ nombre +" se dicta de "+ horas +" los "+ dias + " y esta a cargo el profesor "+ profesor.getNombre()+"\n");
    }

}
