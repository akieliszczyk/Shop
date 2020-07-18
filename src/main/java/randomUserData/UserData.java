package randomUserData;

public class UserData {

    private String introduceUser;
    private String firstName;
    private String secondName;
    private String fullName;
    private Integer age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getIntroduceUser() {
        return introduceUser;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIntroduceUser(String introduceUser) {
        this.introduceUser = introduceUser;
    }

}
