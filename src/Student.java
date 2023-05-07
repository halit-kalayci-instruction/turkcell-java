// erişim belirteçi

// Encapsulation
// constructor
public class Student {
    // default = public
    // sensitive data
    // private = sadece ve sadece ilgili class içerisinden erişim sağla.
    // public = dış classlar için erişime açık alanlar.
    // protected
    private int number;
    private String name;

    // getter => ilgili alanın değerinin alınabileceği fonksiyonu
    // setter => ilgili alanın değerinin atanabileceği fonksiyonu
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        if(number> 1000)
            number=0;
        this.number = number;
    }

    // sol alt + insert
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student()
    {
        System.out.println("Bir öğrenci örneği oluşturuldu!");
    }
    public Student(int number, String name){
        System.out.println("Numara ve ismi bilinen bir öğrenci örneği oluşturuldu!");
        this.number = number;
        this.name = name;
    }

    public void joinClass(String className)
    {
        System.out.println(name + " isimli öğrenci " + className + " isimli derse katıldı.");
    }
}
//instance
// 18.00


