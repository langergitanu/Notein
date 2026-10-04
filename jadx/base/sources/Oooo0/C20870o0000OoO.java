package Oooo0;

import Oooo0O0.C20932OooOooo;
import o00000.C24045OooO0Oo;
import o00000.InterfaceC24054OooOo0;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20870o0000OoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C20932OooOooo, o00000.OooO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C20870o0000OoO f60037OooOo0o = new C20870o0000OoO(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final o00000.OooO0o invoke(C20932OooOooo c20932OooOooo) {
        Integer numValueOf;
        C20932OooOooo deleteIfSelectedOr = c20932OooOooo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        C34695OooOOo0 c34695OooOOo0 = deleteIfSelectedOr.f60302OooO0OO;
        if (c34695OooOOo0 != null) {
            int iOooO0Oo = C34696OooOOoo.OooO0Oo(deleteIfSelectedOr.f60304OooO0o);
            InterfaceC24054OooOo0 interfaceC24054OooOo0 = deleteIfSelectedOr.f60303OooO0Oo;
            numValueOf = Integer.valueOf(interfaceC24054OooOo0.OooO00o(c34695OooOOo0.OooO0oo(c34695OooOOo0.OooO0o(interfaceC24054OooOo0.OooO0O0(iOooO0Oo)))));
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        long j = deleteIfSelectedOr.f60304OooO0o;
        int i = C34696OooOOoo.f124979OooO0OO;
        return new C24045OooO0Oo(((int) (j & 4294967295L)) - iIntValue, 0);
    }
}
