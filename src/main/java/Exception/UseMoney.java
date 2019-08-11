package Exception;

public class UseMoney {

    public static void main(String[] args) {
        Money m1= new Money();
        try{
            m1.set(20,60);
        }catch (InvalidAmountException ex){
            System.out.println(ex.getMessage());
        }



    }
}
