package week2;
class Hospital{
	String patientName;
	int patientid;
	static String DocName="Dr.Murthy";
	void sethospital(String pN,int pid)
	{
		patientName=pN;
		patientid=pid;
	}
	String getpatientName()
	{
		return patientName;
	}
	int getpatientid()
	{
		return patientid;
	}
}
	

public class demoscopeofvariables {

	public static void main(String[] args) {
		String hospitalName="Apollo Hospital";
		Hospital patient1=new Hospital();
		patient1.sethospital("anitha joseph", 101);
		System.out.println("The patient " +patient1.getpatientid()+ " is treated by " +patient1.DocName+ " at " +hospitalName);
	}

}

