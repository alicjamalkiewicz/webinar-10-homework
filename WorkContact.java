package pl.test.PhoneBook;


import java.util.ArrayList;

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
    public Object print() {
        System.out.print("Kontakt " + ContactType.WORK.getFullType());
        super.print();
        return null;
    }

    @Override
    public void send(){
        super.send();
        System.out.print("Kontakt " + ContactType.WORK.getFullType() + " do " + getName() + " " + getSurname());
                //+ WorkContact.getName() + WorkContact.getSurame());
        super.print();
    }

//    @Override
//    public void addToPhonebook(){



}
