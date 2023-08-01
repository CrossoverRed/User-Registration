import java.util.ArrayList;

public class DeleteResume {
    private ArrayList<User> users;

    public DeleteResume(ArrayList<User> users) {
        this.users = users;
    }

    public boolean deleteResume(int userIndex, int resumeIndex) {
        if (userIndex < 0 || userIndex >= users.size()) {
            return false; // Invalid user index
        }

        User user = users.get(userIndex);
        ArrayList<Resume> resumes = user.getResumes();

        if (resumeIndex < 0 || resumeIndex >= resumes.size()) {
            return false; // Invalid resume index
        }

        resumes.remove(resumeIndex);
        System.out.println("Resume successfully deleted.");
        return true;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
