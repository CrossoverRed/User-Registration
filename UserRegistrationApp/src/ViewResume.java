import java.util.ArrayList;

public class ViewResume {
    private UserRegistration userRegistration;

    public ViewResume(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    public boolean deleteResume(int userIndex, int resumeIndex) {
        ArrayList<User> users = userRegistration.getUsers();

        if (userIndex < 0 || userIndex >= users.size()) {
            return false; // Invalid user index
        }

        User user = users.get(userIndex);
        ArrayList<Resume> resumes = user.getResumes();

        if (resumeIndex < 0 || resumeIndex >= resumes.size()) {
            return false; // Invalid resume index
        }

        resumes.remove(resumeIndex);
        return true;
    }

    public void displayAllResumes() {
        ArrayList<User> users = userRegistration.getUsers();

        if (users.isEmpty()) {
            System.out.println("No resumes found.");
        } else {
            System.out.println("Resumes:");
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                System.out.println("User " + (i + 1) + ":");
                System.out.println("Name: " + user.getName());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Resumes:");
                displayUserResumes(user);
                System.out.println("-------------------------");
            }
        }
    }

    private void displayUserResumes(User user) {
        ArrayList<Resume> resumes = user.getResumes();
        if (resumes.isEmpty()) {
            System.out.println("No resumes found for this user.");
        } else {
            for (int i = 0; i < resumes.size(); i++) {
                Resume resume = resumes.get(i);
                System.out.println("Resume " + (i + 1) + ":");
                System.out.println("Title: " + resume.getTitle());
                System.out.println("Summary: " + resume.getSummary());
                System.out.println("Education: " + resume.getEducation());
                System.out.println("Experience: " + resume.getExperience());
                System.out.println("Skills: " + resume.getSkills());
                System.out.println("-------------------------");
            }
        }
    }
}
