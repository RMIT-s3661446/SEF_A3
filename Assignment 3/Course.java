public class Course {
    //private ArrayList<Chapters> chapters;  This is commented out as creating chapter course is outside of the scope of the project
    Instructor Author;
    int courseID;
    //private ArrayList<Student> enrolled Students; This is commented out as students are outside of the scope of this assignment

    public Course(/*ArrayList<Chapters> chapters,*/ Instructor Author){
        courseID = (int) Math.random() * 100; //Course ID is generated randomly
        this.Author = Author;

        System.out.println("New Course Created");
        System.out.println("Course Author is: " + Author.getName() + " from" + Author.getAffiliation());
    }


}
