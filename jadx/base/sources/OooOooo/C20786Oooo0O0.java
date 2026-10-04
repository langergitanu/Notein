package OooOooo;

import OooOoO.C20509OooO0oo;
import o0000Ooo.C24228OooO0O0;
import o0000Ooo.C24232OooO0o0;
import o00O0oOo.AbstractC24958OooOO0o;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20786Oooo0O0 extends AbstractC24958OooOO0o implements InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f59686OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f59687OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final float f59688OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f59689OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final float f59690OooOoo0;

    /* JADX INFO: renamed from: OooOooo.Oooo0O0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59691OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34643OooOoO f59693OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o, InterfaceC34643OooOoO interfaceC34643OooOoO) {
            super(1);
            this.f59691OooOo = abstractC34655Oooo0o;
            this.f59693OooOoO0 = interfaceC34643OooOoO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            C20786Oooo0O0 c20786Oooo0O0 = C20786Oooo0O0.this;
            boolean z = c20786Oooo0O0.f59689OooOoo;
            InterfaceC34643OooOoO interfaceC34643OooOoO = this.f59693OooOoO0;
            AbstractC34655Oooo0o abstractC34655Oooo0o = this.f59691OooOo;
            float f = c20786Oooo0O0.f59686OooOoO;
            float f2 = c20786Oooo0O0.f59687OooOoO0;
            if (z) {
                AbstractC34655Oooo0o.OooO00o.OooO0o(layout, abstractC34655Oooo0o, interfaceC34643OooOoO.o0OoOo0(f2), interfaceC34643OooOoO.o0OoOo0(f));
            } else {
                AbstractC34655Oooo0o.OooO00o.OooO0OO(layout, abstractC34655Oooo0o, interfaceC34643OooOoO.o0OoOo0(f2), interfaceC34643OooOoO.o0OoOo0(f));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C20786Oooo0O0() {
        throw null;
    }

    public C20786Oooo0O0(float f, float f2, float f3, float f4, C31604o0ooOoO.OooO00o oooO00o) {
        super(oooO00o);
        this.f59687OooOoO0 = f;
        this.f59686OooOoO = f2;
        this.f59688OooOoOO = f3;
        this.f59690OooOoo0 = f4;
        this.f59689OooOoo = true;
        if ((f < 0.0f && !C24232OooO0o0.OooO00o(f, Float.NaN)) || ((f2 < 0.0f && !C24232OooO0o0.OooO00o(f2, Float.NaN)) || ((f3 < 0.0f && !C24232OooO0o0.OooO00o(f3, Float.NaN)) || (f4 < 0.0f && !C24232OooO0o0.OooO00o(f4, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iO0OoOo0 = interfaceC34643OooOoO.o0OoOo0(this.f59688OooOoOO) + interfaceC34643OooOoO.o0OoOo0(this.f59687OooOoO0);
        int iO0OoOo02 = interfaceC34643OooOoO.o0OoOo0(this.f59690OooOoo0) + interfaceC34643OooOoO.o0OoOo0(this.f59686OooOoO);
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24228OooO0O0.OooO0oO(-iO0OoOo0, -iO0OoOo02, j));
        return interfaceC34643OooOoO.o00oO0O(C24228OooO0O0.OooO0o(abstractC34655Oooo0oO00ooo.f124845OooOo0o + iO0OoOo0, j), C24228OooO0O0.OooO0o0(abstractC34655Oooo0oO00ooo.f124844OooOo + iO0OoOo02, j), C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo, interfaceC34643OooOoO));
    }

    public final boolean equals(Object obj) {
        C20786Oooo0O0 c20786Oooo0O0 = obj instanceof C20786Oooo0O0 ? (C20786Oooo0O0) obj : null;
        return c20786Oooo0O0 != null && C24232OooO0o0.OooO00o(this.f59687OooOoO0, c20786Oooo0O0.f59687OooOoO0) && C24232OooO0o0.OooO00o(this.f59686OooOoO, c20786Oooo0O0.f59686OooOoO) && C24232OooO0o0.OooO00o(this.f59688OooOoOO, c20786Oooo0O0.f59688OooOoOO) && C24232OooO0o0.OooO00o(this.f59690OooOoo0, c20786Oooo0O0.f59690OooOoo0) && this.f59689OooOoo == c20786Oooo0O0.f59689OooOoo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59689OooOoo) + C20509OooO0oo.OooO0OO(this.f59690OooOoo0, C20509OooO0oo.OooO0OO(this.f59688OooOoOO, C20509OooO0oo.OooO0OO(this.f59686OooOoO, Float.hashCode(this.f59687OooOoO0) * 31, 31), 31), 31);
    }
}
