package collectionpractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student1 {
	int id;
	String name;
	double cgpa;

	public Student1(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;

	}

	public String toString() {
		return "ID:" + this.id + " " + "Name:" + this.name + " " + "cgpa:" + this.cgpa;
	}

}

class CSE {
	private final List<Student1> stuInfo; 

	public CSE(List<Student1> stuInfo) {  //Composition
		this.stuInfo = stuInfo;
	}

	List<Student1> getCSEstuInfo() {
		return this.stuInfo;
	}
}

public class Composition {

	public static void main(String[] args) {
		Student1 s1 = new Student1(3, "bithi", 3.88);
		Student1 s2 = new Student1(8, "sithi", 3.89);
		Student1 s3 = new Student1(6, "tithi", 3.55);

		List<Student1> stu = new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		
		CSE cseStu = new CSE(stu);
		List<Student1> stuInfoList = cseStu.getCSEstuInfo();
		
		
		for (Student1 i : stuInfoList) {

			System.out.println(i.toString());
		}

	}

}
