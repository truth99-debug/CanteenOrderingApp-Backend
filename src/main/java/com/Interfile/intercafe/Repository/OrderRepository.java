package com.Interfile.intercafe.Repository;

import com.Interfile.intercafe.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

    List<Orders> findAllByUserEntityId(int userId);
}
