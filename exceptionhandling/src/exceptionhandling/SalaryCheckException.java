package exceptionhandling;

public class SalaryCheckException extends Exception {
	public String emsg;

	public String getEmsg() {
		return emsg;
	}

	public void setEmsg(String emsg) {
		this.emsg = emsg;
	}

	public SalaryCheckException(String emsg) {
		super();
		this.emsg = emsg;
	}
	

}
