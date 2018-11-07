public class CatTest {
    
    
    public static void main(String[]args){
        Cat meow = new Cat(100, 10, 4);
        Cat randomcat = new Cat(0, 50, 3);


        System.out.println("Cat happiness: " + randomcat.getHappy());

    }
}
