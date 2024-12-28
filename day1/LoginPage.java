package week4.day1;

public class LoginPage extends BasePage {
	
	
	//overrides BasePage.performCommonTasks
	@Override
	public void performCommonTasks() {
		System.out.println("--------MEthod from sub class------- ");
    	System.out.println("The login id is given.");
    	System.out.println("Then the password is entered.");
		System.out.println("The user is logged in successfully.");
	}
	
	
	public void perform() {
		super.performCommonTasks();
		this.performCommonTasks();
		
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.perform();
	
		

	}

}
