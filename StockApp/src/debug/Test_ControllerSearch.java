package debug;
import stocks.Stock;
import utils.Controller;


public class Test_ControllerSearch {

	public static void main(String[] args) {
		long startTime, endTime, runTime;
		
		startTime = System.currentTimeMillis();
		Stock stock = Controller.getStock("able");
		endTime = System.currentTimeMillis();
		
		runTime = endTime - startTime;
		
		System.out.printf("Score: %s\n", stock.getScore().doubleValue());
		System.out.printf("RunTime: %s seconds\n", (runTime / 1000));
	}
}