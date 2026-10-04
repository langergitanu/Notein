package o00oO0o;

import Oooo0oo.AbstractC21138OooO0oo;
import OoooOoO.InterfaceC21233OooO0o;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25527OoooO00;
import o00oO0O.InterfaceC25492OooO0oo;

/* JADX INFO: renamed from: o00oO0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC25575OooO0o extends InterfaceC25578OooO0oo, InterfaceC25492OooO0oo {
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // o00oO0o.InterfaceC25578OooO0oo
    default Object OooO00o(C25570OooO c25570OooO) {
        C25527OoooO00 c25527OoooO00;
        OooOOO0.OooO0oO(c25570OooO, "<this>");
        if (!getNode().f61612Oooo000) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!getNode().f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO = getNode().f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = o00oO0O.OooO.OooO0o0(this);
        while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & 32) != 0) {
                while (oooO0OO != null) {
                    if ((oooO0OO.f61603OooOo & 32) != 0 && (oooO0OO instanceof InterfaceC25575OooO0o)) {
                        InterfaceC25575OooO0o interfaceC25575OooO0o = (InterfaceC25575OooO0o) oooO0OO;
                        if (interfaceC25575OooO0o.OooO0oo().Oooo0oO(c25570OooO)) {
                            return interfaceC25575OooO0o.OooO0oo().OoooO0O(c25570OooO);
                        }
                    }
                    oooO0OO = oooO0OO.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
        return c25570OooO.f87249OooO00o.invoke();
    }

    default AbstractC21138OooO0oo OooO0oo() {
        return C25572OooO0O0.f87248OooO00o;
    }
}
