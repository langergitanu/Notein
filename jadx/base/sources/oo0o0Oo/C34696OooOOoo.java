package oo0o0Oo;

import OooO0Oo.C20398OooO0O0;
import o00o00Oo.C25256OooO00o;

/* JADX INFO: renamed from: oo0o0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34696OooOOoo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f124978OooO0O0 = C25256OooO00o.OooO0OO(0, 0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f124979OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f124980OooO00o;

    public /* synthetic */ C34696OooOOoo(long j) {
        this.f124980OooO00o = j;
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final boolean OooO0O0(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int OooO0OO(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return i > i2 ? i : i2;
    }

    public static final int OooO0Oo(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return i > i2 ? i2 : i;
    }

    public static String OooO0o(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return C20398OooO0O0.OooO00o(')', sb, (int) (j & 4294967295L));
    }

    public static final boolean OooO0o0(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34696OooOOoo) {
            return this.f124980OooO00o == ((C34696OooOOoo) obj).f124980OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f124980OooO00o);
    }

    public final String toString() {
        return OooO0o(this.f124980OooO00o);
    }
}
