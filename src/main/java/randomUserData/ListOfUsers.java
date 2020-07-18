package randomUserData;

import com.github.javafaker.Faker;

public class ListOfUsers {

    private String message;
    UserData userData = new UserData();
    Faker faker = new Faker();

    private Object users[][] = new Object[20][3];

    public Object create20users() {

        for(int i = 0; i<20; i++) {

            userData.setFirstName(faker.name().firstName());
            userData.setSecondName(faker.name().lastName());
            userData.setFullName(userData.getFirstName() + " " + userData.getSecondName());
            userData.setAge(faker.number().numberBetween(1, 100));
            userData.setEmail(userData.getFirstName() + "." + userData.getSecondName() + "@google.pl");

            users[i][0] = userData.getFullName();
            users[i][1] = userData.getAge();
            users[i][2] = userData.getEmail();
        }
        return users;
    }

    public void listUserData() {

        for(int i = 0; i<20; i++) {
            message = "Hi I am " + users[i][0] + ". I am " + users[i][1] + ". Please subscribe my channel using " + users[i][2] + " email.";
            System.out.println(message);
        }
    }
}
