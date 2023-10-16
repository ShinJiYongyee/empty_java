import java.util.Calendar;
import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String s=input.nextLine();
        int length=s.length();
        StringBuffer sb=new StringBuffer(s);
        char tmp;
        System.out.println(s);
        for(int i=0;i<length;i++){
            tmp=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(tmp);
            System.out.println(sb);

        }
    }
}