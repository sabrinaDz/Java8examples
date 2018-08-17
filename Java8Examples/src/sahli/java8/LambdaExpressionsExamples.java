package sahli.java8;

public class LambdaExpressionsExamples {

	
	

	
	
public static void main(String[]args){
	MathOperation addition=(int a,int b)->a+b;
	MathOperation subtraction=(int a,int b)->a-b;
	MathOperation multiplication=(int a,int b)->{return a*b;};
	MathOperation division=( a, b)->a/b;
	
	LambdaExpressionsExamples lambdaExpressionExample=new LambdaExpressionsExamples();
	System.out.println("5+6= "+ lambdaExpressionExample.operate(5,6,addition));
	System.out.println("7-3= " +lambdaExpressionExample.operate(7,3,subtraction));
	System.out.println("2*8= "+lambdaExpressionExample.operate(2,8,multiplication));
	System.out.println("20/4= "+lambdaExpressionExample.operate(20,4,division));
	}




interface MathOperation {
	
	int opperation(int i,int j);
}


public int operate(int i,int j,MathOperation mathOperation){
	
	return mathOperation.opperation(i, j);
}

}
