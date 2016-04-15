package za.ac.innocentmphokeli.DomainInterfaces;

import za.ac.innocentmphokeli.Domain.Schedule;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public interface IScheduleType {
    int getScheduleTypeId();
    String getName();
    boolean isActive();
    List<Schedule> getSchedules();
}
