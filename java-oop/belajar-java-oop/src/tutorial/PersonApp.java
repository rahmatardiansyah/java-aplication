package tutorial;


public class PersonApp {
    public static void main(String[] args) {
        
        //cara 1 membuat object
        Person person1 = new Person("Rahmat Ardiansyah", "jln Karet");
        
//bisa dihapus
//        person1.name = "Rahmat Ardiansyah";
//        person1.address = "jln karet";
        //person1.country = "America"; ERROR
        
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
        person1.sayHello("Eko");
        
        
        //cara 2 membuat object
        Person person2;
        person2 = new Person("Eko", "Subang");
        //value default object adalah null
        person2.sayHello("Budi");
        
        //object dengan konstraktor overloading
        Person person3 = new Person("Abi");
        person3.sayHello("Rahmat");
        
        //object tanpa parameter
        Person person4 = new Person();
        person4.name = "habib";
        
        
        
    }
}
