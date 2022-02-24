package ist242;

import java.util.Date;

public class Fish extends Animal {

    private String FishName;
    private String FishType;
    private boolean FishAdopted;
    private Date AdoptionDate;

    @Override
    public void legs() {
        System.out.println("This animal have no legs");
    }

    public Fish() {
    }
    public void setFishName(String fName){
        FishName = fName;
    }

    public String getFishName() {
        return FishName;

    }


    public void setFishAdopted(boolean fAdopted){
        FishAdopted = fAdopted;
    }

    public boolean getFishAdopted() {
        return FishAdopted;

    }
    public void setFishAdopDate() {
        AdoptionDate = new Date();
    }

    public Date getFishAdopDate() {
        return AdoptionDate;
    }
}

