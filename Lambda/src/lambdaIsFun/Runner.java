package lambdaIsFun;

		public class Runner {

		    interface FuncInterface {
		        int operation(int a, int b);
		    }

		    private int operate(int a, int b, FuncInterface funcObj) {
		        return funcObj.operation(a, b);
		    }

		    public static void main(String[] args) {
		        FuncInterface add = (int x, int y) -> x + y;

		        Runner lambda = new Runner();
		        System.out.println(lambda.operate(3, 5, add));
		    }
		}


