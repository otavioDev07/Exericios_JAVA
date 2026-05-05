package poo.fixacao_interface.application;

import poo.fixacao_interface.model.entities.Contract;
import poo.fixacao_interface.model.entities.Installment;
import poo.fixacao_interface.model.services.ContractService;
import poo.fixacao_interface.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Contract obj = new Contract(808, LocalDate.parse("04/05/2026", fmt), 600);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, 3);
        System.out.println("Parcelas:\n");
        for (Installment ins : obj.getInstallments()){
            System.out.printf("Due date: %s | Amount: %.2f\n", ins.dueDate().format(fmt), ins.amount());
        }
    }
}
