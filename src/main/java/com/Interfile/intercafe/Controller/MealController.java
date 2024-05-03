package com.Interfile.intercafe.Controller;

import com.Interfile.intercafe.Entity.MealItem;
import com.Interfile.intercafe.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/mealitems")
public class MealController {
    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MealItem> getMealItemById(@PathVariable Long id) {
        MealItem mealItem = mealService.getMealItemByID(id);
        return ResponseEntity.ok(mealItem);
    }

    @GetMapping("/getMealItems")
    public List<MealItem> getAllMealItems() {
        return mealService.getAllMealItems();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMealItem(@PathVariable Long id) {
        mealService.deleteMealItem(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/getByCategory")
    public List<MealItem> getByCategory(
            @RequestBody Map<String , String> category
    ) {
        return mealService.getByCategory(category.get("category"));
    }

    @PostMapping
    public MealItem createMealItem(@RequestBody MealItem mealItem) {
        return mealService.createMealItem(mealItem);
    }

}
