import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class TestRACC {
    // This test set achieves RACC on the predicate in the getBonus() method inside Employee class.
    //The tests in this JUnit implement tests 1,5,7,8. The tests here are named test1(),test5(),test7(),test8()
    Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee();
    }

    @Test
    public void test1() throws Exception {
       // T T T
        employee = new Employee(true,true,6);
        assertTrue(employee.getBonus(employee));
    }

    @Test
    public void test5() throws Exception {
        // F T T
        employee = new Employee(false,true,6);
        assertFalse(employee.getBonus(employee));
    }


    @Test
    public void test7() throws Exception {
        // F F T
        employee = new Employee(false,false,6);
        assertTrue(employee.getBonus(employee));
    }

    @Test
    public void test8() throws Exception {
        // F F F
        employee = new Employee(false,false,5);
        assertFalse(employee.getBonus(employee));
    }

}
