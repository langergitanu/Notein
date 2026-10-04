package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.bs */
/* JADX INFO: loaded from: classes3.dex */
class C3037bs {

    /* JADX INFO: renamed from: h4 */
    private static final long[] f8902h4 = {1116352408, 1899447441, 3049323471L, 3921009573L, 961987163, 1508970993, 2453635748L, 2870763221L, 3624381080L, 310598401, 607225278, 1426881987, 1925078388, 2162078206L, 2614888103L, 3248222580L, 3835390401L, 4022224774L, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, 2554220882L, 2821834349L, 2952996808L, 3210313671L, 3336571891L, 3584528711L, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, 2177026350L, 2456956037L, 2730485921L, 2820302411L, 3259730800L, 3345764771L, 3516065817L, 3600352804L, 4094571909L, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, 2227730452L, 2361852424L, 2428436474L, 2756734187L, 3204031479L, 3329325298L};

    /* JADX INFO: renamed from: du */
    private long[] f8903du = {1779033703, 3144134277L, 1013904242, 2773480762L, 1359893119, 2600822924L, 528734635, 1541459225};

    /* JADX INFO: renamed from: k4 */
    private byte[] f8904k4;

    /* JADX INFO: renamed from: kk */
    private long f8905kk;

    /* JADX INFO: renamed from: to */
    private byte[] f8906to;

    /* JADX INFO: renamed from: x1 */
    private int f8907x1;

    public C3037bs() {
        m12787k4();
    }

    /* JADX INFO: renamed from: kk */
    private void m12782kk(byte[] bArr, int i, int i2) {
        int iM27461m9 = (int) ((C7019kk.m27461m9(Long.valueOf(this.f8905kk), 11) + C7019kk.m27461m9(Integer.valueOf(i2), 9)) % C7019kk.m27461m9(64, 9));
        int i3 = 56 - iM27461m9;
        if (i3 < 1) {
            i3 = 120 - iM27461m9;
        }
        int i4 = i3 + i2;
        int i5 = i4 + 8;
        byte[] bArr2 = new byte[i5];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) bArr2), 0, i2);
        bArr2[i2] = UnsignedBytes.MAX_POWER_OF_TWO;
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) m12781k4(new long[]{(C7019kk.m27461m9(Integer.valueOf(i2), 9) + C7019kk.m27461m9(Long.valueOf(this.f8905kk), 11)) * 8}, 0, 1)), 0, AbstractC14092to.m67208k4((Object) bArr2), i4, 8);
        m12779k4(bArr2, 0);
        if (i5 == 128) {
            m12779k4(bArr2, 64);
        }
    }

    /* JADX INFO: renamed from: to */
    private static long[] m12783to(byte[] bArr, int i, int i2) {
        if (i2 + i > bArr.length) {
            throw new ArgumentException("OutOfBound");
        }
        if (i2 % 4 != 0) {
            throw new ArgumentException("length");
        }
        int i3 = i2 / 4;
        long[] jArr = new long[i3];
        int i4 = 0;
        while (i4 < i3) {
            jArr[i4] = (((((long) (bArr[i] & 255)) & 4294967295L) << 24) | ((((long) (bArr[i + 1] & 255)) & 4294967295L) << 16) | ((((long) (bArr[i + 2] & 255)) & 4294967295L) << 8) | (((long) (bArr[i + 3] & 255)) & 4294967295L)) & 4294967295L;
            i4++;
            i += 4;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m12784x1() {
        return m12785x1(this.f8904k4, 0, this.f8907x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12787k4() {
        this.f8903du = new long[]{1779033703, 3144134277L, 1013904242, 2773480762L, 1359893119, 2600822924L, 528734635, 1541459225};
        this.f8905kk = 0L;
        this.f8907x1 = 0;
        this.f8904k4 = new byte[64];
    }

    /* JADX INFO: renamed from: k4 */
    private void m12779k4(byte[] bArr, int i) {
        long[] jArr = new long[64];
        long[] jArr2 = this.f8903du;
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr2[2];
        long j4 = jArr2[3];
        long j5 = jArr2[4];
        long j6 = jArr2[5];
        long j7 = jArr2[6];
        long j8 = jArr2[7];
        long[] jArrM12783to = m12783to(bArr, i, 64);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(jArrM12783to), 0, AbstractC14092to.m67208k4(jArr), 0, jArrM12783to.length);
        for (int i2 = 16; i2 < 64; i2++) {
            long j9 = jArr[i2 - 2];
            long j10 = (((((((j9 & 4294967295L) >> 17) | ((j9 & 4294967295L) << 15)) ^ (((j9 & 4294967295L) >> 19) | ((j9 & 4294967295L) << 13))) ^ ((j9 & 4294967295L) >> 10)) & 4294967295L) + (jArr[i2 - 7] & 4294967295L)) & 4294967295L;
            long j11 = jArr[i2 - 15];
            jArr[i2] = (((j10 + ((((((j11 & 4294967295L) >> 7) | ((j11 & 4294967295L) << 25)) ^ (((j11 & 4294967295L) >> 18) | ((j11 & 4294967295L) << 14))) ^ ((j11 & 4294967295L) >> 3)) & 4294967295L)) & 4294967295L) + (jArr[i2 - 16] & 4294967295L)) & 4294967295L;
        }
        int i3 = 0;
        for (int i4 = 64; i3 < i4; i4 = 64) {
            long[] jArr3 = jArr;
            long j12 = j5 & 4294967295L;
            long j13 = (((((((j8 & 4294967295L) + (((((j12 >> 6) | (j12 << 26)) ^ ((j12 >> 11) | (j12 << 21))) ^ ((j12 >> 25) | (j12 << 7))) & 4294967295L)) & 4294967295L) + (((j5 & j6) ^ (((~j12) & 4294967295L) & j7)) & 4294967295L)) & 4294967295L) + (f8902h4[i3] & 4294967295L)) & 4294967295L) + (jArr3[i3] & 4294967295L);
            long j14 = j & 4294967295L;
            long j15 = j13 & 4294967295L;
            long j16 = ((j4 & 4294967295L) + j15) & 4294967295L;
            long j17 = (j15 + (((((((j14 >> 2) | (j14 << 30)) ^ ((j14 >> 13) | (j14 << 19))) ^ ((j14 >> 22) | (j14 << 10))) & 4294967295L) + ((((j & j2) ^ (j & j3)) ^ (j2 & j3)) & 4294967295L)) & 4294967295L)) & 4294967295L;
            i3++;
            j8 = j7;
            j7 = j6;
            j6 = j5;
            j5 = j16;
            j4 = j3;
            j3 = j2;
            j2 = j;
            j = j17;
            jArr = jArr3;
        }
        long[] jArr4 = this.f8903du;
        jArr4[0] = ((jArr4[0] & 4294967295L) + (j & 4294967295L)) & 4294967295L;
        jArr4[1] = ((jArr4[1] & 4294967295L) + (j2 & 4294967295L)) & 4294967295L;
        jArr4[2] = ((jArr4[2] & 4294967295L) + (j3 & 4294967295L)) & 4294967295L;
        jArr4[3] = ((jArr4[3] & 4294967295L) + (j4 & 4294967295L)) & 4294967295L;
        jArr4[4] = ((jArr4[4] & 4294967295L) + (j5 & 4294967295L)) & 4294967295L;
        jArr4[5] = ((jArr4[5] & 4294967295L) + (j6 & 4294967295L)) & 4294967295L;
        jArr4[6] = ((jArr4[6] & 4294967295L) + (j7 & 4294967295L)) & 4294967295L;
        jArr4[7] = ((jArr4[7] & 4294967295L) + (j8 & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m12785x1(byte[] bArr, int i, int i2) {
        m12782kk(bArr, i, i2);
        List list = new List();
        for (long j : this.f8903du) {
            list.addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) m12786x1(new long[]{j}, 0, 1))));
        }
        return C3085sv.m13110x1((List<Byte>) list);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12780k4(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.f8907x1;
        if (i5 > 0) {
            if (i2 < 64 - i5) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) this.f8904k4), this.f8907x1, i2);
                this.f8907x1 += i2;
                return;
            }
            int i6 = 64 - i5;
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) this.f8904k4), this.f8907x1, i6);
            m12779k4(this.f8904k4, 0);
            this.f8905kk += 64;
            this.f8907x1 = 0;
            i += i6;
            i2 -= i6;
        }
        int i7 = 0;
        while (true) {
            i3 = i2 % 64;
            i4 = i2 - i3;
            if (i7 >= i4) {
                break;
            }
            m12779k4(bArr, i + i7);
            this.f8905kk += 64;
            i7 += 64;
        }
        if (i3 != 0) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i4 + i, AbstractC14092to.m67208k4((Object) this.f8904k4), 0, i3);
            this.f8907x1 = i3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m12786x1(long[] jArr, int i, int i2) {
        int i3 = i2 + i;
        if (i3 > jArr.length) {
            throw new ArgumentException("OutOfBound");
        }
        if (i2 > 536870911) {
            throw new ArgumentOutOfRangeException("length");
        }
        byte[] bArr = new byte[i2 * 4];
        for (int i4 = i; i4 < i3; i4++) {
            for (int i5 = 0; i5 < 4; i5++) {
                bArr[(3 - i5) + ((i4 - i) * 4)] = (byte) (((jArr[i4] & 4294967295L) >> (i5 * 8)) & 4294967295L);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m12788k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("message");
        }
        m12780k4(bArr, 0, bArr.length);
        byte[] bArrM12784x1 = m12784x1();
        this.f8906to = bArrM12784x1;
        byte[] bArr2 = (byte[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) bArrM12784x1).deepClone(), byte[].class);
        m12787k4();
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m12781k4(long[] jArr, int i, int i2) {
        int i3 = i2 + i;
        if (i3 > jArr.length) {
            throw new ArgumentException("Length and offset values are out of bound");
        }
        if (i2 > 268435455) {
            throw new ArgumentOutOfRangeException("length");
        }
        byte[] bArr = new byte[i2 * 8];
        for (int i4 = i; i4 < i3; i4++) {
            for (int i5 = 0; i5 < 8; i5++) {
                bArr[(7 - i5) + ((i4 - i) * 8)] = (byte) (jArr[i4] >> (i5 * 8));
            }
        }
        return bArr;
    }
}
