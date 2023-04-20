package wrong;

public class WrongPassword extends Exception {
    WrongPassword(){
    }
    WrongPassword(String message){
        super(message);
    }
}