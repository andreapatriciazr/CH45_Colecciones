import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
    String id;

    List<Course> enrolledCourses = new ArrayList<>(); // Lista de los cursos inscritos 

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    } // constructor

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    } // 

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    // Método para inscribir un curso
    public void enroll(Course course){
        enrolledCourses.add(course);
    } // enroll

    // Método para desinscribir en un curso
    public void unEnroll(Course course){
        enrolledCourses.remove(course);
    } // unEnroll

    // Método para obtener el total de cursos inscritos
    public int totalEnrolledCourses(){
        return enrolledCourses.size();
    } // totalEnrolledCourses

    // Imprimir: Lista de cursos inscritos
    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    } // list

    // Imprimir: Arreglo Student
    public String toString(){
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}'; // string
        
    } // main	
} // class Student 