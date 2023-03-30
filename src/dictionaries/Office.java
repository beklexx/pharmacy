package dictionaries;

public class Office {
    private int officeId;
    private String name;
    private int clientId;

    public Office() {
    }

    public Office(int officeId, String name, int clientId) {
        this.officeId = officeId;
        this.name = name;
        this.clientId = clientId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
