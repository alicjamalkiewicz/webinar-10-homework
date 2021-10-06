package pl.test.PhoneBook;

public class PrivateContact extends PhoneContact {

    public PrivateContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public Object print() {
        System.out.print("Kontakt " + ContactType.PRIV.getFullType());
        super.print();
        return null;
    }

    @Override
    public void send() {
        super.send();
        System.out.print("Kontakt " + ContactType.PRIV.getFullType() + " do " + getName() + " " + getSurname());
        //+ WorkContact.getName() + WorkContact.getSurame());
        super.print();
    }
}
