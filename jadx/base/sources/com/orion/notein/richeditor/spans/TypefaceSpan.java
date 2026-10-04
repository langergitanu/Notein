package com.orion.notein.richeditor.spans;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.orion.notein.richeditor.fonts.RTTypeface;

/* JADX INFO: loaded from: classes9.dex */
public class TypefaceSpan extends android.text.style.TypefaceSpan implements RTSpan {
    private final RTTypeface mTypeface;

    public TypefaceSpan(RTTypeface rTTypeface) {
        super("");
        this.mTypeface = rTTypeface;
    }

    private void applyCustomTypeFace(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new TypefaceSpan((RTTypeface) obj);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        applyCustomTypeFace(textPaint, this.mTypeface.getTypeface());
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        applyCustomTypeFace(textPaint, this.mTypeface.getTypeface());
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return copy(this.mTypeface);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTTypeface getValue() {
        return this.mTypeface;
    }
}
