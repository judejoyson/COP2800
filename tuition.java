public class tuition {
    public static void main(String[] args) throws Exception {
        double TotalCost = 0;
        double tuition = 10000;
        final double YearlyIncrease = .05;
        double TenYearsTuition = 0;
        for(int year = 1; year<=14;++year){
            tuition += (tuition*YearlyIncrease);
            if(year>10)
                TotalCost += tuition;
            if(year ==10)
                TenYearsTuition = tuition;

        }
            System.out.println("The tuition in tenth year is: "+ TenYearsTuition);
            System.out.println("The tuition cost for four years after ten years is: "+ TotalCost);






    }
}
