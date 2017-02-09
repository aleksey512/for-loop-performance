package info.biosfood.forloop.performance;

import java.util.ArrayList;
import java.util.List;

public class CreateListBuilder {

    public static CreateListBuilder create() {
        return new CreateListBuilder();
    }

    private int elementsCount;

    public CreateListBuilder withElementsCount(int elementsCount) {
        this.elementsCount = elementsCount;

        return this;
    }

    public List<Integer> build() {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < elementsCount; i++) {
            list.add(i);
        }

        return list;
    }

}
