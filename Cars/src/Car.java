public class Car {

    private String make;
    private String model;
    private Integer year;

    public Car(){
        make = "Chevrolet";
        model = "Camaro";
        year = 1995;
    }

    public Car(String make, String model, Integer year) {
    //this is the car classes constructor
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public Integer getYear(){
        return this.year;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
       return this.model;
    }

    public void setMake(String newMake) {
        if (newMake != null)
            this.make = newMake;
    }

    public void setModel(String newModel) {
        if (newModel != null) {
            this.model = newModel;
        }
    }

    public void setYear(Integer newYear) {
        if (newYear != null) {
            if (newYear > 0 && newYear < Integer.MAX_VALUE)
                this.year = newYear;
        }
    }

    public String toString() {
        return "That sweet ride is a " + year + " " + make + " " + model;
    }

}
