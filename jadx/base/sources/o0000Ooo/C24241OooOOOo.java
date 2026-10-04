package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24241OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81498OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24241OooOOOo) {
            return this.f81498OooO00o == ((C24241OooOOOo) obj).f81498OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81498OooO00o);
    }

    public final String toString() {
        long j = this.f81498OooO00o;
        return OooO00o(j, 0L) ? "Unspecified" : OooO00o(j, 4294967296L) ? "Sp" : OooO00o(j, 8589934592L) ? "Em" : "Invalid";
    }
}
