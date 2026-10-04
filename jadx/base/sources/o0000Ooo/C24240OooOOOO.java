package o0000Ooo;

import com.android.billingclient.api.C22189OoooO0;

/* JADX INFO: renamed from: o0000Ooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24240OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24241OooOOOo[] f81496OooO00o = {new C24241OooOOOo(0), new C24241OooOOOo(4294967296L), new C24241OooOOOo(8589934592L)};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f81497OooO0O0 = C22189OoooO0.OooO0o0(Float.NaN, 0);

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final long OooO0O0(long j) {
        return f81496OooO00o[(int) ((j & 1095216660480L) >>> 32)].f81498OooO00o;
    }

    public static final float OooO0OO(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String OooO0Oo(long j) {
        long jOooO0O0 = OooO0O0(j);
        if (C24241OooOOOo.OooO00o(jOooO0O0, 0L)) {
            return "Unspecified";
        }
        if (C24241OooOOOo.OooO00o(jOooO0O0, 4294967296L)) {
            return OooO0OO(j) + ".sp";
        }
        if (!C24241OooOOOo.OooO00o(jOooO0O0, 8589934592L)) {
            return "Invalid";
        }
        return OooO0OO(j) + ".em";
    }
}
