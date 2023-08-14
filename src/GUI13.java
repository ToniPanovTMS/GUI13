import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class GUI13 {
    static String login;
    static String Password;

    public static void main(String[] args) throws IOException {
        inputLogin();
        inputPassword();
        PASSWORDCHECK();
        exitReg();
    }
    public static void inputLogin(){
        JOptionPane.showMessageDialog(null,"ведите логин",
                "Авторизация",
                JOptionPane.INFORMATION_MESSAGE);
        String log="";
        while (true) {
            log = JOptionPane.showInputDialog(null,"ведите логин",
                    "Авторизация",
                    JOptionPane.QUESTION_MESSAGE);
            char[] Array = log.toCharArray();
            int j=0;
            for(int i=0;i<Array.length;i++) {
                if(Array[i]==' '){
                    break;
                } else{
                    j++;
                }
            }
            if(j==log.length()&&log.length()>=5){
                JOptionPane.showMessageDialog(null,"Ваш логин: "+log);
                login=log;
                break;
            }
        }

    }
    public static void inputPassword(){

        while (true) {
            String pass=JOptionPane.showInputDialog(null,
                    "Введите пароль :",
                    "Авторизация",
                    JOptionPane.QUESTION_MESSAGE);
            char[] Array = pass.toCharArray();
            int j=0,k=0,l=0;
            for(int i=0;i<Array.length;i++) {
                if (Array[i]<='9'&&Array[i]>='1') {
                    k++;
                    j++;
                } else if (Array[i]<='z'&&Array[i]>='A') {
                    l++;
                    j++;
                }
            }
            if(j==pass.length()&&pass.length()>=8&&k>=1&&l>=1){
                Password=pass;
                break;
            }
        }
    }
    public static void PASSWORDCHECK(){

            while (true) {
                String pass = JOptionPane.showInputDialog(null,
                        "Повторите пароль :",
                        "Авторизация",
                        JOptionPane.QUESTION_MESSAGE);

                if (pass.equals(Password)) {
                    break;
                }
        }
    }
    public static void exitReg(){
         JOptionPane.showMessageDialog(null,
                 "Регистрация успешно завершена",
                 "Регистрация завершина",
                 JOptionPane.WARNING_MESSAGE);
    }
}
