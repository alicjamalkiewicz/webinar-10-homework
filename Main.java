package pl.test.PhoneBook;

    /*
- stworzyć klasy PrivateContact oraz WorkContact - dziedziczące
po PhoneContact
- wyświetlenie kontaktu
- wyślij jako wizytówka zaimplementować metodę send()
Wykorzystując polimorfizm stworzyć tablicę przechowującą kilka kontaktów różnego typu
i na każdym kontakcie wywołać metodę print()
 */

public class Main {

    public static void main(String[] args) {
        MobileContact mobileContact = new MobileContact(1,
                "Wojtek", "Nowak", "123456789");
        mobileContact.print();


        System.out.println("-------TWORZENIE I WYŚWIETLANIE KONTAKTU-------");

        PrivateContact privateContact = new PrivateContact(2, "Alicja", "Małkiewicz", "123456789");
        privateContact.print();

        WorkContact workContact = new WorkContact(3, "Gustaw", "Gustavsson", "9878654321");
        workContact.print();

        MobileContact mobileContact2 = new MobileContact(4, "Gunnar", "Gunnarsson", "192837465");
        mobileContact2.print();

        System.out.println("-------METODA SEND-------");

        workContact.send();
        privateContact.send();
        mobileContact.send();
        mobileContact2.send();

        System.out.println("-------POLIMORFIZM-------");

        PhoneContact[] contacts = {mobileContact, workContact, privateContact, mobileContact2};

        for(PhoneContact c : contacts){
            c.print();
        }


    }
}
