package me.manishcodes.userservice.repository;

import me.manishcodes.userservice.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo  extends MongoRepository<Users,Long> {
}
