import java.util.Calendar;

public class Empty {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        System.out.println("현재 시간은 "+hour+"시 "+minute+"분 입니다.");
        switch (hour){
            case 4,5,6,7,8,9,10,11->
                    System.out.println("Good Morning");
            case 12,13,14,15,16,17->
                    System.out.println("Good Afternoon");
            case 18,19,20,21,22->
                    System.out.println("Good Evening");
            default -> System.out.println("Good Night");
        }
    }
}