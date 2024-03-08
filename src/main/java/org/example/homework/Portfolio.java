package org.example.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Портфолио - контейнер, не имеет стоимости но состоит из других элементов
 */
public class Portfolio implements IElement{

    public List<IElement> elements = new ArrayList<>();

    @Override
    public Long getSum() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        elements.forEach(iElement -> {
            result.set(result.get() + iElement.getSum());
        });

        return result.get();
    }

    @Override
    public void add(IElement element){
        elements.add(element);
    }
}
