package week4.day1;

public class SubClass extends SampleJava{
	
	public void takeSnap(int snap){
		
		if(snap>1) {
			System.out.println("Snap is positive");
		}else {
			System.out.println("Snap is negative");
		}
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sclass = new SubClass();
		sclass.takeSnap(4); //calling the method in subclass
		sclass.takeSnap(-5);
		
		sclass.takeSnap(); //calling the method from super class
	}

}
