package dataProvider;

public class DataProviders5 {
    @org.testng.annotations.DataProvider(name = "expectedTitle5")
    public Object[][] testData5() {
        Object[][] data5 = new Object[2][2];
        data5[0][0] = "Passion Tea Company";
        data5[0][1] = "";
        return data5;
    }
}
