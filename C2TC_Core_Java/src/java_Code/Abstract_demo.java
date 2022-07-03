package java_Code;

public class Abstract_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scooty Activa = new Scooty();
				Activa.noofwheels();
	}

}

abstract class Vehicle  //partially implemented class
{
	abstract public void noofwheels(); 

}

class Scooty extends Vehicle
{

	@Override
	public void noofwheels() {
		// TODO Auto-generated method stub
		System.out.println("no of wheels in scooty ="+ 2);
	}
	
}
