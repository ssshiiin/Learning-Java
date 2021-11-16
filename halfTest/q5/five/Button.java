package q5.five;

public class Button extends Component implements Clickable{
    private int cnt;
    public Button(String label){
        super(label);
    }

    @Override
    public void print(){
        System.out.println("Button: My button (" + cnt + " clicks)");
    }

    @Override
    public void click(){
        this.cnt++;
    }
}