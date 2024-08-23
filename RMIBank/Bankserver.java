import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Bankserver {
public static void main(String[] args) {
try {
BankInterface bankInterface = new BankImpl();
Registry registry = LocateRegistry.createRegistry(6000);
registry.rebind("Bank", bankInterface);
System.out.println("bound to registry...");
} 
catch (Exception e) {
e.printStackTrace();
}
}
}
