package poo.fixacao_interface.model.services;


import poo.fixacao_interface.model.entities.Contract;
import poo.fixacao_interface.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double base = contract.getTotalValue() / months;
        for (int i=1;i<=months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(base, i);
            double fee = onlinePaymentService.paymentFee(base+interest);
            double valor = base + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, valor));
        }
    }
}
