import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.*;
public class BankImpl extends UnicastRemoteObject implements BankInterface {
private static final int NUM_ACCOUNTS = 2;
private double[] accountBalances;
public BankImpl() throws RemoteException {
accountBalances = new double[NUM_ACCOUNTS];
accountBalances[0] = 1000.0;
accountBalances[1] = 1500.0;
}
public double getBalance(int accountIndex) throws RemoteException {
if (accountIndex >= 0 && accountIndex < NUM_ACCOUNTS) {
return accountBalances[accountIndex];
}
return 0.0;
}
public void deposit(int accountIndex, double amount) throws RemoteException {
if (accountIndex >= 0 && accountIndex < NUM_ACCOUNTS) {
accountBalances[accountIndex] += amount;
}
}
public void withdraw(int accountIndex, double amount) throws RemoteException {
if (accountIndex >= 0 && accountIndex < NUM_ACCOUNTS &&
accountBalances[accountIndex] >= amount) {
accountBalances[accountIndex] -= amount;
}
else
{
System.out.println("Some error happaned in accountindex or due to insufficient balance");
}
}
}

