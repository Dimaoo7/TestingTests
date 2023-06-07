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
    //@Disable <-- не работат
    void after() {
        System.out.println("Тут что то должно было быть");
    }

    @Test
    @DisplayName("Проверка сложения")
    void plus() {
        assertEquals("20 + 60 = 80", out.plus(20, 60));
        assertNotEquals("20 + 0 = 200", out.plus(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void minus() {
        assertEquals("20 - 60 = -40", out.minus(20, 60));
        assertNotEquals("20 - 0 = 2", out.minus(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка умножения")
    void multiply() {
        assertEquals("20 * 60 = 1200", out.multiply(20, 60));
        assertNotEquals("20 * 0 = 20", out.multiply(20, 0));
        assertNotNull(out.plus(20, 60));
    }

    @Test
    @DisplayName("Проверка деления")
    void divide() {
        assertEquals("40 / 20 = 2", out.divide(40, 20));
        assertNotEquals("40 / 10 = 0", out.divide(40, 10));
        assertNotNull(out.plus(60, 20));
        assertThrows(IllegalArgumentException.class, () -> out.divide(40, 0));
    }
}