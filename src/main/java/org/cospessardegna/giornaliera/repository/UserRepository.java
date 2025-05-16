package org.cospessardegna.giornaliera.repository;
import  org.cospessardegna.giornaliera.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer>{

}
