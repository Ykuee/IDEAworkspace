package TestAutowired;

/**
 * Created by Ykue on 2017/7/21.
 */
public class Office {
    private String mi;
    private String year;

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Office{" +
                "mi='" + mi + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
