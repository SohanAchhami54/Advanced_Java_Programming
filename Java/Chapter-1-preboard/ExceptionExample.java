    public class ExceptionExample{
        static void divide(int a,int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("cannot be divide by zero");//manually throw
            }
            System.out.println("Result:"+ (a/b));
        }
        public static void main(String[] args) {
        try {
            divide (10,0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception:"+e.getMessage());
        } finally {
            System.out.println("This runs whether the error occur or not");
        }  
        }
    }