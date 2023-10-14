import java.util.Scanner;

abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double radio;

    public void run(){
        Scanner input=new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다");
        System.out.print(getSrcString()+"을 입력하세요>>");
        double val=input.nextDouble();
        double res=convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다");
        input.close();

    }
}
class Won2Dolllar extends Converter{

    @Override
    protected double convert(double src) {
        return src*1/radio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
    Won2Dolllar(double radio){
        this.radio=radio;
    }
}
public class Empty {
    public static void main(String[] args) {
        Won2Dolllar toDollar=new Won2Dolllar(1200);
        toDollar.run();
    }
}