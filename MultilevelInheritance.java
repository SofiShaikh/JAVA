class School{
    void School(){
        System.out.println("this is school");
    }
}
class Teacher extends School{
    void Teacher(){
        System.out.println(" the Teacher teaches in  the school");
    }
}
class Student extends Teacher{
    void Student(){
        System.out.println(" the Student studies in  the school");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args){
        Student student = new Student();
        student.School();
        student.Teacher();
        student.Student();
    }
    
}
