class Point{
    private int x,y;
    public Point(int x, int y){this.x=x;this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x,int y){this.x=x;this.y=y;}
}

class ColorPoint extends Point{
    String color;
    public ColorPoint(){
        super(0,0);
        this.color="BLACK";
    }
    public ColorPoint(int x, int y,String color) {
        super(x, y);
        this.color=color;
    }
    public ColorPoint(int x, int y) {
        super(x, y);
        this.color="BLACK";
    }
    void setXY(int x,int y){
        super.move(x,y);
    }
    void setColor(String color){this.color=color;}
    public String toString(){
        return color+"색의 "+"("+getX()+","+getY()+")의 점";
    }
}
class Point3D extends Point{
    int z;
    public Point3D(int x, int y,int z) {
        super(x, y);
        this.z=z;
    }

    protected void move(int x, int y,int z) {
        super.move(x, y);
        this.z=z;
    }

    public void moveUp(){
        this.z+=1;
    }
    public void moveDown(){
        this.z-=1;
    }
    public String toString(){
        return "("+getX()+","+getY()+","+z+")의 점";
    }
}
public class Empty {
    public static void main(String[] args) {
        Point3D p=new Point3D(1,2,3);
        System.out.println(p.toString()+"입니다.");
        p.moveUp();
        System.out.println(p.toString()+"입니다.");
        p.moveDown();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");
        p.move(100,200, 300);
        System.out.println(p.toString()+"입니다.");
    }
}