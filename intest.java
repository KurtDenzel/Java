package Insurance;

public class intest {
private int CurrentYear;
private int BirthYear;
private int pamount;

    public intest(int BirthYear, int CurrentYear)
    {
    this.BirthYear = BirthYear;
    this.CurrentYear = CurrentYear;
    }

    public int getcurrentyr() {
    return CurrentYear;
    }

    public void setcurrentyr(int currentYear) {
    CurrentYear = currentYear;
    }

    public int getpamount() {
    return pamount;
    }
    //Operation    
    public void calcpamount() {
    pamount = (((CurrentYear - BirthYear) / 10) + 15) * 20;
    }

    public int getbirthyr() {
    return BirthYear;
    }

    public void setbirthyr(int birthClient) {
    BirthYear = birthClient;
    }
}