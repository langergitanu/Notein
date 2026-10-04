package oO0oO00;

import oO0o.InterfaceC33531OooO0o0;
import ooOOoOO0.C35126OooOOo0;

/* JADX INFO: renamed from: oO0oO00.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33958OooOoo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long[] f122168OooO0o0 = new long[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f122169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35126OooOOo0.OooO00o f122170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f122171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f122172OooO0Oo;

    public C33958OooOoo(InterfaceC33531OooO0o0 descriptor, C35126OooOOo0.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f122169OooO00o = descriptor;
        this.f122170OooO0O0 = oooO00o;
        int iOooO0o0 = descriptor.OooO0o0();
        if (iOooO0o0 <= 64) {
            this.f122171OooO0OO = iOooO0o0 != 64 ? (-1) << iOooO0o0 : 0L;
            this.f122172OooO0Oo = f122168OooO0o0;
            return;
        }
        this.f122171OooO0OO = 0L;
        int i = (iOooO0o0 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iOooO0o0 & 63) != 0) {
            jArr[i - 1] = (-1) << iOooO0o0;
        }
        this.f122172OooO0Oo = jArr;
    }
}
