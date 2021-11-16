package q5.five;

abstract public class Component {
    protected String label;
    public Component(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
    
    abstract public void print();
}
