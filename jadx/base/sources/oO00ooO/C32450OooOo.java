package oO00ooO;

import io.ktor.utils.p616io.Oooo000;

/* JADX INFO: renamed from: oO00ooO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32450OooOo implements Comparable<C32450OooOo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f116650OooOo0o;

    public /* synthetic */ C32450OooOo(long j) {
        this.f116650OooOo0o = j;
    }

    public static String OooO00o(long j) {
        if (j >= 0) {
            Oooo000.OooO0O0(10);
            String string = Long.toString(j, 10);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        Oooo000.OooO0O0(10);
        String string2 = Long.toString(j3, 10);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
        Oooo000.OooO0O0(10);
        String string3 = Long.toString(j4, 10);
        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "toString(...)");
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C32450OooOo c32450OooOo) {
        return kotlin.jvm.internal.OooOOO0.OooOO0(this.f116650OooOo0o ^ Long.MIN_VALUE, c32450OooOo.f116650OooOo0o ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32450OooOo) {
            return this.f116650OooOo0o == ((C32450OooOo) obj).f116650OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f116650OooOo0o);
    }

    public final String toString() {
        return OooO00o(this.f116650OooOo0o);
    }
}
