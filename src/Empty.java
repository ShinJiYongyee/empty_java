import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("정수(-1이 입력될 때까지)>>");
        var v=new Vector<Integer>();
        do{
            int a=input.nextInt();
            if(a==-1)break;
            v.add(a);
        }while (true);

        Iterator<Integer> it=v.iterator();
        int big=v.get(0);
        while (it.hasNext()){
            if(big<it.next())big= it.next();
        }
        System.out.print("가장 큰 수는 "+big);
    }

}