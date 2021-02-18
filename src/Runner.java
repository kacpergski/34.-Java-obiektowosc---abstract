public class Runner extends Sportsman{
    private int distance;
    private  double bestTime;

    public Runner(String name, String surname, int birthYear, String diet, String dateOfStart, String clubName, int distance, double bestTime) {
        super(name, surname, birthYear, diet, dateOfStart, clubName);
        this.distance = distance;
        this.bestTime = bestTime;
    }
    public void  display(){
        super.display();
        System.out.println("Distance: " + distance);
        System.out.println("Best time: " + bestTime);
    }

    public void training() {
        System.out.println("Running");
    }
}
