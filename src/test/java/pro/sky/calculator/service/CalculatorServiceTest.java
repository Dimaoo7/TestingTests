package pro.sky.calculator.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();


    @BeforeEach()
    void before() {
        System.out.println("Тест");

    }
    @AfterEach
    void after() {
        System.out.println("Тут что то должно было быть");
    }

    @Test
    @DisplayName("Проверка сложения")
    void plus() {
        assertEquals(80, out.plus(20, 60));
        assertNotEquals(200, out.plus(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void minus() {
        assertEquals( -40, out.minus(20, 60));
        assertNotEquals(2, out.minus(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка умножения")
    void multiply() {
        assertEquals(1200, out.multiply(20, 60));
        assertNotEquals(20, out.multiply(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка деления")
    void divide() {
        assertEquals(2, out.divide(40, 20));
        assertNotEquals(0, out.divide(40, 10));
        assertNotNull(out.plus(60, 20));
        assertThrows(IllegalArgumentException.class, () -> out.divide(40, 0));
    }
}