package model.exceptions;

public class DomainExpection extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainExpection(String msg) {
		super(msg);
	}
}
