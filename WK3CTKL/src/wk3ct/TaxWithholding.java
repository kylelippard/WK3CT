package wk3ct;

public class TaxWithholding {

	public static void main(String[] args) {
		int income = 1224; 
		double taxWitheld = 0;
		
		if (income <= 500) {
			//tax rate is 10%
			taxWitheld = income * .10 ;
		}else if (income > 500 && income <= 1500) {
			// tax rate is 15%
			taxWitheld = income * .15 ;
		}else if (income > 1500 && income <= 2500) {
			//tax rate is 20%
			taxWitheld = income * .20 ;
		}else if (income > 2500) {
			//tax rate is 30%
			taxWitheld = income * .30 ;
		}
			
		double netIncome = income - taxWitheld;
		System.out.println("You're income was " + income + ", and the taxes witheld were "
				+ taxWitheld + ". Making your net income " + netIncome);
		
	}

}
