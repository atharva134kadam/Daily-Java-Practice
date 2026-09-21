import java.util.Objects;

class Patient{
    int age;
    String Name;

    Patient(int age, String Name){
        this.age = age;
        this.Name = Name;
    }

    @Override
    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!= obj.getClass()){
            return false;
        }

        Patient other = (Patient) obj;

        return age==other.age && Name.equals(other.Name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(age,Name);
    }
}

public class equalsAndhashCode{
    public static void main(String[] args){
        Patient p1 = new Patient(45, "Meghana");
        Patient p2 = new Patient(45, "Meghana");

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode()==p2.hashCode());
    }
}