package edu.northeastern.csye6200;

class NU{
	public NU() {
		System.out.println("This is NU no-arg constructor");
	}
}
class MGEN extends NU{
	public MGEN() {
		System.out.println("This is MGEN no-arg constructor");
	}
}
public class Inheritence_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before MGEN Object is created");
		MGEN mgen = new MGEN();
		System.out.println("After MGEN object is created");
	}

}
