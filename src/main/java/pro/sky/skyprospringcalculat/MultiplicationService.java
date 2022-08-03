package pro.sky.skyprospringcalculat;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

    public String multiplication(int num1, int num2){
        String num1str=Double.toString(num1);
        String num2str=Double.toString(num1);
        int multy;
        if (num1str == null || num2str == null ){
            throw new NullPointerException("НЕ БЫЛО ПОЛУЧЕНО ЧИСЛО");
        } else {
            multy = num1 * num2;
        }
        return num1 +  " * " + num2 + " = " +  multy ;
    }
}
