package poo.exfixacao2.application;

import poo.exfixacao2.entities.Pessoa;
import poo.exfixacao2.entities.PessoaFisica;
import poo.exfixacao2.entities.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new PessoaFisica("Alex", 50000.00, 2000.00);
        Pessoa p2 = new PessoaJuridica("SoftTech", 400000.00, 25);
        Pessoa p3 = new PessoaFisica("Bob", 120000.00, 1000.00);

        System.out.println("TAXES PAID:\n");
        System.out.println(p1.getNome() + ": $ "+p1.imposto() + "\n");
        System.out.println(p2.getNome() + ": $ "+p2.imposto() + "\n");
        System.out.println(p3.getNome() + ": $ "+p3.imposto() + "\n");

        double total = p1.imposto() + p2.imposto() + p3.imposto();
        System.out.println("TOTAL TAXES: $ "+total);
    }
}
