class Student{
    String name;
    int age;
    int rollNo;
    String college;

    void printStudent(){
        System.out.println(name+" , "+age+" , "+rollNo+" , "+college);
    }
}

public class ClassObject{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Atharva";
        s1.age = 19;
        s1.rollNo = 67;
        s1.college = "MIT";

        s2.name = "Meghana";
        s2.age = 19;
        s2.rollNo = 9;
        s2.college = "MIT";

        s1.printStudent();
        s2.printStudent();
    }
}