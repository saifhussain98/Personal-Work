package OperatorsRFun;

public class OperatorsRunner {

	public static void main(String[] args) {
	        

		OperatorsMethods numsOne = new OperatorsMethods(20.5, 10.5);

		OperatorsMethods numsTwo = new OperatorsMethods(10, 5);

	        

	        System.out.println(numsOne.addTwoNums());

	        System.out.println(numsTwo.addTwoNums());

	        System.out.println("=============================================================");

	        System.out.println(numsOne.subTwoNums());

	        System.out.println(numsTwo.subTwoNums());

	        System.out.println("=============================================================");

	        System.out.println(numsOne.divTwoNums());

	        System.out.println(numsTwo.divTwoNums());

	        System.out.println("=============================================================");

	        System.out.println(numsOne.multiTwoNums());

	        System.out.println(numsTwo.multiTwoNums());
	        

	    }
	}
