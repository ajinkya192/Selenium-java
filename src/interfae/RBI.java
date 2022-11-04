package interfae;

public class RBI extends ICICI implements SBI,HDFC,Kotak {

	public static void main(String[] args) {
		RBI ac = new RBI();
		ac.cheque();
	}

	@Override
	public void rd() {
		System.out.println("ah");
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fd() {
		// TODO Auto-generated method stub
		
	}

}
