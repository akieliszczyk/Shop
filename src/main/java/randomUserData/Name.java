package randomUserData;

public class Name {

    private String name;
    private String secondName;
    private final String finalName;

    Name (String finalName) {
        this.finalName = finalName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFinalName() {
        return finalName;
    }

//    public void setFinalName(String finalName) {
//        this.finalName = finalName;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
