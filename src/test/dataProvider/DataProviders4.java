package dataProvider;

public class DataProviders4 {
    @org.testng.annotations.DataProvider(name = "expectedTitle4")
    public Object[] testData4() {
        Object[] data4 = new Object[1];
        data4[0] = "My Store";
        return data4;
    }
}
