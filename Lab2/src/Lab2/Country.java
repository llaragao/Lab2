package Lab2;

public class Country {

    private String name;
    Province[] provinces = new Province[10];

    public Country(){

        provinces[0]=new Province("British Colombia","Victoria",4);
        provinces[1]=new Province("Ontario","Torronto",8);
        provinces[2]=new Province("Quebec","Quebec City",4);
        provinces[3]=new Province("Nova Scotia","Halifax",4);
        provinces[4]=new Province("New Brunswick","Frederiction",4);
        provinces[5]=new Province("Manitoba","Winnipeg",4);
        provinces[6]=new Province("Prince Edward Island","Charlottetown",4);
        provinces[7]=new Province("Saskatchewan","Regina",4);
        provinces[8]=new Province("Alberta","Edmonton",4);
        provinces[9]=new Province("Newfoundland an Labrador","St. John's",4);

    }
    public String getFirstProvinceName(){
        return provinces[0].getName();


    }
    public void displayAllProvinces(){

        for (Province p: provinces){
            System.out.println(p.getDetails());
        }
    }
    public int howManyHaveThisPopulation(int min, int max){
        int count = 0;

        for(Province p: provinces){
            if(p.getPopulationInMillions() >= min && p.getPopulationInMillions() <= max){
                count++;
            }
        }
        return count;
    }
}