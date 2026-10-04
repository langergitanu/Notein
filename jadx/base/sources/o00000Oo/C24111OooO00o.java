package o00000Oo;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooooo0.C21403OooO0oO;
import Oooooo0.C21404OooO0oo;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00000Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24111OooO00o extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC20449OooO0Oo f81249OooOo0o;

    public C24111OooO00o(AbstractC20449OooO0Oo drawStyle) {
        OooOOO0.OooO0oO(drawStyle, "drawStyle");
        this.f81249OooOo0o = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C21403OooO0oO c21403OooO0oO = C21403OooO0oO.f61923OooOo0o;
            AbstractC20449OooO0Oo abstractC20449OooO0Oo = this.f81249OooOo0o;
            if (OooOOO0.OooO0O0(abstractC20449OooO0Oo, c21403OooO0oO)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC20449OooO0Oo instanceof C21404OooO0oo) {
                textPaint.setStyle(Paint.Style.STROKE);
                C21404OooO0oo c21404OooO0oo = (C21404OooO0oo) abstractC20449OooO0Oo;
                textPaint.setStrokeWidth(c21404OooO0oo.f61925OooOo0o);
                textPaint.setStrokeMiter(c21404OooO0oo.f61924OooOo);
                int i = c21404OooO0oo.f61926OooOoO;
                textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i2 = c21404OooO0oo.f61927OooOoO0;
                textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                c21404OooO0oo.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
