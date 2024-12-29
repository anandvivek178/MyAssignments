package week2.day3;

public class AccessModifier1 {

	//Deposit & Withdraw amount
	
		//public method
		public void depositAmount() {
			System.out.println("10000");
		}
		
		
		//private method
		private void atmPin() {
			System.out.println("XX75");
		}
		
		//default method
		void knowAtm() {
			System.out.println("1275");
		}
		
		public static void main(String[] args) {
			AccessModifier1 accessmod=new AccessModifier1();
			accessmod.depositAmount();
			accessmod.atmPin();
		}
	}


