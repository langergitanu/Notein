package OooOoo0;

import OooOoo0.o0000O0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import android.view.View;
import android.widget.Magnifier;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements InterfaceC20715o0000oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0O f59463OooO00o = new o0000O0O();

    public static final class OooO00o extends o0000O0.OooO00o {
        @Override // OooOoo0.o0000O0.OooO00o, OooOoo0.InterfaceC20716o0000oo
        public final void OooO0O0(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                this.f59462OooO00o.setZoom(f);
            }
            if (C21289OooO0o.OooO0o(j2)) {
                this.f59462OooO00o.show(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), C21290OooO0o0.OooO0OO(j2), C21290OooO0o0.OooO0Oo(j2));
            } else {
                this.f59462OooO00o.show(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j));
            }
        }
    }

    @Override // OooOoo0.InterfaceC20715o0000oO
    public final InterfaceC20716o0000oo OooO00o(o00000O0 style, View view, InterfaceC24229OooO0OO density) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(style, "style");
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        if (style.equals(o00000O0.f59436OooO0Oo)) {
            return new OooO00o(new Magnifier(view));
        }
        long jOoooo00 = density.Ooooo00(style.f59438OooO0O0);
        float fO0OOO0o = density.o0OOO0o(Float.NaN);
        float fO0OOO0o2 = density.o0OOO0o(Float.NaN);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jOoooo00 != C21293OooOO0.f61729OooO0OO) {
            builder.setSize(oO0O00O.OooO00o.OooO0O0(C21293OooOO0.OooO0Oo(jOoooo00)), oO0O00O.OooO00o.OooO0O0(C21293OooOO0.OooO0O0(jOoooo00)));
        }
        if (!Float.isNaN(fO0OOO0o)) {
            builder.setCornerRadius(fO0OOO0o);
        }
        if (!Float.isNaN(fO0OOO0o2)) {
            builder.setElevation(fO0OOO0o2);
        }
        if (!Float.isNaN(Float.NaN)) {
            builder.setInitialZoom(Float.NaN);
        }
        builder.setClippingEnabled(true);
        Magnifier magnifierBuild = builder.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new OooO00o(magnifierBuild);
    }

    @Override // OooOoo0.InterfaceC20715o0000oO
    public final boolean OooO0O0() {
        return true;
    }
}
