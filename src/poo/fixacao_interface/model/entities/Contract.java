package poo.fixacao_interface.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(){}

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
