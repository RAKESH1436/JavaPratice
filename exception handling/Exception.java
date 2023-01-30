public class Exception {
    public static void any() {
        test();

    }

    public static void test() {
        String ptr = "hii";

        try {
            if ("sanjay".equals(ptr))
                System.out.println("same");

            else
                System.out.println("not same");

        } catch (NullPointerException e) {
            System.out.println(e);

        }

    }

    public static void main(String[] args) {
      

            //Logical Operators
            
           
            
            int p = 15, q = 10, r = 5;
            
            // && operator
            
            System.out.println((p > q) && (p > r)); //t //t
            System.out.println((p > q) && (p < r)); //f //f
            
            // || operator
            
            System.out.println((r < q) || (p < q)); //f
            
            System.out.println((p > q) || (q> r));  //t
            
            // ! operator
            
            System.out.println(!(p == q)); //t
            
            System.out.println(!(q > r));  //f
            
            
       any();

    }
}