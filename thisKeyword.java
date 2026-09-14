class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public void printStudent(){
        System.out.println(name+" , "+rollNo);
    }
}

public class thisKeyword{
    public static void main(String[] args){
        Student s1 = new Student("Atharva" , 67);

        s1.printStudent();
    }
}