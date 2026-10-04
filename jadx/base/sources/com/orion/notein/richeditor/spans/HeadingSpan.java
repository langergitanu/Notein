package com.orion.notein.richeditor.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.UpdateLayout;

/* JADX INFO: loaded from: classes9.dex */
public class HeadingSpan extends MetricAffectingSpan implements RTSpan, LineHeightSpan, UpdateLayout {
    private static final int DEFAULT_VERTICAL_PADDING = 30;
    private int headingLevel;
    private Paint.FontMetricsInt previousFontMetrics = null;
    private Float previousSpacing = null;
    private int previousHeadingLevel = -1;

    public HeadingSpan(int i) {
        this.headingLevel = i;
    }

    private float headingLevelToScale(int i) {
        if (i == 1) {
            return 1.73f;
        }
        if (i != 2) {
            return i != 3 ? 1.0f : 1.02f;
        }
        return 1.32f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        Spanned spanned = (Spanned) charSequence;
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (this.previousFontMetrics == null) {
            Paint.FontMetricsInt fontMetricsInt2 = new Paint.FontMetricsInt();
            this.previousFontMetrics = fontMetricsInt2;
            fontMetricsInt2.top = fontMetricsInt.top;
            fontMetricsInt2.ascent = fontMetricsInt.ascent;
            fontMetricsInt2.bottom = fontMetricsInt.bottom;
            fontMetricsInt2.descent = fontMetricsInt.descent;
        }
        boolean z2 = true;
        if (i == spanStart || i < spanStart) {
            fontMetricsInt.ascent -= 30;
            fontMetricsInt.top -= 30;
            z = true;
        } else {
            z = false;
        }
        if (i2 == spanEnd || spanEnd < i2) {
            fontMetricsInt.descent += 30;
            fontMetricsInt.bottom += 30;
        } else {
            z2 = false;
        }
        if (!z) {
            Paint.FontMetricsInt fontMetricsInt3 = this.previousFontMetrics;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.top = fontMetricsInt3.top;
        }
        if (z2) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt4 = this.previousFontMetrics;
        fontMetricsInt.descent = fontMetricsInt4.descent;
        fontMetricsInt.bottom = fontMetricsInt4.bottom;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        if (obj instanceof Integer) {
            return new HeadingSpan(((Integer) obj).intValue());
        }
        return null;
    }

    public void setHeadingLevel(int i) {
        this.previousHeadingLevel = i;
        this.headingLevel = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(textPaint.getTextSize() * headingLevelToScale(this.headingLevel));
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        float fHeadingLevelToScale = headingLevelToScale(this.headingLevel);
        if (this.headingLevel != this.previousHeadingLevel || textPaint.getFontSpacing() != this.previousSpacing.floatValue()) {
            this.previousFontMetrics = null;
        }
        this.previousHeadingLevel = this.headingLevel;
        this.previousSpacing = Float.valueOf(textPaint.getFontSpacing());
        textPaint.setTextSize(textPaint.getTextSize() * fHeadingLevelToScale);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Integer getValue() {
        return Integer.valueOf(this.headingLevel);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new HeadingSpan(this.headingLevel);
    }
}
