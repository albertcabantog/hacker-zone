package com.testdome;


public class Permissions {
    public static int permStringToInt(String permString) {
    	StringBuilder sb = new StringBuilder();
    	converter(permString, sb, 0, 1, 0);
        return Integer.valueOf(sb.toString());
    }
    
    private static void converter(String str, StringBuilder sb, int total, int counter, int index) {
    	if (index >= str.length()) {
    		return;
    	}
    	char c = str.charAt(index);
    	int val = 0;
    	switch (c) {
		case 'r':
			val = 4;
			break;
		case 'w':
			val = 2;
			break;
		case 'x':
			val = 1;
			break;
		case '-':
		default:
			val = 0;
			break;
		}
    	total += val;
    	if (counter % 3 == 0) {
    		sb.append(total);
    		total = 0;
    	}
    	
    	converter(str, sb, total, ++counter, ++index);
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(Permissions.permStringToInt("rwxr-x-w-"));
    }
}
