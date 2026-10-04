package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYLI {

    /* JADX INFO: renamed from: aW */
    private static final int[] f51118aW = {13, 41, 121, StyleIdentifier.LIST_TABLE_2_ACCENT_2, 897, 2305};
    private static final byte[] zzWHK = new byte[0];

    /* JADX INFO: renamed from: aX */
    private static final int[] f51119aX = new int[0];

    /* JADX INFO: renamed from: aY */
    private static final zzYLX[] f51120aY = new zzYLX[0];

    public static int zzF(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    private static byte[] zzG(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return zzWHK;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength - 1;
        byte[] bArr = new byte[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = 1;
        while (i2 < i) {
            if (bigIntegerXor.testBit(i2)) {
                bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                i2++;
            }
            i2++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    private static int[] zzH(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f51119aX;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength >> 1;
        int[] iArr = new int[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = iBitLength - 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < i2) {
            if (bigIntegerXor.testBit(i4)) {
                iArr[i3] = i5 | ((bigInteger.testBit(i4) ? -1 : 1) << 16);
                i4++;
                i5 = 1;
                i3++;
            } else {
                i5++;
            }
            i4++;
        }
        int i6 = i3 + 1;
        iArr[i3] = 65536 | i5;
        return i > i6 ? zzR(iArr, i6) : iArr;
    }

    public static zzYLJ zzM(zzYLX zzylx) {
        return zzY(zzylx.zzXHv().zzZ(zzylx, "bc_wnaf"));
    }

    private static int[] zzR(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static byte[] zzW(int i, BigInteger bigInteger) {
        if (i == 2) {
            return zzG(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return zzWHK;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                int i7 = i6 + i5;
                bArr[i7] = (byte) iIntValue;
                i6 = i7 + 1;
                i5 = i;
            }
        }
        return iBitLength > i6 ? zzZS(bArr, i6) : bArr;
    }

    private static zzYLJ zzY(zzYLP zzylp) {
        if (zzylp instanceof zzYLJ) {
            return (zzYLJ) zzylp;
        }
        return null;
    }

    public static zzYLX zzZ(zzYLX zzylx, int i, zzYLW zzylw) {
        zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        zzYLJ zzyljZzZ = zzZ(zzylx, i, true);
        zzYLX zzylxZzQ = zzylw.zzQ(zzylx);
        zzym1ZzXHv.zzZ(zzylxZzQ, "bc_wnaf", new zzYLQ(zzylw, true) { // from class: com.aspose.words.internal.zzYLI.1

            /* JADX INFO: renamed from: ba */
            final /* synthetic */ zzYLW f51122ba;

            /* JADX INFO: renamed from: bb */
            final /* synthetic */ boolean f51123bb = true;

            @Override // com.aspose.words.internal.zzYLQ
            public final zzYLP zzZ(zzYLP zzylp) {
                zzYLJ zzylj = new zzYLJ();
                zzYLX zzylxZzXyR = this.f51121aZ.zzXyR();
                if (zzylxZzXyR != null) {
                    zzylj.zzN(this.f51122ba.zzQ(zzylxZzXyR));
                }
                zzYLX[] zzylxArrZzXyT = this.f51121aZ.zzXyT();
                int length = zzylxArrZzXyT.length;
                zzYLX[] zzylxArr = new zzYLX[length];
                for (int i2 = 0; i2 < zzylxArrZzXyT.length; i2++) {
                    zzylxArr[i2] = this.f51122ba.zzQ(zzylxArrZzXyT[i2]);
                }
                zzylj.zzY(zzylxArr);
                if (this.f51123bb) {
                    zzYLX[] zzylxArr2 = new zzYLX[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        zzylxArr2[i3] = zzylxArr[i3].zzXzc();
                    }
                    zzylj.zzX(zzylxArr2);
                }
                return zzylj;
            }
        });
        return zzylxZzQ;
    }

    private static byte[] zzZS(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static int zzeH(int i) {
        return zzM(i, f51118aW);
    }

    private static int zzM(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static int[] zzX(int i, BigInteger bigInteger) {
        if (i == 2) {
            return zzH(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f51119aX;
        }
        int iBitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                iArr[i6] = i5 | (iIntValue << 16);
                i5 = i;
                i6++;
            }
        }
        return iBitLength > i6 ? zzR(iArr, i6) : iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYLX[] zzY(zzYLX[] zzylxArr, int i) {
        zzYLX[] zzylxArr2 = new zzYLX[i];
        System.arraycopy(zzylxArr, 0, zzylxArr2, 0, zzylxArr.length);
        return zzylxArr2;
    }

    public static zzYLJ zzZ(final zzYLX zzylx, final int i, boolean z) {
        final zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        final boolean z2 = true;
        return (zzYLJ) zzym1ZzXHv.zzZ(zzylx, "bc_wnaf", new zzYLQ() { // from class: com.aspose.words.internal.zzYLI.2
            private static boolean zzW(zzYLX[] zzylxArr, int i2) {
                return zzylxArr != null && zzylxArr.length >= i2;
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x00c6 A[PHI: r12
              0x00c6: PHI (r12v6 com.aspose.words.internal.zzYLX) = 
              (r12v4 com.aspose.words.internal.zzYLX)
              (r12v9 com.aspose.words.internal.zzYLX)
              (r12v9 com.aspose.words.internal.zzYLX)
              (r12v9 com.aspose.words.internal.zzYLX)
              (r12v9 com.aspose.words.internal.zzYLX)
             binds: [B:25:0x0064, B:27:0x0070, B:29:0x007c, B:31:0x0086, B:37:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.aspose.words.internal.zzYLQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final zzYLP zzZ(zzYLP zzylp) {
                zzYLX zzylxZzXzb;
                zzYLX[] zzylxArrZzY;
                zzYLX[] zzylxArrZzY2;
                int length;
                int i2;
                zzYLX zzylxZzX;
                int iZzXzH;
                zzYM0 zzym0ZzeQ = null;
                zzYLJ zzylj = zzylp instanceof zzYLJ ? (zzYLJ) zzylp : null;
                int length2 = 0;
                int iMax = 1 << Math.max(0, i - 2);
                if (zzZ(zzylj, iMax, z2)) {
                    return zzylj;
                }
                if (zzylj != null) {
                    zzylxArrZzY = zzylj.zzXyT();
                    zzylxArrZzY2 = zzylj.zzXyS();
                    zzylxZzXzb = zzylj.zzXyR();
                } else {
                    zzylxZzXzb = null;
                    zzylxArrZzY = null;
                    zzylxArrZzY2 = null;
                }
                if (zzylxArrZzY == null) {
                    zzylxArrZzY = zzYLI.f51120aY;
                    length = 0;
                } else {
                    length = zzylxArrZzY.length;
                }
                if (length < iMax) {
                    zzylxArrZzY = zzYLI.zzY(zzylxArrZzY, iMax);
                    if (iMax == 1) {
                        zzylxArrZzY[0] = zzylx.zzXze();
                    } else {
                        if (length == 0) {
                            zzylxArrZzY[0] = zzylx;
                            i2 = 1;
                        } else {
                            i2 = length;
                        }
                        if (iMax == 2) {
                            zzylxArrZzY[1] = zzylx.zzXza();
                        } else {
                            zzYLX zzylxZzT = zzylxArrZzY[i2 - 1];
                            if (zzylxZzXzb == null) {
                                zzylxZzXzb = zzylxArrZzY[0].zzXzb();
                                if (zzylxZzXzb.zzXzd() || !zzYM3.zzX(zzym1ZzXHv.zzXzL()) || zzym1ZzXHv.getFieldSize() < 64 || !((iZzXzH = zzym1ZzXHv.zzXzH()) == 2 || iZzXzH == 3 || iZzXzH == 4)) {
                                    zzylxZzX = zzylxZzXzb;
                                } else {
                                    zzym0ZzeQ = zzylxZzXzb.zzeQ(0);
                                    zzylxZzX = zzym1ZzXHv.zzX(zzylxZzXzb.zzXzl().toBigInteger(), zzylxZzXzb.zzXzk().toBigInteger());
                                    zzYM0 zzym0ZzXzy = zzym0ZzeQ.zzXzy();
                                    zzylxZzT = zzylxZzT.zzQ(zzym0ZzXzy).zzP(zzym0ZzXzy.zzU(zzym0ZzeQ));
                                    if (length == 0) {
                                        zzylxArrZzY[0] = zzylxZzT;
                                    }
                                }
                                while (i2 < iMax) {
                                    zzylxZzT = zzylxZzT.zzT(zzylxZzX);
                                    zzylxArrZzY[i2] = zzylxZzT;
                                    i2++;
                                }
                            }
                        }
                        zzym1ZzXHv.zzZ(zzylxArrZzY, length, iMax - length, zzym0ZzeQ);
                    }
                }
                if (z2) {
                    if (zzylxArrZzY2 == null) {
                        zzylxArrZzY2 = new zzYLX[iMax];
                    } else {
                        length2 = zzylxArrZzY2.length;
                        if (length2 < iMax) {
                            zzylxArrZzY2 = zzYLI.zzY(zzylxArrZzY2, iMax);
                        }
                    }
                    while (length2 < iMax) {
                        zzylxArrZzY2[length2] = zzylxArrZzY[length2].zzXzc();
                        length2++;
                    }
                }
                zzYLJ zzylj2 = new zzYLJ();
                zzylj2.zzY(zzylxArrZzY);
                zzylj2.zzX(zzylxArrZzY2);
                zzylj2.zzN(zzylxZzXzb);
                return zzylj2;
            }

            private static boolean zzZ(zzYLJ zzylj, int i2, boolean z3) {
                if (zzylj == null || !zzW(zzylj.zzXyT(), i2)) {
                    return false;
                }
                return !z3 || zzW(zzylj.zzXyS(), i2);
            }
        });
    }
}
