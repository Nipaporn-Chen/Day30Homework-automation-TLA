package dataProvider;

public class DataProviders3 {
    @org.testng.annotations.DataProvider(name = "expectedTitle3")
    public Object[] testData3() {
        Object[] data3 = new Object[1];
        data3[0] = "The Internet";
        return data3;
    }
}
