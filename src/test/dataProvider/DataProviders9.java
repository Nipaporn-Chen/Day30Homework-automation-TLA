package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders9 {
    @DataProvider(name = "userInfo")
    public Object[][] data() {
        Object[][] data = new Object[1][5];
        data[0][0] = "Lilly";
        data[0][1] = "Rae";
        data[0][2] = "1234567890";
        data[0][3] = "Lilly_Rae@gmail.com";
        data[0][4] = "Instructor";

        return data;
    }
}
