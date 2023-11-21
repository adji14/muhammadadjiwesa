public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
       double sum = 0.0;
       for(double monthlyRevenue : revenue){
           sum+=monthlyRevenue;
       }

       double averageRevenue = sum / revenue.length;

       System.out.println(averageRevenue);
    }
}