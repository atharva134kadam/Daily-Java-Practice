class Student{
    String name;
    int age;
    int rollNo;
    String college;

    Student(String n, int a, int r, String c){
        name = n;
        age = a;
        rollNo = r;
        college = c;
    }
    void printStudent(){
        System.out.println(name+" , "+age+" , "+rollNo+" , "+college);
    }
}

public class parameterizedConstructor{
    public static void main(String[] args){
        Student s1 = new Student("Atharva",19,67,"MIT");

        s1.printStudent();
    }
}