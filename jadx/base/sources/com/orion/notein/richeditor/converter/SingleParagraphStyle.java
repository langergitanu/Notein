package com.orion.notein.richeditor.converter;

import Oooo0oO.o0Oo0oo;
import android.text.style.ParagraphStyle;
import com.orion.notein.richeditor.spans.IndentationSpan;
import com.orion.notein.richeditor.spans.NumberSpan;
import com.orion.notein.richeditor.utils.Helper;

/* JADX INFO: loaded from: classes9.dex */
public class SingleParagraphStyle extends HtmlParagraphStyle implements ParagraphStyle {
    private final ParagraphStyle mStyle;

    public SingleParagraphStyle(ParagraphType paragraphType, ParagraphStyle paragraphStyle) {
        super(paragraphType);
        this.mStyle = paragraphStyle;
    }

    public int getIndentation() {
        if (this.mType.isIndentation()) {
            return Math.round(((IndentationSpan) this.mStyle).getValue().intValue() / Helper.getLeadingMarging());
        }
        return (this.mType.isBullet() || this.mType.isNumbering()) ? 1 : 0;
    }

    @Override // com.orion.notein.richeditor.converter.HtmlParagraphStyle
    public String getListStartTag() {
        if (this.mType == ParagraphType.NUMBERING) {
            ParagraphStyle paragraphStyle = this.mStyle;
            if (paragraphStyle instanceof NumberSpan) {
                return o0Oo0oo.OooO0O0(((NumberSpan) paragraphStyle).getNumber(), "<li index=", ">");
            }
        }
        return super.getListStartTag();
    }

    public ParagraphStyle getStyle() {
        return this.mStyle;
    }

    public String toString() {
        return this.mType.name() + " - " + this.mStyle.getClass().getSimpleName();
    }
}
