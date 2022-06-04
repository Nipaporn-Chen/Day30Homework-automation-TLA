package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders8 {
    @org.testng.annotations.DataProvider(name = "userInfo1")
    public Object[][] data() {
        Object[][] data = new Object[1][5];
        data[0][0] = "John";
        data[0][1] = "Doe";
        data[0][2] = "4451234567";
        data[0][3] = "John_Doe@gmail.com";
        data[0][4] = "Student";

        return data;
    }
}
