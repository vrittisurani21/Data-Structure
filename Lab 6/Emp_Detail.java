import java.util.Scanner;

class Employee_Detail{

    int employee_ID;
    String name;
    String designation;
    double salary;

    public void getDetails(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter employee_ID:");
        int employee_ID = sc.nextInt();
        sc.nextLine();
        System.out.println("enter employee name:");
        String name = sc.nextLine();
        System.out.println("enter employee designation:");
        String designation = sc.nextLine();
        System.out.println("enter employee salary:");
        double salary = sc.nextDouble();
    }
    public void print(){
        System.out.println(employee_ID);
        System.out.println(name);
        System.out.println(designation);
        System.out.println(salary);
    }
}

public class Emp_Detail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of employees:");
        int n=sc.nextInt();

        Employee_Detail a[] = new Employee_Detail[n];

        for (int i=0;i<n;i++){
            a[i]=new Employee_Detail();
            a[i].getDetails();
            a[i].print();
        }
    }
}
