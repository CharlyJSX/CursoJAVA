public class Example13 {
 
    public static void main(String args[]) {

        boolean x = false;
        boolean y = true;
    

        System.out.println((x || y) && !(x && y));
        System.out.println((x && !y) || (!x && y));
        System.out.println((x || y) && (!x ||!y));
        
        }

       

}

