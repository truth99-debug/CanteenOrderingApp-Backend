package com.Interfile.intercafe.Repository;

import com.Interfile.intercafe.Entity.MealItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MealRepository extends JpaRepository<MealItem, Long> {
    @Query(
            """
            SELECT
                mi
            FROM
                MealItem mi
            WHERE
                mi.category = ?1
            """
    ) List<MealItem> getByCategory(String category);


}
