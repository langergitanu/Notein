package o0000Ooo;

import OooO0Oo.C20398OooO0O0;

/* JADX INFO: renamed from: o0000Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24226OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f81468OooO0O0 = C24235OooOO0.OooO00o(0, 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f81469OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81470OooO00o;

    public static String OooO00o(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return C20398OooO0O0.OooO00o(')', sb, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24226OooO) {
            return this.f81470OooO00o == ((C24226OooO) obj).f81470OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81470OooO00o);
    }

    public final String toString() {
        return OooO00o(this.f81470OooO00o);
    }
}
