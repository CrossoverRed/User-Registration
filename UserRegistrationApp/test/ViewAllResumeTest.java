import static org.junit.Assert.*;
import org.junit.Test;

public class ViewAllResumeTest {

    @Test
    public void testDisplayAllResumes() {
        UserRegistration userRegistration = new UserRegistration();
        ViewAllResumes viewAllResumes = new ViewAllResumes(userRegistration);

        // Perform the test
        viewAllResumes.displayAllResumes();
    }

    @Test
    public void testDisplayAllResumesWithUsersAndResumes() {
        UserRegistration userRegistration = new UserRegistration();
        ViewAllResumes viewAllResumes = new ViewAllResumes(userRegistration);

        // Create some users and resumes
        User user1 = new User("John Doe", "johndoe@example.com", "password1234");
        user1.getResumes().add(new AddResume("Resume 1", "Summary 1", "Education 1", "Experience 1", "Skills 1"));
        user1.getResumes().add(new AddResume("Resume 2", "Summary 2", "Education 2", "Experience 2", "Skills 2"));
        userRegistration.getUsers().add(user1);

        User user2 = new User("Jane Smith", "janesmith@example.com", "password5678");
        user2.getResumes().add(new AddResume("Resume 3", "Summary 3", "Education 3", "Experience 3", "Skills 3"));
        userRegistration.getUsers().add(user2);

        // Perform the test
        viewAllResumes.displayAllResumes();
    }

}
