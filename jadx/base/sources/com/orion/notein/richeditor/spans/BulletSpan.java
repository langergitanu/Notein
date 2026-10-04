package com.orion.notein.richeditor.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes9.dex */
public class BulletSpan extends BaseListItemSpan implements LeadingMarginSpan {
    private static Path sBulletPath;
    private final int mGapWidth;
    private final boolean mIgnoreSpan;

    public BulletSpan(int i, boolean z, boolean z2, boolean z3) {
        this.mGapWidth = i;
        this.mIgnoreSpan = z && z3 && !z2;
        if (sBulletPath == null) {
            sBulletPath = new Path();
        }
    }

    private void draw(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5) {
        sBulletPath.reset();
        sBulletPath.addCircle(0.0f, 0.0f, i5, Path.Direction.CW);
        canvas.save();
        canvas.translate((i2 * i5) + i, (i3 + i4) / 2.0f);
        canvas.drawPath(sBulletPath, paint);
        canvas.restore();
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new BulletSpan(((Integer) obj).intValue(), this.mIgnoreSpan);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        BulletSpan bulletSpan;
        Canvas canvas2;
        Paint paint2;
        int i8;
        int i9;
        int i10;
        int i11;
        int width;
        Spanned spanned = (Spanned) charSequence;
        if (this.mIgnoreSpan || spanned.getSpanStart(this) != i6) {
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        int iMax = Math.max(Math.round(determineTextSize(spanned, i6, i7, paint.getTextSize()) / 9.0f), 4);
        AlignmentSpan[] alignmentSpanArr = (AlignmentSpan[]) spanned.getSpans(i6, i7, AlignmentSpan.class);
        Layout.Alignment alignment = alignmentSpanArr.length > 0 ? alignmentSpanArr[0].getAlignment() : null;
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            width = ((int) ((layout.getWidth() - paint.measureText(charSequence, i6, i7)) - this.mGapWidth)) / 2;
        } else {
            if (alignment != Layout.Alignment.ALIGN_OPPOSITE) {
                bulletSpan = this;
                canvas2 = canvas;
                paint2 = paint;
                i8 = i;
                i9 = i2;
                i10 = i3;
                i11 = i5;
                bulletSpan.draw(canvas2, paint2, i8, i9, i10, i11, iMax);
                paint.setStyle(style);
            }
            width = (int) ((layout.getWidth() - paint.measureText(charSequence, i6, i7)) - this.mGapWidth);
        }
        bulletSpan = this;
        paint2 = paint;
        i9 = i2;
        i10 = i3;
        i11 = i5;
        i8 = width;
        canvas2 = canvas;
        bulletSpan.draw(canvas2, paint2, i8, i9, i10, i11, iMax);
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        if (this.mIgnoreSpan) {
            return 0;
        }
        return this.mGapWidth;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new BulletSpan(this.mGapWidth, this.mIgnoreSpan);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Boolean getValue() {
        return Boolean.TRUE;
    }

    private BulletSpan(int i, boolean z) {
        this.mGapWidth = i;
        this.mIgnoreSpan = z;
    }
}
