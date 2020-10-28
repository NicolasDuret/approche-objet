package essais;

import entites.Address;

public class TestAdressePostale {
    public static void main(String[] args) {
        Address address1 = new Address(20, "rue de la rincais", 44119, "treilliere");
        Address address2 = new Address(30, "rue de la rincais", 44119, "treilliere");
        System.out.println(address1);
        System.out.println(address2);
    }
}
