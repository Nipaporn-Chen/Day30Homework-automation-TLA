package dataProvider;

public class DataProviders6 {
    @org.testng.annotations.DataProvider(name = "expectedTitle6")
    public Object[][] testData6() {
        Object[][] data6 = new Object[2][2];
        data6[0][0] = "Saucedemo";
        data6[0][1] = "Swag Labs";
        return data6;
    }
}
