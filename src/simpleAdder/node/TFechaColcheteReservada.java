/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TFechaColcheteReservada extends Token
{
    public TFechaColcheteReservada()
    {
        super.setText("fecha_colchete");
    }

    public TFechaColcheteReservada(int line, int pos)
    {
        super.setText("fecha_colchete");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFechaColcheteReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFechaColcheteReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFechaColcheteReservada text.");
    }
}