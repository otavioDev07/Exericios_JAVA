package poo.fixacao_interface.model.services;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
