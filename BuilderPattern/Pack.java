package BuilderPattern;

public interface Pack {
    public String pack();
}

class Wrapper implements Pack{
    public String pack(){
        return "袋装";
    }
}

class Bolt implements Pack{
    @Override
    public String pack() {
        return "杯装";
    }
}