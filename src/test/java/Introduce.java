import randomUserData.MyName;

public class Introduce {

    public static void main(String[] args) {
        MyName myName = new MyName();

//        myName.setName("AniaName");
        myName.setSecondName("AniaSecondName");

        System.out.println("Hello, I am " + myName.getName() + " " + myName.getSecondName());


    }
}
