package Models;

import java.util.ArrayList;

public class Grammar {
	private AxiomaticInitial axiomaticInitial;
	private ArrayList<Production> productions;
	private Sigma sigma;
	private Variable variable;
	
	public Grammar() {
	}

	public Grammar(AxiomaticInitial axiomaticInitial, ArrayList<Production> productions, Sigma sigma,
			Variable variable) {
		this.axiomaticInitial = axiomaticInitial;
		this.productions = productions;
		this.sigma = sigma;
		this.variable = variable;
	}

	public AxiomaticInitial getAxiomaticInitial() {
		return axiomaticInitial;
	}

	public void setAxiomaticInitial(AxiomaticInitial axiomaticInitial) {
		this.axiomaticInitial = axiomaticInitial;
	}

	public ArrayList<Production> getProductions() {
		return productions;
	}

	public void setProductions(ArrayList<Production> productions) {
		this.productions = productions;
	}

	public Sigma getSigma() {
		return sigma;
	}

	public void setSigma(Sigma sigma) {
		this.sigma = sigma;
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}
	
}
