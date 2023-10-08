class Rectangle{
    int x,y,width,height;
    Rectangle(int a,int b,int c,int d){
        this.x=a;
        this.y=b;
        this.width=c;
        this.height=d;
    }
    int square(){
        return width*height;
    }
    void show(){
        System.out.println("좌표: "+"("+x+","+y+")"+"에서 크기가: "+width+"X"+height+"인 사각형");
    }
    boolean contains(Rectangle r){
        return this.x < r.x && this.y < r.y &&
                ((this.x + this.width) > (r.x + r.width)) &&
                ((this.y + this.height) > (r.y + r.height));
    }

}

public class Empty {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,2,8,7);
        Rectangle s=new Rectangle(5,5,6,6);
        Rectangle t=new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

    }
}