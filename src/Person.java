public class Person {
    private String name;
    private String surname;
    private int birthYear;
    //private int age = (2021-birthYear);

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth year: " + birthYear);
    }
    public void displayAge(){
        System.out.println("Age of "+ name + " " + surname + ": " + (2021-birthYear) + " years") ;
    }
}
