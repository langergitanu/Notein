package oO0oo0;

import java.security.SecureRandom;

/* JADX INFO: renamed from: oO0oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34227OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34228OooO0O0 f122938OooO00o;

    public C34227OooO00o(C34228OooO0O0 c34228OooO0O0) {
        this.f122938OooO00o = c34228OooO0O0;
    }

    public final byte[] OooO00o() {
        SecureRandom secureRandom = this.f122938OooO00o.f122939OooO00o;
        if (!(secureRandom instanceof C34229OooO0OO)) {
            return secureRandom.generateSeed(48);
        }
        byte[] bArr = new byte[48];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
