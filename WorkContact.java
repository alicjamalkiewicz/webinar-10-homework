package pl.test.PhoneBook;


public class WorkContact extends PhoneContact {

    public WorkContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void print() {
        System.out.print("Kontakt " + ContactType.WORK.getFullType());
        super.print();
    }

    @Override
    public void send(){
        super.send();
        System.out.print("Kontakt " + ContactType.WORK.getFullType() + " do ");
                //+ WorkContact.getName() + WorkContact.getSurame());
        super.print();


    }
}
