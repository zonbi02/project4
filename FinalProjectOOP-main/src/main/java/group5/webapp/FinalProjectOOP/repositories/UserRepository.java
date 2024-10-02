package group5.webapp.FinalProjectOOP.repositories;

import com.sun.mail.imap.protocol.UIDSet;
import group5.webapp.FinalProjectOOP.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserByUserNameAndPassWord(String username, String password);

    User getUserByUserName(String username);

    User getUserByUserNameAndPassWordAndRole(String username,String password, int role);

    Optional<User> findUserByUserNameAndId(String username, Integer id);

    List<User> findAllByRoleAndStatus(int role, int status);

    List<User> findUserByRole(Integer role);

}
