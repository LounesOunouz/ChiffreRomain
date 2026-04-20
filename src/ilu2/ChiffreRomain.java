package ilu2;

public class ChiffreRomain {
	private ChiffreRomain chiffre;
	private static final String[] SYMBOLES = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public String toChiffresRomains(int nombre) {
		if (nombre <= 0 || nombre > 3999) {
			throw new IllegalArgumentException();
		}
		if (nombre == 4) {
			return SYMBOLES[11];
		}
		StringBuilder st = new StringBuilder();
		if (nombre >= 5) {
			st.append("V");
			nombre = nombre - 5;
		}
//		if (nombre <= 3) {
		for (int i = 0; i < nombre; i++) {
			st.append(SYMBOLES[12]);
		}
//		}
//		else if ()
		return st.toString();
	}

}
