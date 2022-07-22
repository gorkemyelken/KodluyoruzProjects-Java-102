import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {

    private static List<Notebook> notebooks = new ArrayList<>();
    private Integer storageSize;

    public Notebook(){
        if(notebooks.isEmpty()){
            makeNotebookList();
        }
    }

    protected Notebook(String productId, String productName, Double sellingPrice, Integer stockAmount, Brand brandInfo,
                       Double screenSize, Integer ram, Integer storageSize) {
        super(productId, productName, sellingPrice, stockAmount, brandInfo, screenSize, ram);
        setStorageSize(storageSize);

    }

    public Integer getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    private static List<Notebook> makeNotebookList(){

        Notebook r550VX = new Notebook("1", "R550VX", 4999.99, 5, Brand.ASUS, 15.6, 8, 256);
        Notebook ideaPad_81VU006STX= new Notebook("2", "81VU006STX", 3999.99, 2, Brand.LENOVO, 15.6, 8, 512);

        notebooks.add(r550VX);
        notebooks.add(ideaPad_81VU006STX);

        return notebooks;
    }

    public static void showNotebookList(Scanner sc){
        if(notebooks.isEmpty()){
            makeNotebookList();
        }

        for (Notebook notebook : notebooks) {
            System.out.println(
                    "Id: " + notebook.getProductId() + "\n" +
                            "Product name: " + notebook.getProductName() + "\n" +
                            "Price: " + notebook.getSellingPrice() + "\n" +
                            "Brand: " + notebook.getBrandInfo() + "\n" +
                            "Storage size: " + notebook.getStorageSize() + "\n" +
                            "Screen size: " + notebook.getScreenSize() + "\n" +
                            "RAM: " + notebook.getRam() +"\n" +
                                    "-----------------------");
        }
    }
}