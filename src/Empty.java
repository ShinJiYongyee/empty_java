
class TV{
    private int size;
    public TV(int size){this.size=size;}
    protected int getSize(){return size;}
}

class ColorTV extends TV{
    int color;
    ColorTV(int size,int color){
        super(size);
        this.color=color;
    }
    void printProperty(){
        System.out.println(getSize()+"인치"+" "+color+"컬러");
    }
}
public class Empty {
    public static void main(String[] args) {
        ColorTV myTV=new ColorTV(32,1024);
        myTV.printProperty();
    }
}