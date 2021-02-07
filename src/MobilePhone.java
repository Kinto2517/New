import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.contacts = new ArrayList<Contacts>();
        this.myNumber = myNumber;
    }

    public boolean updateContact(Contacts oldCont, Contacts newCont) {

        int foundPosition = findContact(oldCont);
        if (foundPosition < 0) {
            System.out.println(oldCont.getName() + ", wasn't found");
            return false;
        }
        else if(findContact(newCont)!= -1){
            System.out.println("Update isn't successful");
            return false;
        }
        this.contacts.set(foundPosition, newCont);
        System.out.println(oldCont.getName() + " is replaced with: " + newCont.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        if (findContact(contact.getName()) < 0){
            System.out.println("Contact couldn't be found!");
            return false;
    }
        System.out.println(contact.getName()+" was deleted");
        this.contacts.remove(contact);
        return true;
    }


    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    private int findContact(Contacts contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contacts contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact)>=0)
            return contact.getName();
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position>=0)
            return this.contacts.get(position);
        return null;
    }

    public void printContact(){
        System.out.println("Printing Contacts...");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1)+ "."+
                    this.contacts.get(i).getName()+" --> "+ this.contacts.get(i).getPhoneNumber());
        }

    
    
    }
    

}
