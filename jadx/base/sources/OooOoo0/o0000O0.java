package OooOoo0;

import OooooO0.C21290OooO0o0;
import android.view.View;
import android.widget.Magnifier;
import o0000Ooo.C24239OooOOO0;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 implements InterfaceC20715o0000oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0 f59461OooO00o = new o0000O0();

    public static class OooO00o implements InterfaceC20716o0000oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Magnifier f59462OooO00o;

        public OooO00o(Magnifier magnifier) {
            this.f59462OooO00o = magnifier;
        }

        @Override // OooOoo0.InterfaceC20716o0000oo
        public final long OooO00o() {
            return C24239OooOOO0.OooO00o(this.f59462OooO00o.getWidth(), this.f59462OooO00o.getHeight());
        }

        @Override // OooOoo0.InterfaceC20716o0000oo
        public void OooO0O0(long j, long j2, float f) {
            this.f59462OooO00o.show(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j));
        }

        @Override // OooOoo0.InterfaceC20716o0000oo
        public final void OooO0OO() {
            this.f59462OooO00o.update();
        }

        @Override // OooOoo0.InterfaceC20716o0000oo
        public final void dismiss() {
            this.f59462OooO00o.dismiss();
        }
    }

    @Override // OooOoo0.InterfaceC20715o0000oO
    public final InterfaceC20716o0000oo OooO00o(o00000O0 style, View view, InterfaceC24229OooO0OO density) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        return new OooO00o(new Magnifier(view));
    }

    @Override // OooOoo0.InterfaceC20715o0000oO
    public final boolean OooO0O0() {
        return false;
    }
}
