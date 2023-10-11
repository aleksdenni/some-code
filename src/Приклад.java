
public class Приклад {
    public static void main(String[] args){
        int i = 4;
        String someName = "World";
        sayHello(someName);
        sayGoodBye();
        System.out.println( i-3 );
    }
    static void sayGoodBye(){
        System.out.println("Good bye");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}


