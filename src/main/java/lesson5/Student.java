package lesson5;



import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private BigDecimal mark;


    public Student() {

    }

    public Student(String name, BigDecimal mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(BigDecimal mark) {
        this.mark = mark;
    }
}
