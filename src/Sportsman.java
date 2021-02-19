public abstract class  Sportsman extends Person {
    private String diet;
    private String dateOfStart;
   // private  Club club;


    public Sportsman(String name, String surname, int birthYear, Club club, String diet, String dateOfStart) {
        super(name, surname, birthYear, club);
        this.diet = diet;
        this.dateOfStart = dateOfStart;
    }

    public  void  display(){
        super.display();
        System.out.println("Diet: " + diet);
        System.out.println("Date of start: " + dateOfStart);


    }


}
