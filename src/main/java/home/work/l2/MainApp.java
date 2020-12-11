package home.work.l2;

import com.sun.javaws.Launcher;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import java.net.URL;
import java.security.ProtectionDomain;


public class MainApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ProtectionDomain domain = Launcher.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/app");
        webAppContext.setWar(location.toExternalForm());

        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
