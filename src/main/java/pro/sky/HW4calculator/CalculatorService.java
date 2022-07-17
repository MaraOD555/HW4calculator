package pro.sky.HW4calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class CalculatorService { // методы класса делают только вычисления в данном случае и ничего больше,
    // если потребуется создать строку или еще какие то методы, отличные от вычеслений,
    // то необходимо создавать новый класс(ы) сервиса.

    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public Number divide(int num1, int num2){ // Метод Number, чтобы можно было вернуть результат
        // деления в числовом типе double, т.к. при делении образуется
        // не целочисленное значение.
        return (double) num1 / num2;
    }
}


