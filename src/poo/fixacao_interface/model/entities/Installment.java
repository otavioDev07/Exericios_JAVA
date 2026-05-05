package poo.fixacao_interface.model.entities;

import java.time.LocalDate;

public record Installment(LocalDate dueDate, Double amount){}
