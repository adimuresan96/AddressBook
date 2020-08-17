package AddressPackage;

public class AddressBook {
    Contact[] contacts = new Contact[2];

    private boolean deleteStatus;
    private Contact foundContact;
    int i=0;

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact){
        contacts[i] = contact;
        i++;
    }

    public boolean deleteContact(String contact) {
        for (int j = 0; j < contacts.length; j++) {
            if (contacts[j].getName().equals(contact)) {
                contacts[j] = null;
                deleteStatus = true;
                i--;
                break;
            }
            if (j == contacts.length - 1) {
                System.out.println("Contact does not exist.Can not delete.");
                deleteStatus = false;
            }
        }
        return deleteStatus;
    }

    public Contact findContact(String contact){
        for(int j=0; j < contacts.length; j++){
            if(contacts[j]!= null && contacts[j].getName().equals(contact)){
                foundContact = contacts[j];
                break;
            }
            if(j == contacts.length-1){
                System.out.println("Contact not found");
                foundContact = null;
            }
        }
        return foundContact;
    }

}
