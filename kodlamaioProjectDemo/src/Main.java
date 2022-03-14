import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       asal();

        Instructor instructor1 = new Instructor(1, "instructor@gmail.com", "Musa", "Balın");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

        StudentManager studentManager = new StudentManager();
        Student student1 = new Student(1, "student@gmail.com", "Musa", "Balın");
        studentManager.add(student1);
        for (User user : studentManager.getAll()
        ) {
            System.out.println("Student: "+user.getEmail());

        }
        for (User user : instructorManager.getAll()
        ) {
            System.out.println("Instructor: "+user.getEmail());
        }


    }

    public static void asal() {
        System.out.print("Sayi Gir:");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        boolean check = true;
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                check = true;
                break;
            } else {
                check = false;
            }

        }
        if (check == false) {
            System.out.println("Sayı asaldır..");
        } else {
            System.out.println("Sayı asal değildir");
        }
        System.out.println("Girilen sayı: " + sayi);
    }
}
