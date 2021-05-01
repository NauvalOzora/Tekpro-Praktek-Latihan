package Latihan7_3;

public class Volunteer extends StaffMember{
	//-----------------------------------------------------------
	// Sets up a volunteer using the specified information
	//-----------------------------------------------------------
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}
	public double pay() {
		return 0.0;
	}
}
