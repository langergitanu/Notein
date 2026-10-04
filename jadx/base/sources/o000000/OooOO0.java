package o000000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends CharacterStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f81150OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f81151OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f81152OooO0Oo;

    public OooOO0(int i, float f, float f2, float f3) {
        this.f81149OooO00o = i;
        this.f81150OooO0O0 = f;
        this.f81151OooO0OO = f2;
        this.f81152OooO0Oo = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint tp) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tp, "tp");
        tp.setShadowLayer(this.f81152OooO0Oo, this.f81150OooO0O0, this.f81151OooO0OO, this.f81149OooO00o);
    }
}
