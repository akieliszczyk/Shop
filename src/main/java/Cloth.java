public class Cloth {

    private String typeOfCloth;
    private Integer completionDate;
    private Integer size;
    private String company;

    public Cloth(){

    }

    public void clothDescription() {
        System.out.println("Cloth description: type: " + typeOfCloth + ", completion date: " + completionDate + ", size: " + size + ", company " + company);
    }


    public String getTypeOfCloth() {
        return typeOfCloth;
    }

    public void setTypeOfCloth(String typeOfCloth) {
        this.typeOfCloth = typeOfCloth;
    }

    public Integer getDate() {
        return completionDate;
    }

    public void setCompletionDate(Integer completionDate) {
        this.completionDate = completionDate;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
