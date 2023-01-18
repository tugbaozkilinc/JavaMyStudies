package projects.studentclass;

public class StudentClass {

    private String studentName;
    private String studentSurname;
    private int studentAge;

    public StudentClass(String studentName, String studentSurname, int studentAge) throws Exception {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        if(studentAge>15){
            throw new Exception("Student age can not be mre than 15");
        } else {
            this.studentAge = studentAge;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
