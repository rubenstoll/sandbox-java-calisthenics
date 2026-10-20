package ch.toto.toolbox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://docs.junit.org/6.1.3/overview.html#getting-started-example-projects">Junit User Guide 6.3</a>
 * <a href="https://github.com/junit-team/junit-examples/tree/r6.1.3/junit-jupiter-starter-maven">junit-jupiter-starter-maven</a>
 */
class AppTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        App.main(new String[]{});
    }
}