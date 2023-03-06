public class HeadMaster {
    private String name;
    private String IC;
    private String address;
    private int yearsOfExperience;

    public HeadMaster(String name, String IC, String address, int yearsOfExperience) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getAddress() {
        return address;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
