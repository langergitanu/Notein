package oO0O0O0;

import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    static {
        Object objOooO00o;
        try {
            objOooO00o = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            objOooO00o = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = obj;
        }
    }

    public static final OooO0OO OooO00o(InterfaceC32507OooOO0o compute) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(compute, "compute");
        return new OooO0OO(compute);
    }
}
