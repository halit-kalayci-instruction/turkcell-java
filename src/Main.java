import mypackage.Student;
import mypackage.Teacher;

public class Main {
    public static void main(String[] args) {
        // OOP => Object Oriented Programming = Nesne Yönelimli Programlama

        // Kütüphane Yönetim Sistemi
        // Kitap
        // Öğrenci

        // Instance oluşturmak => class newlemek => obje üretmek


        // instance üretmek
        Student student1 = new Student();
        student1.setNumber(1);
        student1.setName("Nisa");
        student1.joinClass("Kimya");
        System.out.println(student1.getNumber());

        Student student2 = new Student();
        student2.setNumber(2);
        student2.setName("Mehmet");
        student2.joinClass("Yazılım");

        Student student3 = new Student(1, "Halit","Kalaycı");
        student3.breathe();
        student3.joinClass("Matematik");

        Teacher teacher = new Teacher("Engin","Demiroğ","Java");
        teacher.breathe();
        System.out.println(teacher.getName() + " " + teacher.getSurname() + " "  + teacher.getLessonName());
        //mypackage.Student student4 = new mypackage.Student(5);

        /*
        System.out.println(student1.number + " numaralı öğrencinin ismi: " + student1.name);
        System.out.println(student2.number + " numaralı öğrencinin ismi: " + student2.name);

        int sayi1= 10;
        int sayi2 = 25;
        System.out.println(sayi1 + sayi2);

        int sayi3 = 20;
        int sayi4 = 10;
        System.out.println(sayi3+sayi4);
        //System.out.println("SumNumbers fonksiyonu çalıştırıldı..");
        sumNumbers(10,20); // konsola yazdır
        sumNumbers(5,15); // konsola yazdır
        int result = sumNumbers(100,30); // değeri alıp üzerinden 10 çıkartmak
        System.out.println("Değeri aldım ve üzerinden 10 çıkarttım sonuç: " + (result-10));
        sumNumbers(1, 10); // konsola yazdır
        */
    }
    // (erişim belirteci) (static (opsiyonel)) (dönüş tipi) (metod ismi) () { }
    // void => dönüş tipi yok
    // parametreler (opsiyonel)
    public static int sumNumbers(int number1, int number2)
    {
       //var result = number1+number2;
       int result = number1+number2;
       System.out.println(result);
       return result;
    }
}