package com.example.cert.repository;
import com.example.cert.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.*;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
