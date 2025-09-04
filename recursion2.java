public class recursion2 {
    // given a 2 X n floor and 2 X n tile find the total number of ways how to store tile in the floor 
    public static int totalways(int n){
        // base case 
        if (n == 0 || n == 1){
            return 1;
        }
        // recusrive work
        int fnm1 = totalways(n-1); // for vertical 
        // for horizontal 
        int fnm2 = totalways(n-2);
         // find total ways 
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(totalways(3));
    }
}
