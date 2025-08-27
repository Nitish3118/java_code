package student;

public class Teststudent {
	public static void main(String args[]) {
		Student student1 = new Student(1, "Rohit", "AI", 'C');
		Student student2 = new Student();
		Student student3 = new Student(student1);
		
		
		RegularStudent rs = new RegularStudent(1, "Priya", "AIML", 'G', 80, "H506");
//		rs.displayInfo();
		rs.payFee();
//		student1.payFee();
		
		Onlinestudent os = new Onlinestudent(1, "Rudra", "CSE", 'I', "50MBPS", "Zoom");
		os.platform();
		
////		student1.displayInfo();
////		student2.displayInfo();
//		Student.collegename = "IIT";
//		student1.collegename = "NIT";
//		student1.Department="AIML";
//		student1.displayInfo();
//		student2.displayInfo();
////		student1.Name="priya";
//
////		student1.Name="Nitish";
////		student1.RollNumber=17;
////		student1.section='C';
//		student1.displayInfo();
//		student1.playing();
//		student1.studying(5);
//		student2.displayInfo();
	}
}
