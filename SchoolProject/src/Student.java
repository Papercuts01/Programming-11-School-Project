public class Student {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getStudentPrint() {
        return studentPrint;
    }

    public void setStudentPrint(String studentPrint) {
        this.studentPrint = studentPrint;
    }

    private String firstName;
    private String lastName;
    private int grade;

    private String studentPrint;
    static int studentNum = 1 ;

    private int idNum;

    public String toString(){
        return  "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }

    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentPrint = "Name: " + firstName + lastName + " Grade: " + grade;
        this.idNum = studentNum;
        studentNum++;
    }

}
