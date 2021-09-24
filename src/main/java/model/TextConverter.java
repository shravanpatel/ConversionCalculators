package model;

/**
 * @author Shravan - spatel10 
 * CIS175 - Fall 2021 
 * Sep 23, 2021
 */
public class TextConverter {
	private String asciiText;
	private String binary;
	private String hexadecimal;
	private String decimal;

	public TextConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextConverter(String asciiText) {
		super();
		this.asciiText = asciiText;
		setBinary(asciiText);
		setHexadecimal(asciiText);
		setDecimal(asciiText);

	}
	
	public String getAsciiText() {
		return asciiText;
	}

	public void setAsciiText(String asciiText) {
		this.asciiText = asciiText;
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String asciiText) {
		this.binary = textToBinary(asciiText);
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String asciiText) {
		this.hexadecimal = textToHexadecimal(asciiText);
	}

	public String getDecimal() {
		return decimal;
	}

	public void setDecimal(String asciiText) {
		this.decimal = textToDecimal(asciiText);
	}

	@Override
	public String toString() {
		return "TextConverter [asciiText=" + asciiText + ", binary=" + binary + ", hexadecimal=" + hexadecimal
				+ ", decimal=" + decimal + "]";
	}

	public String textToBinary(String text) {
		StringBuilder binary = new StringBuilder();
		byte[] bytes = text.getBytes();
		for (byte b : bytes) {
			int value = b;
			for (int i = 0; i < 8; i++) {
				binary.append((value & 128) == 0 ? 0 : 1);
				value <<= 1;
			}
			binary.append(' ');
		}
		return binary.toString();
	}
	
	public String textToHexadecimal(String text) {
		StringBuilder hexadecimal = new StringBuilder();
	    char[] charArray = text.toCharArray();
	    for (char c : charArray) {
	            hexadecimal.append(Integer.toHexString(c));
	            hexadecimal.append(' ');
	    }  
	    return hexadecimal.toString();
	}
	
	public String textToDecimal(String text) {
		StringBuilder decimal = new StringBuilder(); 
		char[] charArray = text.toCharArray(); 
	    for(char c : charArray) { 
	        decimal.append((byte) c); 
	        decimal.append(' ');
	    }
	    return decimal.toString();
	}
}
