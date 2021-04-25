package sixthpackage;

public class Year {

    private Months months;

    public Year(Months months){
        this.months = months;
    }

    public void seasons(){
        switch(months){
            case December:
            case January:
            case February:
                System.out.println("it's winter");
                break;
            case March:
            case April:
            case May:
                System.out.println("It's Spring");
                break;
            case June:
            case July:
            case August:
                System.out.println("It's Summer");
                break;
            default:
                System.out.println("It's fall");
                break;
        }
    }

    public static void main(String[] args) {
        Year yr = new Year(Months.January);
        yr.seasons();

        Year yr1 = new Year(Months.September);
        yr1.seasons();

    }


}
