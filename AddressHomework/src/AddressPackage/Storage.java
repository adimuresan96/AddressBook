package AddressPackage;

public class Storage {
    public boolean store(AddressBook addressBook){
        if(addressBook.contacts.length > 0){
            return true;
        }else return false;
    }

    public AddressBook load(AddressBook addressBook){
        return addressBook;

    }

}
