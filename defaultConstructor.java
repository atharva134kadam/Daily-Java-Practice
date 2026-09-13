class Student{
    String name;
    int age;
    int rollNo;
    String college;

    Student(){
        name = "Atharva";
        age = 19;
        rollNo = 67;
        college = "MIT";
    }
    void printStudent(){
        System.out.println(name+" , "+age+" , "+rollNo+" , "+college);
    }
}

public class defaultConstructor{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.printStudent();
        s2.printStudent();
    }
}