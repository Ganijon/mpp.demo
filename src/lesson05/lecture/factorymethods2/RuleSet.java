package lesson05.lecture.factorymethods2;

import java.awt.Component;

import lesson05.lecture.factorymethods2.rulesets.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
