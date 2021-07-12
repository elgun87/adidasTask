package utilities;

public abstract class BrowserWait {
    public static void sleep(int second){
        try{
            Thread.sleep(1000 * second);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
