package oO00Oo0;

import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f115943OooO00o;

    static {
        String property;
        Integer numOooOOO0;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat("max.copy.size"));
        } catch (SecurityException unused) {
            property = null;
        }
        f115943OooO00o = (property == null || (numOooOOO0 = C33596OooOOo0.OooOOO0(property)) == null) ? 500 : numOooOOO0.intValue();
    }
}
