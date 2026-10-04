package oO0oo00O;

import OooOOO0.AbstractC20449OooO0Oo;

/* JADX INFO: renamed from: oO0oo00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34233OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f122971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long[][] f122972OooO0O0;

    public final void OooO00o(byte[] bArr) {
        long[] jArr = this.f122972OooO0O0[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f122972OooO0O0[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        AbstractC20449OooO0Oo.Oooo0(j, bArr, 0);
        AbstractC20449OooO0Oo.Oooo0(j2, bArr, 8);
    }
}
