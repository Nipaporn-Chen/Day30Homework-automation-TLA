package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders10 {
    @DataProvider(name = "userInfo")
    public Object[][] data() {
        Object[][] data = new Object[1][5];
        data[0][0] = "Rose";
        data[0][1] = "Miller";
        data[0][2] = "7894561230";
        data[0][3] = "Rose_Miller@gmail.com";
        data[0][4] = "Mentor";
        return data;
    }
}
