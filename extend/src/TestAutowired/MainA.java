package TestAutowired;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ykue on 2017/7/21.
 */
public class MainA {
    public static void main(String args[]){
        String[] locations = {"TestAutowired/TestSpring.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
        Boss boss = (Boss) ctx.getBean(Boss.class);
        System.out.println(boss);
        System.out.println("slkdjlsjdls");
        Map map = new HashMap();
        map.put("Shit","Shit");
    }
}
