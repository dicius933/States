package states.model;

/**
 * Created by yeshua on 12/3/2017.
 */
public class State {

    private String name;
    private int population;
    private String capitalCity;
    private String language;



    public State(String stateName, int population, String capitalCity, String language) {
        this.name = stateName;
        this.population = population;
        this.capitalCity = capitalCity;
        this.language = language;
    }


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getLanguage() {
        return language;
    }
}
