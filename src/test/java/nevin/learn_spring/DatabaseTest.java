package nevin.learn_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    
    @Test
    void testSingletonDatabase() {
        var db1 = Database.getInstance();
        var db2 = Database.getInstance();

        Assertions.assertSame(db1, db2);
    }
}
