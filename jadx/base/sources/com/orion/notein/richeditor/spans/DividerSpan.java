package com.orion.notein.richeditor.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.view.ViewCompat;
import com.orion.notein.richeditor.C18896R;

/* JADX INFO: loaded from: classes9.dex */
public class DividerSpan extends ReplacementSpan implements RTSpan {
    private Context mContext;
    private final Paint mPaint;

    public DividerSpan(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(context.getColor(C18896R.color.text_page_divider_color));
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new DividerSpan(this.mContext);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = (i3 + i5) / 2;
        canvas.drawLine(0.0f, f2, canvas.getWidth(), f2, this.mPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        if (fontMetricsInt == null) {
            return 1;
        }
        fontMetricsInt.ascent = fontMetricsInt2.ascent;
        fontMetricsInt.descent = fontMetricsInt2.descent;
        fontMetricsInt.top = fontMetricsInt2.top;
        fontMetricsInt.bottom = fontMetricsInt2.bottom;
        return 1;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Object getValue() {
        return Integer.valueOf(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new DividerSpan(this.mContext);
    }
}
