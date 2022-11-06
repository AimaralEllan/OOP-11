import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java OOP

        /*Student student =new Student();
        student.name="Aimaral";
        student.surname="Ellanova";
        student.age=19;
        student.getInfo();
        student.addStudent();

        //System.out.println(student.name+" "+student.surname+" "+student.age);

        Student student1=new Student();
        student1.name="Yntymak";
        student1.surname="Zhenishbekov";
        student1.age=20;
        student1.getInfo();
        //System.out.println(student1.name+" "+student1.surname+" "+student1.age);*/

        /*University university=new University();
        university.name="AUCA";
        university.city="Bishkek";
        university.year=1899;
        university.getInfo();*/

        Scanner input=new Scanner(System.in);
      Developer developer=new Developer();
      System.out.println("Print your Name:");
      developer.name=input.nextLine();
      System.out.println("Print your Surname");
      developer.surname=input.nextLine();
      System.out.println("Print your Age");
      developer.age=input.nextInt();
      developer.getAge();

      /*Developer developer1=new Developer();
      developer1.name=input.nextLine();
      developer1.surname=input.nextLine();
      developer1.age=input.nextInt();
      developer1.getAge();*/
    }

}