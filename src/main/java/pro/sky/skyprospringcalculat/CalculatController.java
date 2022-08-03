package pro.sky.skyprospringcalculat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatController {


    private final AdditionServis additionServis;
    private final DivisionService divisionService;
    private final SubtractionService subtractionService;
    private final MultiplicationService multiplicationService;
    private final HelloCalculatorService helloCalculatorService;

     private CalculatController(AdditionServis additionServis, DivisionService divisionService,
                                SubtractionService subtractionService, MultiplicationService multiplicationService,
                                HelloCalculatorService helloCalculatorService){
         this.additionServis=additionServis;
         this.divisionService=divisionService;
         this.subtractionService=subtractionService;
         this.multiplicationService=multiplicationService;
         this.helloCalculatorService=helloCalculatorService;
     }
    @GetMapping(path = "/calculator")
    public String helloCalculator(){
        return helloCalculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam ("num2") int num2){

        return additionServis.addition(num1,num2) ;
    }

    @GetMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam ("num2") int num2){

        return subtractionService.subtraction(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam ("num2") int num2){

        return multiplicationService.multiplication(num1,num2) ;
    }

    @GetMapping(path = "/calculator/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam ("num2") int num2){

        return divisionService.division(num1,num2);
    }
}
