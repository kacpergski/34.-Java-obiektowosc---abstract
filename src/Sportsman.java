public abstract class  Sportsman extends Person {
    private String diet;
    private String dateOfStart;
    private String clubName;

    public Sportsman(String name, String surname, int birthYear, String diet, String dateOfStart, String clubName) {
        super(name, surname, birthYear);
        this.diet = diet;
        this.dateOfStart = dateOfStart;
        this.clubName = clubName;
    }
    public  void  display(){
        super.display();
        System.out.println("Diet: " + diet);
        System.out.println("Date of start: " + dateOfStart);
        System.out.println("Club: " + clubName);
    }


}
