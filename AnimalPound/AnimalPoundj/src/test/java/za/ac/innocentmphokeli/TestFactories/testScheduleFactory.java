package za.ac.innocentmphokeli.TestFactories;

import org.junit.Assert;
import org.junit.Test;
import za.ac.innocentmphokeli.Domain.DateTimeRange;
import za.ac.innocentmphokeli.Domain.Schedule;
import za.ac.innocentmphokeli.Factories.ScheduleFactory;

/**
 * Created by Admin on 2016/04/03.
 */
public class testScheduleFactory {

    @Test
    public void testName() throws Exception {
        ScheduleFactory factory = new ScheduleFactory();
        Schedule testObject = factory.createSchedule("Bathing", 0, new DateTimeRange());

        Assert.assertEquals("Bathing", testObject.getActivity());
    }




    @Test
    public void testUpdate()
    {
        ScheduleFactory factory = new ScheduleFactory();
        Schedule original = factory.createSchedule("Bathing", 0, new DateTimeRange());
        Schedule copy = new Schedule.Builder("Feeding").copy(original).scheduleId(5).build();

        Assert.assertEquals(0, original.getScheduleId());
        Assert.assertEquals(5, copy.getScheduleId());

    }
}
