package university;

public class TA {
	String name;
	String course;
	String officeHourDay;
	int officeHourTime;
	int recitationTime;

	public TA(String name, String course_name){
		this.name= name;
		this.course=course_name;
		this.officeHourDay="unknown";
		this.officeHourTime = 0;
		//assume all recitations are on Friday. recitation time is an integer.
		this.recitationTime = 0;
	}

	//this makes the assumption that TAs hold office hours in 2hr slots
	public void pickOfficeHours(String day, int start){
		this.officeHourDay=day;
		this.officeHourTime=start;
	}

	public void pickRecitationTime(int start){
		this.recitationTime = start;
	}

	public String getName(){
		return this.name;
	}

	public String getCourse(){
		return this.course;
	}

	public int getRecitationTime(){
		return this.recitationTime;
	}

	public void displayOfficeHours(){
		System.out.println("office hour"+this.officeHourDay+"from"+officeHourTime+"to"+officeHourTime+2);
	}

	//in this model, the TA gives the student their final grade
	public void gradeStudent(Student object_student,String grade){
		object_student.receiveGrade(this.course,grade);	
	}

}

