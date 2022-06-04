package dataProvider;

public class DataProviders4 {
    @org.testng.annotations.DataProvider(name = "expectedTitle4")
    public Object[][] testData4() {
        Object[][] data4 = new Object[2][2];
        data4[0][0] = "E-commerce";
        data4[0][1] = "My Store";
        return data4;
    }
}
