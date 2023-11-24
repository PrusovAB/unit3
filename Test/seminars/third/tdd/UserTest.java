package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {


    private UserRepository userRepository;

    @Test
    void deleteAllExceptAdminsTest() {

        userRepository = new UserRepository();

        User user1 = new User("first", "123", false);
        User user2 = new User("second", "123", false);
        User user3 = new User("third", "123", true);
        User user4 = new User("first", "123", false);

        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);

        userRepository.login(user1);
        userRepository.login(user2);
        userRepository.login(user3);
        userRepository.login(user4);

        userRepository.unloginAllExceptAdministrators();

        assertThat(userRepository.getAllLoginedUsers()).contains(user3);

    }
}