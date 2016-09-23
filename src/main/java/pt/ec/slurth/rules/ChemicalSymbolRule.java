package pt.ec.slurth.rules;

import pt.ec.slurth.ChemicalElement;

/**
 * 
 * @author ecartaxo
 *
 */
public interface ChemicalSymbolRule {
	public boolean verify(ChemicalElement chemicalElement);
}
