public class Runner extends Sportsman{
    private int distance;
    private  double bestTime;


    public Runner(String name, String surname, int birthYear, Club club, String diet, String dateOfStart, int distance, double bestTime) {
        super(name, surname, birthYear, club, diet, dateOfStart);
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
