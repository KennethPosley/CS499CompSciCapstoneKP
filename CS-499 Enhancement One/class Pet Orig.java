bclass Pet
{
    // petType can be dog or cat
    private String petName;
    private String petType;
    // pet age in years
    // dog and catSpaces are rooms/slots available
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    // amount due for pets bill
    private double amountDue;
    // Pet Constructor
    Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
}
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
    }
    public int getPetAge() {
        return petAge;
}
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    public int getDogSpaces() {
        return dogSpaces;
    }
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }
    public int getCatSpaces() {
        return catSpaces;
    }
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}