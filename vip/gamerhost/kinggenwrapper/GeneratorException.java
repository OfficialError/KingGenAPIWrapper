/**
 * This is a java file created by Error.
 * @author Error.
 * Created on 28.05.2021 (19:51:42)
 */
package vip.gamerhost.kinggenwrapper;

public class GeneratorException extends Exception {
	
	public GeneratorException(String reason) {
		super(reason);
	}
	
	public GeneratorException(String reason, Throwable other) {
		super(reason, other);
	}

	private static final long serialVersionUID = 4887097293835073965L;
	
	
}