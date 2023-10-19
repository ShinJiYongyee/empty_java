import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Location{

    int latitude;
    int longitude;
    Location(int latitude,int longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }

    @Override
    public String toString() {
        return latitude+"\t"+longitude;
    }
}

public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        var location=new HashMap<String,Location>();

        System.out.print("도시,경도,위도를 입력하세요");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            String s= input.nextLine();
            String[] parts = s.split(",\\s+");
            String n = parts[0];
            int latitude = Integer.parseInt(parts[1]);
            int longitude = Integer.parseInt(parts[2]);
            Location l = new Location(latitude, longitude);
            location.put(n, l);
        }
        for (Map.Entry<String,Location> entry:location.entrySet()) {
            String n= entry.getKey();
            Location s=entry.getValue();
            System.out.println(n+"\t"+s);

        }
        System.out.print("도시 이름 >> ");
        String find=input.next();
        if(location.containsKey(find)){
            Location n=location.get(find);
            System.out.println(find+"\t"+n);
        }
        else System.out.println(find+"는 없습니다.");


    }
}
