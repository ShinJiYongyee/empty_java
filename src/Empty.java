import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        var student=new HashMap<String,Double>();
        var awarded=new ArrayList<String>();
        System.out.println("미래장학금관리시스템입니다.");
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            String name=input.next();
            Double p= input.nextDouble();
            student.put(name,p);
        }
        System.out.print("장학생 선발 학점 기준 입력>>");
        double stdpoint= input.nextDouble();
        for (HashMap.Entry<String, Double> entry : student.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if(value>=stdpoint)awarded.add(key);

        }
        System.out.print("장학생 명단 : ");
        for (String s:awarded) {
            System.out.print(s+" ");
        }

    }
}
