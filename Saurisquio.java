public class Saurisquio extends Dinossauro {

    public Saurisquio(String dieta) {
        super(dieta);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Saurísquios: tipo de dinossauro, geralmente " + dieta + ".");
    }
}