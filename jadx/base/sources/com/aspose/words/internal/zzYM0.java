package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYM0 implements zzYM2 {

    public static class zzW extends zzY {

        /* JADX INFO: renamed from: ah */
        BigInteger f51164ah;
        BigInteger zzWl0;
        BigInteger zzWlw;

        public zzW(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.zzWl0 = bigInteger;
            this.f51164ah = bigInteger2;
            this.zzWlw = bigInteger3;
        }

        private BigInteger modInverse(BigInteger bigInteger) {
            int iBitLength = this.zzWl0.bitLength();
            int i = (iBitLength + 31) >> 5;
            int[] iArrZzV = zzYI2.zzV(iBitLength, this.zzWl0);
            int[] iArrZzV2 = zzYI2.zzV(iBitLength, bigInteger);
            int[] iArr = new int[i];
            zzYI3.zzN(iArrZzV, iArrZzV2, iArr);
            return zzYI2.zzG(i, iArr);
        }

        private BigInteger zzL(BigInteger bigInteger) {
            if (this.f51164ah == null) {
                return bigInteger.mod(this.zzWl0);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.zzWl0.bitLength();
            boolean zEquals = this.f51164ah.equals(zzYM2.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f51164ah);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.zzWl0) >= 0) {
                bigInteger = bigInteger.subtract(this.zzWl0);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.zzWl0.subtract(bigInteger);
        }

        private BigInteger zzM(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.zzWl0.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        private BigInteger zzN(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.zzWl0) >= 0 ? bigIntegerShiftLeft.subtract(this.zzWl0) : bigIntegerShiftLeft;
        }

        public static BigInteger zzO(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return zzYM2.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        private zzYM0 zzS(zzYM0 zzym0) {
            if (zzym0.zzXzy().equals(this)) {
                return zzym0;
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzW)) {
                return false;
            }
            zzW zzw = (zzW) obj;
            return this.zzWl0.equals(zzw.zzWl0) && this.zzWlw.equals(zzw.zzWlw);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final int getFieldSize() {
            return this.zzWl0.bitLength();
        }

        public final int hashCode() {
            return this.zzWl0.hashCode() ^ this.zzWlw.hashCode();
        }

        @Override // com.aspose.words.internal.zzYM0
        public final BigInteger toBigInteger() {
            return this.zzWlw;
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzT(zzYM0 zzym0) {
            return new zzW(this.zzWl0, this.f51164ah, zzV(this.zzWlw, modInverse(zzym0.toBigInteger())));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzU(zzYM0 zzym0) {
            return new zzW(this.zzWl0, this.f51164ah, zzV(this.zzWlw, zzym0.toBigInteger()));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzV(zzYM0 zzym0) {
            return new zzW(this.zzWl0, this.f51164ah, zzU(this.zzWlw, zzym0.toBigInteger()));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzW(zzYM0 zzym0) {
            return new zzW(this.zzWl0, this.f51164ah, zzW(this.zzWlw, zzym0.toBigInteger()));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzA() {
            BigInteger bigIntegerAdd = this.zzWlw.add(zzYM2.ONE);
            if (bigIntegerAdd.compareTo(this.zzWl0) == 0) {
                bigIntegerAdd = zzYM2.ZERO;
            }
            return new zzW(this.zzWl0, this.f51164ah, bigIntegerAdd);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzw() {
            if (isZero() || zzXzv()) {
                return this;
            }
            if (!this.zzWl0.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.zzWl0.testBit(1)) {
                BigInteger bigIntegerAdd = this.zzWl0.shiftRight(2).add(zzYM2.ONE);
                BigInteger bigInteger = this.zzWl0;
                return zzS(new zzW(bigInteger, this.f51164ah, this.zzWlw.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.zzWl0.testBit(2)) {
                BigInteger bigIntegerModPow = this.zzWlw.modPow(this.zzWl0.shiftRight(3), this.zzWl0);
                BigInteger bigIntegerZzV = zzV(bigIntegerModPow, this.zzWlw);
                if (zzV(bigIntegerZzV, bigIntegerModPow).equals(zzYM2.ONE)) {
                    return zzS(new zzW(this.zzWl0, this.f51164ah, bigIntegerZzV));
                }
                return zzS(new zzW(this.zzWl0, this.f51164ah, zzV(bigIntegerZzV, zzYM2.zzWkF.modPow(this.zzWl0.shiftRight(2), this.zzWl0))));
            }
            BigInteger bigIntegerShiftRight = this.zzWl0.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.zzWlw.modPow(bigIntegerShiftRight, this.zzWl0);
            BigInteger bigInteger2 = zzYM2.ONE;
            if (!bigIntegerModPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.zzWlw;
            BigInteger bigIntegerZzN = zzN(zzN(bigInteger3));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger2);
            BigInteger bigIntegerSubtract = this.zzWl0.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.zzWl0.bitLength(), random);
                if (bigInteger4.compareTo(this.zzWl0) < 0 && zzL(bigInteger4.multiply(bigInteger4).subtract(bigIntegerZzN)).modPow(bigIntegerShiftRight, this.zzWl0).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrZzZ = zzZ(bigInteger4, bigInteger3, bigIntegerAdd2);
                    BigInteger bigInteger5 = bigIntegerArrZzZ[0];
                    BigInteger bigInteger6 = bigIntegerArrZzZ[1];
                    if (zzV(bigInteger6, bigInteger6).equals(bigIntegerZzN)) {
                        return new zzW(this.zzWl0, this.f51164ah, zzM(bigInteger6));
                    }
                    if (!bigInteger5.equals(zzYM2.ONE) && !bigInteger5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzx() {
            return new zzW(this.zzWl0, this.f51164ah, modInverse(this.zzWlw));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzy() {
            BigInteger bigInteger = this.zzWl0;
            BigInteger bigInteger2 = this.f51164ah;
            BigInteger bigInteger3 = this.zzWlw;
            return new zzW(bigInteger, bigInteger2, zzV(bigInteger3, bigInteger3));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzz() {
            if (this.zzWlw.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.zzWl0;
            return new zzW(bigInteger, this.f51164ah, bigInteger.subtract(this.zzWlw));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
            BigInteger bigInteger = this.zzWlw;
            BigInteger bigInteger2 = zzym0.toBigInteger();
            BigInteger bigInteger3 = zzym02.toBigInteger();
            BigInteger bigInteger4 = zzym03.toBigInteger();
            return new zzW(this.zzWl0, this.f51164ah, zzL(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
            BigInteger bigInteger = this.zzWlw;
            BigInteger bigInteger2 = zzym0.toBigInteger();
            BigInteger bigInteger3 = zzym02.toBigInteger();
            BigInteger bigInteger4 = zzym03.toBigInteger();
            return new zzW(this.zzWl0, this.f51164ah, zzL(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        private BigInteger zzU(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.zzWl0) : bigIntegerSubtract;
        }

        private BigInteger zzV(BigInteger bigInteger, BigInteger bigInteger2) {
            return zzL(bigInteger.multiply(bigInteger2));
        }

        private BigInteger zzW(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.zzWl0) >= 0 ? bigIntegerAdd.subtract(this.zzWl0) : bigIntegerAdd;
        }

        private BigInteger[] zzZ(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerZzV = zzYM2.ONE;
            BigInteger bigIntegerZzL = bigInteger;
            BigInteger bigIntegerZzV2 = bigIntegerZzV;
            BigInteger bigIntegerZzL2 = zzYM2.zzWkF;
            BigInteger bigIntegerZzV3 = bigIntegerZzV2;
            for (int i = iBitLength - 1; i >= lowestSetBit + 1; i--) {
                bigIntegerZzV = zzV(bigIntegerZzV, bigIntegerZzV3);
                if (bigInteger3.testBit(i)) {
                    bigIntegerZzV3 = zzV(bigIntegerZzV, bigInteger2);
                    bigIntegerZzV2 = zzV(bigIntegerZzV2, bigIntegerZzL);
                    bigIntegerZzL2 = zzL(bigIntegerZzL.multiply(bigIntegerZzL2).subtract(bigInteger.multiply(bigIntegerZzV)));
                    bigIntegerZzL = zzL(bigIntegerZzL.multiply(bigIntegerZzL).subtract(bigIntegerZzV3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerZzL3 = zzL(bigIntegerZzV2.multiply(bigIntegerZzL2).subtract(bigIntegerZzV));
                    BigInteger bigIntegerZzL4 = zzL(bigIntegerZzL.multiply(bigIntegerZzL2).subtract(bigInteger.multiply(bigIntegerZzV)));
                    bigIntegerZzL2 = zzL(bigIntegerZzL2.multiply(bigIntegerZzL2).subtract(bigIntegerZzV.shiftLeft(1)));
                    bigIntegerZzL = bigIntegerZzL4;
                    bigIntegerZzV2 = bigIntegerZzL3;
                    bigIntegerZzV3 = bigIntegerZzV;
                }
            }
            BigInteger bigIntegerZzV4 = zzV(bigIntegerZzV, bigIntegerZzV3);
            BigInteger bigIntegerZzV5 = zzV(bigIntegerZzV4, bigInteger2);
            BigInteger bigIntegerZzL5 = zzL(bigIntegerZzV2.multiply(bigIntegerZzL2).subtract(bigIntegerZzV4));
            BigInteger bigIntegerZzL6 = zzL(bigIntegerZzL.multiply(bigIntegerZzL2).subtract(bigInteger.multiply(bigIntegerZzV4)));
            BigInteger bigIntegerZzV6 = zzV(bigIntegerZzV4, bigIntegerZzV5);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerZzL5 = zzV(bigIntegerZzL5, bigIntegerZzL6);
                bigIntegerZzL6 = zzL(bigIntegerZzL6.multiply(bigIntegerZzL6).subtract(bigIntegerZzV6.shiftLeft(1)));
                bigIntegerZzV6 = zzV(bigIntegerZzV6, bigIntegerZzV6);
            }
            return new BigInteger[]{bigIntegerZzL5, bigIntegerZzL6};
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
            BigInteger bigInteger = this.zzWlw;
            BigInteger bigInteger2 = zzym0.toBigInteger();
            BigInteger bigInteger3 = zzym02.toBigInteger();
            return new zzW(this.zzWl0, this.f51164ah, zzL(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }
    }

    public static abstract class zzY extends zzYM0 {
    }

    public static abstract class zzZ extends zzYM0 {
        public int zzXzs() {
            int fieldSize = getFieldSize();
            zzYM0 zzym0ZzW = this;
            zzYM0 zzym0ZzXzy = zzym0ZzW;
            for (int i = 1; i < fieldSize; i++) {
                zzym0ZzXzy = zzym0ZzXzy.zzXzy();
                zzym0ZzW = zzym0ZzW.zzW(zzym0ZzXzy);
            }
            if (zzym0ZzW.isZero()) {
                return 0;
            }
            if (zzym0ZzW.zzXzv()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }

        public final zzYM0 zzXzt() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new IllegalStateException("Half-trace only defined for odd m");
            }
            zzYM0 zzym0ZzW = this;
            zzYM0 zzym0ZzeR = zzym0ZzW;
            for (int i = 2; i < fieldSize; i += 2) {
                zzym0ZzeR = zzym0ZzeR.zzeR(2);
                zzym0ZzW = zzym0ZzW.zzW(zzym0ZzeR);
            }
            return zzym0ZzW;
        }
    }

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public final byte[] getEncoded() {
        return zzYGT.zzU((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract int getFieldSize();

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    public abstract zzYM0 zzT(zzYM0 zzym0);

    public abstract zzYM0 zzU(zzYM0 zzym0);

    public abstract zzYM0 zzV(zzYM0 zzym0);

    public abstract zzYM0 zzW(zzYM0 zzym0);

    public abstract zzYM0 zzXzA();

    public boolean zzXzu() {
        return toBigInteger().testBit(0);
    }

    public boolean zzXzv() {
        return bitLength() == 1;
    }

    public abstract zzYM0 zzXzw();

    public abstract zzYM0 zzXzx();

    public abstract zzYM0 zzXzy();

    public abstract zzYM0 zzXzz();

    public zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        return zzU(zzym0).zzW(zzym02.zzU(zzym03));
    }

    public zzYM0 zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
        return zzU(zzym0).zzV(zzym02.zzU(zzym03));
    }

    public zzYM0 zzeR(int i) {
        zzYM0 zzym0ZzXzy = this;
        for (int i2 = 0; i2 < i; i2++) {
            zzym0ZzXzy = zzym0ZzXzy.zzXzy();
        }
        return zzym0ZzXzy;
    }

    public zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
        return zzXzy().zzW(zzym0.zzU(zzym02));
    }

    public static class zzX extends zzZ {

        /* JADX INFO: renamed from: aj */
        private int f51165aj;

        /* JADX INFO: renamed from: ak */
        private int[] f51166ak;

        /* JADX INFO: renamed from: al */
        zzYLR f51167al;
        private int zzWtq;

        public zzX(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f51165aj = 2;
                this.f51166ak = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f51165aj = 3;
                this.f51166ak = new int[]{i2, i3, i4};
            }
            this.zzWtq = i;
            this.f51167al = new zzYLR(bigInteger);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final int bitLength() {
            return this.f51167al.zzXz5();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzX)) {
                return false;
            }
            zzX zzx = (zzX) obj;
            return this.zzWtq == zzx.zzWtq && this.f51165aj == zzx.f51165aj && zzYGU.zzv(this.f51166ak, zzx.f51166ak) && this.f51167al.equals(zzx.f51167al);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final int getFieldSize() {
            return this.zzWtq;
        }

        public final int hashCode() {
            return (this.f51167al.hashCode() ^ this.zzWtq) ^ zzYGU.hashCode(this.f51166ak);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final boolean isZero() {
            return this.f51167al.isZero();
        }

        @Override // com.aspose.words.internal.zzYM0
        public final BigInteger toBigInteger() {
            return this.f51167al.toBigInteger();
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzT(zzYM0 zzym0) {
            return zzU(zzym0.zzXzx());
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzU(zzYM0 zzym0) {
            int i = this.zzWtq;
            int[] iArr = this.f51166ak;
            return new zzX(i, iArr, this.f51167al.zzZ(((zzX) zzym0).f51167al, i, iArr));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzV(zzYM0 zzym0) {
            return zzW(zzym0);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzW(zzYM0 zzym0) {
            zzYLR zzylr = (zzYLR) this.f51167al.clone();
            zzylr.zzZ(((zzX) zzym0).f51167al);
            return new zzX(this.zzWtq, this.f51166ak, zzylr);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzA() {
            return new zzX(this.zzWtq, this.f51166ak, this.f51167al.zzXz4());
        }

        @Override // com.aspose.words.internal.zzYM0
        public final boolean zzXzu() {
            return this.f51167al.zzXzu();
        }

        @Override // com.aspose.words.internal.zzYM0
        public final boolean zzXzv() {
            return this.f51167al.zzXzv();
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzw() {
            return (this.f51167al.isZero() || this.f51167al.zzXzv()) ? this : zzeR(this.zzWtq - 1);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzx() {
            int i = this.zzWtq;
            int[] iArr = this.f51166ak;
            return new zzX(i, iArr, this.f51167al.zzN(i, iArr));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzy() {
            int i = this.zzWtq;
            int[] iArr = this.f51166ak;
            return new zzX(i, iArr, this.f51167al.zzO(i, iArr));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzXzz() {
            return this;
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
            zzYLR zzylr = this.f51167al;
            zzYLR zzylr2 = ((zzX) zzym0).f51167al;
            zzYLR zzylr3 = ((zzX) zzym02).f51167al;
            zzYLR zzylr4 = ((zzX) zzym03).f51167al;
            zzYLR zzylrZzY = zzylr.zzY(zzylr2);
            zzYLR zzylrZzY2 = zzylr3.zzY(zzylr4);
            if (zzylrZzY == zzylr || zzylrZzY == zzylr2) {
                zzylrZzY = (zzYLR) zzylrZzY.clone();
            }
            zzylrZzY.zzZ(zzylrZzY2);
            zzylrZzY.zzP(this.zzWtq, this.f51166ak);
            return new zzX(this.zzWtq, this.f51166ak, zzylrZzY);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0 zzym03) {
            return zzY(zzym0, zzym02, zzym03);
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzeR(int i) {
            if (i <= 0) {
                return this;
            }
            int i2 = this.zzWtq;
            int[] iArr = this.f51166ak;
            return new zzX(i2, iArr, this.f51167al.zzV(i, i2, iArr));
        }

        @Override // com.aspose.words.internal.zzYM0
        public final zzYM0 zzY(zzYM0 zzym0, zzYM0 zzym02) {
            zzYLR zzylr = this.f51167al;
            zzYLR zzylr2 = ((zzX) zzym0).f51167al;
            zzYLR zzylr3 = ((zzX) zzym02).f51167al;
            zzYLR zzylrZzXz3 = zzylr.zzXz3();
            zzYLR zzylrZzY = zzylr2.zzY(zzylr3);
            if (zzylrZzXz3 == zzylr) {
                zzylrZzXz3 = (zzYLR) zzylrZzXz3.clone();
            }
            zzylrZzXz3.zzZ(zzylrZzY);
            zzylrZzXz3.zzP(this.zzWtq, this.f51166ak);
            return new zzX(this.zzWtq, this.f51166ak, zzylrZzXz3);
        }

        public zzX(int i, int[] iArr, zzYLR zzylr) {
            this.zzWtq = i;
            this.f51165aj = iArr.length == 1 ? 2 : 3;
            this.f51166ak = iArr;
            this.f51167al = zzylr;
        }
    }
}
