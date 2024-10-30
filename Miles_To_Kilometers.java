public class Miles_To_Kilometers {
    public static void main(String[] args) throws Exception {
        final double Kilometers_Per_Mile = 1.609;
        System.out.println(
            "Miles           Kilometers");
        for (int i = 1; i <= 10; i++){
            System.out.printf(
                "%1d%23f\n", i, (i*Kilometers_Per_Mile));
        }


    }
}
