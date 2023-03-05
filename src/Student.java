public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 0;
    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        id = studentCount;
        studentCount++;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public static int getStudentCount(){
        return studentCount;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }
    public boolean equals(Student student){
        if(student.toString().equals(toString()))
            return true;
        else return false;
    }
    public String toString(){
        return "Student{id=" + id +", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }
}