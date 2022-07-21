public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Bos" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Bos" : "Dolu"));

        System.out.println("Indeks : " + liste.indexOf(20));

        System.out.println("Indeks :" + liste.indexOf(100));

        System.out.println("Indeks : " + liste.lastIndexOf(20));

        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemani :" + dizi[0]);

        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        System.out.println("Listemde 20 degeri : " + liste.contains(20));
        System.out.println("Listemde 120 degeri : " + liste.contains(120));

        liste.clear();
        System.out.println(liste.toString());
    }
}