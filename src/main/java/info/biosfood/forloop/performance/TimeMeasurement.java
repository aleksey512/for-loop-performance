package info.biosfood.forloop.performance;

import java.util.Date;

public class TimeMeasurement {

    public static TimeMeasurement create() {
        return new TimeMeasurement();
    }

    private long createdAt = System.currentTimeMillis();
    private long timeWhenLastStopWatchHappened = createdAt;

    private TimeMeasurement() {
        System.out.println(" ----- TimeMeasurement ----- ");
        System.out.println("created at: " + new Date(createdAt));
    }

    public void stopwatch() {
        long timeAt = System.currentTimeMillis();

        printStatistic(timeAt, timeWhenLastStopWatchHappened);

        timeWhenLastStopWatchHappened = timeAt;
    }

    protected void printStatistic(double timeAt, double lastStopwatchTime) {
        System.out.println(" ----- Stopwatch ----- ");
        System.out.println("created at:                         " + new Date((long)timeAt));
        System.out.println("time since start, seconds:          " + (timeAt - createdAt)/1000);
        System.out.println("time since last stopwatch, seconds: " + (timeAt - lastStopwatchTime)/1000);
    }

}
