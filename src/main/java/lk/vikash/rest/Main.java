package lk.vikash.rest;

import lk.vikash.rest.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.glassfish.jersey.servlet.ServletContainer;

import java.io.File;

public class Main {
    private static final int SERVER_PORT = 8080;
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(SERVER_PORT);
        tomcat.getConnector();
      tomcat.addWebapp("/rest_api",new File("src/main/webapp").getAbsolutePath());
        try {
//            Tomcat.addServlet(context,"RestApp",new ServletContainer(new AppConfig()));
//            context.addServletMappingDecoded("/api/*", "RestApp");
            tomcat.start();
            System.out.println("URL: http://localhost:"+SERVER_PORT+"/rest_api/");
            tomcat.getServer().await();
        }catch (LifecycleException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
