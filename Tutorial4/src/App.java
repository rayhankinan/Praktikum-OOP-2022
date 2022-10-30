public class App {
    public static void main(String[] args) throws Exception {
        ListMap M = new ListMap();

        M.set("Rayhan Kinan Muhannad", "16520177");
        M.set("Najla Mutiari Zalfa", "16620292");

        M.set("Rayhan Kinan Muhannad", "13520065");
        M.set("Najla Mutiari Zalfa", "15320060");
        M.set("Fikri Khoiron Fadhila", "13520056");

        System.out.println(M.size());
        System.out.println(M.get("Rayhan Kinan Muhannad"));
        System.out.println(M.get("Najla Mutiari Zalfa"));
        System.out.println(M.get("Fikri Khoiron Fadhila"));
    }
}
