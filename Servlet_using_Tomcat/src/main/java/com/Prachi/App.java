package com.Prachi;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello World!");
        Tomcat tommy = new Tomcat();
        tommy.setPort(9090);

        // Add context: "" means root context (http://localhost:9090/

        Context context=tommy.addContext("", null);

        Tomcat.addServlet(context,"HelloServlet", new HelloServlet());

        // Add a servlet and map it to a specific URL pattern
        context.addServletMappingDecoded("/hello", "HelloServlet");




        tommy.start();
        System.out.println("Tomcat started on port: " + tommy.getConnector().getPort());

        // Keep the server running
        tommy.getServer().await();
    }
}
