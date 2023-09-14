import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		int [] users = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		int balance = 100, withdraw, deposit, usernum;
		Scanner i = new Scanner(System.in);
		while (true) {
			System.out.println("Enter an id:");
			usernum = i.nextInt();
			while(true)
	        {
				System.out.println("Main Menu");
				System.out.println("1: Check Balance");
	            System.out.println("2: Withdraw");
	            System.out.println("3: Deposit");
	            System.out.println("4: exit");
	            System.out.print("Enter a choice:");
	            int s = i.nextInt();
	            switch(s)
	            {
	                case 1:
	                System.out.print("Balance : ");
	                System.out.println(users[usernum]);
	                System.out.println("");
	                
	                break;
	                case 2:
	                System.out.print("Enter an amount to withdraw:");
	                withdraw = i.nextInt();
	                if(users[usernum] >= withdraw)
	                {
	                    users[usernum] = users[usernum] - withdraw;
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance");
	                }
	                System.out.println("");
	                break;
	 
	                case 3:
	                System.out.print("Enter an amount to deposit:");
	                deposit = i.nextInt();
	                users[usernum] = users[usernum] + deposit;              
	                System.out.println("");
	                break;
	                case 4:
	                System.exit(0);
	            }
	        }
		}	
	}
}
