package adapter.class_adapter_pattern;

public interface IntegerValueInterface {
    public int getInteger();
}

class IntegerValue implements IntegerValueInterface{
    @Override
    public int getInteger() {
        return 15;
    }
}

class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter{
    private IntegerValueInterface myInt;

    public ObjectAdapter (IntegerValueInterface myInt){
        this.myInt = myInt;
    }

    public int getInteger(){
        return 2 + this.myInt.getInteger();
    }
}
