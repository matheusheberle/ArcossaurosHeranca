public class Ornitisquio extends Dinossauro {

    public Ornitisquio(String dieta) {
        super(dieta);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Ornitísquios: tipo de dinossauro, geralmente " + dieta + ".");
    }
}