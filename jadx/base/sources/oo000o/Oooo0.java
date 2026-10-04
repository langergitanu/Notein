package oo000o;

import o0000Ooo.C24237OooOO0o;
import o0000Ooo.C24239OooOOO0;
import o00O0oOo.AbstractC24958OooOO0o;
import o0ooOO0.C31604o0ooOoO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends AbstractC24958OooOO0o implements InterfaceC34652Oooo00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f124841OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f124842OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(InterfaceC32507OooOO0o interfaceC32507OooOO0o, C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f124842OooOoO0 = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
        this.f124841OooOoO = C24239OooOOO0.OooO00o(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oo000o.InterfaceC34652Oooo00o
    public final void OooOOo(long j) {
        if (C24237OooOO0o.OooO00o(this.f124841OooOoO, j)) {
            return;
        }
        this.f124842OooOoO0.invoke(new C24237OooOO0o(j));
        this.f124841OooOoO = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124842OooOoO0, ((Oooo0) obj).f124842OooOoO0);
    }

    public final int hashCode() {
        return this.f124842OooOoO0.hashCode();
    }
}
