package oO0O0O;

import oO0O0OO.InterfaceC32596OooO0o0;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;

/* JADX INFO: renamed from: oO0O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32521OooO0Oo {
    public static InterfaceC32596OooO0o0 OooO00o(InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        C33478OooO0Oo c33478OooO0OoOooO0oO = C32982OooO.OooO0oO(interfaceC32596OooO0o0);
        String str = OooO0OO.f116822OooO00o;
        C33477OooO0OO c33477OooO0OO = OooO0OO.f116831OooOO0O.get(c33478OooO0OoOooO0oO);
        if (c33477OooO0OO != null) {
            return C33194OooO0O0.OooO0o0(interfaceC32596OooO0o0).OooO(c33477OooO0OO);
        }
        throw new IllegalArgumentException("Given class " + interfaceC32596OooO0o0 + " is not a read-only collection");
    }

    public static InterfaceC32596OooO0o0 OooO0O0(C33477OooO0OO c33477OooO0OO, oO0O0O0o.OooOO0 builtIns) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builtIns, "builtIns");
        String str = OooO0OO.f116822OooO00o;
        C33476OooO0O0 c33476OooO0O0 = OooO0OO.f116829OooO0oo.get(c33477OooO0OO.OooO());
        if (c33476OooO0O0 != null) {
            return builtIns.OooO(c33476OooO0O0.OooO0O0());
        }
        return null;
    }
}
