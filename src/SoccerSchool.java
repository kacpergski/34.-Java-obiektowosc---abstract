public class SoccerSchool {

    private Person [] persons = new Person[50]; // zadeklarowanie w pamieci tablicy 50 elementowej klasy Person  o referencji persons
    private  int indexPerson;
    public void add(Person person){
    persons[indexPerson++] = person;
    }

    public void displayAll (){
    if (indexPerson<persons.length) {
        for (int i = 0; i < indexPerson; i++) {
            persons[i].display();
        }
    }
    }

    public void displayAge (){
        if (indexPerson<persons.length) {
            for (int i = 0; i < indexPerson; i++) {
                persons[i].displayAge();
            }
        }
    }
}
