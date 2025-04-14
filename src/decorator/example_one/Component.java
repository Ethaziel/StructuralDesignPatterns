package decorator.example_one;

public abstract class Component {

    public abstract void doJob();

}

class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("I am a concrete component, closed for modification.");
    }
}
