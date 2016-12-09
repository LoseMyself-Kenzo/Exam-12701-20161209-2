import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	

		System.out.print("请输入工资:");
		int gz = sc.nextInt();
		cal(gz);
	}
	
	//计算税
	public static void cal(int gz){
		double sum = 0;
		if(gz < 1500){
			sum = gz*0.03;
		}else if(gz<4500){
			sum = 1500*0.03 + (gz-1500)*0.1;
		}else if(gz<9000){
			sum = 1500*0.03 + 3000*0.1 + (gz-4500)*0.2;
		}else if(gz<35000){
			sum = 1500*0.03 + 3000*0.1 + 4500*0.2 + (gz-9000)*0.25;
		}else if(gz<55000){
			sum = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + (gz-35000)*0.3;
		}else if(gz<80000){
			sum = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + (gz -55000)*0.35;
		}else{
			sum = 1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35 + (gz-80000)*0.45;
		}
		System.out.println("所需要缴纳的税费为:"+sum);
	}
}
