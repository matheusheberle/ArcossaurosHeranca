public class Dinossauro extends Arcossauro {
    protected String dieta;

    public Dinossauro(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Dinossauro: pode ter diferentes dietas.");
    }
}