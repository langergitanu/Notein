package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYM3 {
    public static zzYLX zzW(zzYM1 zzym1, zzYLX zzylx) {
        if (zzym1.zzV(zzylx.zzXHv())) {
            return zzym1.zzVO(zzylx.zzOC(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean zzX(zzYIB zzyib) {
        return zzyib.zzYxQ() == 1;
    }

    public static boolean zzY(zzYIB zzyib) {
        return zzyib.zzYxQ() > 1 && zzyib.zzXyD().equals(zzYM2.zzWkF) && (zzyib instanceof zzYI6);
    }

    public static zzYLX zzZ(zzYLX zzylx, BigInteger bigInteger, zzYLX zzylx2, BigInteger bigInteger2) {
        zzYM1 zzym1ZzXHv = zzylx.zzXHv();
        zzYLX zzylxZzX = zzX(zzym1ZzXHv, zzylx2);
        if ((zzym1ZzXHv instanceof zzYM1.zzZ) && ((zzYM1.zzZ) zzym1ZzXHv).zzXzD()) {
            return zzX(zzylx.zzK(bigInteger).zzT(zzylxZzX.zzK(bigInteger2)));
        }
        zzYIM zzyimZzXzG = zzym1ZzXHv.zzXzG();
        return zzyimZzXzG instanceof zzYIL ? zzX(zzZ(new zzYLX[]{zzylx, zzylxZzX}, new BigInteger[]{bigInteger, bigInteger2}, (zzYIL) zzyimZzXzG)) : zzX(zzY(zzylx, bigInteger, zzylxZzX, bigInteger2));
    }

    public static zzYLX zzX(zzYM1 zzym1, zzYLX zzylx) {
        if (zzym1.zzV(zzylx.zzXHv())) {
            return zzym1.zzW(zzylx);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    private static zzYLX zzY(zzYLX zzylx, BigInteger bigInteger, zzYLX zzylx2, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, zzYLI.zzeH(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, zzYLI.zzeH(bigIntegerAbs2.bitLength())));
        zzYLJ zzyljZzZ = zzYLI.zzZ(zzylx, iMax, true);
        zzYLJ zzyljZzZ2 = zzYLI.zzZ(zzylx2, iMax2, true);
        return zzZ(z ? zzyljZzZ.zzXyS() : zzyljZzZ.zzXyT(), z ? zzyljZzZ.zzXyT() : zzyljZzZ.zzXyS(), zzYLI.zzW(iMax, bigIntegerAbs), z2 ? zzyljZzZ2.zzXyS() : zzyljZzZ2.zzXyT(), z2 ? zzyljZzZ2.zzXyT() : zzyljZzZ2.zzXyS(), zzYLI.zzW(iMax2, bigIntegerAbs2));
    }

    public static zzYLX zzX(zzYLX zzylx, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        zzYLX zzylxZzXzM = zzylx.zzXHv().zzXzM();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                zzylxZzXzM = zzylx;
            }
            for (int i = 1; i < iBitLength; i++) {
                zzylx = zzylx.zzXzb();
                if (bigIntegerAbs.testBit(i)) {
                    zzylxZzXzM = zzylxZzXzM.zzT(zzylx);
                }
            }
        }
        return bigInteger.signum() < 0 ? zzylxZzXzM.zzXzc() : zzylxZzXzM;
    }

    public static void zzZ(zzYM0[] zzym0Arr, int i, zzYM0 zzym0) {
        zzYM0[] zzym0Arr2 = new zzYM0[i];
        zzym0Arr2[0] = zzym0Arr[0];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                break;
            }
            zzym0Arr2[i3] = zzym0Arr2[i2].zzU(zzym0Arr[i3]);
            i2 = i3;
        }
        if (zzym0 != null) {
            zzym0Arr2[i2] = zzym0Arr2[i2].zzU(zzym0);
        }
        zzYM0 zzym0ZzXzx = zzym0Arr2[i2].zzXzx();
        while (i2 > 0) {
            int i4 = i2 - 1;
            zzYM0 zzym02 = zzym0Arr[i2];
            zzym0Arr[i2] = zzym0Arr2[i4].zzU(zzym0ZzXzx);
            zzym0ZzXzx = zzym0ZzXzx.zzU(zzym02);
            i2 = i4;
        }
        zzym0Arr[0] = zzym0ZzXzx;
    }

    public static zzYLX zzX(zzYLX zzylx) {
        if (zzylx.zzu(false, false)) {
            return zzylx;
        }
        throw new IllegalStateException("Invalid result");
    }

    public static zzYLX zzZ(zzYLX zzylx, BigInteger bigInteger, zzYLW zzylw, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, zzYLI.zzeH(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        zzYLX zzylxZzZ = zzYLI.zzZ(zzylx, iMax, zzylw);
        zzYLJ zzyljZzM = zzYLI.zzM(zzylx);
        zzYLJ zzyljZzM2 = zzYLI.zzM(zzylxZzZ);
        return zzZ(z ? zzyljZzM.zzXyS() : zzyljZzM.zzXyT(), z ? zzyljZzM.zzXyT() : zzyljZzM.zzXyS(), zzYLI.zzW(iMax, bigIntegerAbs), z2 ? zzyljZzM2.zzXyS() : zzyljZzM2.zzXyT(), z2 ? zzyljZzM2.zzXyT() : zzyljZzM2.zzXyS(), zzYLI.zzW(iMax, bigIntegerAbs2));
    }

    private static zzYLX zzZ(zzYLX[] zzylxArr, zzYLX[] zzylxArr2, byte[] bArr, zzYLX[] zzylxArr3, zzYLX[] zzylxArr4, byte[] bArr2) {
        zzYLX zzylxZzT;
        int iMax = Math.max(bArr.length, bArr2.length);
        zzYLX zzylxZzXzM = zzylxArr[0].zzXHv().zzXzM();
        int i = iMax - 1;
        int i2 = 0;
        zzYLX zzylxZzR = zzylxZzXzM;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    zzylxZzT = zzylxZzXzM.zzT((b < 0 ? zzylxArr2 : zzylxArr)[Math.abs((int) b) >>> 1]);
                } else {
                    zzylxZzT = zzylxZzXzM;
                }
                if (b2 != 0) {
                    zzylxZzT = zzylxZzT.zzT((b2 < 0 ? zzylxArr4 : zzylxArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    zzylxZzR = zzylxZzR.zzeP(i2);
                    i2 = 0;
                }
                zzylxZzR = zzylxZzR.zzR(zzylxZzT);
            }
            i--;
        }
        return i2 > 0 ? zzylxZzR.zzeP(i2) : zzylxZzR;
    }

    private static zzYLX zzZ(zzYLX[] zzylxArr, BigInteger[] bigIntegerArr, zzYIL zzyil) {
        zzYM1 zzym1ZzXHv = zzylxArr[0].zzXHv();
        BigInteger bigIntegerMultiply = zzym1ZzXHv.getOrder().multiply(zzym1ZzXHv.zzXzI());
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            BigInteger[] bigIntegerArrZzC = zzyil.zzC(bigIntegerArr[i2].mod(bigIntegerMultiply));
            int i3 = i + 1;
            bigIntegerArr2[i] = bigIntegerArrZzC[0];
            i += 2;
            bigIntegerArr2[i3] = bigIntegerArrZzC[1];
        }
        return zzZ(zzylxArr, zzyil.zzXyO(), bigIntegerArr2);
    }

    private static zzYLX zzZ(zzYLX[] zzylxArr, zzYLW zzylw, BigInteger[] bigIntegerArr) {
        int length = zzylxArr.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        zzYLJ[] zzyljArr = new zzYLJ[i];
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            boolean z = true;
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            if (bigInteger2.signum() >= 0) {
                z = false;
            }
            zArr[i4] = z;
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, zzYLI.zzeH(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
            zzYLX zzylx = zzylxArr[i2];
            zzYLX zzylxZzZ = zzYLI.zzZ(zzylx, iMax, zzylw);
            zzyljArr[i3] = zzYLI.zzM(zzylx);
            zzyljArr[i4] = zzYLI.zzM(zzylxZzZ);
            bArr[i3] = zzYLI.zzW(iMax, bigIntegerAbs);
            bArr[i4] = zzYLI.zzW(iMax, bigIntegerAbs2);
        }
        return zzZ(zArr, zzyljArr, bArr);
    }

    private static zzYLX zzZ(boolean[] zArr, zzYLJ[] zzyljArr, byte[][] bArr) {
        int length = bArr.length;
        int iMax = 0;
        for (byte[] bArr2 : bArr) {
            iMax = Math.max(iMax, bArr2.length);
        }
        zzYLX zzylxZzXzM = zzyljArr[0].zzXyT()[0].zzXHv().zzXzM();
        int i = iMax - 1;
        int i2 = 0;
        zzYLX zzylxZzR = zzylxZzXzM;
        while (i >= 0) {
            zzYLX zzylxZzT = zzylxZzXzM;
            for (int i3 = 0; i3 < length; i3++) {
                byte[] bArr3 = bArr[i3];
                byte b = i < bArr3.length ? bArr3[i] : (byte) 0;
                if (b != 0) {
                    int iAbs = Math.abs((int) b);
                    zzYLJ zzylj = zzyljArr[i3];
                    zzylxZzT = zzylxZzT.zzT(((b < 0) == zArr[i3] ? zzylj.zzXyT() : zzylj.zzXyS())[iAbs >>> 1]);
                }
            }
            if (zzylxZzT == zzylxZzXzM) {
                i2++;
            } else {
                if (i2 > 0) {
                    zzylxZzR = zzylxZzR.zzeP(i2);
                    i2 = 0;
                }
                zzylxZzR = zzylxZzR.zzR(zzylxZzT);
            }
            i--;
        }
        return i2 > 0 ? zzylxZzR.zzeP(i2) : zzylxZzR;
    }
}
