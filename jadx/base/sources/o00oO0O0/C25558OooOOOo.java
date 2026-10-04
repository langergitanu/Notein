package o00oO0O0;

import android.graphics.Canvas;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oO0O0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25558OooOOOo extends OooOOOO {
    @Override // o00oO0O0.OooOOOO, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        C25732OooO0O0.OooO00o();
        if (!this.f87209OooOo && !this.f87212OooOoO0 && this.f87211OooOoO <= 0.0f) {
            super.draw(canvas);
            C25732OooO0O0.OooO00o();
            return;
        }
        OooO0oo();
        OooO0o0();
        canvas.clipPath(this.f87213OooOoOO);
        super.draw(canvas);
        C25732OooO0O0.OooO00o();
    }
}
