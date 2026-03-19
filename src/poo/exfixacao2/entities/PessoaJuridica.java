package poo.exfixacao2.entities;

public class PessoaJuridica extends Pessoa {
    private Integer nmrFunc;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer nmrFunc){
        super(nome, rendaAnual);
        this.nmrFunc = nmrFunc;
    }

    @Override
    public Double imposto(){
        double desconto = nmrFunc > 10 ? 0.14 : 0.16;
        return Math.max(0.0, super.getRendaAnual()*desconto);
    }
}
