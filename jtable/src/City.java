
public class City {
private int id;
private String name;
private String conuntrycode;
private String district;
private String population;

    public City(int id, String name, String conuntrycode, String district, String population) {
        this.id = id;
        this.name = name;
        this.conuntrycode = conuntrycode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConuntrycode() {
        return conuntrycode;
    }

    public void setConuntrycode(String conuntrycode) {
        this.conuntrycode = conuntrycode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    

}
