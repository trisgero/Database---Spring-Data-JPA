package it.triexercise.springDataJPA.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "classes")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "schoolClass")
    private List<Enrollment> enrollment;

    public SchoolClass() {
    }

    public SchoolClass(int id, String title, String description, List<Enrollment> enrollment) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.enrollment = enrollment;
    }


}
