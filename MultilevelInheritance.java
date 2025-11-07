interface Teacher {
    void teacher();
}

interface Student {
    void student();
}

class School implements Teacher, Student {
    public void teacher() {
        System.out.println("The teacher teaches in the school");
    }
    public void student() {
        System.out.println("The student studies in the school");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        School school = new School();
        school.teacher();
        school.student();
    }
}
