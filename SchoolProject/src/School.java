import java.util.ArrayList;
public class School {



        public ArrayList<Teacher> getTeachers() {
                return teachers;
        }

        public void setTeachers(ArrayList<Teacher> teachers) {
                this.teachers = teachers;
        }

        public ArrayList<Student> getStudents() {
                return students;
        }

        public void setStudents(ArrayList<Student> students) {
                this.students = students;
        }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    private String schoolType;

    public int getSchoolAmountOfGrades() {
        return schoolAmountOfGrades;
    }

    public void setSchoolAmountOfGrades(int schoolAmountOfGrades) {
        this.schoolAmountOfGrades = schoolAmountOfGrades;
    }

    private int schoolAmountOfGrades;

        ArrayList<Teacher> teachers = new ArrayList<>();


        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();

      public String addTeacher(String name, String lastName, String subject){
              Teacher teacher = new Teacher(name,lastName,subject);
              teachers.add(teacher);
              return name;
      }

      public String addStudent(String name, String lastName, int grade){
              Student student = new Student(name,lastName, grade);
              students.add(student);
              return name;
      }
      public String removeStudent(int indexArray){
             students.remove(indexArray);
             return "Student Removed";
      }
      public String removeTeacher(int indexArray){
              teachers.remove(indexArray);
              return "Teacher Removed";
      }
      public ArrayList showAllTeachers(){
          return teachers;
      }
      public ArrayList showAllStudents(){
          return students;
      }
      public String addCourse(String course){
          courses.add(course);
          return course;
      }
      public String removeCourse(int indexArray){
          courses.remove(indexArray);
          return "Course Removed";
      }











}



