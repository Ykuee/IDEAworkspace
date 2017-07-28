package TestAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


/**
 * Created by Ykue on 2017/7/21.
 */
@Component
public class Boss {
    @Autowired
    private Car car;
    @Autowired
    private Office office;

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                ", office=" + office +
                '}';
    }
}
