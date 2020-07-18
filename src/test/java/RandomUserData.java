import com.github.javafaker.Faker;
import randomUserData.ListOfUsers;
import randomUserData.UserData;

public class RandomUserData {

    public static void main(String[] args) {

        ListOfUsers listOfUsers = new ListOfUsers();

        listOfUsers.create20users();
        listOfUsers.listUserData();

    }

}
