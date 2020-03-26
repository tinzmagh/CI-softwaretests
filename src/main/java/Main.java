public class Main {

    public static void main(String[] args) {
        // write your code here

        String username = "Martine";
        Validator validator = new Validator();

        if(validator.username_is_valid(username)){
            System.out.println("Username is valid");
        }
        else{
            System.out.println("Username is invalid");
        }

    }
}