package com.example.pizza;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza newPizza) {
        return pizzaService.savePizza(newPizza);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> findPizzaById(@PathVariable Long id) {
        return ResponseEntity.ok(pizzaService.getPizzaByID(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pizza>> getAllPizza() {
        return ResponseEntity.ok(pizzaService.getAllPizza());
    }
}
