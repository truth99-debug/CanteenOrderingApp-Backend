package com.Interfile.intercafe.Repository;

import com.Interfile.intercafe.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);

    UserEntity getUserByEmailAndPassword(String email , String password);
}
