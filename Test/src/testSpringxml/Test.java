package testSpringxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ykue on 2017/7/24.
 */
@Component
public class Test {

    @Autowired
    private Prop prop;

    @Override
    public String toString() {
        return "Test{" +
                "prop=" + prop +
                '}';
    }

    public void setProp(Prop Prop) {
        prop = Prop;
    }

    public Prop getProp() {
        return prop;
    }
}
