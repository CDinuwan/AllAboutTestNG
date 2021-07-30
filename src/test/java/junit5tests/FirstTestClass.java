package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {

    @BeforeAll
    void beforeAll() {
        System.out.println("__This is the before All method");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("____This is the before each method");
    }

    @AfterAll
    void afterAll() {
        System.out.println("__This is the after all method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("____This is the after each method");
    }

    @Test
    @DisplayName("US2345-Verify First Test")
    public void firstMethod() {
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1234-Verify Second Test")
    void secondMethod() {
        System.out.println("This is second test method");
    }
}
