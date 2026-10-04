package OooOooo;

import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o0000Ooo.C24232OooO0o0;
import o00O0oOo.AbstractC24958OooOO0o;
import o00oO0O.AbstractC25516Oooo0OO;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOooo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20807Oooooo extends AbstractC24958OooOO0o implements InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f59737OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f59738OooOoO0;

    /* JADX INFO: renamed from: OooOooo.Oooooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59739OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f59739OooOo0o = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0o(layout, this.f59739OooOo0o, 0, 0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C20807Oooooo() {
        throw null;
    }

    public C20807Oooooo(float f, C31604o0ooOoO.OooO00o oooO00o) {
        super(oooO00o);
        this.f59738OooOoO0 = Float.NaN;
        this.f59737OooOoO = f;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        int iOooOO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        float f = this.f59738OooOoO0;
        int iOooO = 0;
        if (C24232OooO0o0.OooO00o(f, Float.NaN) || C24227OooO00o.OooOO0(j) != 0) {
            iOooOO0 = C24227OooO00o.OooOO0(j);
        } else {
            iOooOO0 = interfaceC34643OooOoO.o0OoOo0(f);
            int iOooO0oo = C24227OooO00o.OooO0oo(j);
            if (iOooOO0 > iOooO0oo) {
                iOooOO0 = iOooO0oo;
            }
            if (iOooOO0 < 0) {
                iOooOO0 = 0;
            }
        }
        int iOooO0oo2 = C24227OooO00o.OooO0oo(j);
        float f2 = this.f59737OooOoO;
        if (C24232OooO0o0.OooO00o(f2, Float.NaN) || C24227OooO00o.OooO(j) != 0) {
            iOooO = C24227OooO00o.OooO(j);
        } else {
            int iO0OoOo0 = interfaceC34643OooOoO.o0OoOo0(f2);
            int iOooO0oO = C24227OooO00o.OooO0oO(j);
            if (iO0OoOo0 > iOooO0oO) {
                iO0OoOo0 = iOooO0oO;
            }
            if (iO0OoOo0 >= 0) {
                iOooO = iO0OoOo0;
            }
        }
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24228OooO0O0.OooO00o(iOooOO0, iOooO0oo2, iOooO, C24227OooO00o.OooO0oO(j)));
        return interfaceC34643OooOoO.o00oO0O(abstractC34655Oooo0oO00ooo.f124845OooOo0o, abstractC34655Oooo0oO00ooo.f124844OooOo, C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo));
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0OO(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iOooooOO = measurable.OooooOO(i);
        float f = this.f59738OooOoO0;
        int iO0OoOo0 = !C24232OooO0o0.OooO00o(f, Float.NaN) ? abstractC25516Oooo0OO.o0OoOo0(f) : 0;
        return iOooooOO < iO0OoOo0 ? iO0OoOo0 : iOooooOO;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0Oo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iOooo00O = measurable.Oooo00O(i);
        float f = this.f59737OooOoO;
        int iO0OoOo0 = !C24232OooO0o0.OooO00o(f, Float.NaN) ? abstractC25516Oooo0OO.o0OoOo0(f) : 0;
        return iOooo00O < iO0OoOo0 ? iO0OoOo0 : iOooo00O;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0o(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iOooOOoo = measurable.OooOOoo(i);
        float f = this.f59737OooOoO;
        int iO0OoOo0 = !C24232OooO0o0.OooO00o(f, Float.NaN) ? abstractC25516Oooo0OO.o0OoOo0(f) : 0;
        return iOooOOoo < iO0OoOo0 ? iO0OoOo0 : iOooOOoo;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooOOoo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        int iOoooO = measurable.OoooO(i);
        float f = this.f59738OooOoO0;
        int iO0OoOo0 = !C24232OooO0o0.OooO00o(f, Float.NaN) ? abstractC25516Oooo0OO.o0OoOo0(f) : 0;
        return iOoooO < iO0OoOo0 ? iO0OoOo0 : iOoooO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20807Oooooo)) {
            return false;
        }
        C20807Oooooo c20807Oooooo = (C20807Oooooo) obj;
        return C24232OooO0o0.OooO00o(this.f59738OooOoO0, c20807Oooooo.f59738OooOoO0) && C24232OooO0o0.OooO00o(this.f59737OooOoO, c20807Oooooo.f59737OooOoO);
    }

    public final int hashCode() {
        return Float.hashCode(this.f59737OooOoO) + (Float.hashCode(this.f59738OooOoO0) * 31);
    }
}
