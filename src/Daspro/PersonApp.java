public class PersonApp {
    public static void main(String[] args)
    {

        var person1 = new Person();
        person1.name = "Riki";
        person1.address = "Tasikmalaya";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Beta");
    }
}
