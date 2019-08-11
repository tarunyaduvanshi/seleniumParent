package Exception;

public class Money {
    private int rs;
    private int paisa;

    public void set(int r, int p) throws InvalidAmountException {
        if(r>=0 && p<=0){
            rs=r;
            paisa=p;
        }
        else {
            InvalidAmountException e=new InvalidAmountException("Amount can't be Zero");
            throw e;
        }
    }
}
