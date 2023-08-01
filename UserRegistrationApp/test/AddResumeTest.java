import static org.junit.Assert.*;
import org.junit.Test;

public class AddResumeTest {

    @Test
    public void testValidResume() {
        // Create a UserRegistration instance to pass to AddResume constructor
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        // Register a user before adding a resume
        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result); // Ensure the user is registered successfully

        // Add a valid resume for the registered user
        result = addResume.addResume(0, "Software Engineer",
                "Experienced software engineer specializing in Java development.",
                "Bachelor's Degree in Computer Science",
                "5 years of professional experience in software development",
                "Java, Python, HTML, SQL");
        assertTrue(result); // Ensure the resume is added successfully

        // Get the user's resume and assert its properties
        Resume resume = userRegistration.getUsers().get(0).getResumes().get(0);
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    // Add other test cases for missing title, summary, education, experience, and skills
    // ...

    @Test
    public void testMissingTitle() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with a missing title
        result = addResume.addResume(0, "",
                "Experienced software engineer specializing in Java development.",
                "Bachelor's Degree in Computer Science",
                "5 years of professional experience in software development",
                "Java, Python, HTML, SQL");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }
    @Test
    public void testMissingSummary() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with a missing summary
        result = addResume.addResume(0, "Software Engineer",
                "",
                "Bachelor's Degree in Computer Science",
                "5 years of professional experience in software development",
                "Java, Python, HTML, SQL");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }

    @Test
    public void testMissingEducation() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with missing education
        result = addResume.addResume(0, "Software Engineer",
                "Experienced software engineer specializing in Java development.",
                "",
                "5 years of professional experience in software development",
                "Java, Python, HTML, SQL");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }

    @Test
    public void testMissingExperience() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with missing experience
        result = addResume.addResume(0, "Software Engineer",
                "Experienced software engineer specializing in Java development.",
                "Bachelor's Degree in Computer Science",
                "",
                "Java, Python, HTML, SQL");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }

    @Test
    public void testMissingSkills() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with missing skills
        result = addResume.addResume(0, "Software Engineer",
                "Experienced software engineer specializing in Java development.",
                "Bachelor's Degree in Computer Science",
                "5 years of professional experience in software development",
                "");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }
    
    @Test
    public void testInvalidUserIndex() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add a resume with an invalid user index (out of bounds)
        result = addResume.addResume(1, "Software Engineer",
                "Experienced software engineer specializing in Java development.",
                "Bachelor's Degree in Computer Science",
                "5 years of professional experience in software development",
                "Java, Python, HTML, SQL");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }

    // Add other test cases for missing summary, education, experience, and skills
    // ...
    
    
    
    
    
    @Test
    public void testEmptyResume() {
        UserRegistration userRegistration = new UserRegistration();
        AddResume addResume = new AddResume(userRegistration);

        boolean result = userRegistration.registerUser("John Doe", "john.doe@example.com", "password123");
        assertTrue(result);

        // Attempt to add an empty resume
        result = addResume.addResume(0, "", "", "", "", "");
        assertFalse(result); // Expect the resume addition to fail

        // Ensure that no resume is added for the user
        assertEquals(0, userRegistration.getUsers().get(0).getResumes().size());
    }

}
