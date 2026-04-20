package ilu2;

public class ChiffreRomain {
	private ChiffreRomain chiffre;
	

	public String toChiffresRomains(int nombre) {
		if (nombre<=0|| nombre>3999) {
			throw new IllegalArgumentException();
		}
		StringBuilder st=new StringBuilder();
		for (int i=0;i<nombre;i++) {
			st.append("I");
		}
		return st.toString();
	}


}
