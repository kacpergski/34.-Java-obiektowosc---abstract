public class Club {
    public String getClubName;
    public String getDateOfCreation;
    private String clubName;
    private 1String dateOfCreation;

    public Club(String clubName, String dateOfCreation) {
        this.clubName = clubName;
        this.dateOfCreation = dateOfCreation;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getClubName() {
        return clubName;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

//    public void  display(){
//
//        System.out.println("Club name: " + clubName);
//        System.out.println("Date club: " + dateOfCreation);
//    }

}
