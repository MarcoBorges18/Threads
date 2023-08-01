public class App {
    public static void main(String[] args) throws Exception {
        ImprimeString imprimeString = new ImprimeString();
        Thread thread = new Thread(imprimeString, "Eita");
        thread.start();
    }
}