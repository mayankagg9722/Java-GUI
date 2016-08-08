package mayank;

public class extensionclass {
	
	public static void main(String[] args) {
	StringBuffer str=new StringBuffer("mayank");
	int i;
	for(i=0;i<str.length();i++){
		  char ch=(char)((int)(str.charAt(i))-32);
	str.setCharAt(i,ch);
	}
	}
}