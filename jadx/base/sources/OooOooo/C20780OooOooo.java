package OooOooo;

import o0000Ooo.InterfaceC24229OooO0OO;
import o00O0oOo.AbstractC24958OooOO0o;
import o0ooOO0.C31604o0ooOoO;
import oo000o.InterfaceC34653Oooo0O0;

/* JADX INFO: renamed from: OooOooo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20780OooOooo extends AbstractC24958OooOO0o implements InterfaceC34653Oooo0O0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f59668OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f59669OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20780OooOooo(boolean z, C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f59669OooOoO0 = 1.0f;
        this.f59668OooOoO = z;
    }

    @Override // oo000o.InterfaceC34653Oooo0O0
    public final Object OooO0oO(InterfaceC24229OooO0OO interfaceC24229OooO0OO, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24229OooO0OO, "<this>");
        C20794OoooO00 c20794OoooO00 = obj instanceof C20794OoooO00 ? (C20794OoooO00) obj : null;
        if (c20794OoooO00 == null) {
            c20794OoooO00 = new C20794OoooO00(0);
        }
        c20794OoooO00.f59716OooO00o = this.f59669OooOoO0;
        c20794OoooO00.f59717OooO0O0 = this.f59668OooOoO;
        return c20794OoooO00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C20780OooOooo c20780OooOooo = obj instanceof C20780OooOooo ? (C20780OooOooo) obj : null;
        return c20780OooOooo != null && this.f59669OooOoO0 == c20780OooOooo.f59669OooOoO0 && this.f59668OooOoO == c20780OooOooo.f59668OooOoO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59668OooOoO) + (Float.hashCode(this.f59669OooOoO0) * 31);
    }

    @Override // o00O0oOo.AbstractC24958OooOO0o
    public final String toString() {
        return "LayoutWeightImpl(weight=" + this.f59669OooOoO0 + ", fill=" + this.f59668OooOoO + ')';
    }
}
