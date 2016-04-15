package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.*;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleFactory {

    //singleton
    private static ScheduleFactory instance=null;

    public ScheduleFactory(){}

    public static ScheduleFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleFactory();
        }
        return instance;
    }

    public static Schedule createSchedule(String activity,
                                          int scheduleId,
                                          DateTimeRange dtr)
    {
        return new Schedule.Builder(activity)
                .scheduleId(scheduleId)
                .dateTimeRange(dtr)
                .build();
    }

}
