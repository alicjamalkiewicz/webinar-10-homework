package pl.test.PhoneBook;

public class MobileContact extends PhoneContact {

    public MobileContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public void print() {
        System.out.print("Kontakt " + ContactType.MOBI.getFullType());
        super.print();
    }
    @Override
    public void send() {
        super.send();
        System.out.print("Kontakt " + ContactType.MOBI.getFullType() + " do ");
        //+ WorkContact.getName() + WorkContact.getSurame());
        super.print();
    }
}
