import java.util.*;
class iCET_Tax_Calculator{
	public static void homePage(){
		System.out.println("                                               __  ______  ________ ________      ");
		System.out.println("                                              |  \\/      \\|        |        \\  ");
		System.out.println("                                               \\&|  $$$$$$| $$$$$$$$\\$$$$$$$$   ");
		System.out.println("                                              |  | $$   \\$| $$__      | $$       ");
		System.out.println("                                              | $| $$     | $$  \\     | $$       ");
		System.out.println("                                              | $| $$   __| $$$$$     | $$        ");
		System.out.println("                                              | $| $$__/  | $$_____   | $$        ");
		System.out.println("                                              | $$\\$$    $| $$     \\  | $$      ");
		System.out.println("                                               \\$$ \\$$$$$$ \\$$$$$$$$   \\$$    ");
		System.out.println();
		System.out.println();
		System.out.println(" _________          __   __        _____              _	        _____   _     _	  _                _________    ____    _____                ");
		System.out.println("|___   ___|  /\\     \\ \\ / /       / ____|     /\\     | |       / ____| | |   | | | |          /\\  |___   ___|  / __ \\  |  __ \\        ");
		System.out.println("    | |     /  \\     \\ V /       | |         /  \\    | |      | |      | |   | | | |         /  \\     | |     | |  | | | |__) |          ");
		System.out.println("    | |    / /\\ \\     > <        | |        / /\\ \\   | |      | |      | |   | | | |        / /\\ \\    | |     | |  | | |  _  /         ");
		System.out.println("    | |   / ____ \\   / . \\       | |____   / ____ \\  | |____  | |____  | |___| | | |____   / ____ \\   | |     | |__| | | | \\ \\         ");
		System.out.println("    |_|  /_/    \\_\\ /_/ \\_\\       \\_____| /_/    \\_\\ |______|  \\_____|  \\_____/  |______| /_/    \\_\\  |_|      \\____/  |_|  \\_\\");
		System.out.println();
		System.out.println();	
		System.out.println("================================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("	[1] Withholding Tax\n");
		System.out.println("	[2] Payable Tax\n");
		System.out.println("	[3] Income Tax\n");
		System.out.println("	[4] Social Security Contribution Levy (SSCL) Tax\n");
		System.out.println("	[5] Leasing Payment\n");
		System.out.println("	[6] Exit\n");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an option to continue -> ");
		int option=input.nextInt();
		
		switch(option){
			case 1:
				withHoldingTax();
				break;
			case 2:
				payableTax();
				break;
			case 3:
				incomeTax();
				break;
			case 4:
				socialSecurityContributionLevyTax();
				break;
			case 5:
				leasingPayment(); 
				break;
			case 6:
				return;
			default:
				System.out.println("\n	Incorrect input!");
			
		}
		
		
	}
	public static void withHoldingTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                             WITHHOLDING TAX                              |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		System.out.println("	[1] Rent Tax");
		System.out.println();
		System.out.println("	[2] Bank Interest Tax");
		System.out.println();
		System.out.println("	[3] Dividend Tax");
		System.out.println();
		System.out.println("	[4] Exit");
		System.out.println();
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an option to continue -> ");
		int wT=input.nextInt();
		
		switch(wT){
			case 1:
				findRentTax();
				break;
			case 2:
				findBankIntrestTax();
				break;
			case 3:
				findDividendTax();
				break;
			case 4:
				return;
			default:
				System.out.println("\n	Incorrect input!");
		}
			
		
	}
	public static void findRentTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                                 Rent TAX                                 |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your rent            : ");
		double rent=input.nextDouble();
		if(rent>=0){
			if(rent>100000){
				System.out.printf("\nYou have to pay Rent Tax   : %.2f\n",((rent-100000)*0.1));
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					findRentTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}else{
				System.out.println("\n	You don't have to pay Rent Tax...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					findRentTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findRentTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}		
		
	}
	public static void findBankIntrestTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                             BANK INTEREST TAX                            |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your bank interest per year            : ");
		double bIt=input.nextDouble();
		if(bIt>=0){
			System.out.printf("\nYou have to pay bank interest tax per year   : %.2f",bIt*0.05);
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("\nDo you want to calculate another Bant Interest Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findBankIntrestTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Bant Interest Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findBankIntrestTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}	
	}
	public static void findDividendTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                               DIVIDENT TAX                               |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your total divident per year      : ");
		double dT=input.nextDouble();
		if(dT>=0){
			if(dT>100000){
				System.out.printf("\nYou have to pay Dividend Tax per year   : %.2f",(dT-100000)*0.14);
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("\nDo you want to calculate another Dividend Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					findDividendTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}else{
				System.out.println("\n	You don't have to pay Dividend Tax...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					findDividendTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findDividendTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}		
	}
	public static void payableTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                               PAYABLE TAX                                |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your emlployee payment per month  : ");
		double pT=input.nextDouble();
		if(pT>=0){
			if(pT>100000){
				double rem=pT-100000;
				double tax=0;
				if(pT<=141667){
					tax+=rem*0.06;
					Math.round(tax);
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}else if(pT<=183333){
					tax+=(rem-41667)*0.12;
					tax+=41667*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}else if(pT<=225000){
					tax+=(rem-(41667+41667))*0.18;
					tax+=41667*0.12;
					tax+=41667*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}else if(pT<=266667){
					tax+=(rem-(41667+41667+41667))*0.24;
					tax+=41667*0.18;
					tax+=41667*0.12;
					tax+=41667*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}else if(pT<=308333){
					tax+=(rem-(41667+41667+41667+41667))*0.30;
					tax+=41667*0.24;
					tax+=41667*0.18;
					tax+=41667*0.12;
					tax+=41667*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}else{
					tax+=41667*0.06;
					tax+=41667*0.12;
					tax+=41667*0.18;
					tax+=41667*0.24;
					tax+=41667*0.30;
					tax+=(rem-(41667+41667+41667+41667+41667))*0.36;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Payable Tax per month   : %.2f",x);
				}
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("\nDo you want to calculate another Payable Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					payableTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}else{
				System.out.println("\n	You don't have to pay Payable Tax...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					payableTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				payableTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}			
	}
	public static void incomeTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                                INCOME TAX                                |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your total income per year      : ");
		double iT=input.nextDouble();
		if(iT>=0){
			if(iT>1200000){
				double rem=iT-1200000;
				double tax=0;
				if(iT<=1700000){
					tax+=rem*0.06;
					Math.round(tax);
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}else if(iT<=2200000){
					tax+=(rem-500000)*0.12;
					tax+=500000*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}else if(iT<=2700000){
					tax+=(rem-(500000+500000))*0.18;
					tax+=500000*0.12;
					tax+=500000*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}else if(iT<=3200000){
					tax+=(rem-(500000+500000+500000))*0.24;
					tax+=500000*0.18;
					tax+=500000*0.12;
					tax+=500000*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}else if(iT<=3700000){
					tax+=(rem-(500000+500000+500000+500000))*0.30;
					tax+=500000*0.24;
					tax+=500000*0.18;
					tax+=500000*0.12;
					tax+=500000*0.06;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}else{
					tax+=500000*0.06;
					tax+=500000*0.12;
					tax+=500000*0.18;
					tax+=500000*0.24;
					tax+=500000*0.30;
					tax+=(rem-(500000+500000+500000+500000+500000))*0.36;
					double x=Math.round(tax);
					System.out.printf("\nYou have to pay Income Tax per year   : %.2f",x);
				}
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("\nDo you want to calculate another Income Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					incomeTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}else{
				System.out.println("\n	You don't have to pay Income Tax...");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					incomeTax();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				incomeTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}	
	}
	public static void socialSecurityContributionLevyTax(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|               SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX               |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("  Enter value of Good or Service      : ");
		double value=input.nextDouble();	
		if(value>=0){
			double sTax=value*0.025;
			double voG=value+sTax;
			double vat=voG*0.15;
			System.out.printf("  You have to pay SSCL tax            : %.2f",(sTax+vat));
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("\nDo you want to calculate another Social Security Contribution Levy Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				socialSecurityContributionLevyTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
			
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another Social Security Contribution Levy Tax (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				socialSecurityContributionLevyTax();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}	
		}	
	}
	public static void  leasingPayment(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                              Leasing Payment                             |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();
		System.out.println("	[1] Calculate Monthly Installment");
		System.out.println();
		System.out.println("	[2] Search Leasing Category");
		System.out.println();
		System.out.println("	[3] Find Leasing Amount");
		System.out.println();
		System.out.println("	[4] Exit");
		System.out.println();
		System.out.println();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an option to continue -> ");
		int lP=input.nextInt();
		
		switch(lP){
			case 1:
				calculateMonthlyInstallment();
				break;
			case 2:
				searchLeasingCategory();
				break;
			case 3:
				findLeasingAmount();
				break;
			case 4:
				return;
			default:
				System.out.println("\n	Incorrect input!");
		}	
	}
	public static void calculateMonthlyInstallment(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                         Calculate Leasing Payment                        |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();	
		Scanner input=new Scanner(System.in);
		System.out.print(" Enter lease amount         : ");
		double amount=input.nextInt();
		System.out.println();
		System.out.print(" Enter annual interest rate : ");
		double rate=input.nextInt();
		System.out.println();
		System.out.print(" Enter number of year       : ");
		int years=input.nextInt();
		System.out.println();
		
		
		if(amount>=0&&rate>0){
			if(years<=5){
				double i=(rate/100)/12;
				int n=years*12;
				double x=(amount*i)/(1-(1/Math.pow((1+i),n)));
				System.out.printf(" Your monthly instalment    : %.2f",x);
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					calculateMonthlyInstallment();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
	
			}else{
				System.out.println();
				System.out.println("	Invalid number of year... Enter the correct value againt...");
				System.out.println();
				System.out.println();
				System.out.print(" Enter number of year       : ");
				years=input.nextInt();
				System.out.println();
				double i=(rate/100)/12;
				int n=years*12;
				double x=(amount*i)/(1-(1/Math.pow((1+i),n)));
				System.out.printf(" Your monthly instalment    : %.2f",x);
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					calculateMonthlyInstallment();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
			}
			
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				calculateMonthlyInstallment();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
			
		}
	}
	public static void searchLeasingCategory(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                          Search Leasing Category                         |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();	
		Scanner input=new Scanner(System.in);
		System.out.print(" Enter lease amount         : ");
		double amount=input.nextInt();
		System.out.println();
		System.out.print(" Enter annual interest rate : ");
		double rate=input.nextInt();
		System.out.println();

		if(amount>=0&&rate>0){
				double i=(rate/100)/12;
				int n=3*12;
				double x=(amount*i)/(1-(1/Math.pow((1+i),n)));
				System.out.printf(" Your monthly instalment for 3 years leasing plan -  %.2f\n",x);
				i=(rate/100)/12;
				n=4*12;
				x=(amount*i)/(1-(1/Math.pow((1+i),n)));
				System.out.printf(" Your monthly instalment for 4 years leasing plan -  %.2f\n",x);
				i=(rate/100)/12;
				n=5*12;
				x=(amount*i)/(1-(1/Math.pow((1+i),n)));
				System.out.printf(" Your monthly instalment for 5 years leasing plan -  %.2f",x);
		
				System.out.println();
				System.out.println();
				System.out.println();				
				System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
				char rT=input.next().charAt(0);
				if(rT=='y'||rT=='Y'){
					searchLeasingCategory();
				}else if(rT=='n'||rT=='N'){
					homePage();
				}else{
					System.out.println();
					System.out.println();
					System.out.println("	error.you should input Y/N !");
				}
	
			
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				searchLeasingCategory();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
			
		}
	}
	public static void findLeasingAmount(){
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|                            Find Leasing Amount                           |");
		System.out.println("+--------------------------------------------------------------------------+");
		System.out.println();	
		Scanner input=new Scanner(System.in);
		System.out.print(" Enter the monthly lease payment amount you can afford : ");
		double mi=input.nextInt();
		System.out.println();
		System.out.print(" Enter number of year                                  : ");
		int years=input.nextInt();
		System.out.println();
		System.out.print(" Enter annual interest rate                            : ");
		double rate=input.nextInt();
		System.out.println();
		double r=rate/100;
		int n=years*12;
		if(rate>0&&years<=5){
			double h=mi * (1 - (1 / Math.pow((1 + (r / 12)), n))) / (r / 12);
			h=Math.round(h);
			System.out.printf("You can get lease amount                               : %.2f",h);
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to find another Leasing Amount (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findLeasingAmount();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}else{
			System.out.println("\n	Invalid input...");
			System.out.println();
			System.out.println();
			System.out.println();				
			System.out.print("Do you want to find another Leasing Amount (Y/N) : ");
			char rT=input.next().charAt(0);
			if(rT=='y'||rT=='Y'){
				findLeasingAmount();
			}else if(rT=='n'||rT=='N'){
				homePage();
			}else{
				System.out.println();
				System.out.println();
				System.out.println("	error.you should input Y/N !");
			}
		}
	}
	public static void main(String []args){
		homePage();
	}	
}
