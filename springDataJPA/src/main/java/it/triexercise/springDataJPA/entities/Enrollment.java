package it.triexercise.springDataJPA.entities;


import javax.persistence.*;


@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;

    public Enrollment() {
    }

    public Enrollment(int id, Student student, SchoolClass schoolClass) {
        this.id = id;
        this.student = student;
        this.schoolClass = schoolClass;
    }


}
