/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcities;
public class City {
   private int id;
   private String Name;
   private String CountryCode;
   private String District;
   private int Population;

    public City(int id, String Name, String CountryCode, String Distinct, int Population) {
        this.id= id;
        this.Name = Name;
        this.CountryCode = CountryCode;
        this.District = Distinct;
        this.Population = Population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String Distinct) {
        this.District = District;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int Population) {
        this.Population = Population;
    }

   
    
}
