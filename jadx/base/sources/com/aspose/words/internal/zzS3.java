package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes5.dex */
public final class zzS3 {
    private int zzO1;
    private long zzO3;
    private long zzO4;
    private long zzO5;
    private int order = 16;
    private long zzOb = 4129;
    private int zzOa = 1;
    private long zzO9 = C18177fb.f54859s;
    private long zzO8 = 0;
    private int zzO7 = 0;
    private int zzO6 = 0;
    private long[] zzO2 = new long[256];

    public zzS3() {
        zzRw();
    }

    private void zzRv() {
        for (int i = 0; i < 256; i++) {
            long jZzS = i;
            if (this.zzO7 != 0) {
                jZzS = zzS(jZzS, 8);
            }
            long jZzS2 = jZzS << (this.order - 8);
            for (int i2 = 0; i2 < 8; i2++) {
                long j = this.zzO4 & jZzS2;
                jZzS2 <<= 1;
                if (j != 0) {
                    jZzS2 ^= this.zzOb;
                }
            }
            if (this.zzO7 != 0) {
                jZzS2 = zzS(jZzS2, this.order);
            }
            this.zzO2[i] = jZzS2 & this.zzO5;
        }
    }

    private void zzRw() {
        this.zzO1 = 1;
        this.order = 32;
        this.zzOa = 1;
        this.zzOb = 79764919L;
        this.zzO9 = 4294967295L;
        this.zzO8 = 4294967295L;
        this.zzO7 = 1;
        this.zzO6 = 1;
        this.zzO5 = (((1 << (32 - 1)) - 1) << 1) | 1;
        this.zzO4 = 1 << (32 - 1);
        zzRv();
        if (this.zzOa != 0) {
            this.zzO3 = this.zzO9;
            return;
        }
        long j = this.zzO9;
        for (int i = 0; i < this.order; i++) {
            long j2 = this.zzO4 & j;
            j <<= 1;
            if (j2 != 0) {
                j ^= this.zzOb;
            }
        }
        this.zzO3 = j & this.zzO5;
    }

    private static long zzS(long j, int i) {
        long j2 = 1;
        long j3 = 0;
        for (long j4 = 1 << (i - 1); j4 != 0; j4 >>= 1) {
            if ((j & j4) != 0) {
                j3 |= j2;
            }
            j2 <<= 1;
        }
        return j3;
    }

    public final int zzG(byte[] bArr) {
        long jZzS = this.zzO3;
        if (this.zzO7 != 0) {
            jZzS = zzS(jZzS, this.order);
        }
        int i = 0;
        if (this.zzO7 == 0) {
            while (i < bArr.length) {
                jZzS = this.zzO2[(int) (((jZzS >> (this.order - 8)) & 255) ^ ((long) (bArr[i] & 255)))] ^ (jZzS << 8);
                i++;
            }
        } else {
            while (i < bArr.length) {
                jZzS = this.zzO2[(int) ((jZzS & 255) ^ ((long) (bArr[i] & 255)))] ^ (jZzS >> 8);
                i++;
            }
        }
        if ((this.zzO6 ^ this.zzO7) != 0) {
            jZzS = zzS(jZzS, this.order);
        }
        return (int) ((jZzS ^ this.zzO8) & this.zzO5);
    }
}
