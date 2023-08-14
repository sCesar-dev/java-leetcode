package metodosIntrod.test;

import metodosIntrod.domain.ImpressStudant;
import metodosIntrod.domain.Student;

public class TestStudent01 {
    public static void main(String[] args) {
        ImpressStudant impress = new ImpressStudant();
        Student student1 = new Student();

        student1.name = "Irineu";
        student1.age = 15;
        student1.sex = 'M';

        Student student2 = new Student();

        student2.name = "Maria";
        student2.age = 17;
        student2.sex = 'F';

        impress.impressStudant(student1);
        impress.impressStudant(student2);
    }
}
