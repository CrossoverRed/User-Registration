import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class DeleteResumeTest {
    private ArrayList<User> users;
    private DeleteResume deleteResume;

    @Before
    public void setUp() {
        users = new ArrayList<>();
        deleteResume = new DeleteResume(users);
    }

    @Test
    public void testDeleteValidResume() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        user.getResumes().add(new Resume("Software Engineer", "Summary 1", "Education 1", "Experience 1", "Java, Python"));
        user.getResumes().add(new Resume("Web Developer", "Summary 2", "Education 2", "Experience 2", "HTML, CSS, JavaScript"));
        users.add(user);

        int userIndex = 0;
        int resumeIndex = 1;

        boolean result = deleteResume.deleteResume(userIndex, resumeIndex);
        assertTrue(result); // Expect the resume deletion to succeed

        // Check if the resume was removed from the user's resumes
        assertEquals(1, users.get(userIndex).getResumes().size());
    }

    @Test
    public void testDeleteResumeWithInvalidUserIndex() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        user.getResumes().add(new Resume("Software Engineer", "Summary 1", "Education 1", "Experience 1", "Java, Python"));
        users.add(user);

        int userIndex = 1; // Invalid user index
        int resumeIndex = 0;

        boolean result = deleteResume.deleteResume(userIndex, resumeIndex);
        assertFalse(result); // Expect the resume deletion to fail due to invalid user index

        // Ensure the resume count remains the same
        assertEquals(1, users.get(0).getResumes().size());
    }

    @Test
    public void testDeleteResumeWithInvalidResumeIndex() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        user.getResumes().add(new Resume("Software Engineer", "Summary 1", "Education 1", "Experience 1", "Java, Python"));
        users.add(user);

        int userIndex = 0;
        int resumeIndex = 1; // Invalid resume index

        boolean result = deleteResume.deleteResume(userIndex, resumeIndex);
        assertFalse(result); // Expect the resume deletion to fail due to invalid resume index

        // Ensure the resume count remains the same
        assertEquals(1, users.get(userIndex).getResumes().size());
    }

    @Test
    public void testDeleteResumeWithEmptyUsers() {
        int userIndex = 0;
        int resumeIndex = 0;

        boolean result = deleteResume.deleteResume(userIndex, resumeIndex);
        assertFalse(result); // Expect the resume deletion to fail due to empty users list
    }
}
