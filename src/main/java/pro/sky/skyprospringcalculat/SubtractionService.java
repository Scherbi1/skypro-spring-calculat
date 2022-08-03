package pro.sky.skyprospringcalculat;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {

    public String subtraction( int num1,  int num2){
        String num1str=Double.toString(num1);
        String num2str=Double.toString(num1);
        int sub;
        if (num1str == null || num2str == null ){
            throw new NullPointerException("НЕ БЫЛО ПОЛУЧЕНО ЧИСЛО");
        } else {
            sub = num1 - num2;
        }
        return num1 +  " - " + num2 + " = " +  sub ;
    }
}
