/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private TInteiro _left_;
    private TSoma _soma_;
    private TInteiro _right_;
    private TPontovirgula _pontovirgula_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") TInteiro _left_,
        @SuppressWarnings("hiding") TSoma _soma_,
        @SuppressWarnings("hiding") TInteiro _right_,
        @SuppressWarnings("hiding") TPontovirgula _pontovirgula_)
    {
        // Constructor
        setLeft(_left_);

        setSoma(_soma_);

        setRight(_right_);

        setPontovirgula(_pontovirgula_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._left_),
            cloneNode(this._soma_),
            cloneNode(this._right_),
            cloneNode(this._pontovirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public TInteiro getLeft()
    {
        return this._left_;
    }

    public void setLeft(TInteiro node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TSoma getSoma()
    {
        return this._soma_;
    }

    public void setSoma(TSoma node)
    {
        if(this._soma_ != null)
        {
            this._soma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._soma_ = node;
    }

    public TInteiro getRight()
    {
        return this._right_;
    }

    public void setRight(TInteiro node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    public TPontovirgula getPontovirgula()
    {
        return this._pontovirgula_;
    }

    public void setPontovirgula(TPontovirgula node)
    {
        if(this._pontovirgula_ != null)
        {
            this._pontovirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontovirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._soma_)
            + toString(this._right_)
            + toString(this._pontovirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._soma_ == child)
        {
            this._soma_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        if(this._pontovirgula_ == child)
        {
            this._pontovirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((TInteiro) newChild);
            return;
        }

        if(this._soma_ == oldChild)
        {
            setSoma((TSoma) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((TInteiro) newChild);
            return;
        }

        if(this._pontovirgula_ == oldChild)
        {
            setPontovirgula((TPontovirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}