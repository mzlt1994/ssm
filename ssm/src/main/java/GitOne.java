import java.util.Date;

public class GitOne {

    private Integer id;
    private String name;
    private String password;
    private Date brithday;
    private String sex;

    public GitOne() {
        super();
    }

    public GitOne(Integer id, String name, String password, Date brithday, String sex) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.brithday = brithday;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "GitOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", brithday=" + brithday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
