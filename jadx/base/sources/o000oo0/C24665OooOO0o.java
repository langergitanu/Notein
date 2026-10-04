package o000oo0;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: o000oo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24665OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantLock f83551OooO00o = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f83552OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean[] f83553OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f83554OooO0Oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o000oo0.OooOO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f83555OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f83556OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f83557OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f83558OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("NO_OP", 0);
            f83556OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("ADD", 1);
            f83555OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("REMOVE", 2);
            f83558OooOoO0 = oooO00o3;
            OooO00o[] oooO00oArr = {oooO00o, oooO00o2, oooO00o3};
            f83557OooOoO = oooO00oArr;
            OooO.OooO00o.OooO0O0(oooO00oArr);
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f83557OooOoO.clone();
        }
    }

    public C24665OooOO0o(int i) {
        this.f83552OooO0O0 = new long[i];
        this.f83553OooO0OO = new boolean[i];
    }

    public final boolean OooO00o(int[] tableIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f83551OooO00o;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : tableIds) {
                long[] jArr = this.f83552OooO0O0;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.f83554OooO0Oo = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean OooO0O0(int[] tableIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f83551OooO00o;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : tableIds) {
                long[] jArr = this.f83552OooO0O0;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.f83554OooO0Oo = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
