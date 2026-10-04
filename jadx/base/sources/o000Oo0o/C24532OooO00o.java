package o000Oo0o;

/* JADX INFO: renamed from: o000Oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24532OooO00o {

    /* JADX INFO: renamed from: o000Oo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19625OooO00o {
        public static float OooO00o(long j, long j2, float f) {
            if (j < j2) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j2 == 0) {
                return 0.0f;
            }
            long j3 = j % j2;
            if (j3 + ((((j3 ^ j2) & ((-j3) | j3)) >> 63) & j2) != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long jOooO0OO = oO0O00O.OooO00o.OooO0OO(((double) f) * j) % j2;
            return (jOooO0OO + ((((jOooO0OO ^ j2) & ((-jOooO0OO) | jOooO0OO)) >> 63) & j2)) / j2;
        }
    }
}
