import java.util.Scanner;

class Add{
    int a,b;
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return a+b;
    }
}
class Sub{
    int a,b;
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return a-b;
    }
}
class Mul{
    int a,b;
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return a*b;
    }
}
class Div{
    int a,b;
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    int calculate(){
        return a/b;
    }
}
public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Add add = new Add();Sub sub = new Sub();
        Mul mul = new Mul();Div div = new Div();
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a= input.nextInt();
        int b= input.nextInt();
        String c=input.next();
        int result;
        switch (c) {
            case "+" -> {
                add.setValue(a, b);
                result = add.calculate();
                System.out.println(result);
            }
            case "-" -> {
                sub.setValue(a, b);
                result = sub.calculate();
                System.out.println(result);
            }
            case "*" -> {
                mul.setValue(a, b);
                result = mul.calculate();
                System.out.println(result);
            }
            case "/" -> {
                div.setValue(a, b);
                result = div.calculate();
                System.out.println(result);
            }
        }
        /* 같은 기능을 하는 코드
        switch(c){
            case "+":add.setValue(a,b);result=add.calculate();
                System.out.println(result);break;
            case "-":sub.setValue(a,b);result=sub.calculate();
                System.out.println(result);break;
            case "*":mul.setValue(a,b);result= mul.calculate();
                System.out.println(result);break;
            case "/":div.setValue(a,b);result=div.calculate();
                System.out.println(result);break;
        }*/

    }
}