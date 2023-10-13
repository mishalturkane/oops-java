package pollymorphism.runtime;

public class French extends Language{
    @Override
    public void greetings() {
        System.out.println("Bon jour!");
    }
}
