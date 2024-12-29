package week2.day1;

public class MethodWithReturnTypes {

	//Mobile- makeCall, takePhoto, sendSms, playGame,setAlarm,doPayemnts, watchVideos
	
	   public String watchVideos() {
			
		return "mp4";

		}
		
		public int doPayments() {
		return 1000;
		}
		
		public static void main(String[] args) {
			MethodWithReturnTypes returnValue=new MethodWithReturnTypes();
			System.out.println(returnValue.watchVideos());
			System.out.println(returnValue.watchVideos()+1000);
			System.out.println(returnValue.doPayments());
			System.out.println(returnValue.doPayments()+1000);
		}

}
