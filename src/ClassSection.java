import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;
    public ClassSection(String x, int y, int z){
        this.subject = x;
        this.capacity = y;
        this.yearLevel = z;
        students = new ArrayList<>();
    }
    public void setSubject(String x){
        this.subject = subject;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public String getSubject(){
        return subject;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        if(student.getYearLevel() == yearLevel && !isStudentEnrolled(student)){
            students.add(student);
        }
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public boolean isStudentEnrolled(Student student){
        for(Student name : students){
            if(name.equals(student)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";
    }
}