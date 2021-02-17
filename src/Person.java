public class Person {
    private String name;
    private String surname;
    private int birthYear;

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

}
