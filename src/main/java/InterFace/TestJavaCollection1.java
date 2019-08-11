public class MyClass {
    public static void main(String[ ] args){
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        }catch (Exception ex){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("this is last section");
        }
    }
}