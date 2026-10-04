package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;
import com.aspose.words.internal.zzYM1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYLM {

    /* JADX INFO: renamed from: aJ */
    private static final BigInteger f51134aJ;

    /* JADX INFO: renamed from: aK */
    private static final BigInteger f51135aK;

    /* JADX INFO: renamed from: aL */
    private static final BigInteger f51136aL;

    /* JADX INFO: renamed from: aM */
    public static final zzYLF[] f51137aM;

    /* JADX INFO: renamed from: aN */
    public static final byte[][] f51138aN;

    /* JADX INFO: renamed from: aO */
    public static final zzYLF[] f51139aO;

    /* JADX INFO: renamed from: aP */
    public static final byte[][] f51140aP;

    static {
        BigInteger bigInteger = zzYM2.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        f51134aJ = bigIntegerNegate;
        f51135aK = zzYM2.zzWkF.negate();
        BigInteger bigIntegerNegate2 = zzYM2.f51193K.negate();
        f51136aL = bigIntegerNegate2;
        BigInteger bigInteger2 = zzYM2.ZERO;
        f51137aM = new zzYLF[]{null, new zzYLF(bigInteger, bigInteger2), null, new zzYLF(bigIntegerNegate2, bigIntegerNegate), null, new zzYLF(bigIntegerNegate, bigIntegerNegate), null, new zzYLF(bigInteger, bigIntegerNegate), null};
        f51138aN = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        f51139aO = new zzYLF[]{null, new zzYLF(bigInteger, bigInteger2), null, new zzYLF(bigIntegerNegate2, bigInteger), null, new zzYLF(bigIntegerNegate, bigInteger), null, new zzYLF(bigInteger, bigInteger), null};
        f51140aP = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static BigInteger zz9(byte b) {
        return b == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
    }

    private static int zzI(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(zzYM2.zzWkF)) {
                return 1;
            }
            if (bigInteger.equals(zzYM2.f51194M)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    private static BigInteger zzZ(byte b, zzYLF zzylf) {
        BigInteger bigInteger = zzylf.f51113bg;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        BigInteger bigIntegerMultiply2 = zzylf.f51113bg.multiply(zzylf.f51114bh);
        BigInteger bigInteger2 = zzylf.f51114bh;
        BigInteger bigIntegerShiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b == 1) {
            return bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        if (b == -1) {
            return bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static byte zzeI(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzYLF zzZ(zzYLN zzyln, zzYLN zzyln2, byte b) {
        zzYLN zzylnZzX;
        zzYLN zzylnZzY;
        zzYLN zzylnZzX2;
        if (zzyln2.zzZ9q() != zzyln.zzZ9q()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i = -1;
        int i2 = 1;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerZzXz0 = zzyln.zzXz0();
        BigInteger bigIntegerZzXz02 = zzyln2.zzXz0();
        zzYLN zzylnZzJ = zzyln.zzJ(bigIntegerZzXz0);
        zzYLN zzylnZzJ2 = zzyln2.zzJ(bigIntegerZzXz02);
        zzYLN zzylnZzY2 = zzylnZzJ.zzY(zzylnZzJ);
        if (b == 1) {
            zzylnZzX = zzylnZzY2.zzY(zzylnZzJ2);
        } else {
            zzylnZzX = zzylnZzY2.zzX(zzylnZzJ2);
        }
        zzYLN zzylnZzY3 = zzylnZzJ2.zzY(zzylnZzJ2).zzY(zzylnZzJ2);
        zzYLN zzylnZzY4 = zzylnZzY3.zzY(zzylnZzJ2);
        if (b == 1) {
            zzylnZzY = zzylnZzJ.zzX(zzylnZzY3);
            zzylnZzX2 = zzylnZzJ.zzY(zzylnZzY4);
        } else {
            zzylnZzY = zzylnZzJ.zzY(zzylnZzY3);
            zzylnZzX2 = zzylnZzJ.zzX(zzylnZzY4);
        }
        BigInteger bigInteger = zzYM2.ONE;
        byte b2 = 0;
        if (zzylnZzX.compareTo(bigInteger) >= 0) {
            if (zzylnZzY.compareTo(f51134aJ) < 0) {
                i2 = 0;
                b2 = b;
            }
        } else if (zzylnZzX2.compareTo(zzYM2.zzWkF) < 0) {
            i2 = 0;
        }
        if (zzylnZzX.compareTo(f51134aJ) >= 0) {
            if (zzylnZzX2.compareTo(f51135aK) < 0) {
            }
            i = i2;
            return new zzYLF(bigIntegerZzXz0.add(BigInteger.valueOf(i)), bigIntegerZzXz02.add(BigInteger.valueOf(b2)));
        }
        b2 = (byte) (-b);
        i = i2;
        return new zzYLF(bigIntegerZzXz0.add(BigInteger.valueOf(i)), bigIntegerZzXz02.add(BigInteger.valueOf(b2)));
    }

    private static zzYLN zzZ(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = (i + 5) / 2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - (i3 + 10)) - 2) + b));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i3);
        if (bigIntegerAdd.testBit(i3 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(zzYM2.ONE);
        }
        return new zzYLN(bigIntegerShiftRight, 10);
    }

    private static BigInteger[] zzZ(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = zzYM2.zzWkF;
            bigIntegerSubtract = BigInteger.valueOf(b);
        } else {
            bigInteger = zzYM2.ZERO;
            bigIntegerSubtract = zzYM2.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b == 1 ? bigIntegerSubtract : bigIntegerSubtract.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static BigInteger[] zzZ(zzYM1.zzZ zzz) {
        if (zzz.zzXzD()) {
            int fieldSize = zzz.getFieldSize();
            int iIntValue = zzz.zzXzK().toBigInteger().intValue();
            byte bZzeI = zzeI(iIntValue);
            int iZzI = zzI(zzz.zzXzI());
            BigInteger[] bigIntegerArrZzZ = zzZ(bZzeI, (fieldSize + 3) - iIntValue, false);
            if (bZzeI == 1) {
                bigIntegerArrZzZ[0] = bigIntegerArrZzZ[0].negate();
                bigIntegerArrZzZ[1] = bigIntegerArrZzZ[1].negate();
            }
            BigInteger bigInteger = zzYM2.ONE;
            return new BigInteger[]{bigInteger.add(bigIntegerArrZzZ[1]).shiftRight(iZzI), bigInteger.add(bigIntegerArrZzZ[0]).shiftRight(iZzI).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static zzYLF zzZ(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2) {
        BigInteger bigIntegerSubtract;
        if (b2 == 1) {
            bigIntegerSubtract = bigIntegerArr[0].add(bigIntegerArr[1]);
        } else {
            bigIntegerSubtract = bigIntegerArr[0].subtract(bigIntegerArr[1]);
        }
        BigInteger bigInteger2 = zzZ(b2, i, true)[1];
        zzYLF zzylfZzZ = zzZ(zzZ(bigInteger, bigIntegerArr[0], bigInteger2, b, i, 10), zzZ(bigInteger, bigIntegerArr[1], bigInteger2, b, i, 10), b2);
        return new zzYLF(bigInteger.subtract(bigIntegerSubtract.multiply(zzylfZzZ.f51113bg)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(zzylfZzZ.f51114bh)), bigIntegerArr[1].multiply(zzylfZzZ.f51113bg).subtract(bigIntegerArr[0].multiply(zzylfZzZ.f51114bh)));
    }

    private static zzYLX.zzZ zzZ(zzYLX.zzZ zzz, byte[] bArr) {
        zzYLX.zzZ zzz2 = (zzYLX.zzZ) zzz.zzXHv().zzXzM();
        zzYLX.zzZ zzz3 = (zzYLX.zzZ) zzz.zzXzc();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                zzz2 = (zzYLX.zzZ) zzz2.zzeO(i).zzT(b > 0 ? zzz : zzz3);
                i = 0;
            }
        }
        return i > 0 ? zzz2.zzeO(i) : zzz2;
    }

    public static byte[] zzZ(byte b, zzYLF zzylf, BigInteger bigInteger, BigInteger bigInteger2, zzYLF[] zzylfArr) {
        BigInteger bigIntegerSubtract;
        int iIntValue;
        boolean z;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = zzZ(b, zzylf).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 8 : 38];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd = zzylf.f51113bg;
        BigInteger bigIntegerAdd2 = zzylf.f51114bh;
        int i = 0;
        while (true) {
            BigInteger bigInteger3 = zzYM2.ZERO;
            if (bigIntegerAdd.equals(bigInteger3) && bigIntegerAdd2.equals(bigInteger3)) {
                return bArr;
            }
            if (bigIntegerAdd.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd.add(bigIntegerAdd2.multiply(bigInteger2)).mod(bigInteger);
                if (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0) {
                    iIntValue = bigIntegerMod.subtract(bigInteger).intValue();
                } else {
                    iIntValue = bigIntegerMod.intValue();
                }
                byte b2 = (byte) iIntValue;
                bArr[i] = b2;
                if (b2 < 0) {
                    b2 = (byte) (-b2);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigIntegerAdd = bigIntegerAdd.subtract(zzylfArr[b2].f51113bg);
                    bigIntegerAdd2 = bigIntegerAdd2.subtract(zzylfArr[b2].f51114bh);
                } else {
                    bigIntegerAdd = bigIntegerAdd.add(zzylfArr[b2].f51113bg);
                    bigIntegerAdd2 = bigIntegerAdd2.add(zzylfArr[b2].f51114bh);
                }
            } else {
                bArr[i] = 0;
            }
            if (b == 1) {
                bigIntegerSubtract = bigIntegerAdd2.add(bigIntegerAdd.shiftRight(1));
            } else {
                bigIntegerSubtract = bigIntegerAdd2.subtract(bigIntegerAdd.shiftRight(1));
            }
            BigInteger bigIntegerNegate = bigIntegerAdd.shiftRight(1).negate();
            i++;
            bigIntegerAdd = bigIntegerSubtract;
            bigIntegerAdd2 = bigIntegerNegate;
        }
    }

    public static zzYLX.zzZ[] zzZ(zzYLX.zzZ zzz, byte b) {
        byte[][] bArr = b == 0 ? f51138aN : f51140aP;
        zzYLX.zzZ[] zzzArr = new zzYLX.zzZ[(bArr.length + 1) >>> 1];
        zzzArr[0] = zzz;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            zzzArr[i >>> 1] = zzZ(zzz, bArr[i]);
        }
        zzz.zzXHv().zzZ(zzzArr);
        return zzzArr;
    }
}
