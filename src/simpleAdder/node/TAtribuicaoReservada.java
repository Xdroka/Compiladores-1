/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TAtribuicaoReservada extends Token
{
    public TAtribuicaoReservada()
    {
        super.setText("atribuicao");
    }

    public TAtribuicaoReservada(int line, int pos)
    {
        super.setText("atribuicao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAtribuicaoReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAtribuicaoReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAtribuicaoReservada text.");
    }
}
