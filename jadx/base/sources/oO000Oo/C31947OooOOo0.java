package oO000Oo;

import oO000Oo.C31943OooOOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.OooO0o;

/* JADX INFO: renamed from: oO000Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31947OooOOo0 extends AbstractRunnableC31956OooOoO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o.o00Oo0 f114030OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C31943OooOOOo.OooO0OO f114031OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33094OoooO f114032OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31947OooOOo0(C31943OooOOOo.OooO0OO oooO0OO, oO0OOo0o.o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
        super(C31943OooOOOo.this.f114001OooO0o);
        this.f114031OooOoO = oooO0OO;
        this.f114030OooOo = o00oo02;
        this.f114032OooOoO0 = c33094OoooO;
    }

    @Override // oO000Oo.AbstractRunnableC31956OooOoO0
    public final void OooO00o() {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0OO oooO0OO = C31943OooOOOo.this.f113998OooO0O0;
            oO00o00.OooO0O0.OooO00o();
            oO00o00.OooO00o oooO00o = oO00o00.OooO0O0.f116246OooO00o;
            oooO00o.getClass();
            OooO0O0();
            oooO00o.getClass();
        } catch (Throwable th) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void OooO0O0() {
        oO0OOo0o.o00Oo0 o00oo02 = this.f114030OooOo;
        C33094OoooO c33094OoooO = this.f114032OooOoO0;
        oO0OOo0o.o00Oo0 o00oo03 = this.f114031OooOoO.f114020OooO0O0;
        if (o00oo03 != null) {
            c33094OoooO = new C33094OoooO();
            o00oo02 = o00oo03;
        }
        C31943OooOOOo.this.f114006OooOO0O = true;
        try {
            C31943OooOOOo.OooO0OO oooO0OO = this.f114031OooOoO;
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            OooO0o.OooO00o<RespT> oooO00o = oooO0OO.f114019OooO00o;
            c31943OooOOOo.getClass();
            oooO00o.onClose(o00oo02, c33094OoooO);
            C31943OooOOOo.this.OooO0O0();
            C31942OooOO0o c31942OooOO0o = C31943OooOOOo.this.f114002OooO0o0;
            if (o00oo02.OooO0o()) {
                c31942OooOO0o.f113987OooO0OO.OooO00o();
            } else {
                c31942OooOO0o.f113988OooO0Oo.OooO00o();
            }
        } catch (Throwable th) {
            C31943OooOOOo.this.OooO0O0();
            C31942OooOO0o c31942OooOO0o2 = C31943OooOOOo.this.f114002OooO0o0;
            if (o00oo02.OooO0o()) {
                c31942OooOO0o2.f113987OooO0OO.OooO00o();
            } else {
                c31942OooOO0o2.f113988OooO0Oo.OooO00o();
            }
            throw th;
        }
    }
}
