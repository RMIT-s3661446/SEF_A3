public abstract class User {
    
    protected int userID;
    protected String userName;
    protected String phoneNumber;
    protected paymentDetails userPayment;
    protected String userAddress;
    protected String email;
    protected String userLogin;
    protected String passWord;

    public User(int userID, String userName, String phoneNumber, paymentDetails userPayment, String email){
        this.userID = userID;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.userPayment = userPayment;
        this.email = email;
    }

    
    public void generateCredentials(){

    }

    public int sendGeneralQuery(String message, String userEmail){
        int ticketNumber = 1;
        ticketNumber += 1;
        
        return ticketNumber;
    }
    
}
