package testSpringxml;

import javafx.beans.property.ReadOnlyProperty;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Ykue on 2017/7/24.
 */
@SuppressWarnings("deprecation")
public class Main {

    public static void main(String args[]) throws ClassNotFoundException {

        String[] locations = {"/testSpringxml/Springbeans.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
        Test test = (Test) ctx.getBean(Test.class);
        System.out.println(test);
    }
}
