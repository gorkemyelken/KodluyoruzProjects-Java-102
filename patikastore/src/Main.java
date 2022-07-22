import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Markalari Listele");
        System.out.println("[2] Telefonlari Listele");
        System.out.println("[3] Notebooklari Listele");
        System.out.println("Cikmak icin herhangi bir tusa basin.");
        System.out.print("Secim: ");
        int secim = sc.nextInt();

        switch(secim){
            case 1:
                Brand.showList();
                Main.main(null);
                break;

            case 2:
                Phone.showPhoneList(sc);
                break;

            case 3:
                Notebook.showNotebookList(sc);
                break;
            default:
                sc.close();
                break;
        }
        sc.close();
    }

}