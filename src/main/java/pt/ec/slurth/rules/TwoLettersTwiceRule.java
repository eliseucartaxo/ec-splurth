package pt.ec.slurth.rules;

import pt.ec.slurth.ChemicalElement;

/**
 * If the two letters in the symbol are the same, it must appear twice in the
 * element name. So Nn is valid for Xenon, but Xx and Oo are not.
 * 
 * @author ecartaxo
 *
 */
public class TwoLettersTwiceRule implements ChemicalSymbolRule {

	public boolean verify(ChemicalElement chemicalElement) {
		assert (chemicalElement != null && chemicalElement.getSymbol() != null
				&& chemicalElement.getElementName() != null);
		String elementName = chemicalElement.getElementName();
		char[] symbol = chemicalElement.getSymbol().toCharArray();

		boolean found = true;

		for (int i = 0; (i < symbol.length && found); i++) {
			found = elementName.indexOf(symbol[i]) > -1;
			if (found) {
				elementName = elementName.replaceFirst(String.valueOf(symbol[i]), "");
			}
		}

		return found;

	}

}
