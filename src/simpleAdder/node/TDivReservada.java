/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TDivReservada extends Token
{
    public TDivReservada()
    {
        super.setText("div");
    }

    public TDivReservada(int line, int pos)
    {
        super.setText("div");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDivReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDivReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDivReservada text.");
    }
}