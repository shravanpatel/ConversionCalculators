package model;

/**
 * @author Shravan - spatel10
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class BinaryConverter {
	private String asciiText;
	private String binary;
	private String hexadecimal;
	private String decimal;

	public BinaryConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BinaryConverter(String binaryCode) {
		super();
		this.binary = binaryCode;
		setAsciiText(binaryCode);
		setHexadecimal(binaryCode);
		setDecimal(binaryCode);

	}
	
	public String getAsciiText() {
		return asciiText;
	}

	public void setAsciiText(String binaryCode) {
		this.asciiText = binaryToText(binaryCode);
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String binaryCode) {
		this.binary = binaryCode;
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String binaryCode) {
		this.hexadecimal = binaryToHexadecimal(binaryCode);
	}

	public String getDecimal() {
		return decimal;
	}

	public void setDecimal(String binaryCode) {
		this.decimal = binaryToDecimal(binaryCode);
	}

	@Override
	public String toString() {
		return "BinaryConverter [asciiText=" + asciiText + ", binary=" + binary + ", hexadecimal=" + hexadecimal
				+ ", decimal=" + decimal + "]";
	}

	public static String binaryToText(String binaryCode) {
	      StringBuilder text = new StringBuilder ();
	      for(int i = 0; i < binaryCode.length(); i += 9) {
	          String temp = binaryCode.substring (i, i+8);
	          int num = Integer.parseInt(temp, 2);
	          char letter = (char)num;
	          text.append(letter);
	      }
	      return text.toString();
	}
	
	public String binaryToHexadecimal(String binaryCode) {
		StringBuilder hexadecimal = new StringBuilder ();
		for(int i = 0; i < binaryCode.length(); i += 9) {
			String temp = binaryCode.substring (i, i+8);
			int num = Integer.parseInt(temp, 2);
			String hex = Integer.toString(num, 16);
			hexadecimal.append(hex);
			hexadecimal.append(' ');
		}  
		return hexadecimal.toString();
	}
	
	public String binaryToDecimal(String binaryCode) {
		StringBuilder decimal = new StringBuilder ();
		for(int i = 0; i < binaryCode.length(); i += 9) {
			String temp = binaryCode.substring (i, i+8);
			int num = Integer.parseInt(temp, 2);
			decimal.append(num);
			decimal.append(' ');
		}  
		return decimal.toString();
	}
}
