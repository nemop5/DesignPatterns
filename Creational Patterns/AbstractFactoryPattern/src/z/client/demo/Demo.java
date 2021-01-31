package z.client.demo;

import app.Application;
import factories.GUIFactory;
import factories.LinuxFactory;
import factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app = null;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new LinuxFactory();
            app = new Application(factory);
        } else if(osName.contains("windows")) {
            factory = new WindowsFactory();
            app = new Application(factory);
        } else {
        	System.out.println("Error - Unidentified OS");
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
