public class errorCardHandler extends ArrayIndexOutOfBoundsException {
    private int errorId;
    private String senderError;

    public errorCardHandler(int myError){
        this.errorId = myError;
        notifyUser(myError);

    }
    public errorCardHandler(String senderErrorUser){
        this.senderError = senderErrorUser;
        notifyUser(2 );

    }
    public void notifyUser(int errorIdNot){
        switch (errorIdNot){
            case 1:
                System.out.println("Error! you cannot enter a number of cards greater than 5.");
                break;
            case 2:
                System.out.println("There is not such a sender: "+this.senderError+" in the Repository. Try again.");
                break;
            default:
                System.out.println("Internal Error.");
                break;

        }

    }
}
