import java.util.Scanner;
class Day{
    private String work;
    public void set(String work){this.work=work;}
    public String get(){return work;}
    public void show(){
        if(work==null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}
class MonthSchedule{
    Scanner input=new Scanner(System.in);
    int days;
    Day[] Monthdays;
    MonthSchedule(int days){
        this.days =days;
        this.Monthdays=new Day[days];
        for(int i=0;i<days;i++){
            Monthdays[i]=new Day();
        }
    }
    void run(){
        System.out.println("이번달 스케줄 관리 프로그램.");
        for(int i = 0; i< days; i++){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int anInt=input.nextInt();
            if(anInt==1){
                input();
            }else if(anInt==2){
                view();
            }else if(anInt==3){
                finish();
                break;
            }else{
                System.out.println("wrong input.");
            }
        }
    }
    void input(){
        System.out.print("날짜(1~"+days+")?");
        int d=input.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String work=input.next();
        Monthdays[d].set(work);
    }
    void view(){
        System.out.print("날짜(1~"+days+")?");
        int d=input.nextInt();
        System.out.print(d+"일의 할 일은 ");
        Monthdays[d].show();
    }
    void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
}

public class Empty {
    public static void main(String[] args) {
        MonthSchedule april=new MonthSchedule(30);
        april.run();
    }
}