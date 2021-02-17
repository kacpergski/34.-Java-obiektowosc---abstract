
import java.util.Scanner;

public class SoccerSchoolApp {
    public static void main(String[] args) {
        SoccerSchool soccerSchool = new SoccerSchool(); // utworzenie nowej szkoły obiektu o ref sockerCHOOL KLASY Sockerschool
       Scanner scanner = new Scanner(System.in, "UTF-8");
       int option;
       String name, surname, diet, dateOfStart, clubName;
       int birthYear;
    do{
        System.out.println("---------------Socker school------------");
        System.out.println("Menu choose and insert number:");
        System.out.println("1. Add Footballer");
        System.out.println("2. Add Runner");
        System.out.println("3. Add Swimmer");
        System.out.println("4. Display all Athletes");
        System.out.println("5. Display age all Athletes");
        System.out.println("6. Add trenning");
        System.out.println("0. Stop");

        option = scanner.nextInt();
        scanner.nextLine();

        switch (option){

            case 1:
                System.out.println("Name: ");
                name = scanner.nextLine();
                System.out.println("Surname: ");
                surname = scanner.nextLine();
                System.out.println("Birth year: ");
                birthYear = scanner.nextInt();
                scanner.nextLine(); // n
                System.out.println("Diet: ");
                diet = scanner.nextLine();
                System.out.println("Date of Start(f.e. 10.01.2020): ");
                dateOfStart = scanner.nextLine();
                System.out.println("Position: ");
                String position = scanner.nextLine();
                System.out.println("Club: ");
                clubName = scanner.nextLine();
                Footballer footballer = new Footballer(name, surname, birthYear, diet, dateOfStart,clubName, position);
                soccerSchool.add(footballer);

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;




        }
    }while (option !=0);

scanner.close();
    }
}
