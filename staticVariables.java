class Student{
    String name;
    int rollNo;
    static String college;

    Student(String name , int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public void print(){
        System.out.println(name+" , "+rollNo+" , "+college);
    }
}

public class staticVariables{
    public static void main(String[] args){
        Student s1 = new Student("Atharva", 67);
        Student s2 = new Student("Meghana", 9);
        Student.college="MIT";

        s1.print();
        s2.print();
    }
}