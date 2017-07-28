package extendTest;

/**
 * Created by Ykue on 2017/7/14.
 */
public class InterImpl implements Inter {
    public Dao dao = new Daoimpl();
    @Override
    public void eat() {
        System.out.println("we can eat");
    }

    @Override
    public void save() {
        dao.saveDao();
    }
}
