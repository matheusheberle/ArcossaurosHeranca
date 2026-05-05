public class Tecodonte extends Arcossauro{
    public Tecodonte(String alimentacao, String locomocao, String tamanho, boolean predador, boolean oviparo) {
        super(alimentacao, locomocao, tamanho, predador, oviparo);
    }

    public Tecodonte() {
        super();
        setAlimentacao("Carnívoro");
        setTamanho("Médio");
    }



    @Override
    public void dados(){
        System.out.println("Características dos Tecodontes: ");
        System.out.println("Alimentação: " + getAlimentacao() + "  |  Locomoção: " + getLocomocao() + "  |  Tamanho: " + getTamanho() + "  |  Predador: " + isPredador() + "  |  Oviparo: " + isOviparo() + "\n");

    }
}
