package com.example.pizza;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    private List<Pizza> allPizzas = new ArrayList<>();

    public Pizza savePizza(Pizza pizza) {
        allPizzas.add(pizza);
        return pizza;
    }

    public Pizza getPizzaByID(Long id) {
        for (Pizza p : allPizzas) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public List<Pizza> getAllPizza() {
        return allPizzas;
    }
}
