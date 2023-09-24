import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to learning Platform Demo:");
        System.out.println("Select an option:");
        System.out.println("[1] Log in as a student");
        System.out.println("[2] Log in as an instructor");
        System.out.println("[3] Log in as an employee");

        System.out.println();

        System.out.println("NOTE: OPTIONS 1 AND 3 ARE NOT FUNCTIONING AS THEY ARE OTSIDE OF SCOPE OF THIS ASSESSMENT:");
        System.out.print("Select your option: ");

        int menuOption = input.nextInt();



        //Instructor is created for demo purposes only, as registration process is outside of the scope
        Instructor instructor = new Instructor(0, "John Smith", "0412345678", null, "test@test.test", "RMIT");

        switch(menuOption){
            case 1:
            System.out.println("STUDENT NOT IMPLEMENTED");
            break;

            case 2:
            System.out.println("Instructor logged in");
            instructor.createCourse("Hello Everyone");
            break;

            case 3:
            System.out.println("EMPLOYEE NOT IMPLEMENTED");
            break;

            default:
            System.out.println("Select appropriate Option!!!");

        }




    }
}
