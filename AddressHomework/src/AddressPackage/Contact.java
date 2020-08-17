package AddressPackage;

public class Contact {

    private String name;
    ContactData[] data = new ContactData[10];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactData[] getData() {
        return data;
    }

    public void setData(ContactData[] data) {
        this.data = data;
    }
}
