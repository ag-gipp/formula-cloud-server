package com.formulasearchengine.formulacloud.beans;

/**
 * @author Andre Greiner-Petter
 */
public interface IInverseDocumentFrequencyCalculator {
    double calculate(long raw, long total);
}
