public class Resume {
	private String title;
	private String summary;
	private String education;
	private String experience;
	private String skills;
	//public AddResume(String title, String summary, String education, String experience, String skills) {
	//    this.title = title;
	//    this.summary = summary;
	//    this.education = education;
	//    this.experience = experience;
	//    this.skills = skills;
	//}
	public Resume(String title, String summary, String education, String experience, String skills) {
        this.title = title;
        this.summary = summary;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	public String getSummary() {
	    return summary;
	}

	public void setSummary(String summary) {
	    this.summary = summary;
	}

	public String getEducation() {
	    return education;
	}

	public void setEducation(String education) {
	    this.education = education;
	}

	public String getExperience() {
	    return experience;
	}

	public void setExperience(String experience) {
	    this.experience = experience;
	}

	public String getSkills() {
	    return skills;
	}

	public void setSkills(String skills) {
	    this.skills = skills;
	}
}

