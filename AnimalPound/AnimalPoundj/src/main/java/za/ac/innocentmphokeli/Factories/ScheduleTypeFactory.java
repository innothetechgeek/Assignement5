package za.ac.innocentmphokeli.Factories;

import za.ac.innocentmphokeli.Domain.Schedule;
import za.ac.innocentmphokeli.Domain.ScheduleType;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleTypeFactory {

    //singleton
    private static ScheduleTypeFactory instance=null;

    public ScheduleTypeFactory(){}

    public static ScheduleTypeFactory getInstance(){
        if (instance == null) {
            instance = new ScheduleTypeFactory();
        }
        return instance;
    }
    public static ScheduleType createScheduleType(
            String code,
            boolean active,
            List<Schedule> schedules)
    {
        return new ScheduleType.Builder(code)
                .active(active)
                .schedules(schedules)
                .build();
    }
}
