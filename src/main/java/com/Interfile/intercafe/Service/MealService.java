package com.Interfile.intercafe.Service;

import com.Interfile.intercafe.Entity.MealItem;
import com.Interfile.intercafe.Repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {

        this.mealRepository = mealRepository;
    }

    public MealItem createMealItem(MealItem mealItem) {
        return mealRepository.save(mealItem);
    }

    public List<MealItem> getAllMealItems(){
        return mealRepository.findAll();
    }

    public void deleteMealItem(Long id) {
         mealRepository.deleteById(id);
    }

    public MealItem getMealItemByID(Long id) {
      return mealRepository.findById(id).get();
    }


    public List<MealItem> getByCategory(String category){
        return mealRepository.getByCategory(category);
    }



}
