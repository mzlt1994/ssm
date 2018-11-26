public class TestGit {

    private String gitName;
    private String gitPassword;
    private String gitId;

    public TestGit() {
        super();
    }

    public TestGit(String gitName, String gitPassword, String gitId) {
        this.gitName = gitName;
        this.gitPassword = gitPassword;
        this.gitId = gitId;
    }

    @Override
    public String toString() {
        return "TestGit{" +
                "gitName='" + gitName + '\'' +
                ", gitPassword='" + gitPassword + '\'' +
                ", gitId='" + gitId + '\'' +
                '}';
    }

    public String getGitName() {
        return gitName;
    }

    public void setGitName(String gitName) {
        this.gitName = gitName;
    }

    public String getGitPassword() {
        return gitPassword;
    }

    public void setGitPassword(String gitPassword) {
        this.gitPassword = gitPassword;
    }

    public String getGitId() {
        return gitId;
    }

    public void setGitId(String gitId) {
        this.gitId = gitId;
    }
}
