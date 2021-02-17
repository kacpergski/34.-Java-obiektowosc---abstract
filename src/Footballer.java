public class Footballer extends Sportsman {
    private String position;

    public Footballer(String name, String surname, int birthYear, String diet, String dateOfStart, String clubName, String position) {
        super(name, surname, birthYear, diet, dateOfStart, clubName);
        this.position = position;
    }
    public void  display(){
        super.display();
        System.out.println("Position: " + position);
            }
}
