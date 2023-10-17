import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("6개 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        var v=new ArrayList<Character>();
        for(int i=0;i<6;i++){
            char a=input.next().charAt(0);
            v.add(a);

        }

        Iterator<Character> it=v.iterator();
        double sum=0;
        while (it.hasNext()){
            char a=it.next();
            if(a=='A')sum+=4.0;
            if(a=='B')sum+=3.0;
            if(a=='C')sum+=2.0;
            if(a=='D')sum+=1.0;
            if(a=='F')sum+=0.0;

        }
        double avg=sum/6;
        System.out.println(avg);
    }

}