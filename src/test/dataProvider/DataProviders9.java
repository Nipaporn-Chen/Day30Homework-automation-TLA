package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders9 {
    @DataProvider(name = "userInfo")
    public Object[][] data() {
        Object[][] data = new Object[1][5];
        data[1][0] = "Lilly";
        data[1][1] = "Rae";
        data[1][2] = "1234567890";
        data[1][3] = "Lilly_Rae@gmail.com";
        data[1][4] = "Instructor";

        return data;
    }
}
