package student.management.cmb.rpository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.management.cmb.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}