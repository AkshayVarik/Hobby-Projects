package university;

public class Mainprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("alpha", 2018);
		student1.takeCourse("cis110");
		TA ta110= new TA("beta", "cis110");
		ta110.pickOfficeHours("Monday", 3);
		ta110.pickRecitationTime(11);
		student1.assignRecitationTA(ta110);
		ta110.gradeStudent(student1, "A");
		student1.printReport();
		student1.takeCourse("cis120");
		TA ta120= new TA("gamma", "cis120");
		ta120.pickOfficeHours("Tuesday", 1);
		ta120.pickRecitationTime(3);
		student1.assignRecitationTA(ta120);
		ta120.gradeStudent(student1, "B+");
		student1.printReport();

	}

}
