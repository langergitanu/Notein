package ooOOoOO0;

import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: ooOOoOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35117OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f126108OooO00o;

    static {
        Object objOooO00o;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.OooOOO0.OooO0o(property, "getProperty(...)");
            objOooO00o = C33596OooOOo0.OooOOO0(property);
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
        Integer num = (Integer) objOooO00o;
        f126108OooO00o = num != null ? num.intValue() : 2097152;
    }
}
