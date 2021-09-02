package demo;

public class exceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception {
//		try {
			System.out.println("hello world");
			throw new ArithmeticException("not valid operation");
//			int i = 1/0;
//			System.out.println("completed");
//		} catch (Exception exp) {
//			System.out.println("I am in catch block");
//			System.out.println("message is: "+exp.getMessage());
//			System.out.println("cause is: "+exp.getCause());
//		} finally {
//			System.out.println("in final blco");
//		}
	}

}
