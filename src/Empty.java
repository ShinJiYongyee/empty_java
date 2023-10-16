
class MyPoint{
    int x,y;
    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+')';
    }

    public boolean equals(MyPoint obj) {
        return ((this.x== obj.x)&&(this.y== obj.y));
    }
}

public class Empty {
    public static void main(String[] args) {
        MyPoint p=new MyPoint(3,50);
        MyPoint q=new MyPoint(4,50);
        System.out.println(q);
        if(p.equals(q)) System.out.println("같은 점");
        else System.out.println("다른 점");
    }
}