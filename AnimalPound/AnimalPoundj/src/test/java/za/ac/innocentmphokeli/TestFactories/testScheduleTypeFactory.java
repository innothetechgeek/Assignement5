package za.ac.innocentmphokeli.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.Schedule;
import za.ac.innocentmphokeli.Domain.ScheduleType;
import za.ac.innocentmphokeli.Factories.ScheduleTypeFactory;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class testScheduleTypeFactory {
    @Test
    public void testCreate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("Evening120",true, schedules);

        Assert.assertEquals("Evening120", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactory factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("Evening120",true, schedules);
        ScheduleType copy = new ScheduleType.Builder("IDK").copy(original).active(false).build();

        Assert.assertEquals(false, copy.isActive());
        Assert.assertEquals(true, original.isActive());
        Assert.assertEquals(original.getCode(), copy.getCode());
    }
}
