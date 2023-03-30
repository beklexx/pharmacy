package dictionaries;

public class Personal {
    private int personalId;
    private String name;

    public Personal() {
    }

    public Personal(int personalId, String name) {
        this.personalId = personalId;
        this.name = name;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
