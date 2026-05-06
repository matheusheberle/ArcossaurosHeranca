public class Main {
    public static void main(String[] args) {

        Arcossauro a1 = new Tecodonte();
        Arcossauro a2 = new Pterossauro();
        Arcossauro a3 = new Crocodilo();
        Arcossauro a4 = new Saurisquio("carnívoro (ex: Tiranossauro Rex)");
        Arcossauro a5 = new Ornitisquio("herbívoro");

        a1.exibirInfo();
        a2.exibirInfo();
        a3.exibirInfo();
        a4.exibirInfo();
        a5.exibirInfo();
    }
}