package Seminar6;

public class Phone {
    String number;
    String model;
    Integer weight;

    public Phone(String number, String model, int weight){
//        this.number = number;
//        this.model = model;
        this(number,model);
        this.weight = weight;

    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name){
        System.out.println("Call " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Call " + name + " number " + number);
    }

    public void sendMessage(String... numbers){
        System.out.println("Phone " + number + " send message:");
        for (String number: numbers) {
            System.out.println("Number for send: " + number);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("12345","Iphone", 123);
        Phone phone2 = new Phone("14333","Iphone", 123);
        Phone phone3 = new Phone("16666","Iphone", 123);
        Phone phone4 = new Phone("14322","Iphone");
        Phone phone5 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
        System.out.println(phone5);
        phone1.receiveCall("Alex");
        phone2.receiveCall("Vlad", "12345");
        System.out.println("Phone3's number " +phone3.getNumber());
        phone4.sendMessage("123");
        String [] numbers = {"1212","1313","1414"};
        phone5.sendMessage(numbers);
    }
}
