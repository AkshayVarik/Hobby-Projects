package university;

public class Student {

	String name;
	int graduation_year;
	double GPA;
	int numCoursesCompleted;
	Boolean inGoodStanding;
	TA recitationTA;

	public Student(String name,int graduation_year){
		this.name = name;
		this.graduation_year = graduation_year;
		this.GPA = 0;
		this.numCoursesCompleted = 0;
		//all students are initially in good standing
		this.inGoodStanding = true;
		this.recitationTA = null;
	}

	public String getName(){
		return name;
	}

	public int getGraduationYear(){
		return graduation_year;
	}

	public void setGraduationYear(int year){
		this.graduation_year = year;
	}

	public double getGPA(){
		return this.GPA;
	}

	public Boolean isEligibleForDeanList(){
		if (this.GPA > 3.7 && this.inGoodStanding){
			return true;
		}
		return false;
	}

	public void takeCourse(String course_name){
		System.out.println(this.name+" is now enrolled in "+ course_name);
	}

	public void receiveGrade(String course_name,String grade){
		System.out.println( this.name+ " got "+ grade+" in "+ course_name);
		double numeric_value=0; 
		if (grade == "A")
			numeric_value = 4;            
		else if (grade == "A-")
			numeric_value = 3.7;
		else if (grade == "B+")
			numeric_value = 3.3;
		else if (grade == "B")
			numeric_value = 3;
		else if (grade == "B-")
			numeric_value = 2.7;
		else if (grade == "C+")
			numeric_value = 2.3;
		else if (grade == "C")
			numeric_value = 2;
		else if (grade == "C-")
			numeric_value = 1.3;
		else if (grade == "D+")
			numeric_value = 1.0;    
		this.GPA = (this.GPA * this.numCoursesCompleted + numeric_value) / (this.numCoursesCompleted + 1);
		this.numCoursesCompleted += 1;
	}

	public void caughtCheating(){
		this.inGoodStanding=false;
	}

	public void printReport(){
		System.out.println("This is "+ this.name + " UPENN " + this.graduation_year);
		System.out.println("Their GPA is " + this.GPA);
		String numcourses_string;
		if (this.numCoursesCompleted==1){
			numcourses_string="course";
		}
		else{
			numcourses_string="courses";
		}
		System.out.println("They have taken " + this.numCoursesCompleted + numcourses_string);
	}
	
	public void assignRecitationTA(TA object_ta){
		this.recitationTA= object_ta;
		System.out.println(this.name + " your TA is " + object_ta.getName() + " whose recitation is at " + object_ta.getRecitationTime());
	}
	
}
