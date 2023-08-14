package metodosIntrod.domain;

public class ImpressStudant {
    public void impressStudant (Student student){
        System.out.println("------------------------\n");
        System.out.println("\nNome: " + student.name +
                "\nIdade: " + student.age +
                "\nSex: " + student.sex);
    }
}
