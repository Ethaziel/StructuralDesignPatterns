package decorator.example_one;

public abstract class AbstractDecorator extends Component{
    protected Component component;

    public void setComponent(Component c){
        component = c;
    }

    @Override
    public void doJob() {
        if (component != null){
            component.doJob();
        }
    }
}

class ConcreteDecorator1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add functionality
        System.out.println("I am from decorator1.");
    }
}

class ConcreteDecorator2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("I am from decorator2.");
        super.doJob();
        System.out.println("And still decorator2.");
    }
}