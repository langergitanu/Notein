package o0O0o0OO;

import OooOoO.C20509OooO0oo;
import android.view.MotionEvent;
import java.util.concurrent.CancellationException;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.o00000OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26004OooO0O0 implements InterfaceC26008OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26006OooO0Oo f88816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f88817OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000OO f88818OooO0OO;

    public C26004OooO0O0(C26006OooO0Oo c26006OooO0Oo) {
        this.f88816OooO00o = c26006OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o() {
        boolean z;
        o00000OO o00000oo2 = this.f88818OooO0OO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o("shouldTakeDoubleTapEvent called start.", new Object[0]);
        if (this.f88816OooO00o.OooO00o()) {
            c20358OooO00o.OooO00o("shouldTakeDoubleTapEvent, ratio: " + this.f88817OooO0O0, new Object[0]);
            if (this.f88817OooO0O0 < 1.5f) {
                z = true;
            }
        } else {
            z = false;
        }
        this.f88817OooO0O0 = 0.0f;
        c20358OooO00o.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("shouldTakeDoubleTapEvent called end, take: ", z), new Object[0]);
        return z;
    }

    @Override // o0O0o0OO.InterfaceC26008OooO0o0
    public final void OooO0O0(MotionEvent motionEvent) {
        this.f88816OooO00o.OooO0O0(motionEvent);
        float touchMajor = motionEvent.getTouchMajor();
        float touchMinor = motionEvent.getTouchMinor();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        float f = touchMajor / touchMinor;
        double d = touchMinor;
        boolean z = d < 1.0E-6d;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("major: ", touchMajor, ", minor: ", touchMinor, ", ratio: ");
        sbOooO0Oo.append(f);
        sbOooO0Oo.append(", minor is 0: ");
        sbOooO0Oo.append(z);
        sbOooO0Oo.append("}");
        c20358OooO00o.OooO00o(sbOooO0Oo.toString(), new Object[0]);
        if (d < 1.0E-6d) {
            return;
        }
        if (f > this.f88817OooO0O0) {
            this.f88817OooO0O0 = f;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            o00000OO o00000oo2 = this.f88818OooO0OO;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            this.f88818OooO0OO = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C26003OooO00o(this, null), 3);
        }
    }
}
