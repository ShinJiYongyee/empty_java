class Song{
    String title;
    String artist;
    int year;
    String country;
    Song(){}
    Song(String t,String a,int y,String c){
        this.title=t;
        this.artist=a;
        this.year=y;
        this.country=c;
    }
    void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }

}

public class Empty {
    public static void main(String[] args) {
        Song Dancing_Queen=new Song("Dancing Queen","ABBA",1978,"스웨덴");
        Dancing_Queen.show();
    }
}