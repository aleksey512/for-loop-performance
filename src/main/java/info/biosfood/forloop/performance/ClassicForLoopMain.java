package info.biosfood.forloop.performance;

import java.util.List;

public class ClassicForLoopMain {

    public static void main(String... args) {
        new ClassicForLoopMain().test();
    }

    public void test() {
        List<Integer> subject = CreateListBuilder.create()
                .withElementsCount(5000).build();

        TimeMeasurement tm = TimeMeasurement.create();

        for(int i = 0; i < subject.size(); i++) {
            Integer value1 = subject.get(i);
            for(int i2 = 0; i2 < subject.size(); i2++) {
                Integer value2 = subject.get(i2);
                for(int i3 = 0; i3 < subject.size(); i3++) {
                    Integer value3 = subject.get(i3);
                }
            }
        }

        tm.stopwatch();
    }

}
