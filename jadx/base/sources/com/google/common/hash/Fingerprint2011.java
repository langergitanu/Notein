package com.google.common.hash;

import OooOoo.C20593OooO0Oo;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();

    /* JADX INFO: renamed from: K0 */
    private static final long f51712K0 = -6505348102511208375L;

    /* JADX INFO: renamed from: K1 */
    private static final long f51713K1 = -8261664234251669945L;

    /* JADX INFO: renamed from: K2 */
    private static final long f51714K2 = -4288712594273399085L;

    /* JADX INFO: renamed from: K3 */
    private static final long f51715K3 = -4132994306676758123L;

    public static long fingerprint(byte[] bArr, int i, int i2) {
        long jMurmurHash64WithSeed = i2 <= 32 ? murmurHash64WithSeed(bArr, i, i2, -1397348546323613475L) : i2 <= 64 ? hashLength33To64(bArr, i, i2) : fullFingerprint(bArr, i, i2);
        long jLoad64 = f51712K0;
        long jLoad642 = i2 >= 8 ? LittleEndianByteArray.load64(bArr, i) : -6505348102511208375L;
        if (i2 >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bArr, (i + i2) - 8);
        }
        long jHash128to64 = hash128to64(jMurmurHash64WithSeed + jLoad64, jLoad642);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i);
        int i3 = i + i2;
        long jLoad642 = LittleEndianByteArray.load64(bArr2, i3 - 16) ^ f51713K1;
        long jLoad643 = f51712K0 ^ LittleEndianByteArray.load64(bArr2, i3 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j = i2;
        weakHashLength32WithSeeds(bArr2, i3 - 64, j, jLoad642, jArr);
        long[] jArr3 = jArr;
        weakHashLength32WithSeeds(bArr2, i3 - 32, j * f51713K1, f51712K0, jArr2);
        long[] jArr4 = jArr2;
        long jShiftMix = (shiftMix(jArr3[1]) * f51713K1) + jLoad643;
        long jRotateRight = Long.rotateRight(jLoad64 + jShiftMix, 39) * f51713K1;
        int i4 = (i2 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jLoad642, 33) * f51713K1;
        long j2 = jRotateRight;
        long j3 = jShiftMix;
        int i5 = i;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j2 + jRotateRight2 + jArr3[0] + LittleEndianByteArray.load64(bArr2, i5 + 16), 37) * f51713K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr3[1] + LittleEndianByteArray.load64(bArr2, i5 + 48), 42) * f51713K1;
            long j4 = jRotateRight3 ^ jArr4[1];
            long j5 = jRotateRight4 ^ jArr3[0];
            long jRotateRight5 = Long.rotateRight(j3 ^ jArr4[0], 33);
            long[] jArr5 = jArr3;
            weakHashLength32WithSeeds(bArr2, i5, jArr3[1] * f51713K1, j4 + jArr4[0], jArr5);
            int i6 = i5;
            long[] jArr6 = jArr4;
            weakHashLength32WithSeeds(bArr, i6 + 32, jRotateRight5 + jArr4[1], j5, jArr6);
            i5 = i6 + 64;
            i4 -= 64;
            if (i4 == 0) {
                return hash128to64(C20593OooO0Oo.OooO00o(shiftMix(j5), f51713K1, hash128to64(jArr5[0], jArr6[0]), j4), hash128to64(jArr5[1], jArr6[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr4 = jArr6;
            jArr3 = jArr5;
            j3 = j4;
            jRotateRight2 = j5;
            j2 = jRotateRight5;
        }
    }

    public static long hash128to64(long j, long j2) {
        long j3 = (j2 ^ j) * f51715K3;
        long j4 = (j ^ (j3 ^ (j3 >>> 47))) * f51715K3;
        return (j4 ^ (j4 >>> 47)) * f51715K3;
    }

    private static long hashLength33To64(byte[] bArr, int i, int i2) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i + 24);
        int i3 = i + i2;
        int i4 = i3 - 16;
        long jLoad642 = ((((long) i2) + LittleEndianByteArray.load64(bArr, i4)) * f51712K0) + LittleEndianByteArray.load64(bArr, i);
        long jRotateRight = Long.rotateRight(jLoad642 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad642, 37);
        long jLoad643 = jLoad642 + LittleEndianByteArray.load64(bArr, i + 8);
        long jRotateRight3 = Long.rotateRight(jLoad643, 7) + jRotateRight2;
        int i5 = i + 16;
        long jLoad644 = jLoad643 + LittleEndianByteArray.load64(bArr, i5);
        long j = jLoad64 + jLoad644;
        long jRotateRight4 = Long.rotateRight(jLoad644, 31) + jRotateRight + jRotateRight3;
        long jLoad645 = LittleEndianByteArray.load64(bArr, i5) + LittleEndianByteArray.load64(bArr, i3 - 32);
        long jLoad646 = LittleEndianByteArray.load64(bArr, i3 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad645 + jLoad646, 52);
        long jRotateRight6 = Long.rotateRight(jLoad645, 37);
        long jLoad647 = jLoad645 + LittleEndianByteArray.load64(bArr, i3 - 24);
        long jRotateRight7 = Long.rotateRight(jLoad647, 7) + jRotateRight6;
        long jLoad648 = jLoad647 + LittleEndianByteArray.load64(bArr, i4);
        return shiftMix((shiftMix(((jLoad648 + jLoad646 + jRotateRight4) * f51712K0) + ((Long.rotateRight(jLoad648, 31) + jRotateRight5 + jRotateRight7 + j) * f51714K2)) * f51712K0) + jRotateRight4) * f51714K2;
    }

    public static long murmurHash64WithSeed(byte[] bArr, int i, int i2, long j) {
        int i3 = i2 & (-8);
        int i4 = i2 & 7;
        long jLoad64Safely = j ^ (((long) i2) * f51715K3);
        for (int i5 = 0; i5 < i3; i5 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bArr, i + i5) * f51715K3) * f51715K3)) * f51715K3;
        }
        if (i4 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bArr, i + i3, i4) ^ jLoad64Safely) * f51715K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * f51715K3);
    }

    private static long shiftMix(long j) {
        return j ^ (j >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i);
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        long jLoad643 = LittleEndianByteArray.load64(bArr, i + 16);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i + 24);
        long j3 = j + jLoad64;
        long j4 = jLoad642 + j3 + jLoad643;
        long jRotateRight = Long.rotateRight(j4, 23) + Long.rotateRight(j2 + j3 + jLoad644, 51);
        jArr[0] = j4 + jLoad644;
        jArr[1] = jRotateRight + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
