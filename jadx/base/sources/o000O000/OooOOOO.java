package o000O000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextPaint f82290OooOoOO;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f82290OooOoOO;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f82290OooOoOO = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f82251OooOoO0, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        androidx.emoji2.text.OooO0OO.OooO00o().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        OooOOO oooOOO = this.f82248OooOo;
        C24385OooOO0o c24385OooOO0o = oooOOO.f82284OooO0O0;
        Typeface typeface = c24385OooOO0o.f82279OooO0Oo;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText(c24385OooOO0o.f82277OooO0O0, oooOOO.f82283OooO00o * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }
}
