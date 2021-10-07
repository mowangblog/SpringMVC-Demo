package top.mowang.pojo;

/**
 * Spring-MVC-Demo
 * 实体类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 23:15
 **/
public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String password, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
