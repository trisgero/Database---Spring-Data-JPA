package it.triexercise.springDataJPA.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollment;

    public Student() {
    }

    public Student(int id, String lastName, String firstName, String email, List<Enrollment> enrollment) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.enrollment = enrollment;
    }


}
