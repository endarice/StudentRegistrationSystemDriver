package StudentRegistrationSystemDriver.student_registration_system_driver;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import StudentRegistrationSystem.student_registration_system.Course;
import StudentRegistrationSystem.student_registration_system.Module;
import StudentRegistrationSystem.student_registration_system.Student;

public class StudentEnroller {
	public static void main (String [] args) {		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Module> modules = new ArrayList<Module>();
		
		Student s1 = new Student("Enda", 20, new LocalDate(1996,05,29), 13463878);
		Student s2 = new Student("Conor", 21, new LocalDate(1995,03,15), 12345678);
		Student s3 = new Student("Niamh", 22, new LocalDate(1994,01,07), 87654321);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Module m1 = new Module("Software Engineering III", "CT417", students);
		Module m2 = new Module("Artificial Intelligence", "CT421", students);
		Module m3 = new Module("Machine Learning & Data Mining", "CT475", students);
		modules.add(m1);
		modules.add(m2);
		modules.add(m3);
		
		Course c1 = new Course("4BCT1", modules, new LocalDate(2013,9,01), new LocalDate(2017,9,01));

		for(Student student: students) {
			System.out.println(student);
		}
	}
}
