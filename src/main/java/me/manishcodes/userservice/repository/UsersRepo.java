package me.manishcodes.userservice.repository;

import me.manishcodes.userservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo  extends JpaRepository<Users,Long> {
}
