package pt.ec.slurth.rules;

import java.util.Objects;
import java.util.function.Predicate;

import pt.ec.slurth.ChemicalElement;

/**
 * Both letters in the symbol must appear in the element name, but the first
 * letter of the element name does not necessarily need to appear in the symbol.
 * So Hg is not valid for Mercury, but Cy is.
 * 
 * @author ecartaxo
 *
 */
public class BothLettersExistsRule implements ChemicalSymbolRule {

	public boolean verify(ChemicalElement chemicalElement) {
		Objects.requireNonNull(chemicalElement, "Chemical Element is null");
		Objects.requireNonNull(chemicalElement.getElementName(), "Chemical Element -Element Name is null");
		Objects.requireNonNull(chemicalElement.getSymbol(), "Chemical Element -Symbol is null");

		String elementName = chemicalElement.getElementName();
		char[] symbol = chemicalElement.getSymbol().toCharArray();

		boolean found = true;

		for (int i = 0; (i < symbol.length && found); i++) {
			found = elementName.indexOf(symbol[i]) > -1;
		}

		return found;

	}

}
