import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class EmployeeAppTest {

    @Test
    public void testData() {
        Employee testEmp = this.getEmployeeTest();
        assertAll( "heading",
            () -> assertEquals(testEmp.name, "John"),
            () -> assertEquals(testEmp.emailAddress, "john@baeldung.com"),
            () -> assertEquals(testEmp.yearOfBirth, 1978)
        );
    }

    private Employee getEmployeeTest() {

        Employee employee = new Employee();
        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        return employee;
    }
}
