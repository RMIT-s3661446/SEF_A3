public class paymentDetails {
    
    private String cardNumber;
    private String expiryDate;
    private int CCV;

    private String payPalToken;

    public paymentDetails(String cardNumber, String expiryDate, int CCV){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CCV = CCV;
    }

    public paymentDetails(String payPalToken){
        this.payPalToken = payPalToken;
    }

    

    public void takePayment(int bill) throws Exception{
        int paymentSuccess = (int)(Math.random()*100) % 2; //Generally response comes from the bank whether payment is successful or not, howewever, in this case it will be randomly determined where 1 is success and 0 is fail

        if (paymentSuccess == 1){
            System.out.println("Payment Successful");
        }
        else if(paymentSuccess == 0){
            throw new Exception("Payment failed");
        }
    }
}
