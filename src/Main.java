
public class Main {
    public static void main( String[] args ) {
            CourseService courseService = new CourseService();
            
            // Datos del primer Estudiante
            String courseId = "math_01";
            String studentId = "120120";
            
            // Mostrar Información del Curso y Estudiante
            courseService.displayCourseInformation(courseId);
            courseService.displayStudentInformation(studentId);
            
            // Inscribir al Estudiante en el Curso
            courseService.enrollStudent(studentId, courseId);
            courseService.displayStudentInformation(studentId);

            // Mostrar Información Estudiante y el Curso ya inscrito o desinscribir
            courseService.unEnrollStudent(studentId, courseId);
            courseService.displayStudentInformation(studentId);
   
    } // main
} // main Class