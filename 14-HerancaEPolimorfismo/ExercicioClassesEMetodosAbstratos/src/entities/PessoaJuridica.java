package entities;

public class PessoaJuridica extends Pessoas {

    private Double imposto;
    private int funcionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double rendaAnual, int funcionarios) {
        super(name, rendaAnual);
        this.funcionarios = funcionarios;
    }


    @Override
    public double calculaImposto() {
        if (this.funcionarios > 10) {
            return this.getRendaAnual() * 0.14;
        } else {
            return this.getRendaAnual() * 0.16;
        }

    }


}
