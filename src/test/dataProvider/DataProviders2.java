package dataProvider;

public class DataProviders2 {
    @org.testng.annotations.DataProvider(name = "expectedTitle2")
    public Object[] testData2() {
        Object[] data1 = new Object[1];
        data1[0] = "demoaut.com - demoaut Resources and Information.";
        return data1;
    }
}
