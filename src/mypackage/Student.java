package mypackage;// erişim belirteçi

// Encapsulation
// Inheritance => Miras,Kalıtım
// constructor

// Subclass - Superclass
public class Student extends Human
{
    private int number;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        if(number> 1000)
            number=0;
        this.number = number;
    }

    public Student()
    {
        System.out.println("Bir öğrenci örneği oluşturuldu!");
    }
    public Student(int number,String name, String surname){
        System.out.println("Numara ve ismi bilinen bir öğrenci örneği oluşturuldu!");
        this.number = number;
        this.name = name;
        this.surname = surname;
    }
    public void joinClass(String className)
    {
        System.out.println(name + " isimli öğrenci " + className + " isimli derse katıldı.");
    }
}


