public class PERSON {

    private String name;
    private String gender;
    private String address;
    private int phone;
    public double weight;
    private double hight;
    private String birthday;
    private String email;
    private String job;
    private String familyStatus;
    private int id;

    //---- Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //---- Gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    //---- Adress
    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getAddress() {
        return this.address;
    }

    //---- Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    //---- phone
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    //---- Weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    //---- job
    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    //---- family status
    public void setfamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getfamilyStatus() {
        return getfamilyStatus();
    }

    //---- birthday
    public void setbirthday(String dateOfBirth) {
        this.birthday = birthday;
    }

    public String getbirthday() {

        return this.birthday;
    }

    public String toString() {
        return "person{name=" + getName()+ "gender=" + getGender()+ "address=" + getAddress()+ "phone=" + getPhone()+ "weight=" + getWeight()+"email="+getEmail()+"job="+getJob()+"familyStatus="+getfamilyStatus()+"birthday="+getbirthday()+"}";
    }
}