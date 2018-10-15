package hello.controllers;

import hello.services.OperationsServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;
import java.math.BigDecimal;

@RestController
public class OperationsController {


    @RequestMapping("/eval")
    public BigDecimal eval(@RequestParam(value="operation") String operation) {
        OperationsServices ops = new OperationsServices();
        return ops.evaluation(operation);
    }

}
