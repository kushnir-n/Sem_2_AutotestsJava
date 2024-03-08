package org.example.homework;

/**
 * Общий интерфейс - задача посчитать стоиомость всех элементов
 */
public interface IElement {

    public Long getSum();

    public void add(IElement element);
}
