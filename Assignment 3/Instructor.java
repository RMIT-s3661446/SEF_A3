import java.util.ArrayList;

public class Instructor extends User{

    private String Affiliation;
    private ArrayList<Course> instructedCourses;

    public Instructor(int userID, String userName, String phoneNumber, paymentDetails userPayment, String email, String Affiliation){
        super(userID, userName, phoneNumber, userPayment, email);
        this.Affiliation = Affiliation;

        instructedCourses = new ArrayList<Course>();
    }

    public void createCourse(String courseDescription){
        Instructor thisInstructor = new Instructor(userID, userName, phoneNumber, userPayment, email, Affiliation);
        Course newCourse = new Course(thisInstructor);

    }

    public String getName(){
        return userName;
    }

    public String getAffiliation(){
        return Affiliation;
    }






    
    
}
