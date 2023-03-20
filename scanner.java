import java.util.*;
class Main {
    public static void main(String args[]) {

    System.out.println("Enter your details....");

    //scanner object
    Scanner input = new Scanner(System.in);

    //take input name of employee which is string
    System.out.println("Please enter your name: ");
    String employee_name = input.nextLine();
    System.out.println("Name- " + employee_name);

    //take input age of employee which is integer type
    System.out.println("Enter your age: ");
    int age = input.nextInt();
    System.out.println("Age- " + age);


    //take input salary of employee which is double type
    System.out.println("Enter your salary: ");
    double salary = input.nextDouble();
    System.out.println("Salary- " + salary);
    //close the scanner
    input.close();
  }
}
