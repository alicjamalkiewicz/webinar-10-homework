package pl.test.PhoneBook;

public class MobileContact extends PhoneContact {

    public MobileContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public Object print() {
        System.out.print("Kontakt " + ContactType.MOBI.getFullType());
        super.print();
        return null;
    }
    @Override
    public void send() {
        super.send();
        System.out.print("Kontakt " + ContactType.MOBI.getFullType() + " do " + getName() + " " + getSurname());
        //+ WorkContact.getName() + WorkContact.getSurame());
        super.print();
    }
}
