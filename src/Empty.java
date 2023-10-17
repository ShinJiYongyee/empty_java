import java.util.HashMap;
import java.util.Scanner;

class Student {
/*
    String name;
*/
    String major;
    int id;
    double avg;

    Student( String major, int id, double avg) {
        this.major = major;
        this.id = id;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "학과 : " + major +
                "\n학번 : " + id + "\n학점평균 : " + avg + "\n";
    }
}

public class Empty {
    public static void main(String[] args) {
        var std = new HashMap<String,Student>();
        Scanner input = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요");

/*        for (int i = 0; i < 4; i++) {
            System.out.print( ">> ");
            String line=input.nextLine();
            String[] parts=line.split(",");
            String name = parts[0];
            String major = parts[1];
            int id = Integer.parseInt(parts[2]);
            double avg = Double.parseDouble((parts[3]));

            Student student = new Student(name, major, id, avg);
            std.add(student);
        }*/

        for (int i = 0; i < 4; i++) {
            System.out.print( ">> ");

            String name = input.next();
            String major = input.next();
            int id = input.nextInt();
            double avg = input.nextDouble();

            Student student = new Student(major, id, avg);
            std.put(name,student);
        }

        for (HashMap.Entry<String, Student> entry : std.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("이름 : " + key + "\n"+value);
        }

        System.out.print("학생 이름>> ");
        String name= input.next();
        System.out.println(std.get(name));

    }
}
