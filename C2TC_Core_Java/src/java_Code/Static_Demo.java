package java_Code;

public class Static_Demo {

	public static void main(String[] args) {
		string name;
		int roll;
		static string college = "st. john college";
		
		void display()
		{
			System.out.println(roll+" "+name+" "+college);
		}
		
		public Static_Demo(string name, int roll) {
			super();
			this.name= name;
			this.roll= roll;
		}
		
	public static void main(String[] args) {
		
		Static_Demo s1=new Static_Demo("alisha",1);
		Static_Demo s2=new Static_Demo("alia",2);
		s1.display();
		s2.display();
	}

}
