package com.vamsi.hackerrank.practise;

public class SpreadSheetNotationConversion {

    public static void main(String[] args) {
	System.out.println(getCellName(1404));
    }

    private static String getCellName(long n) {
	long rowNumber = (n % 702 == 0) ? n / 702 : n / 702 + 1;
	StringBuilder cell = new StringBuilder();
	;
	for (long i = 1; i <= rowNumber; i++) {
	    n = n % 702;
	    if (i == rowNumber) {
		cell.append((n == 0) ? "ZZ" : "");
		while (n > 0) {
		    long rem = n % 26;
		    if (rem == 0) {
			cell.append("Z");
			n = (n / 26) - 1;
		    }
		    else {
			cell.append((char) ((rem - 1) + 'A'));
			n = n / 26;
		    }
		}
	    }
	}
	return rowNumber + cell.reverse().toString();

    }

}
