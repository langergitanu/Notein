package o0O0o00;

import android.view.MotionEvent;
import com.orion.editor.AbstractC22830OooO0Oo;
import o0O0o00.C25935OooOoo;
import o0O0oooo.C26395Oooo0o0;

/* JADX INFO: renamed from: o0O0o00.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25908OooO extends C25935OooOoo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.orion.editor.OooO00o f88442OooO00o;

    public C25908OooO(com.orion.editor.OooO00o oooO00o) {
        this.f88442OooO00o = oooO00o;
    }

    @Override // o0O0o00.C25935OooOoo.OooO0O0
    public final void OooO00o(MotionEvent motionEvent) {
        C26395Oooo0o0 c26395Oooo0o0;
        com.orion.editor.OooO00o oooO00o = this.f88442OooO00o;
        oooO00o.f69056OooO00o.OooOo0o();
        int pointerCount = motionEvent.getPointerCount();
        if (oooO00o.f69056OooO00o.getInputType() == 1 || pointerCount > 1) {
            oooO00o.f69056OooO00o.getTool().OooOO0O();
            oooO00o.f69091Oooo0O0 = true;
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = oooO00o.f69056OooO00o.f69170OooOooO;
            if (abstractC22830OooO0Oo == null || (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) == null) {
                return;
            }
            c26395Oooo0o0.f90558OooO0oO.OooOO0o(pointerCount);
        }
    }
}
