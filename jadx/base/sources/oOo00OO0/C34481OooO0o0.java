package oOo00OO0;

import oO00Oo0o.AbstractC32276OooO0OO;
import oO00Oo0o.AbstractC32278OooO0o0;

/* JADX INFO: renamed from: oOo00OO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34481OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oO00Oo0o.OooO0o<char[]> f123563OooO00o;

    /* JADX INFO: renamed from: oOo00OO0.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC32278OooO0o0<char[]> {
        @Override // oO00Oo0o.OooO0o
        public final Object o0000OoO() {
            return new char[2048];
        }
    }

    /* JADX INFO: renamed from: oOo00OO0.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32276OooO0OO<char[]> {
        @Override // oO00Oo0o.AbstractC32276OooO0OO
        public final char[] OooOOo0() {
            return new char[2048];
        }
    }

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        f123563OooO00o = property != null ? Boolean.parseBoolean(property) : false ? new OooO00o() : new OooO0O0(4096);
    }
}
