package week1.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Chrome {

	public float versionType() {
		return 91.0f;
			}
	
	public	void developerType(String developerType) {
		System.out.println("Developer Type :"+developerType);
	}
	
	private boolean isBetatype()
	{
		return false;
		
	}
	
	int releaseYeartype () {
		return 2008;
		
	}
	
	protected void shortcutKeytype(char shortcutKeytype) {
		System.out.println("Shortcut Key Type :"+shortcutKeytype);
		
	}
	
	
	public static void main(String[] args) {
		// object created for class
	
		Chrome co= new Chrome();
		
		float versionType = co.versionType();
		System.out.println("Version Type :"+versionType);
		
		co.developerType("Google");
		
		boolean isBetatype = co.isBetatype();
		System.out.println("Beta Type :"+isBetatype);
		
		int releaseYeartype = co.releaseYeartype();
		System.out.println("Release Year Type :"+releaseYeartype);
		
		co.shortcutKeytype('C');		
				
	
	
	}

}
