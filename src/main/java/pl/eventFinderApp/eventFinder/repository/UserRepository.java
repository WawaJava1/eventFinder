package pl.eventFinderApp.eventFinder.repository;

import org.springframework.stereotype.Repository;
import pl.eventFinderApp.eventFinder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
    List<User> findUserById(Integer idUser);
}
