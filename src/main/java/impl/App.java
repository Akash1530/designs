package impl;

import impl.abstractFactory.case1.impl.MacButtonFactory;
import impl.abstractFactory.case1.impl.WindowButtonFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
         String sys = System.getProperty("os.name").toLowerCase();

         if(sys.contains("win")){
             System.out.println("Windows OS Detected");
             new WindowButtonFactory().createButton().click();
         } else if(sys.contains("mac")) {
             System.out.println("Mac OS Detected");
             new MacButtonFactory().createButton().click();
         }
    }
}
