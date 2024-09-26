public class Patients {

    //Creating the variables
    String namePatient = "";
    int agePatient = 0;
    double billToPay = 0;

    // Creating the constructor of the class Patients
    public Patients(String namePatient, int agePatient, double billToPay) {
        this.namePatient = namePatient;
        this.agePatient = agePatient;
        this.billToPay = billToPay;
    }

    // Creating the set and get methods for each value
    public void setName(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getName() {
        return namePatient;
    }

    public void setAge(int agePatient) {
        this.agePatient = agePatient;
    }

    public int getAge() {
        return agePatient;
    }

    public void setBillToPay(double billToPay) {
        this.billToPay = billToPay;
    }

    public double getBillToPay() {
        return billToPay;
    }


    public double discount() {
        if (agePatient > 60) {
            return billToPay - (billToPay * 0.1);
        } else {
            return billToPay;
        }
    }

}
