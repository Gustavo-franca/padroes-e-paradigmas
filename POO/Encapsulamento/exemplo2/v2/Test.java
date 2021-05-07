package Encapsulamento.exemplo2.v2;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        People p1  = new People("Mother",45, null);
        People people = new People("Pedro",18,p1);
        people.addPhone("99999999");
        people.addPhone("99999999");
        people.addPhone("99999999");


        String name = people.name();
        name += "jasdasdsad";

        System.out.println(name);
        System.out.println(people.name());

        int age = people.age();

        age++;
        System.out.println(age);
        System.out.println(people.age());




        List<String> phones = people.getPhones();
        phones.add("asdkjaslkdasdkjas");
        phones.set(1, "lsflksjdfskdfj");
        System.out.println(phones);

        System.out.println(people.getPhones());

        String mother = people.getMother();

        mother = "strange";

        System.out.println(mother);
        System.out.println(people.getMother());

    }
}
