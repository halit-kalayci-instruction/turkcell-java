package mypackage;

public class Human {
    // İlgili kod aynı pakette veya subclassda ise erişim sağlanabilir..
    protected String name;
    protected String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void breathe(){
        System.out.println(name + " is breathing..");
    }
}
