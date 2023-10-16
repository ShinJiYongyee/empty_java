import java.util.Objects;

class Circle{
    int x,y,radius;
    Circle(int x,int y,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "원 a : " +
                "Circle(" + x +
                "," + y +
                ") 반지름" + radius ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return this.x == circle.x &&
                this.y == circle.y &&
                this.radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }
}

public class Empty {
    public static void main(String[] args) {
        Circle a=new Circle(2,3,5);
        Circle b=new Circle(2,3,30);
        System.out.println("원 a: "+a);
        System.out.println("원 b: "+b);
        if(a.equals(b)) System.out.println("같은 원");
        else System.out.println("다른 원");
    }
}