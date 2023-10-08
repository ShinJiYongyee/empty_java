import java.util.Scanner;

class Phone{
    String name;
    String tel;
    void set(String name,String tel){this.name=name;this.tel=tel;}

}
class PhoneBook{
    int index;
    Scanner input=new Scanner(System.in);
    Phone[] PhoneNumbers;
    PhoneBook(int index){
        this.index=index;
        this.PhoneNumbers=new Phone[index];
        for(int i=0;i<index;i++){
            PhoneNumbers[i]=new Phone();
        }
    }
    void input(){
        for(int i=0;i<index;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name=input.next();
            String tel=input.next();
            PhoneNumbers[i].set(name,tel);
        }
        System.out.println("저장되었습니다.");
    }
    void search(){
        while (true){
            System.out.print("검색할 이름>>");
            String name=input.next();
            boolean b=false;
            if(name.equals("그만"))break;
            for(Phone p:PhoneNumbers){
                if(p.name.equals(name)){
                    System.out.println(p.name+"의 번호는"+p.tel+"입니다.");
                    b=true;
                }
            }
            if(!b)System.out.println(name+" 이 없습니다.");

        }
    }
    void run(){
        input();
        search();
        input.close();
    }


}
public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("인원수>>");
        int n=input.nextInt();
        var p=new PhoneBook(n);
        p.run();
    }
}