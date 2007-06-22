/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AInstanceofExpression extends PExpression
{
    private PImmediate _immediate_;
    private TInstanceof _instanceof_;
    private PNonvoidType _nonvoidType_;

    public AInstanceofExpression()
    {
    }

    public AInstanceofExpression(
        PImmediate _immediate_,
        TInstanceof _instanceof_,
        PNonvoidType _nonvoidType_)
    {
        setImmediate(_immediate_);

        setInstanceof(_instanceof_);

        setNonvoidType(_nonvoidType_);

    }
    public Object clone()
    {
        return new AInstanceofExpression(
            (PImmediate) cloneNode(_immediate_),
            (TInstanceof) cloneNode(_instanceof_),
            (PNonvoidType) cloneNode(_nonvoidType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstanceofExpression(this);
    }

    public PImmediate getImmediate()
    {
        return _immediate_;
    }

    public void setImmediate(PImmediate node)
    {
        if(_immediate_ != null)
        {
            _immediate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _immediate_ = node;
    }

    public TInstanceof getInstanceof()
    {
        return _instanceof_;
    }

    public void setInstanceof(TInstanceof node)
    {
        if(_instanceof_ != null)
        {
            _instanceof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _instanceof_ = node;
    }

    public PNonvoidType getNonvoidType()
    {
        return _nonvoidType_;
    }

    public void setNonvoidType(PNonvoidType node)
    {
        if(_nonvoidType_ != null)
        {
            _nonvoidType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _nonvoidType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_immediate_)
            + toString(_instanceof_)
            + toString(_nonvoidType_);
    }

    void removeChild(Node child)
    {
        if(_immediate_ == child)
        {
            _immediate_ = null;
            return;
        }

        if(_instanceof_ == child)
        {
            _instanceof_ = null;
            return;
        }

        if(_nonvoidType_ == child)
        {
            _nonvoidType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_immediate_ == oldChild)
        {
            setImmediate((PImmediate) newChild);
            return;
        }

        if(_instanceof_ == oldChild)
        {
            setInstanceof((TInstanceof) newChild);
            return;
        }

        if(_nonvoidType_ == oldChild)
        {
            setNonvoidType((PNonvoidType) newChild);
            return;
        }

    }
}