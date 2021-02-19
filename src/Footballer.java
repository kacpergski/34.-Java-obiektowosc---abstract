public class Footballer extends Sportsman {
    private String position;

    public Footballer(String name, String surname, int birthYear, Club club, String diet, String dateOfStart, String position) {
        super(name, surname, birthYear, club, diet, dateOfStart);
        this.position = position;
    }

    public void display() {
        super.display();
        System.out.println("Position: " + position);
    }

    public void training() {
        System.out.println("Drybling");
    }

}


