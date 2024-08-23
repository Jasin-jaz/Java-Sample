import java.rmi.Remote;
import java.rmi.RemoteException;
public interface BankInterface extends Remote 
{
double getBalance(int accountIndex) throws RemoteException;
void deposit(int accountIndex, double amount) throws RemoteException;
void withdraw(int accountIndex, double amount) throws RemoteException;
}
