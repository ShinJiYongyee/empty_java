import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;

    public Circle(double x,double y,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getRadius(){
        return radius;
    }
}

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Circle c[]=new Circle[3];
        for(int i=0;i<3;i++){
            System.out.print("x, y, radius>> ");
            double x=input.nextDouble();
            double y=input.nextDouble();
            int radius=input.nextInt();
            c[i]= new Circle(x,y,radius);
        }
        Circle biggestCircle=c[0];
        for(int i=1;i<3;i++){
            if(biggestCircle.getRadius()<c[i].getRadius())
                biggestCircle=c[i];
        }
        System.out.print("가장 큰 원은 ");
        biggestCircle.show();
        input.close();
    }
}