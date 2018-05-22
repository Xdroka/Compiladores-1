/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.analysis;

import simpleAdder.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);

    void caseTPontovirgula(TPontovirgula node);
    void caseTBranco(TBranco node);
    void caseTSoma(TSoma node);
    void caseTIgual(TIgual node);
    void caseTSub(TSub node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTString(TString node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTPara(TPara node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTBooleano(TBooleano node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}