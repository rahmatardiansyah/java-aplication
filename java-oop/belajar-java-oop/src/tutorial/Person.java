package tutorial;

// cara membuat class
class Person {
    
    //contoh field
    String name;
    String address;
    final String country = "Indonesia";
    
    // Membuat Konstactor
    Person(String name, String address){
        //name = paramName;
        //address = paramAddress;
        
        // bisa menggunakan keyword this = merepresentasikan object saat ini
        // this.name mengambil data dari parameter
        // name mengambil data dari Luar constructor// untuk mengatasi variable shadowing
         this.name = name;
         this.address = address; 
    }
    
    // Membuat Konstraktor Overloading
    Person(String paramName){
        //tidak baik jika sudah komplesk
        //name = paramName;
        
        // Memanggil constructor lain/memanggil constructor Kedua berarti memanggil Konstructor yang pertama
        // karena Person Awal menggunakan 2 parameter jadi set null
        this(paramName, null);
    }
    
    // Membuat Konstarktor tanpa parameter
    Person(){
        // ketika manggil konstructor yang ketiga sebenarnya memanggil konstructor yang kedua
        this(null);
    }
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
    
    
}
