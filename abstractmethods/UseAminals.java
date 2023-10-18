package abstractmethods;

public class UseAminals {
    public static void main(String[] args) {
        Animal anml;
        anml= new Goat();
        anml.eat();

        anml=new Lion();
        anml.eat();

        anml=new Bear();
        anml.eat();
    }

}
