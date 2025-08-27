package student;

public class Onlinestudent extends Student{
	String internet_speed;
	String platform;
	
	public Onlinestudent(int RollNumber, String Name, String Department, char section, String internet_speed, String platform) {
		super(RollNumber, Name, Department, section);
		this.internet_speed=internet_speed;
		this.platform=platform;
	}
	
	public void submitAssignment() {
		System.out.println("The student have submitted the soft copy of the assignment");
	}
	public void platform() {
		super.platform();
		System.out.println("The student in class room"+platform+"has joined the platform + Zoom");
	}
	public void displayInfo() {
		super.displayInfo();
	}
}
