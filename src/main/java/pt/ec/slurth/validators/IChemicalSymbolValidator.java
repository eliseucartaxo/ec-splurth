package pt.ec.slurth.validators;

import java.util.List;

import pt.ec.slurth.ChemicalElement;
import pt.ec.slurth.rules.ChemicalSymbolRule;

/**
 * 
 * @author ecartaxo
 *
 */
public interface IChemicalSymbolValidator {
	public boolean isValid(ChemicalElement chElement);
}
