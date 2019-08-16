
package DAL;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class sessionManager {
 
    public sessionManager() {
    }
    
 
    public static Session getSession() throws HibernateException {

        
        Configuration config = new Configuration();

        
        registerMappers(config);

        
        config.setProperties(getHibernateProperties());

       
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
        SessionFactory factory = config.buildSessionFactory(builder.build());

       
        return factory.openSession();



    }

    private static Properties getHibernateProperties() {
        
        Properties props = new Properties();

        
        props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        
        props.put("hibernate.connection.url", "jdbc:mysql://localhost/hibernate");

        
        props.put("hibernate.connection.username", "root");

        
        props.put("hibernate.connection.password", "");

        
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        
        
        props.put("hibernate.show_sql", "true");
        
        props.put("hibernate.connection.autocommit", "true");
        
        
        return props;

    }

    private static void registerMappers(Configuration config) throws MappingException {
        config.addAnnotatedClass(DAL.Producto.class);
    }
    
    
    
}
