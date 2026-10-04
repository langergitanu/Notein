package OooOooo;

import OooOooo.AbstractC20742OooO;
import OoooOoO.C21230OooO0O0;
import OoooOoO.InterfaceC21229OooO00o;
import o0000Ooo.InterfaceC24229OooO0OO;
import o00O0oOo.AbstractC24958OooOO0o;
import o0ooOO0.C31604o0ooOoO;
import oo000o.InterfaceC34653Oooo0O0;

/* JADX INFO: renamed from: OooOooo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20809OoooooO extends AbstractC24958OooOO0o implements InterfaceC34653Oooo0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21230OooO0O0.C18985OooO0O0 f59742OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20809OoooooO(C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        C21230OooO0O0.C18985OooO0O0 c18985OooO0O0 = InterfaceC21229OooO00o.C18984OooO00o.f61592OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f59742OooOoO0 = c18985OooO0O0;
    }

    @Override // oo000o.InterfaceC34653Oooo0O0
    public final Object OooO0oO(InterfaceC24229OooO0OO interfaceC24229OooO0OO, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24229OooO0OO, "<this>");
        C20794OoooO00 c20794OoooO00 = obj instanceof C20794OoooO00 ? (C20794OoooO00) obj : null;
        if (c20794OoooO00 == null) {
            c20794OoooO00 = new C20794OoooO00(0);
        }
        int i = AbstractC20742OooO.f59592OooO00o;
        C21230OooO0O0.C18985OooO0O0 vertical = this.f59742OooOoO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(vertical, "vertical");
        c20794OoooO00.f59718OooO0OO = new AbstractC20742OooO.C20744OooO0o0(vertical);
        return c20794OoooO00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C20809OoooooO c20809OoooooO = obj instanceof C20809OoooooO ? (C20809OoooooO) obj : null;
        if (c20809OoooooO == null) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f59742OooOoO0, c20809OoooooO.f59742OooOoO0);
    }

    public final int hashCode() {
        return Float.hashCode(this.f59742OooOoO0.f61597OooO00o);
    }

    @Override // o00O0oOo.AbstractC24958OooOO0o
    public final String toString() {
        return "VerticalAlignModifier(vertical=" + this.f59742OooOoO0 + ')';
    }
}
