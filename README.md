[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=22911540&assignment_repo_type=AssignmentRepo)

import java.util.*;
public class Main {
static Scanner sc = new Scanner (System.in);

public static void main(String[] args) {

System.out.println("Welcome to the Basic calculator!");
System.out.println("Press 1 if you want to continue or press 5 to exit");
}

public static void nu (int nu, Scanner sc){
if (nu == 5){
System.out.println("Goodbye!");
return;
}

else if (nu == 1) {

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

double ans;

switch (op) {
case '+':
ans = num1 + num2;
System.out.println("Answer: " +ans);
break;

case '-':
ans = num1 - num2;
System.out.println("Answer: " +ans);
break;

case '*':
ans = num1 * num2; 
System.out.println("Answer: " +ans);
break;

case '/':
ans = num1 / num2;
System.out.println("Answer: " +ans);
break;

default: 
System.out.println("Invalid Credentials");
return;
}
}

else {
System.out.println("Invalid number");
return;
}

System.out.println("Thank you for using the calculator");


 }
}
