import java.util.*;
class Example{
public final static void clearConsole() {
	try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
	} catch (final Exception e) {
		e.printStackTrace();
		
		}
	}	
	
public static void getRenttax(){
			Scanner input=new Scanner(System.in);	
	
			System.out.println("+_______________________________________________+");
			System.out.println("|                  RENT TAX                     |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.print("Enter your rent           :");
			int rent=input.nextInt();
			
			System.out.println("\n");
				
			double tax=0;
			if(rent<=100000){
				System.out.println("You dont have to pay rent tax...");
				}else if(0>=rent){
					System.out.println("Invalid Option...");
					}else if(rent>100000){
						tax=(rent-100000)*0.10;
						System.out.println("You have to pay Rent Tax :"+tax);

						}
			System.out.println("\n");

			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getRenttax();
				clearConsole();
			}

	
	} 

public static void getBankInterestTax(){
			Scanner input=new Scanner(System.in);	
	
			System.out.println("+_______________________________________________+");
			System.out.println("|               BANK INTEREST TAX               |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.print("Enter your bank interest per year      : ");
			int bank=input.nextInt();	
			System.out.println("\n");

			double banktax=bank*0.05;
			System.out.println("You have to pay Bank Interst Tax per : "+banktax);
			System.out.println("\n");
			
			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getBankInterestTax();
				clearConsole();
			}



	}

public static void getDividentTax(){
			Scanner input=new Scanner(System.in);	
	
			System.out.println("+_______________________________________________+");
			System.out.println("|                  DIVIDEND TAX                 |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
		
			System.out.print("Enter your total divident per year      : ");
			int divident=input.nextInt();	
			System.out.println("\n");

			double Dtax=0;
			if (divident>100000)
			{
				Dtax=(divident-100000)*0.14;
				System.out.printf("%s%.2f","You have to pay Divident Tax per year : ",Dtax);

			}else if (divident<=100000)
			{
				System.out.println("You dont have to pay Divident Tax..");
			}
			System.out.println("\n");
			System.out.println("\n");

			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getDividentTax();
				clearConsole();
			}

			
}

public static void getptax(){
			Scanner input=new Scanner(System.in);
	
	
			System.out.println("+_______________________________________________+");
			System.out.println("|                 PAYABLE TAX                   |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.print("Enter your employee payment per month : ");
			int payble=input.nextInt();
			System.out.println("\n");
	
		double ptax=payble;
		if (ptax<=100000){
		   System.out.print("You don't have to pay Payble Tax...");
		}else if (ptax >100000 && ptax <=141667){
			  ptax =(ptax-100000)*0.06;
		}else if (ptax >141667 && ptax <=183333){
			  ptax =(ptax-141667)*0.12+2500;
		}else if (ptax >183333 && ptax <=225000){
			  ptax =(ptax-183333)*0.18+7500;
		}else if (ptax >225000 && ptax<= 266667){
			  ptax =(ptax-225000)*0.24+15000;
		}else if (ptax>266667 && ptax <= 308333){
              ptax =(ptax-266667)*0.30+25000;
        }else if (ptax >308333) {
              ptax =(ptax-308333)*0.36+37500;
        }
         System.out.print("You  have to pay Payble Tax : "+Math.round(ptax));
         
			System.out.println("\n");
			System.out.println("\n");

         
       		System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getptax();
				clearConsole();
			}

         
         
}

public static void getincome(){
			Scanner input=new Scanner(System.in);
	
			System.out.println("+_______________________________________________+");
			System.out.println("|                  ICOME TAX                    |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.print("Enter your total income per year    : ");
			int asalary=input.nextInt();
	
				double tax=0;

		if (asalary <= 1200000) {
            System.out.println("You don't have to Income Tax...");
        } else if (asalary > 1200000 && asalary <= 1700000) {
            tax = (asalary - 1200000) * 0.06;
        } else if (asalary > 1700000 && asalary <= 2200000) {
            tax = (asalary - 1700000) * 0.12 + 30000; 
        } else if (asalary > 2200000 && asalary <= 2700000) {
            tax = (asalary - 2200000) * 0.18 + 90000; 
        } else if (asalary > 2700000 && asalary <= 3200000) {
            tax = (asalary - 2700000) * 0.24 + 183333; 
        } else if (asalary > 3200000 && asalary <= 3700000) {
            tax = (asalary - 3200000) * 0.30 + 408333; 
        } else if (asalary > 3700000){
			tax = (asalary - 3700000) * 0.36 + 675000;
        
		}

		System.out.print("You have to pay Income Tax per Year : "+Math.round(tax));
			System.out.println("\n");
			System.out.println("\n");

			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getincome();
				clearConsole();
			}

		
}

public static void getsev(){
			Scanner input=new Scanner(System.in);
	
			System.out.println("+_______________________________________________+");
			System.out.println("| SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX  |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.print("Enter value of Good or Service : ");
			int sev=input.nextInt();
	
			double saletax=0;
			saletax=sev*0.025;

			double total=sev+saletax;
			double totaltax=(total*0.15)+saletax;
			
			System.out.println("You have to pay SSCL Tax       : "+totaltax);
			System.out.println("\n");
	
			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			
			if (asw=='Y' || asw=='y')
			{				
				getsev();
				clearConsole();
			}
		}



public static double getlease(int amount,int rate,int year){
			
			double i=rate/1200.0;
			double n=year*12;
			double math1=amount*i;
			double math2=Math.pow((1+i),n);
			double math3=(1-(1/math2));
			double MonthIn=math1/math3;
			return MonthIn;
}

public static void getlease1(){
			Scanner input=new Scanner(System.in);

			System.out.println("+_______________________________________________+");
			System.out.println("|           Calculate Leasing Payment           |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");


			System.out.print("Enter lease amount         : ");
			int amount=input.nextInt();
			System.out.println("\n");
			System.out.print("Enter annual interest rate : ");
			int rate=input.nextInt();
			System.out.println("\n");
			System.out.print("Enter number of year       : ");
			int year=input.nextInt();
			System.out.println("\n");
			
			double i=rate/1200.0;
			double n=year*12;
			double math1=amount*i;
			double math2=Math.pow((1+i),n);
			double math3=(1-(1/math2));
			double MonthIn=math1/math3;

			System.out.printf("%s%.2f%s","Your monthly instalment   : ",MonthIn,"\n");
			System.out.println("\n");
			System.out.println("\n");

			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			clearConsole();
			if (asw=='Y' || asw=='y')
			{				
				getlease1();
				clearConsole();
			}
		}




public static void getleasingAmount(){
	Scanner input=new Scanner(System.in);
			System.out.println("+_______________________________________________+");
			System.out.println("|               Find Leasing Amount             |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");


			System.out.print("Enter the monthly lease payment amount you can afford : ");
			int MonthIn=input.nextInt();
			System.out.print("Enter number of year                                  : ");
			int year3=input.nextInt();
			System.out.print("Enter annual interest rate                            : ");
			int rate3=input.nextInt();

			double i=rate3/1200.0;
			double n=year3*12;
			double math2=Math.pow((1+i),n);
			double math3=(1-(1/math2));
			MonthIn*=math3/i;
			double amount3=MonthIn;
			
			System.out.printf("You can get Lease Amount                              : "+amount3);
			System.out.println("\n");
			System.out.print("Do you want to calculate another instalment (Y/N) : ");
			char asw=input.next().charAt(0);
			        clearConsole();

			if (asw=='Y' || asw=='y')
			{				
				getleasingAmount();
        			clearConsole();

			}
		}
		
		
		public static void searchL(){
			Scanner input=new Scanner(System.in);
				System.out.println("+_______________________________________________+");
			System.out.println("|            Search Leasing Category            |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");


			System.out.print("Enter lease amount         : ");
			int amount2=input.nextInt();
			System.out.println("\n");
			System.out.print("Enter annual interest rate : ");
			int rate2=input.nextInt();
			System.out.println("\n");

		
				

			System.out.printf("%s%.2f%s","Your monthly instalment for 3 year leasing plan  : ",getlease(amount2,rate2,3),"\n");
			System.out.printf("%s%.2f%s","Your monthly instalment for 4 year leasing plan  : ",getlease(amount2,rate2,4),"\n");
			System.out.printf("%s%.2f%s","Your monthly instalment for 5 year leasing plan  : ",getlease(amount2,rate2,5),"\n");
		}
		

public static void main(String args[]){
Scanner input=new Scanner(System.in);

System.out.println("\r\n                                   \r\n                                         __   ______   ________  ________ \r\n                                        |  \\ /      \\ |        \\|        \\\r\n                                         \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$\r\n                                        |  \\| $$   \\$$| $$__       | $$   \r\n                                        | $$| $$      | $$  \\      | $$   \r\n                                        | $$| $$   __ | $$$$$      | $$   \r\n                                        | $$| $$__/  \\| $$_____    | $$   \r\n                                        | $$ \\$$    $$| $$     \\   | $$   \r\n                                         \\$$  \\$$$$$$  \\$$$$$$$$    \\$$   \r\n                                  \r                                  \r                                  \r");

System.out.println("\r\n                                   \r\n  _______            __   __   _____              _         _____   _    _   _                   _______    ____    _____  \r\n |__   __|     /\\    \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ \r\n    | |       /  \\    \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |\r\n    | |      / /\\ \\    > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / \r\n    | |     / ____ \\  / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ \r\n    |_|    /_/    \\_\\/_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\\r\n                                                                                                                           \r\n                                                                                                                           \r\n");
System.out.println("============================================================================================================================");
System.out.println("\n");


System.out.println("[1] Withholding Tax\n ");
System.out.println("[2] Payable Tax\n");
System.out.println("[3] Income Tax\n");
System.out.println("[4] Social Security Conributation Lavy (SSCL) Tax\n");
System.out.println("[5] Leasing Payment\n");
System.out.println("[6] Exit\n\n");


System.out.print("Enter an option to continue -> ");
int option=input.nextInt();
clearConsole();
System.out.println("\n\n");

switch(option){
	case 1: 
			System.out.println("+_______________________________________________+");
			System.out.println("|               WITHHOLDING TAX                 |");
			System.out.println("+-----------------------------------------------+\n");
			System.out.println("[1] Rent Tax\n");
			System.out.println("[2] Bank Interst Tax\n");
			System.out.println("[3]Dividend Tax\n");
			System.out.println("[4] Exit\n");

System.out.print("Enter an option to continue -> ");
int optionc1=input.nextInt();
clearConsole();

switch (optionc1){
	case 1 :
	
			getRenttax();
			break;

	case 2 :
			
			getBankInterestTax();
			break;
			
	case 3 :
	
			getDividentTax();
			break;
			
	case 4:
            System.out.println("Exiting withholding tax section...");
            break;
            
    default:
            System.out.println("Invalid input!");

	}
	clearConsole();
	break;
	 
	case 2 :
	
			getptax();
			break;
			
	case 3  :
	
			getincome();
			break;
			
			
	case 4 :
			
			getsev();
			break;


	case 5  :
	
			System.out.println("+_______________________________________________+");
			System.out.println("|                 Leasing Payment               |");
			System.out.println("+-----------------------------------------------+");
			System.out.println("\n");
			
			System.out.println("[1] Calculate Monthly Installment\n");
			System.out.println("[2] Search Leasing Category\n");
			System.out.println("[3] Find Leasing Amount\n");
			System.out.println("[4] Exit\n");
			

			System.out.print("Enter an option to continue -> ");
			int optionl1=input.nextInt();
			clearConsole();

switch(optionl1){
	
		case 1 :
	
				getlease1();
				break;
			
		case 2 :
		
				searchL();
			
			break;



		case 3 :
				getleasingAmount();
				break;
				
		case 4:
                System.out.println("Exiting leasing section...");
                break;
                
        default:
                System.out.println("Invalid input!");
 
				}
				
		case 6:
                System.out.println("Exiting the program...");
                break;

        default:
                System.out.println("Invalid option! Please try again.");
                clearConsole();	
			

			}

		}

	}




