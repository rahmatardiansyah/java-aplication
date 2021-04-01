package tutorial;

public class ManagerApp {
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.name = "Rahmat";
        manager.sayHello("Budi");
        
        
        // mengakses child class
        VicePresident vp = new VicePresident();
        vp.name = "eko";
        vp.sayHello("joko");
        
    }
}
