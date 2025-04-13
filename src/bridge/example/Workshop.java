package bridge.example;

public abstract class Workshop {

    abstract public void work();

}

class Produce extends Workshop{
    @Override
    public void work() {
        System.out.println("Produced");
    }
}

class Assemble extends Workshop{
    @Override
    public void work() {
        System.out.println("And assembled");
    }
}
