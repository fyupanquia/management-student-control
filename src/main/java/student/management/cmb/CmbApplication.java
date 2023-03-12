package student.management.cmb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import student.management.cmb.entity.Student;
import student.management.cmb.rpository.StudentRepository;

@SpringBootApplication
public class CmbApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	public CmbApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CmbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		  Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		  studentRepository.save(student1);

		 Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		  studentRepository.save(student2);

		  Student student3 = new Student("tony", "stark", "tony@gmail.com");
		  studentRepository.save(student3);
		*/

	}

}
