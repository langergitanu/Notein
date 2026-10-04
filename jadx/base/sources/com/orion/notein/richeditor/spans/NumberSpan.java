package com.orion.notein.richeditor.spans;

import Oooo0oO.C21023OooO0Oo;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes9.dex */
public class NumberSpan extends BaseListItemSpan implements LeadingMarginSpan {
    private final int mGapWidth;
    private final boolean mIgnoreSpan;
    private int mNr;
    private float mWidth;

    public NumberSpan(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.mNr = i;
        this.mGapWidth = i2;
        this.mIgnoreSpan = z && z3 && !z2;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new NumberSpan(((Integer) obj).intValue(), this.mGapWidth, this.mIgnoreSpan);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned = (Spanned) charSequence;
        if (this.mIgnoreSpan || spanned.getSpanStart(this) != i6) {
            return;
        }
        AlignmentSpan[] alignmentSpanArr = (AlignmentSpan[]) spanned.getSpans(i6, i7, AlignmentSpan.class);
        Layout.Alignment alignment = alignmentSpanArr.length > 0 ? alignmentSpanArr[0].getAlignment() : null;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            i = ((int) ((layout.getWidth() - paint.measureText(charSequence, i6, i7)) - this.mGapWidth)) / 2;
        } else if (alignment == Layout.Alignment.ALIGN_OPPOSITE) {
            i = (int) ((layout.getWidth() - paint.measureText(charSequence, i6, i7)) - this.mGapWidth);
        }
        Paint.Style style = paint.getStyle();
        float textSize = paint.getTextSize();
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(determineTextSize(spanned, i6, i7, textSize));
        this.mWidth = paint.measureText(this.mNr + ".");
        canvas.drawText(C21023OooO0Oo.OooO0OO(".", this.mNr, new StringBuilder()), (float) i, (float) i4, paint);
        paint.setStyle(style);
        paint.setTextSize(textSize);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        if (this.mIgnoreSpan) {
            return 0;
        }
        return Math.max(Math.round(this.mWidth + 2.0f), this.mGapWidth);
    }

    public int getNumber() {
        return this.mNr;
    }

    public void setNumber(int i) {
        this.mNr = i;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new NumberSpan(this.mNr, this.mGapWidth, this.mIgnoreSpan);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Boolean getValue() {
        return Boolean.TRUE;
    }

    private NumberSpan(int i, int i2, boolean z) {
        this.mNr = i;
        this.mGapWidth = i2;
        this.mIgnoreSpan = z;
    }
}
