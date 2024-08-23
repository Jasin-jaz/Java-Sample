import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
public class CalculatorClient {
public static void main(String[] args) {
try {
Calculator c = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
boolean exit = false;
while (!exit) {
System.out.println("_________________________");
System.out.println("|--SELECT AN OPERATION--|");
System.out.println("|   1. Add              |");
System.out.println("|   2. Subtract         |");
System.out.println("|   3. Multiply         |");
System.out.println("|   4. Divide           |");
System.out.println("|   5. Exit             |");
System.out.println("|_______________________|");
System.out.print("Enter your choice: ");
String choiceStr = br.readLine();
int choice = Integer.parseInt(choiceStr);
long a, b;
switch (choice) {
case 1:
System.out.print("Enter the first number: ");
a = Long.parseLong(br.readLine());
System.out.print("Enter the second number: ");
b = Long.parseLong(br.readLine());
System.out.println("Result: " + c.add(a, b));
break;
case 2:
System.out.print("Enter the first number: ");
a = Long.parseLong(br.readLine());
System.out.print("Enter the second number: ");
b = Long.parseLong(br.readLine());
System.out.println("Result: " + c.sub(a, b));
break;
case 3:
System.out.print("Enter the first number: ");
a = Long.parseLong(br.readLine());
System.out.print("Enter the second number: ");
b = Long.parseLong(br.readLine());
System.out.println("Result: " + c.mul(a, b));
break;
case 4:
System.out.print("Enter the first number: ");
a = Long.parseLong(br.readLine());
System.out.print("Enter the second number: ");
b = Long.parseLong(br.readLine());
System.out.println("Result: " + c.div(a, b));
break;
case 5:
exit = true;
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please try again.");
break;
}
System.out.println();
}
} 
catch (IOException e) { 
e.printStackTrace();
} 
catch (Exception e) {
e.printStackTrace();
}
}
}
