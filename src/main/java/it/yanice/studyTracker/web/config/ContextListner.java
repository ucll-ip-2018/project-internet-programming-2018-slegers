package it.yanice.studyTracker.web.config;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

@Configuration
public class ContextListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("App shutdown ...");

        System.out.println("Deregistering SQL-Drivers ...");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            try {
                DriverManager.deregisterDriver(driver);
                System.out.println(driver.getClass().getName());
            } catch (SQLException e) {
                System.err.println("Error deregistering driver " + driver.getClass().getName());
            }
        }
    }
}
