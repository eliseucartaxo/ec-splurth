package pt.ec.slurth.rules;

import java.util.regex.Pattern;

import pt.ec.slurth.ChemicalElement;

/**
 * The two letters must appear in order in the element name. So Vr is valid for
 * Silver, but Rv is not. To be clear, both Ma and Am are valid for Magnesium,
 * because there is both an a that appears after an m, and an m that appears
 * after an a.
 * 
 * @author ecartaxo
 *
 */
public class LettersOrderRule implements ChemicalSymbolRule {

	public boolean verify(ChemicalElement chemicalElement) {
		assert (chemicalElement != null && chemicalElement.getSymbol() != null
				&& chemicalElement.getElementName() != null);
		String elementName = chemicalElement.getElementName();

		Pattern pattern = Pattern.compile(createRegex(chemicalElement), Pattern.CASE_INSENSITIVE);

		return pattern.matcher(elementName).find();
	}

	// TODO more performance and elegant solution
	private String createRegex(ChemicalElement chemicalElement) {
		char[] symbol = chemicalElement.getSymbol().toCharArray();
		StringBuilder result = new StringBuilder("*");

		for (int i = 0; i < symbol.length; i++) {
			result.append(symbol[i]);
			result.append("*");
		}
		return result.toString();
	}

}
