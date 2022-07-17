package pro.sky.HW4calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator") // т.к. есть общая часть у @GetMapping, выносим на уровень класса
public class CalculatorController {
    private final CalculatorService calculatorService; // поле сервиса

    public CalculatorController(CalculatorService calculatorService) { // конструктор сервиса
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String showCalculatorGreetings(){
        return "Добро пожаловать в калькулятор"; // формат вывода всегда в контроллере
    }
    @GetMapping("/plus")
    public String showSumResult(@RequestParam(required = false) Integer num1,
                                @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Ошибка! Какой то из параметров не задан";
        }
       return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);

    }
    @GetMapping("/minus")
    public String showSubtractionResult(@RequestParam(required = false) Integer num1,
                                        @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Ошибка! Какой то из параметров не задан";
        }
        return  num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }
    @GetMapping("/multiply")
    public String showMultiplyResult(@RequestParam(required = false) Integer num1,
                                     @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Ошибка! Какой то из параметров не задан";
        }
        return  num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String showDivideResult(@RequestParam(required = false) Integer num1,
                                   @RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Ошибка! Какой то из параметров не задан";
        }
        if (num2 == 0) {
            return "Ошибка!!! Делить на 0 запрещено";
        }
        return  num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);

        }

    }

