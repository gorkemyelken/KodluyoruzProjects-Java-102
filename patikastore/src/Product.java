import java.util.Scanner;

public abstract class Product {

    private String productId;
    private String productName;
    private Double sellingPrice;
    private Integer stockAmount;
    private Brand brandInfo;
    private Double screenSize;
    private Integer ram;


    protected Product() {
    }

    protected Product(String productId, String productName, Double sellingPrice, Integer stockAmount, Brand brandInfo,
                      Double screenSize, Integer ram) {
        this.productId = productId;
        this.productName = productName;
        this.sellingPrice = sellingPrice;
        this.stockAmount = stockAmount;
        this.brandInfo = brandInfo;
        this.screenSize = screenSize;
        this.ram = ram;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public Integer getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }
    public Brand getBrandInfo() {
        return brandInfo;
    }
    public void setBrandInfo(Brand brandInfo) {
        this.brandInfo = brandInfo;
    }
    public Double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }
    public Integer getRam() {
        return ram;
    }
    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return  "[Product brandInfo=" + brandInfo + ", productId=" + productId + ", productName=" + productName
                + ", ram=" + ram + ", screenSize=" + screenSize + ", sellingPrice=" + sellingPrice + ", stockAmount="
                + stockAmount + "]";
    }

}