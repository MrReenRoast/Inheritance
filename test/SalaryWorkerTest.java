import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1;
    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "Ryan", "Rofe","Mr.", 2002, 50000);
    }

    @Test
    void getAnnualSalary() {
        assertEquals(50000, s1.getAnnualSalary());
    }
}