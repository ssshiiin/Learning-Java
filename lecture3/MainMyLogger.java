public class MainMyLogger {
    public static void main(String[] args) {
        MyLogger myLogger1 = new MyLogger("./OutPut/Logger1.txt");
        MyLogger myLogger2 = new MyLogger("./OutPut/Logger2.txt");
        MyLogger myLogger3 = new MyLogger("./OutPut/Logger3.txt");
        
        myLogger1.open();
        myLogger1.write("iniad hello world! 1");
        myLogger1.write("iniad hello world! 2");
        myLogger1.write("iniad hello world! 3");
        myLogger1.write("iniad hello world! 4");
        myLogger1.close();
        System.out.println(myLogger1.count());
        
        MyLogger myLogger4 = new MyLogger("./OutPut/Logger4.txt");
        myLogger4.open();
    }
}