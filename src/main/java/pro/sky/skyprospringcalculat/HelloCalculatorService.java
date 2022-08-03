package pro.sky.skyprospringcalculat;

import org.springframework.stereotype.Service;

@Service
public class HelloCalculatorService {

    public String helloCalculator(){
        return "Добро пожаловать в калькулятор";
    }
}
