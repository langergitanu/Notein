package o000000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: o000000.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24082OooOO0o extends CharacterStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f81154OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f81155OooO0O0;

    public C24082OooOO0o(boolean z, boolean z2) {
        this.f81154OooO00o = z;
        this.f81155OooO0O0 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f81154OooO00o);
        textPaint.setStrikeThruText(this.f81155OooO0O0);
    }
}
