package hello.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hello.entities.GreetingEntities;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public GreetingEntities greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingEntities(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/greeting/{name}")
    public GreetingEntities greetingPath(@PathVariable(value="name") String name) {
        return new GreetingEntities(counter.incrementAndGet(),
                String.format(template, name));
    }
}