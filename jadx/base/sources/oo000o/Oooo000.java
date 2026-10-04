package oo000o;

import o00O0oOo.AbstractC24958OooOO0o;
import o00oO0O.AbstractC25521OoooO;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends AbstractC24958OooOO0o implements InterfaceC34649OooOooo {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC34635OooOOOO, C32460OooOooO> f124843OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(InterfaceC32507OooOO0o callback, C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f124843OooOoO0 = callback;
    }

    @Override // oo000o.InterfaceC34649OooOooo
    public final void OooOo00(AbstractC25521OoooO abstractC25521OoooO) {
        this.f124843OooOoO0.invoke(abstractC25521OoooO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124843OooOoO0, ((Oooo000) obj).f124843OooOoO0);
    }

    public final int hashCode() {
        return this.f124843OooOoO0.hashCode();
    }
}
