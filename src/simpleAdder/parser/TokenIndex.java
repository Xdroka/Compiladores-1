/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.parser;

import simpleAdder.node.*;
import simpleAdder.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTPontovirgula(@SuppressWarnings("unused") TPontovirgula node)
    {
        this.index = 0;
    }

    @Override
    public void caseTBranco(@SuppressWarnings("unused") TBranco node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 2;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 3;
    }

    @Override
    public void caseTSub(@SuppressWarnings("unused") TSub node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 5;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 6;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 7;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 8;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 9;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 10;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 11;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 12;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 13;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 14;
    }

    @Override
    public void caseTAvalie(@SuppressWarnings("unused") TAvalie node)
    {
        this.index = 15;
    }

    @Override
    public void caseTCaso(@SuppressWarnings("unused") TCaso node)
    {
        this.index = 16;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 17;
    }

    @Override
    public void caseTVerdadeiro(@SuppressWarnings("unused") TVerdadeiro node)
    {
        this.index = 18;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 19;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 20;
    }
}