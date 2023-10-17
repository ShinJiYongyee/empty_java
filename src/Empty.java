import java.util.Scanner;
import java.util.Vector;

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        var v=new Vector<Integer>();
        while (true){
            System.out.print("강수량 입력(0 입력시 종료)>> ");
            int sum=0;
            int a=input.nextInt();
            if(a==0)break;
            v.add(a);
            for(int b:v){
                System.out.print(b+" ");
            }
            System.out.println();
            for(int b:v){
                sum+=b;
            }
            System.out.println("현재 평균 "+sum/v.size());
        }

    }

}