package pt.ec.slurth.rules;

import pt.ec.slurth.ChemicalElement;

/**
 * All chemical symbols must be exactly two letters, so B is not a valid symbol
 * for Boron.
 * 
 * @author ecartaxo
 *
 */
public class TwoLettersRule implements ChemicalSymbolRule {

	public boolean verify(ChemicalElement chemicalElement) {
		String symbol = chemicalElement.getSymbol();

		if (symbol == null || symbol.length() != 2) {
			return false;
		}

		return Character.isLetter(symbol.charAt(0)) && Character.isLetter(symbol.charAt(1));
	}

}
