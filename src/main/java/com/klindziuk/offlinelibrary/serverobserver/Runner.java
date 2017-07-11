package com.klindziuk.offlinelibrary.serverobserver;

public class Runner {
	private static final String XMLFILEPATH_GET = "C:/Users/Pavel_Klindziuk/Program_Files/eclipse/workspace/offlinelibrary/requests/get";
	private static final String XMLFILEPATH_FINDBY = "C:/Users/Pavel_Klindziuk/Program_Files/eclipse/workspace/offlinelibrary/requests/findby";
	private static final String XMLFILEPATH_SIGNIN = "C:/Users/Pavel_Klindziuk/Program_Files/eclipse/workspace/offlinelibrary/requests/signin";
	private static final String XMLFILEPATH_UPDATE = "C:/Users/Pavel_Klindziuk/Program_Files/eclipse/workspace/offlinelibrary/requests/updateprofile";

	public static void main(String[] args) {
		new Thread(new XmlFileReader(XMLFILEPATH_GET)).start();
		new Thread(new XmlFileReader(XMLFILEPATH_FINDBY)).start();
		new Thread(new XmlFileReader(XMLFILEPATH_SIGNIN)).start();
		new Thread(new XmlFileReader(XMLFILEPATH_UPDATE)).start();
	}
}
