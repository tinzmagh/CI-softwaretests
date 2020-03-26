public class Validator {


    public Boolean username_is_valid(String username){
        if(username.length() > 10){
            return false;
        }

        if(username.contains(" ")){
            return false;
        }

        if(username.isEmpty()){
            return false;
        }

        return true;

    }
}