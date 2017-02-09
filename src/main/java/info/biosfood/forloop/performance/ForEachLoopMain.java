package info.biosfood.forloop.performance;

import java.util.List;

public class ForEachLoopMain {

    public static void main(String... args) {
        new ForEachLoopMain().test();
    }

    public void test() {
        List<Integer> subject = CreateListBuilder.create()
                .withElementsCount(5000).build();

        TimeMeasurement tm = TimeMeasurement.create();

        for(Integer i : subject) {
            for(Integer i2 : subject) {
                for(Integer i3 : subject) {

                }
            }
        }

        tm.stopwatch();
    }

}
