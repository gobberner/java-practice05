package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("참새"+getName()+"는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("참새"+getName()+"는 날지 않습니다.");		
	}

	@Override
	public String toString() {
		return "참새에 이름은 "+name+"입니다.";
	}
	
	

}
