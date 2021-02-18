public class Swimmer extends Sportsman {
    private String style;
    private double bestTime;

    public Swimmer(String name, String surname, int birthYear, String diet, String dateOfStart, String clubName, String style, double bestTime) {
        super(name, surname, birthYear, diet, dateOfStart, clubName);
        this.style = style;
        this.bestTime = bestTime;
    }

    public void  display(){
        super.display();
        System.out.println("Distance: " + style);
        System.out.println("Best time: " + bestTime);
    }

    public void training() {
        System.out.println("Swimming");
    }
}
