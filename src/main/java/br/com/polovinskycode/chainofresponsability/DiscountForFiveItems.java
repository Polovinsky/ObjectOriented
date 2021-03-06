package br.com.polovinskycode.chainofresponsability;

import br.com.polovinskycode.chainofresponsability.model.Budget;

public class DiscountForFiveItems implements Discount {

    private Discount next;

    public double calculate(Budget budget) {
        if (budget.getItems().size() > 5) {
            return budget.getValue() * 0.1;
        } else {
            return next.calculate(budget);
        }
    }

    public void next(Discount next) {
        this.next = next;
    }
}
