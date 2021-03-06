/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TDoispontosReservada extends Token
{
    public TDoispontosReservada()
    {
        super.setText("doispontos");
    }

    public TDoispontosReservada(int line, int pos)
    {
        super.setText("doispontos");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoispontosReservada(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoispontosReservada(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoispontosReservada text.");
    }
}
