package oO0OOo;

import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;

/* JADX INFO: renamed from: oO0OOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33050OooOoOO extends AbstractC33051OooOoo<Long> {
    public C33050OooOoOO(long j) {
        super(Long.valueOf(j));
    }

    @Override // oO0OOo.AbstractC33038OooO0oO
    public final AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo module) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oO0O0OO.OooOo00.OooO00o(module, OooOOO.OooO00o.f117195OoooOO0);
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = interfaceC32596OooO0o0OooO00o != null ? interfaceC32596OooO0o0OooO00o.OooOOO() : null;
        return abstractC33328Oooo0O0OooOOO == null ? C33509OooO.OooO0OO(EnumC33517OooO0oo.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC33328Oooo0O0OooOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0OOo.AbstractC33038OooO0oO
    public final String toString() {
        return ((Number) this.f119483OooO00o).longValue() + ".toULong()";
    }
}
