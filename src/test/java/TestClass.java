public class TestClass {

    public static void main(String[] args) {
        Cloth cloth = new Cloth();

        cloth.setTypeOfCloth("t-shirt");
        cloth.setCompletionDate(2020);
        cloth.setSize(38);
        cloth.setCompany("BestClothes");

        cloth.clothDescription();
    }
}
