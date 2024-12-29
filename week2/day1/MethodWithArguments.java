package week2.day1;

public class MethodWithArguments {

	//Phone -makeCall, sendSms, takePhoto
	
		public void makeCall(String call, long mobileNumber) {
			System.out.println(call+" "+mobileNumber);

		}
		
	    public void sendSMS() {
			System.out.println("Message");
		}
		
		
		public static void main(String[] args) {
			MethodWithArguments obj=new MethodWithArguments();
			obj.makeCall("Vinoth", 8525411170L);
			obj.sendSMS();
			
		}
		

}
