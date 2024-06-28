//Encapsulation Demo with this keyword, getter and setter methods.

class Encapsulation{
    private String country = "USA";
    private String nationalAnthem = "English Song";
    private String touristSpot = "Statue of Liberty";

    public void setDetails(String a, String b, String c){
        this.country = a;
        this.nationalAnthem = b;
        this.touristSpot = c;
    }

    public String GetCountry(){
        return country;
    }

    public String GetNationalAnthem(){
        return nationalAnthem;
    }

    public String GetTouristSpot(){
        return touristSpot;
    }

    public static void main (String[] args){
        Encapsulation obj = new Encapsulation();
        System.out.println("Before this keyword: Country: " +obj.country +".\nNational Anthem: " +obj.nationalAnthem +".\nTourist spot: " +obj.touristSpot);
        obj.setDetails("India", "Vande Matharam", "India Gate");

        System.out.println("After this keyword: The country is " +obj.country +". \nThe National Anthem is " +obj.nationalAnthem +". \nTourist spot is " +obj.touristSpot);
    }
}
