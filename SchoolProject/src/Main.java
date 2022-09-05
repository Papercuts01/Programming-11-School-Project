import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        School javaSchool = new School();
        javaSchool.addStudent("Andrew", "Herbert",10 );
        javaSchool.addStudent("Hammond", "Simon", 9);
        javaSchool.addStudent("Declan", "Moore", 10);
        javaSchool.addStudent("Brandon", "Cooper", 11);
        javaSchool.addStudent("Holt", "Dawson",8);
        javaSchool.addStudent("Kira", "Dawson", 9);
        javaSchool.addStudent("Taylor", "Kennedy",10);
        javaSchool.addStudent("Milo", "Hammond",10);
        javaSchool.addStudent("Edwin", "Kahn",8);
        javaSchool.addStudent("Jackson", "Rossi", 9);

        javaSchool.addTeacher("Kay", "Palmer", "Math");
        javaSchool.addTeacher("Shawn", "Thornton", "English");
        javaSchool.addTeacher("Hugo", "Alexander", "Social Studies");
        System.out.println(javaSchool.teachers);
        System.out.println(javaSchool.students);

        javaSchool.removeTeacher(2);

        javaSchool.removeStudent(2);
        javaSchool.removeStudent(6);
        javaSchool.removeStudent(3);

        System.out.println(javaSchool.teachers);
        System.out.println(javaSchool.students);









    }
}
