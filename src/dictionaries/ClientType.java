package dictionaries;

public class ClientType {
    private int clientTypeId;
    private String name;

    public ClientType() {
    }

    public ClientType(int clientTypeId, String name) {
        this.clientTypeId = clientTypeId;
        this.name = name;
    }

    public int getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(int clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
