package pro.sky.skyprospringcalculat;


import org.springframework.stereotype.Service;

@Service
public class DivisionService {
    public String division(double num1, double num2){
      String num1str=Double.toString(num1);
        String num2str=Double.toString(num1);
        double div;
  if (num1str == null || num2str == null ){
      throw new NullPointerException("НЕ БЫЛО ПОЛУЧЕНО ЧИСЛО");
  } else {
         if (num2==0){
             throw new NullPointerException("Число равняется нулю");
         } else {
             div = num1 / num2;
         }
        }
        return num1 +  " / " + num2 + " = " +  div ;
    }
}
