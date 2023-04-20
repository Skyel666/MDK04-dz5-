package wrong;

public class WrongLogin extends Exception{
    WrongLogin(){
    }
    WrongLogin(String message){
        super(message);
    }
}
