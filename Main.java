import java.util.*;
public class Main {
static Scanner sc = new Scanner (System.in);

public static void main(String[] args) {

System.out.println("Modular Calculator");
System.out.println("Press 1 if you want to continue or press anything else to exit");
int nu = sc.nextInt();

 if (nu == 1) {

System.out.println("Enter a number");
double num1 = sc.nextDouble();
System.out.println("Enter another number");
double num2 = sc.nextDouble();
System.out.println("Choose an operator");
System.out.println("""
                    Addition (+)
                    Subtraction (-)
                    Multiplication (*)
                    Division (/)
                   """);
char op = sc.next(). charAt(0);

System.out.println("Enter Modulus:");
double modu=sc.nextDouble();

double ans;

switch (op) {
case '+':
ans = (num1 + num2) % modu;
System.out.println("Answer: " +ans);
break;

case '-':
ans = (num1 - num2) % modu;
System.out.println("Answer: " +ans);
break;

case '*':
ans = (num1 * num2) % modu; 
System.out.println("Answer: " +ans);
break;

case '/':
ans = (num1 / num2) % modu;
System.out.println("Answer: " +ans);
break;

default: 
System.out.println("Invalid Credentials");
return;
}
}

else {
System.out.println("Goodbye!");
return;
}

System.out.println("Thank you for using the modular calculator");
 }
}
