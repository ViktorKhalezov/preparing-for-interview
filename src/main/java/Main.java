import lesson3.task1.ConsolePrinter;
import lesson3.task1.PingPongThread;
import lesson3.task2.ThreadSafeCounter;
import lesson5.Student;
import lesson5.StudentService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        for(int i = 0; i < 1000; i++) {
            String name = "Viktor" + (i + 1);
           BigDecimal mark = new BigDecimal(1 + Math.random() * 4).setScale(1, BigDecimal.ROUND_HALF_UP);
           Student student = new Student(name, mark);
           // создание студента
           studentService.saveStudent(student);
        }

        // нахождение студента по id
        System.out.println(studentService.findStudent(1L));

        //вывод всех студентов
        ArrayList<Student> students = (ArrayList<Student>) studentService.findAllStudents();
        for(Student student : students) {
            System.out.println(student);
        }

        //изменение студента
        Student student = studentService.findStudent(5L);
        student.setName("John");
        student.setMark(new BigDecimal(5.0));
        studentService.updateStudent(student);
        System.out.println(studentService.findStudent(5L));


        //удаление студента
        studentService.deleteStudent(studentService.findStudent(3L));
        System.out.println(studentService.findStudent(3L));
    }

}


