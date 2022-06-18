package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res = (byte) (res * 2);
		}
		System.out.println("Byte=" + res);
		return (byte) (res - 1);
	}

	public static byte getMinByte() {
		
		return (byte) (getMaxByte()+1);
	}

	public static int getLengthByte() {
		
		return getLength(getMaxByte());
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char) (res * 2);

		}
		System.out.println("char=" + res);
		return (char) (res - 1);
	}

	public static char getMinChar() {

		return (char) (getMaxChar() + 1);
	}

	public static int getLengthChar() {
	
		return getLength(getMaxChar());
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		System.out.println("short=" +  res);
		return (short) (res - 1);
	}

	public static short getMinShort() {
	
		return (short) (getMaxShort()+1);
	}

	public static int getLengthShort() {
		// TODO
		
		return getLength(getMaxShort());
	}

	public static int getMaxInt() {
		int res = 1;
		while (res > 0) {
			res = res * 2;
		}
		System.out.println("int = "+res);
		return res - 1;
	}

	public static int getMinInt() {
		
		return getMaxInt()+1;
	}

	public static int getLengthInt() {
	
		return getLength(getMaxInt());
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		System.out.println("long="+res);
		return res - 1;
	}

	public static long getMinLong() {
		
		return getMaxLong()+1;
	}

	public static int getLengthLong() {
		int res=getLength(getMaxLong());
		//System.out.println("longLength="+res);
		return res;
	}

	/**
	 * 
	 * @param x you should understand what x is
	 * @return length of any type in accordance to the x length is number of bytes
	 *         for any type
	 */
	private static int getLength(long x) {
		
		int  count=0;
		while(x>=128) {
			x=x/128;
			count++;
			System.out.println(count);
		}

		return count;
	}

}