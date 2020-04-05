/**
 * 
 */
package com.sd.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.User;

/**
 * @author Vikram
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	 Optional<User> findByUserName(String username);
}
