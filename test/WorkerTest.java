import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2;
    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Ryan", "Rofe", "Mr.", 2002, 20);
    }

    @Test
    void getHourlyPayRate() {
        assertEquals(20, w1.getHourlyPayRate());
    }
}