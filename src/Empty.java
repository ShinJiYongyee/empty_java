import java.util.HashMap;
import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("나라 이름과 인구를 입력하세요(에: Korea 5000)");
        var v=new HashMap<String,Integer>();
        System.out.println();
        while (true){
            System.out.print("나라 이름, 인구 >> ");
            String s=input.next();
            if(s.equals("그만"))break;
            //int를 읽기 전 s.equals를 수행해야 조건문이 정상적으로 작동
            //int p~가 if문보다 먼저 올 경우 그만+정수 를 읽어야 break
            int p=input.nextInt();
            v.put(s,p);
        }

        while (true){
            System.out.print("인구 검색 >> ");
            String s=input.next();
            if(s.equals("그만"))break;
            if(!v.containsKey(s)) {
                System.out.println(s+" 나라는 없습니다");
            }
            else {
                int p= v.get(s);
                System.out.println(s+"의 인구는 "+p);
            }
        }

    }

}