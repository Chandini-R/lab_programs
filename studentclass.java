class Student
{
	String StudName,dept;
	int Rollno;
	static String clg="GPT";
	int percent;
	void setStudent(String Name, int rollno, String cdept,int per)
	{
		StudName=Name;
		Rollno = rollno;
		dept=cdept;
		percent=per;
	}

	void getStudent()
	{
		System.out.println(StudName+"\t" +Rollno+"\t"+clg+"\t"+dept+" "+percent);
	}
}

class Stud
{
	public static void main(String args[]) {
		System.out.println("Name Rollno\tCollege'tDepartment'tpercent");
		Student Stud1= new Student();
		Student Stud2 = new Student();
		Stud1.setStudent("Sindhu",155,"CS",88);
		Stud2.setStudent("Madhu", 100, "EC",90);
		Stud1.getStudent();
		Stud2.getStudent();
	}
}

