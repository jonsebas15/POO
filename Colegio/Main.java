public class Main
{
    public static void main(String[] args) {
        String[] cursos = {"Matematicas", "Fisica"};
        Profesor profesor1 = new Profesor(); //este profesor es provicional, la idea es arreglar el profesor y colocar los argumentos correspondientes
        
        Administrativo admin1 = new Administrativo("María", 35, "77777", "Coordinadora Académica"); //se crea el adminsitrativo
        admin1.informacion(); //esto todas las clases (profesor y estudiantes) la deben de tener por defecto si usan herencia
        admin1.organizarHorarioProfesor(profesor1,"10A", "8am - 10am"); // aqui se le asigna el curso al profesor
    }
}
