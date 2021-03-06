/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TMaiorigReservada extends Token
{
    public TMaiorigReservada()
    {
        super.setText("maiorig");
    }

    public TMaiorigReservada(int line, int pos)
    {
        super.setText("maiorig");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMaiorigReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMaiorigReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMaiorigReservada text.");
    }
}
