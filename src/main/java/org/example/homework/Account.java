package org.example.homework;

/**
 * Счет, входит в портфолио имеет стоимость
 */
public class Account implements IElement{

    private Long sum;

    public Account(Long sum) {
        this.sum = sum;
    }

    @Override
    public Long getSum() {
        return sum;
    }

    @Override
    public void add(IElement element) {
        throw new UnsupportedOperationException();
    }
}
