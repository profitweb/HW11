public class Main {
    public static void main(String[] args) {

       Phone moscovit = new Phone();
       moscovit.receiveCall("Dasha");
       Phone zvonoka = new Phone("111", "Nokia", 150 );
       zvonoka.receiveCall("Natalia", "916111111");

       Phone.countryPhone = "Russia";

       System.out.println(moscovit.countryPhone);
       System.out.println(zvonoka.countryPhone);
    }
}
