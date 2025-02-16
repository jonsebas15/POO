public class main {
    public static void main(String[] args) {
        System.out.println("\n**** SISTEMA DE INFORMACION COLEGIO LIBERTADORES\n");

        Profesor p1 = new Profesor("Juan Carlos", "222547");
        Asignatura m1 = new Asignatura("Matematicas", "10:00 - 12:00 pm", "martes y jueves", p1);
        Estudiante e1 = new Estudiante("Sebastian gomez", "666555", m1);


        p1.info();
        m1.info();
        e1.info();


    }
}