public class Club {
    private String name;
    private String dateOfCreation;

    public Club(String name, String dateOfCreation) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
