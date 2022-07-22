import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone extends Product {
    public static List<Phone> phones = new ArrayList<>();
    private Integer memorySize;
    private Integer batteryPower;


    public Phone() {
        if(phones.isEmpty()){
            makePhoneList();
        }
    }

    public Phone(String productId, String productName, Double sellingPrice, Integer stockAmount, Brand brandInfo,
                 Double screenSize, Integer ram, Integer memorySize, Integer batteryPower) {
        super(productId, productName, sellingPrice, stockAmount, brandInfo, screenSize, ram);
        this.memorySize = memorySize;
        this.batteryPower = batteryPower;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    private static List<Phone> makePhoneList(){

        Phone p9Lite = new Phone("1", "P9 LITE", 1500.0, 10, Brand.HUAWEI, 5.2, 3, 16, 3000);
        Phone iphone13 = new Phone("2", "IPHONE 13", 15000.0, 5, Brand.APPLE, 6.1, 8, 128, 5000);

        phones.add(p9Lite);
        phones.add(iphone13);

        return phones;
    }

    public static void showPhoneList(Scanner sc){
        if(phones.isEmpty()){
            makePhoneList();
        }
        for (Phone phone : phones) {
            System.out.println(
                            "Id: " + phone.getProductId() + "\n" +
                            "Product name: " + phone.getProductName() + "\n" +
                            "Price: " + phone.getSellingPrice() + "\n" +
                            "Brand: " + phone.getBrandInfo() + "\n" +
                            "Memory size: " +  phone.getMemorySize() + "\n" +
                            "Screen size: " + phone.getScreenSize() + "\n" +
                            "Battery power: " +  phone.getBatteryPower() +"\n" +
                            "RAM: " +  phone.getRam() +"\n" +
                            "-----------------------");

        }

        }
}

    