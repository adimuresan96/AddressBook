package AddressPackage;

public class Main {
    public static void main(String[] args) {
        Contact cont1 = new Contact();
        cont1.setName("Adi Muresan");
        Contact cont2 = new Contact();
        cont2.setName("Ion Marius");
        AddressBook book = new AddressBook();

        book.addContact(cont1);
        book.addContact(cont2);

        printContacts(book);

        book.deleteContact("Ion Marius");
        System.out.println("After deletion");
        printContacts(book);
        book.findContact("Ionel");

        Storage storage = new Storage();
        System.out.println(storage.store(book));
        //System.out.println("Search result: " + book.findContact("Ionci").getName());
    }

    public static void printContacts(AddressBook book) {
        for(Contact c : book.getContacts()){
            if(c!=null)
            System.out.println(c.getName());
        }
    }
}
