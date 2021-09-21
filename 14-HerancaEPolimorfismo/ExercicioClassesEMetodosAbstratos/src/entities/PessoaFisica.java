package entities;

public class PessoaFisica extends Pessoas {

    private Double gastosComSaude;


    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double calculaImposto() {
        if (this.getRendaAnual() < 20000) {
            return this.getRendaAnual() * 0.15 - (gastosComSaude * 0.5);
        } else {
            return this.getRendaAnual() * 0.25 - (gastosComSaude * 0.5);
        }
    }
}
