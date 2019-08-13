package edu.kit.ipd.are.esda.EnergyStateDataAnalysis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import edu.kit.ipd.are.esda.consumer.Receiver;
import edu.kit.ipd.are.esda.producer.Sender;

// @RunWith(SpringRunner.class)
// @SpringBootTest
// @DirtiesContext
// @EmbeddedKafka(partitions = 1, topics =
// {EnergyStateDataAnalysisApplicationTests.HELLOWORLD_TOPIC})
public class EnergyStateDataAnalysisApplicationTests {

    // static final String HELLOWORLD_TOPIC = "helloworld.t";
    //
    // @Autowired
    // Receiver receiver;
    //
    // @Autowired
    // Sender sender;
    //
    // @Test
    // public void contextLoads() {
    // assertTrue("receiver", receiver != null);
    // assertTrue("sender", sender != null);
    // }

}
