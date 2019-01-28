package com.testdome;

import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Path {
	private String path;

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String str) {
		this.path = str;
	}

	public Path cd(String newPath) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(this.path, "/");
		String newPathName = cleanPathName(newPath);
		boolean isAdded = false;
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			if (newPathName.equals(str)) {
				sb.append("/").append(str);
				isAdded = true;
				break;
			}
			sb.append("/").append(str);
		}
		if (!isAdded) {
			sb.append("/").append(newPathName);
		}
		this.setPath(sb.toString());
		return new Path(sb.toString());
	}

	public Path cd(String path, String pathx) {
		Stack<String> stack = new Stack<String>();

		path = this.path + "/" + path;

		while (path.length() > 0 && path.charAt(path.length() - 1) == '/') {
			path = path.substring(0, path.length() - 1);
		}

		int start = 0;
		for (int i = 1; i < path.length(); i++) {
			if (path.charAt(i) == '/') {
				stack.push(path.substring(start, i));
				start = i;
			} else if (i == path.length() - 1) {
				stack.push(path.substring(start));
			}
		}

		LinkedList<String> result = new LinkedList<String>();
		int back = 0;
		while (!stack.isEmpty()) {
			String top = stack.pop();

			if (top.equals("/.") || top.equals("/")) {
				// nothing
			} else if (top.equals("/..")) {
				back++;
			} else {
				if (back > 0) {
					back--;
				} else {
					result.push(top);
				}
			}
		}

		// if empty, return "/"
		if (result.isEmpty()) {
			return new Path("/");
		}

		StringBuilder sb = new StringBuilder();
		while (!result.isEmpty()) {
			String s = result.pop();
			sb.append(s);
		}

		return new Path(sb.toString());
	}

	private String cleanPathName(String newPath) {
		StringBuilder sb = new StringBuilder();
		int ctr = 0;
		while (ctr < newPath.length()) {
			char c = newPath.charAt(ctr);
			if (Character.isAlphabetic(c)) {
				sb.append(c);
			}
			ctr++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		System.out.println(path.cd("../x", "").getPath());
	}
}
