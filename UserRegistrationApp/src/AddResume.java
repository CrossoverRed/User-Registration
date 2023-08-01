import java.util.ArrayList;

public class AddResume {
    private ArrayList<Resume> resumes = new ArrayList<>();
    private UserRegistration userRegistration; // Add reference to UserRegistration

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        AddResume newAddResume = new AddResume(userRegistration); // Pass UserRegistration instance

        boolean addUser = true; 

        while (addUser) {
            String name = Helper.readString("Enter name: ");
            String email = Helper.readString("Enter email: ");
            String pw = Helper.readString("Enter password: ");

            boolean result = userRegistration.registerUser(name, email, pw);

            if (result) {
                System.out.println("User registration is successful.");
            } else {
                System.out.println("User registration failed.");
            }

            addUser = Helper.readBoolean("Do you want to register another user (Y/N)?");
        }

        boolean addResume = true;

        while (addResume) {
            int userIndex = Helper.getUserOption("Select a user to add a resume:", userRegistration.getUserNames());
            if (userIndex > 0 && userIndex <= userRegistration.getUsers().size()) {
                String title = Helper.readString("Enter resume title: ");
                String summary = Helper.readString("Enter resume summary: ");
                String education = Helper.readString("Enter educational background: ");
                String experience = Helper.readString("Enter work experience: ");
                String skills = Helper.readString("Enter skills: ");

                boolean result = newAddResume.addResume(userIndex - 1, title, summary, education, experience, skills);

                if (result) {
                    System.out.println("Resume added successfully.");
                } else {
                    System.out.println("Failed to add the resume.");
                }
            } else {
                System.out.println("Invalid user selection.");
            }

            addResume = Helper.readBoolean("Do you want to add another resume (Y/N)?");
        }

        System.out.println("Goodbye.");
    }

    // Constructor to receive the UserRegistration instance
    public AddResume(UserRegistration userRegistration) {
        this.userRegistration = userRegistration;
    }

    public boolean addResume(int userIndex, String title, String summary, String education, String experience, String skills) {
        ArrayList<User> users = userRegistration.getUsers(); // Get the users from UserRegistration

        if (userIndex < 0 || userIndex >= users.size()) {
            return false; // Invalid user index
        }

        User user = users.get(userIndex);
        ArrayList<Resume> userResumes = user.getResumes();

        if (title.isEmpty() || summary.isEmpty() || education.isEmpty() || experience.isEmpty() || skills.isEmpty()) {
            return false;
        }

        userResumes.add(new Resume(title, summary, education, experience, skills));
        return true;
    }
}
