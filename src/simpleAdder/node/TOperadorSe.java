/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TOperadorSe extends Token
{
    public TOperadorSe()
    {
        super.setText("se");
    }

    public TOperadorSe(int line, int pos)
    {
        super.setText("se");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOperadorSe(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOperadorSe(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOperadorSe text.");
    }
}