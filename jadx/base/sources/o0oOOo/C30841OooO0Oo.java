package o0oOOo;

import android.graphics.Canvas;
import o00o0o00.C25438OooO00o;
import o00oO00O.C25476OooO0OO;
import o00oO0O0.C25556OooO0oo;
import o00oOO.C25580OooO0O0;
import o00oOo.C25600OooO00o;

/* JADX INFO: renamed from: o0oOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C30841OooO0Oo extends C25556OooO0oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C25600OooO00o f110229OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C25580OooO0O0 f110230OooOoOO;

    public final void OooOOOO(C25580OooO0O0 c25580OooO0O0) {
        this.f110230OooOoOO = c25580OooO0O0;
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            C25580OooO0O0 c25580OooO0O0 = this.f110230OooOoOO;
            if (c25580OooO0O0 != null && !c25580OooO0O0.f87259OooO00o) {
                C25438OooO00o.OooO0oo(C25476OooO0OO.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(c25580OooO0O0)), Integer.valueOf(System.identityHashCode(c25580OooO0O0.f87264OooO0o0)), c25580OooO0O0.toString());
                c25580OooO0O0.f87260OooO0O0 = true;
                c25580OooO0O0.f87261OooO0OO = true;
                c25580OooO0O0.OooO0O0();
            }
            super.draw(canvas);
            C25600OooO00o c25600OooO00o = this.f110229OooOoO;
            if (c25600OooO00o != null) {
                c25600OooO00o.setBounds(getBounds());
                this.f110229OooOoO.draw(canvas);
            }
        }
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C25580OooO0O0 c25580OooO0O0 = this.f110230OooOoOO;
        if (c25580OooO0O0 != null) {
            c25580OooO0O0.OooO0Oo(z);
        }
        return super.setVisible(z, z2);
    }
}
