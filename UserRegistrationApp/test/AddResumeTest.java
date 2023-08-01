import static org.junit.Assert.*;
import org.junit.Test;

public class AddResumeTest {

    @Test
    public void testValidResume() {
        AddResume resume = new AddResume("Software Engineer",
                                        "Experienced software engineer specializing in Java development.",
                                        "Bachelor's Degree in Computer Science",
                                        "5 years of professional experience in software development",
                                        "Java, Python, HTML, SQL");
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    @Test
    public void testMissingTitle() {
        AddResume resume = new AddResume("",
                                        "Experienced software engineer specializing in Java development.",
                                        "Bachelor's Degree in Computer Science",
                                        "5 years of professional experience in software development",
                                        "Java, Python, HTML, SQL");
        assertEquals("", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    @Test
    public void testMissingSummary() {
        AddResume resume = new AddResume("Software Engineer",
                                        "",
                                        "Bachelor's Degree in Computer Science",
                                        "5 years of professional experience in software development",
                                        "Java, Python, HTML, SQL");
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    @Test
    public void testMissingEducation() {
        AddResume resume = new AddResume("Software Engineer",
                                        "Experienced software engineer specializing in Java development.",
                                        "",
                                        "5 years of professional experience in software development",
                                        "Java, Python, HTML, SQL");
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    @Test
    public void testMissingExperience() {
        AddResume resume = new AddResume("Software Engineer",
                                        "Experienced software engineer specializing in Java development.",
                                        "Bachelor's Degree in Computer Science",
                                        "",
                                        "Java, Python, HTML, SQL");
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("", resume.getExperience());
        assertEquals("Java, Python, HTML, SQL", resume.getSkills());
    }

    @Test
    public void testMissingSkills() {
        AddResume resume = new AddResume("Software Engineer",
                                        "Experienced software engineer specializing in Java development.",
                                        "Bachelor's Degree in Computer Science",
                                        "5 years of professional experience in software development",
                                        "");
        assertEquals("Software Engineer", resume.getTitle());
        assertEquals("Experienced software engineer specializing in Java development.", resume.getSummary());
        assertEquals("Bachelor's Degree in Computer Science", resume.getEducation());
        assertEquals("5 years of professional experience in software development", resume.getExperience());
        assertEquals("", resume.getSkills());
    }

    @Test
    public void testEmptyResume() {
        AddResume resume = new AddResume("", "", "", "", "");
        assertEquals("", resume.getTitle());
        assertEquals("", resume.getSummary());
        assertEquals("", resume.getEducation());
        assertEquals("", resume.getExperience());
        assertEquals("", resume.getSkills());
    }
}
