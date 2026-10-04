package oO0oo0;

import java.security.SecureRandom;
import oO0oOoo.C34205OooO00o;
import oO0oo0O0.C34243OooO00o;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34229OooO0OO extends SecureRandom {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final SecureRandom f122940OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34230OooO0Oo f122941OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C34243OooO00o f122942OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34227OooO00o f122943OooOoO0;

    public C34229OooO0OO(SecureRandom secureRandom, C34227OooO00o c34227OooO00o, C34230OooO0Oo c34230OooO0Oo) {
        this.f122940OooOo = secureRandom;
        this.f122943OooOoO0 = c34227OooO00o;
        this.f122941OooOo0o = c34230OooO0Oo;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        int i2 = i * 8;
        C34227OooO00o c34227OooO00o = this.f122943OooOoO0;
        c34227OooO00o.getClass();
        if (i2 <= 384) {
            System.arraycopy(c34227OooO00o.OooO00o(), 0, bArr, 0, i);
            return bArr;
        }
        for (int i3 = 0; i3 < i; i3 += 48) {
            byte[] bArrOooO00o = c34227OooO00o.OooO00o();
            int i4 = i - i3;
            if (bArrOooO00o.length <= i4) {
                System.arraycopy(bArrOooO00o, 0, bArr, i3, bArrOooO00o.length);
            } else {
                System.arraycopy(bArrOooO00o, 0, bArr, i3, i4);
            }
        }
        return bArr;
    }

    @Override // java.security.SecureRandom
    public final String getAlgorithm() {
        C34205OooO00o c34205OooO00o = this.f122941OooOo0o.f122944OooO00o;
        return "CTR-DRBG-AES256";
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f122942OooOoO == null) {
                    this.f122942OooOoO = this.f122941OooOo0o.OooO00o(this.f122943OooOoO0);
                }
                if (this.f122942OooOoO.OooO0o0(bArr) < 0) {
                    C34243OooO00o c34243OooO00o = this.f122942OooOoO;
                    c34243OooO00o.OooO0O0(c34243OooO00o.OooO00o(c34243OooO00o.f122987OooO0Oo, C34332OooO00o.OooO00o(c34243OooO00o.OooO0o())), c34243OooO00o.f122988OooO0o, c34243OooO00o.f122990OooO0oO);
                    c34243OooO00o.f122991OooO0oo = 1L;
                    this.f122942OooOoO.OooO0o0(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.f122940OooOo;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.f122940OooOo;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
