import java.util.Scanner;

class Grade{
    int math;
    int science;
    int english;
    Grade(int m,int s,int e){
        this.math=m;
        this.science=s;
        this.english=e;
    }
    int average(){
        return (math+science+english)/3;
    }

}

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("수학,과학,영어 순으로 3개의 점수 입력>>");
        int math=input.nextInt();
        int science=input.nextInt();
        int english=input.nextInt();
        Grade me=new Grade(math,science,english);
        System.out.println("평균은 "+me.average());

        input.close();
    }
}