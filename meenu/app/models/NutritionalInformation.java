/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meenu.models;

/**
 *
 * @author Steffen
 */
public class NutritionalInformation {

    public float carbohydrates;
    public float calories;
    public float proteins;
    public float saturatedFat;
    public float unsaturatedFat;
    public float transFat;

    public void setCarbs(float carbohydrates){
        this.carbohydrates = carbohydrates;
    }
     public void setKcal(float calories){
        this.calories = calories;
    }
     public void setProteins(float proteins){
         this.proteins = proteins;
     }
     public void setSaturatedFat(float saturatedFat){
         this.saturatedFat = saturatedFat;
     }
      public void setunSaturatedFat(float unsaturatedFat){
         this.unsaturatedFat = unsaturatedFat;
     }
       public void setTransFat(float TransFat){
         this.transFat = transFat;
     }
       public String getNutritionalList(){
           return "not finished";
       }
}
