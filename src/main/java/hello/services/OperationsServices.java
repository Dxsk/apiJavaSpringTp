package hello.services;

import com.udojava.evalex.Expression;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OperationsServices {

    public OperationsServices() {}

    // TODO faire les tests pour toutes les methodes

    public Integer add(Integer numberOne, Integer numberTwo){
        return numberOne + numberTwo;
    }

    public Integer subtraction(Integer numberOne, Integer numberTwo){
        return numberOne - numberTwo;
    }

    public Integer multiply(Integer numberOne, Integer numberTwo){
        return numberOne * numberTwo;
    }

    public Integer divise(Integer numberOne, Integer numberTwo){
        return numberOne / numberTwo;
    }

    public BigDecimal evaluation(String operations) {
        Expression expression = new Expression(operations);
        return expression.eval();
    }


}
