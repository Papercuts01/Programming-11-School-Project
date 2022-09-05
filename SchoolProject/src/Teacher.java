import java.util.ArrayList;

public class Teacher {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    private  String subject;

    public String toString(){
        return "Name: " + name + " " + lastName + " Subject: " + subject;
    }

    private String teacherPrint;
    Teacher(String name, String lastName, String subject) {

        this.name = name;
        this.lastName = lastName;
        this.subject = subject;




    }


}
