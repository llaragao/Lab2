package Lab2;

public class Province {
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final int DEFAULT_POPULATION_MILLIONS = 4;
    private String name;                 //
    private String capital;              // they 3 are INSTANCE VARIABLE
    private int populationInMillions;    //

    //------------------------------------------------------------------------------------------------------------------
    //THE CONSTRUCTOR TAKES ALL THREE PARAMETERS AND ASSIGN THEM IF THE FOLLOW THE RULES
    //SO, WE HAVE TO DO METHODS TO CHECK IF THE VARIABLE CAN BE ASSIGN

    public Province(String name, String capital, int populationInMillions){

        if(isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(populationInMillions)){
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;

        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    private boolean isValidProvince(String province) {

        String[] provinces  = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta","Newfoundland an Labrador"};

        int i = 0;
        while (i < provinces.length) {
            if (province.equals(provinces[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    private boolean isValidCapitalCity(String capital){
        String [] capitalNames = {"Toronto", "Quebec City", "Halifax", "Frederiction", "Winnipeg","Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};

        for (int i = 0; i < capitalNames.length; i++){
            if(capital.equals(capitalNames[i])){
                return true;
            }
        }
        return false;
    }
    //------------------------------------------------------------------------------------------------------------------
    private boolean isValidPopulation(int population){

        if(population >= 4 && population <=38){
            return true;
        }
        return false;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters and Setters
    public String getDetails(){

        return String.format("The capital of " +this.name +"( pop." +this.populationInMillions+ ")million is " +this.capital);
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }

}

