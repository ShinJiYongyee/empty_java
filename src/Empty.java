import java.util.Scanner;

class Dictionary{
    private static String [] kor={"사랑","아기","돈","미래","희망"};
    private static String [] eng={"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        for (int i = 0; i < kor.length; i++) {
            if(kor[i].equals(word))return word+"은/는 "+eng[i];
        }
        return word+"은/는 저의 사전에 없습니다.";
    }
}
public class Empty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("한글 단어 검색 프로그램입니다.");
        while (true){
            System.out.print("한글 단어?");
            String word=input.next();
            if(word.equals("그만"))break;
            String result=Dictionary.kor2Eng(word);
            System.out.println(result);
        }
    }
}