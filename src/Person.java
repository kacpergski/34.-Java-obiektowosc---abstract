public abstract class Person {
    private String name;
    private String surname;
    private int birthYear;
    private  Club club;


    public Person(String name, String surname, int birthYear, Club club) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.club = club;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Club name: " + club.getClubName);
        System.out.println("Club date: " + club.getDateOfCreation);
    }
    public void displayAge(){
        System.out.println("Age of "+ name + " " + surname + ": " + (2021-birthYear) + " years") ;
    }

    public abstract void training();

}
