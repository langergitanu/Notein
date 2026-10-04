package o0O0o0OO;

import android.view.MotionEvent;
import java.util.concurrent.CancellationException;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.o00000OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26009OooO0oO implements InterfaceC26008OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26006OooO0Oo f88826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f88827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000OO f88828OooO0OO;

    public C26009OooO0oO(C26006OooO0Oo c26006OooO0Oo) {
        this.f88826OooO00o = c26006OooO0Oo;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public final boolean OooO00o() {
        o00000OO o00000oo2 = this.f88828OooO0OO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        boolean z = this.f88826OooO00o.OooO00o() && this.f88827OooO0O0 < 0.04f;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("SizePalmDetector");
        c20358OooO00o.OooO0o0("shouldTakeDoubleTapEvent: " + z + ", " + this.f88827OooO0O0, new Object[0]);
        this.f88827OooO0O0 = 0.0f;
        return z;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public final void OooO0O0(MotionEvent motionEvent) {
        this.f88826OooO00o.OooO0O0(motionEvent);
        C34406OooO00o.f123390OooO00o.OooO00o("size: " + motionEvent.getSize(), new Object[0]);
        if (motionEvent.getSize() > 0.04f) {
            this.f88827OooO0O0 = motionEvent.getSize();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            o00000OO o00000oo2 = this.f88828OooO0OO;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            this.f88828OooO0OO = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C26007OooO0o(this, null), 3);
        }
    }
}
