package model;

/**
 * @author Shravan - spatel10 
 * CIS175 - Fall 2021 
 * Sep 23, 2021
 */
public class HexadecimalConverter {
	private String asciiText;
	private String binary;
	private String hexadecimal;
	private String decimal;

	public HexadecimalConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HexadecimalConverter(String hexadecimalCode) {
		super();
		this.hexadecimal = hexadecimalCode;
		setAsciiText(hexadecimalCode);
		setBinary(hexadecimalCode);
		setDecimal(hexadecimalCode);

	}

	public String getAsciiText() {
		return asciiText;
	}

	public void setAsciiText(String hexadecimalCode) {
		this.asciiText = hexadecimalToText(hexadecimalCode);
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String hexadecimalCode) {
		this.binary = hexToBinary(hexadecimalCode);
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}

	public String getDecimal() {
		return decimal;
	}

	public void setDecimal(String hexadecimalCode) {
		this.decimal = hexadecimalToDecimal(hexadecimalCode);
	}

	@Override
	public String toString() {
		return "HexadecimalConverter [asciiText=" + asciiText + ", binary=" + binary + ", hexadecimal=" + hexadecimal
				+ ", decimal=" + decimal + "]";
	}

	public String hexadecimalToText(String hexadecimal) {
		hexadecimal = hexadecimal.replaceAll("\\s", "");
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < hexadecimal.length(); i += 2) {
			String str = hexadecimal.substring(i, i + 2);
			text.append((char) Integer.parseInt(str, 16));
		}
		return text.toString();
	}

	public String hexToBinary(String hexadecimal) {
		hexadecimal = hexadecimal.replaceAll("\\s", "");
		StringBuilder binary = new StringBuilder();
		for (int i = 0; i < hexadecimal.length(); i += 2) {
			String str = hexadecimal.substring(i, i + 2);
			int decimal = Integer.parseInt(str, 16);
			String binaryCode = Integer.toBinaryString(decimal);
			binary.append(String.format("%08d", Integer.parseInt(binaryCode)));
			binary.append(' ');
		}
		return binary.toString();
	}

	public String hexadecimalToDecimal(String hexadecimal) {
		hexadecimal = hexadecimal.replaceAll("\\s", "");
		StringBuilder decimal = new StringBuilder();
		for (int i = 0; i < hexadecimal.length(); i += 2) {
			String str = hexadecimal.substring(i, i + 2);
			int num = Integer.parseInt(str, 16);
			decimal.append(num);
			decimal.append(' ');
		}
		return decimal.toString();
	}
}
