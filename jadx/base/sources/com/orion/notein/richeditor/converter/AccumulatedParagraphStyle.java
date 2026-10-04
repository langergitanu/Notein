package com.orion.notein.richeditor.converter;

import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes9.dex */
public class AccumulatedParagraphStyle extends HtmlParagraphStyle {
    private int mAbsoluteIndent;
    private int mRelativeIndent;

    public AccumulatedParagraphStyle(ParagraphType paragraphType, int i, int i2) {
        this(paragraphType, i, i2, null);
    }

    public int getAbsoluteIndent() {
        return this.mAbsoluteIndent;
    }

    public int getRelativeIndent() {
        return this.mRelativeIndent;
    }

    @Override // com.orion.notein.richeditor.converter.HtmlParagraphStyle
    public ParagraphType getType() {
        return this.mType;
    }

    public void setAbsoluteIndent(int i) {
        this.mAbsoluteIndent = i;
    }

    public void setRelativeIndent(int i) {
        this.mRelativeIndent = i;
    }

    public String toString() {
        return this.mType.name() + " - " + this.mAbsoluteIndent + "/" + this.mRelativeIndent;
    }

    public AccumulatedParagraphStyle(ParagraphType paragraphType, int i, int i2, Attributes attributes) {
        super(paragraphType);
        this.mAbsoluteIndent = i;
        this.mRelativeIndent = i2;
    }
}
