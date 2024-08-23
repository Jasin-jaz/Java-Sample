import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.*;
public class Bankclient {
public static void main(String[] args) {
try {
Registry registry = LocateRegistry.getRegistry("localhost",6000);
BankInterface bankInterface = (BankInterface)
registry.lookup("Bank");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Select an account (0 or 1):");
int accountIndex = Integer.parseInt(br.readLine());
double balance = bankInterface.getBalance(accountIndex);
System.out.println("Balance for account " + accountIndex + " is :" + balance);
System.out.println("Enter the amount to deposit :");
double depositAmount =Double.parseDouble(br.readLine());
bankInterface.deposit(accountIndex, depositAmount);
System.out.println("Deposited amount is:" + depositAmount);
System.out.println("Enter the amount to withdraw :");
double withdrawAmount =Double.parseDouble(br.readLine());
bankInterface.withdraw(accountIndex, withdrawAmount);
System.out.println("Withdrawn amount is:" + withdrawAmount);
balance = bankInterface.getBalance(accountIndex);
System.out.println("Updated balance is:" + balance);
} catch (Exception e) {
e.printStackTrace();
}
}
}
