package dataProvider;

public class DataProviders1 {
    @org.testng.annotations.DataProvider(name = "expectedTitle1")
    public Object[] testData1() {
        Object[] data = new Object[1];
        data[0] = "Demo Script Test drive - PHPTRAVELS";

        return data;

    }
}
