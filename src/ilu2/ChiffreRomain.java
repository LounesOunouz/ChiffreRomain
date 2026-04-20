package ilu2;

public class ChiffreRomain {
	private ChiffreRomain chiffre;
	

	public String toChiffresRomains(int nombre) {
		StringBuilder st=new StringBuilder();
		for (int i=0;i<nombre;i++) {
			st.append("I");
		}
		return st.toString();
	}


}
