package com.nt.bank;
import java.util.Scanner; 

public class ATM {
    private BankAccount account;
    
    public ATM(BankAccount account) {
    	this.account=account;
    }
    
    public void displayMenu() {
    	System.out.println("Welcome to the ATM ");
    	System.out.println("1.Check Balance ");
    	System.out.println("2.Deposit ");
    	System.out.println("3.Withdraw ");
    	System.out.println("4.Exit");
    }
    
    public void run() {
    	Scanner sc=new Scanner(System.in) ;
    		
    	while(true) {
    		System.out.println();
    		displayMenu();
    		System.out.println();
    		System.out.println("Enter your Choice ");
    		
    		int choice=sc.nextInt();
    	
    	
    	switch(choice) {
    	case 1:
    		System.out.println("Balance:"+account.getBalance());
    	    break;
    	case 2:
        	System.out.println("Enter the Deposit Amount: ");
        	double depositAmount=sc.nextDouble();
        	account.deposit(depositAmount);
        	System.out.println(" Deposit Succesfully ");
        	break;
        case 3:
            System.out.println("Enter the Withdraw amount: ");
            double withdrawAmount=sc.nextDouble();
            
            if(account.withdraw(withdrawAmount)){
            	System.out.println("Withdraw Succesfully ");
            }else {
            	System.out.println("Insufficient balance for withdraw ");
            }
            break;	
        case 4:
            System.out.println("Thank You for visiting ATM");
            sc.close();
            break;
        default:
            System.out.println("Invalid choice please try again");
            break;          
            	
    	}
    	}
    }
    
	public static void main(String[] args) {
		BankAccount Bank=new BankAccount(1000);
		ATM atm=new ATM(Bank);
		atm.run();
		
	}

}
