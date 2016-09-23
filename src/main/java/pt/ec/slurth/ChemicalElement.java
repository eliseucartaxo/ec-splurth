package pt.ec.slurth;

/**
 * Slurth chemical element.
 * 
 * @author ecartaxo
 *
 */
public class ChemicalElement {
	private String elementName;
	private String symbol;

	public ChemicalElement(String elementName, String symbol) {
		this.elementName = elementName;
		this.symbol = symbol;
	}

	public String getElementName() {
		return elementName;
	}

	public String getSymbol() {
		return symbol;
	}
}
