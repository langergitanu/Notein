package o00oOoO0;

import kotlin.jvm.internal.OooOOO0;
import o00oOOO0.InterfaceC25581OooO00o;

/* JADX INFO: renamed from: o00oOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25616OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25581OooO00o f87414OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f87415OooO0O0;

    public C25616OooO00o(InterfaceC25581OooO00o animationInformation) {
        OooOOO0.OooO0oO(animationInformation, "animationInformation");
        this.f87414OooO00o = animationInformation;
        this.f87415OooO0O0 = -1L;
    }

    public final long OooO00o() {
        long j = this.f87415OooO0O0;
        if (j != -1) {
            return j;
        }
        this.f87415OooO0O0 = 0L;
        InterfaceC25581OooO00o interfaceC25581OooO00o = this.f87414OooO00o;
        int iOooO0O0 = interfaceC25581OooO00o.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            this.f87415OooO0O0 += (long) interfaceC25581OooO00o.OooO0OO(i);
        }
        return this.f87415OooO0O0;
    }
}
