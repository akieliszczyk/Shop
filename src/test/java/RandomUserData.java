import com.github.javafaker.Faker;

import java.util.List;

public class RandomUserData {

    private List listOfUsers;
    private String introduceUser;
    private String firstName;
    private String secondName;
    private Integer age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIntroduceUser(String introduceUser) {
        this.introduceUser = introduceUser;
    }

    public static void main(String[] args) {
        RandomUserData randomData = new RandomUserData();
        Faker faker = new Faker();

     for(int i = 0; i<20; i++) {
         randomData.setFirstName(faker.name().firstName());
         randomData.setSecondName(faker.name().lastName());
         randomData.setAge(faker.number().numberBetween(1,100));
         randomData.setEmail(randomData.getFirstName() + "." + randomData.getSecondName() + "@google.pl");

         randomData.setIntroduceUser("Hi, I am "+ randomData.getFirstName() + " " + randomData.getSecondName() + ", I am " + randomData.getAge() + ". Please subscribe my channel using " + randomData.getEmail().toLowerCase() + " email.");
         //randomData.listOfUsers.add(randomData.getIntroduceUser());
         System.out.println(randomData.introduceUser);

     }

     //System.out.println(randomData.listOfUsers);
    }



}
