package main.java.sriram_task3;

public class Area_for_construction {
	public static double standardmaterials(String Standardmaterial,double area) {
		if(Standardmaterial=="Standardmaterial")
		return area*1200;
		return 0;
	}
	public static double abovestandardmaterial(String Standardmaterial,double area) {
		if(Standardmaterial=="abovestandardmaterial") {
			return area*1500;
		}
		return 0;
	}
	public static double highstandardmaterial(String Standardmaterial,double area) {
		if(Standardmaterial=="highstandardmaterial")
			return area*1800;
		return 0;

	}
	public static double standard_material_and_fullyautomated_home(String Standard_material,double area) {
		return area*2500;
	}


	}


