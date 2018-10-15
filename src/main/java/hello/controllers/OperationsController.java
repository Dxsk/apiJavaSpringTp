package hello.controllers;

import hello.services.OperationsServices;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
public class OperationsController {

    private final OperationsServices ops = new OperationsServices();

    // TODO faire les tests pour toutes ses routes
    // TODO Gestion des erreurs quand l'utilisateur envoie des mauvaises erreurs

    @RequestMapping(value = "/add/{nbOne}/{nbTwo}")
    public Integer add(OperationsServices ops, @PathVariable Integer nbOne, @PathVariable Integer nbTwo){
        return ops.add(nbOne, nbTwo);
    }

    @RequestMapping("/subtraction/{nbOne}/{nbTwo}")
    public Integer subtraction(OperationsServices ops, @PathVariable Integer nbOne, @PathVariable Integer nbTwo){
        return ops.subtraction(nbOne, nbTwo);
    }

    @RequestMapping("/multiply/{nbOne}/{nbTwo}")
    public Integer multiply(OperationsServices ops, @PathVariable Integer nbOne, @PathVariable Integer nbTwo){
        return ops.multiply(nbOne, nbTwo);
    }

    @RequestMapping("/divise/{nbOne}/{nbTwo}")
    public Integer divise(OperationsServices ops, @PathVariable Integer nbOne, @PathVariable Integer nbTwo){
        return ops.divise(nbOne, nbTwo);
    }

    @RequestMapping("/eval")
    public BigDecimal eval(@RequestParam(value="operation") String operation) {
        // TODO Ajouter les test pour la route eval
        // TODO Faire en sorte de retourner une erreur quand un retour utilisateur bug
        operation = operation.replace(" ", "+");
        return ops.evaluation(operation);
    }

}
