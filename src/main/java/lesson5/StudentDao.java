package lesson5;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);
    List<Student> findAll();
    void save(Student student);
    void update(Student student);
    void delete(Student student);

}
