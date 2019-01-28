package com.testdome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Folders {
	public static Collection<String> folderNames(String xml, char startingLetter)
			throws Exception {
		List<String> list = new ArrayList<String>();
		getFolderNames(list, xml, startingLetter, 0);
		return list;
	}
	
	private static void getFolderNames(List<String> list, String xml, char startingLetter, int index) {
		if (xml == null) 
			return;
		
		int start = xml.indexOf("folder name=\"", index);
		if (start < 0) 
			return;
		int end = xml.indexOf("\"", start + 13);
		String folder = xml.substring(start + 13, end);
		boolean temp = folder.startsWith(String.valueOf(startingLetter));
		if (temp) {
			list.add(folder);
		}
		getFolderNames(list, xml, startingLetter, end);
	}

	public static void main(String[] args) throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <folder name=\"c\"> 	<folder name=\"program files\"> 		<folder name=\"one\"> 			<folder name=\"two\"> 				<folder name=\"pthree\"/> 				<folder name=\"p1111\"/> 				<folder name=\"p2222\"> 					<folder name=\"p3333\"/> 				</folder> 			</folder> 		</folder> 		<folder name=\"uninstall information\" /> 	</folder> 	<folder name=\"users\" /> </folder>";
		System.out.println("" + xml);
		Collection<String> names = folderNames(xml, 'p');
		for (String name : names)
			System.out.println(name);
	}
}