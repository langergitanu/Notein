package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYHR {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger zzWkF = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: K */
    private static final BigInteger f50903K = BigInteger.valueOf(3);

    public static class zzZ {

        /* JADX INFO: renamed from: dk */
        private boolean f50904dk;

        /* JADX INFO: renamed from: dl */
        private BigInteger f50905dl;

        private zzZ(boolean z, BigInteger bigInteger) {
            this.f50904dk = z;
            this.f50905dl = bigInteger;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzZ zzXyA() {
            return new zzZ(false, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzZ zzXyz() {
            return new zzZ(true, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzZ zzx(BigInteger bigInteger) {
            return new zzZ(true, bigInteger);
        }

        public final boolean zzXyx() {
            return this.f50904dk && this.f50905dl == null;
        }

        public final boolean zzXyy() {
            return this.f50904dk;
        }
    }

    public static boolean zzY(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        zzZ(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(zzWkF);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzZ(bigInteger, bigIntegerSubtract, bigIntegerShiftRight, lowestSetBit, zzYGT.zzX(zzWkF, bigIntegerSubtract2, secureRandom))) {
                return false;
            }
        }
        return true;
    }

    public static zzZ zzZ(BigInteger bigInteger, SecureRandom secureRandom, int i) {
        BigInteger bigIntegerModPow;
        zzZ(bigInteger, "candidate");
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return zzZ.zzXyA();
        }
        if (!bigInteger.testBit(0)) {
            return zzZ.zzx(zzWkF);
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(zzWkF);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i2 = 0; i2 < i; i2++) {
            BigInteger bigIntegerZzX = zzYGT.zzX(zzWkF, bigIntegerSubtract2, secureRandom);
            BigInteger bigIntegerGcd = bigIntegerZzX.gcd(bigInteger);
            BigInteger bigInteger2 = ONE;
            if (bigIntegerGcd.compareTo(bigInteger2) > 0) {
                return zzZ.zzx(bigIntegerGcd);
            }
            BigInteger bigIntegerModPow2 = bigIntegerZzX.modPow(bigIntegerShiftRight, bigInteger);
            if (!bigIntegerModPow2.equals(bigInteger2) && !bigIntegerModPow2.equals(bigIntegerSubtract)) {
                boolean z = true;
                int i3 = 1;
                while (true) {
                    if (i3 >= lowestSetBit) {
                        z = false;
                        bigIntegerModPow = bigIntegerModPow2;
                        break;
                    }
                    bigIntegerModPow = bigIntegerModPow2.modPow(zzWkF, bigInteger);
                    if (bigIntegerModPow.equals(bigIntegerSubtract)) {
                        break;
                    }
                    if (bigIntegerModPow.equals(ONE)) {
                        z = false;
                        break;
                    }
                    i3++;
                    bigIntegerModPow2 = bigIntegerModPow;
                }
                if (!z) {
                    BigInteger bigInteger3 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger3)) {
                        bigIntegerModPow2 = bigIntegerModPow.modPow(zzWkF, bigInteger);
                        if (bigIntegerModPow2.equals(bigInteger3)) {
                            bigIntegerModPow2 = bigIntegerModPow;
                        }
                    }
                    BigInteger bigIntegerGcd2 = bigIntegerModPow2.subtract(bigInteger3).gcd(bigInteger);
                    return bigIntegerGcd2.compareTo(bigInteger3) > 0 ? zzZ.zzx(bigIntegerGcd2) : zzZ.zzXyz();
                }
            }
        }
        return zzZ.zzXyA();
    }

    private static boolean zzy(BigInteger bigInteger) {
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870L)).intValue();
        if (iIntValue % 2 != 0 && iIntValue % 3 != 0 && iIntValue % 5 != 0 && iIntValue % 7 != 0 && iIntValue % 11 != 0 && iIntValue % 13 != 0 && iIntValue % 17 != 0 && iIntValue % 19 != 0 && iIntValue % 23 != 0) {
            int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669L)).intValue();
            if (iIntValue2 % 29 != 0 && iIntValue2 % 31 != 0 && iIntValue2 % 37 != 0 && iIntValue2 % 41 != 0 && iIntValue2 % 43 != 0) {
                int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303L)).intValue();
                if (iIntValue3 % 47 != 0 && iIntValue3 % 53 != 0 && iIntValue3 % 59 != 0 && iIntValue3 % 61 != 0 && iIntValue3 % 67 != 0) {
                    int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931L)).intValue();
                    if (iIntValue4 % 71 != 0 && iIntValue4 % 73 != 0 && iIntValue4 % 79 != 0 && iIntValue4 % 83 != 0) {
                        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099L)).intValue();
                        if (iIntValue5 % 89 != 0 && iIntValue5 % 97 != 0 && iIntValue5 % 101 != 0 && iIntValue5 % 103 != 0) {
                            int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713L)).intValue();
                            if (iIntValue6 % 107 != 0 && iIntValue6 % 109 != 0 && iIntValue6 % 113 != 0 && iIntValue6 % 127 != 0) {
                                int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317L)).intValue();
                                if (iIntValue7 % 131 != 0 && iIntValue7 % 137 != 0 && iIntValue7 % 139 != 0 && iIntValue7 % 149 != 0) {
                                    int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247L)).intValue();
                                    if (iIntValue8 % 151 != 0 && iIntValue8 % 157 != 0 && iIntValue8 % 163 != 0 && iIntValue8 % 167 != 0) {
                                        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157L)).intValue();
                                        if (iIntValue9 % 173 != 0 && iIntValue9 % 179 != 0 && iIntValue9 % 181 != 0 && iIntValue9 % 191 != 0) {
                                            int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769L)).intValue();
                                            if (iIntValue10 % 193 != 0 && iIntValue10 % 197 != 0 && iIntValue10 % 199 != 0 && iIntValue10 % 211 != 0) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean zzz(BigInteger bigInteger) {
        zzZ(bigInteger, "candidate");
        return zzy(bigInteger);
    }

    private static void zzZ(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() <= 0 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("'", str, "' must be non-null and >= 2"));
        }
    }

    private static boolean zzZ(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, BigInteger bigInteger4) {
        BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger3, bigInteger);
        if (bigIntegerModPow.equals(ONE) || bigIntegerModPow.equals(bigInteger2)) {
            return true;
        }
        for (int i2 = 1; i2 < i; i2++) {
            bigIntegerModPow = bigIntegerModPow.modPow(zzWkF, bigInteger);
            if (bigIntegerModPow.equals(bigInteger2)) {
                return true;
            }
            if (bigIntegerModPow.equals(ONE)) {
                return false;
            }
        }
        return false;
    }
}
