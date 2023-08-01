import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String password;
    private ArrayList<Resume> resumes;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.resumes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Resume> getResumes() {
        return resumes;
    }
}

