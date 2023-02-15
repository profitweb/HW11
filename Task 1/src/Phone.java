public class Phone {
    static String countryPhone = "";
    String numberPhone = "";
    String modelPhone = "";
    double weightPhone = 0.0;

    public Phone() {
    }

    public Phone(String numberPhone, String modelPhone, double weightPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
        this.weightPhone = weightPhone;
    }

    public void receiveCall(String name){
        System.out.println("Звонит абонент по имени " + name + " .");
        receiveCall(name, "");
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит абонент по имени " + name + (number == "" ? "" : ", номер " + number));
    }





//    static String nameCaller = "";
//
//    static int numberCaller;
//
//    public Phone() {
//    }
//
//    public Phone(int numberPhone, String modelPhone, double weightPhone, String countryPhone) {
//      this.numberPhone = numberPhone;
//      this.modelPhone = modelPhone;
//      this.weightPhone = weightPhone;
//      this.countryPhone = countryPhone;
//    }
//
//        public void receiveCall(String nameCaller){
//        System.out.println("Звонит абонент по имени " + nameCaller);
//    }
//
//        public void receiveCall(String nameCaller, int numberCaller){
//            System.out.println("Звонит абонент по имени " + nameCaller + " - номер " + numberCaller);
//    }

}
