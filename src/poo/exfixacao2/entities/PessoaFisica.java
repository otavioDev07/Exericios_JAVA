package poo.exfixacao2.entities;

public class PessoaFisica extends Pessoa {
    private Double saude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double saude){
        super(nome, rendaAnual);
        this.saude = saude;
    }

    @Override
    public Double imposto() {
        double base = super.getRendaAnual()<20000 ? 0.15 : 0.25;
        double desconto = saude * 0.5;
        return Math.max(0.0, super.getRendaAnual()*base-desconto);
    }

}
