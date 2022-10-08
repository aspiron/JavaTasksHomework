package HW120822;

public class Main{

    public static void main(String[] args) {
        Phone phone1 = new Phone("+79788669748", "Samsung Galaxy A53", 189);
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        phone1.receiveCall("Jonh Smith");
        phone1.getNumberOfIncomingCall("88001234567");
        System.out.println("====================================================================");

        Phone phone2 = new Phone("+79780000001", "Samsung Galaxy A21", 192);
        phone2.receiveCall("Moshennik is Sberbanka");
        phone2.getNumberOfIncomingCall("+7905123123");
        System.out.println("====================================================================");

        Phone phone3 = new Phone("+79780000002", "iPhone X", 174);
        phone3.receiveCall("SpamInvest");
        phone3.getNumberOfIncomingCall("900");
        System.out.println("====================================================================");

        phone3.receiveCall("Somebody", "911");
    }
}
