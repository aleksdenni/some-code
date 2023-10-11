package TestTask;

public class Ts {
    public static void main(String[] args) {
        String s = password(new String [] {"P1Asw2ord","PasswORD1"},"2dro3");
    }

    public static String password(String[] pass, String check){
        if(!check.matches("^\\d+[A-Za-z]{3}\\d+$")){

        }
        return "";
    }

}

/*
* out: 2dro3 - для in: P1Asw2ord
* */