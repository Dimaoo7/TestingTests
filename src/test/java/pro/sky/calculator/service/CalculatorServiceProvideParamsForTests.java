package pro.sky.calculator.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceProvideParamsForTests {

    private final CalculatorService out = new CalculatorService();

    public static Stream<Arguments> provideParamsForPlus() {
        return Stream.of(
                Arguments.of("20 + 60 = 80", 20, 60, 80)
        );
    }

    public static Stream<Arguments> provideParamsForMinus() {
        return Stream.of(
                Arguments.of("20 - 60 = -40", 20, 60, -40)
        );
    }

    public static Stream<Arguments> provideParamsForMultiply() {
        return Stream.of(
                Arguments.of("20 * 60 = 1200", 20, 60, 1200)
        );
    }

    public static Stream<Arguments> provideParamsForDivide() {
        return Stream.of(
                Arguments.of("40 / 20 = 2", 40, 20, 2)
        );
    }

    @DisplayName("Проверка сложения")
    @ParameterizedTest
    @MethodSource("provideParamsForPlus")
    public void plus(String ignoredExpression, int num1, int num2, int expected) {
        assertEquals(expected, out.plus(num1, num2));
    }

    @DisplayName("Проверка вычитания")
    @ParameterizedTest
    @MethodSource("provideParamsForMinus")
    public void minus(String ignoredExpression, int num1, int num2, int expected) {
        assertEquals(expected, out.minus(num1, num2));
    }


    @DisplayName("Проверка умножения")
    @ParameterizedTest
    @MethodSource("provideParamsForMultiply")
    public void multiply(String ignoredExpression, int num1, int num2, int expected) {
        assertEquals(expected, out.multiply(num1, num2));
    }


    @DisplayName("Проверка деления")
    @ParameterizedTest
    @MethodSource("provideParamsForDivide")
    public void divide(String ignoredExpression, int num1, int num2, int expected) {
        assertEquals(expected, out.divide(num1, num2));
    }



}