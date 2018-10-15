package hello.services;

import com.udojava.evalex.Expression;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OperationsServices {

    public OperationsServices() {

    }


    // + dans l'url = %2B
    public BigDecimal evaluation(String operations) {
        Expression expression = new Expression(operations);
        BigDecimal result = expression.eval();
        System.out.println(result);
        return result;
    }


}
