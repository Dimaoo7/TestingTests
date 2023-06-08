package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {         //Человек который убил другого убийца но если он убил злодея то он герой
                                            //Мир не справедлив только к тем у кого нет связей
                                            //Деньги всего лишь грязная маколатура                        Сергей Мавроди
                                            //Интерестно зачем придумали религию не ужели люди боялись смерти :D
                                            //Что же страшнее смерть или же старость
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String index() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "<h1>" + num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2) + "</h1>";
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "<h1>" + num1 + " + " + num2 + " = " + calculatorService.minus(num1, num2) + "</h1>";
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "<h1>" + num1 + " + " + num2 + " = " + calculatorService.multiply(num1, num2) + "</h1>";
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "<h1>" + num1 + " + " + num2 + " = " + calculatorService.divide(num1, num2) + "</h1>";
    }
}

