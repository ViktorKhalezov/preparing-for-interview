package lesson5;

import java.util.List;

public class StudentService {

    private StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

    public StudentService() {
    }

    public Student findStudent(Long id) {
        return studentDaoImpl.findById(id);
    }

    public void saveStudent(Student student) {
        studentDaoImpl.save(student);
    }

    public void deleteStudent(Student student) {
        studentDaoImpl.delete(student);
    }

    public void updateStudent(Student student) {
        studentDaoImpl.update(student);
    }

    public List<Student> findAllStudents() {
        return studentDaoImpl.findAll();
    }

}
