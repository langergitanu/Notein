package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYLN {

    /* JADX INFO: renamed from: aH */
    private final BigInteger f51141aH;

    /* JADX INFO: renamed from: aI */
    private final int f51142aI;

    public zzYLN(BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f51141aH = bigInteger;
        this.f51142aI = i;
    }

    private BigInteger zzXz1() {
        return this.f51141aH.shiftRight(this.f51142aI);
    }

    private zzYLN zzXz2() {
        return new zzYLN(this.f51141aH.negate(), this.f51142aI);
    }

    private void zzZ(zzYLN zzyln) {
        if (this.f51142aI != zzyln.f51142aI) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    private zzYLN zzeJ(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        int i2 = this.f51142aI;
        return i == i2 ? this : new zzYLN(this.f51141aH.shiftLeft(i - i2), i);
    }

    public final int compareTo(BigInteger bigInteger) {
        return this.f51141aH.compareTo(bigInteger.shiftLeft(this.f51142aI));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzYLN)) {
            return false;
        }
        zzYLN zzyln = (zzYLN) obj;
        return this.f51141aH.equals(zzyln.f51141aH) && this.f51142aI == zzyln.f51142aI;
    }

    public final int hashCode() {
        return this.f51141aH.hashCode() ^ this.f51142aI;
    }

    public final String toString() {
        if (this.f51142aI == 0) {
            return this.f51141aH.toString();
        }
        BigInteger bigIntegerZzXz1 = zzXz1();
        BigInteger bigIntegerSubtract = this.f51141aH.subtract(bigIntegerZzXz1.shiftLeft(this.f51142aI));
        if (this.f51141aH.signum() == -1) {
            bigIntegerSubtract = zzYM2.ONE.shiftLeft(this.f51142aI).subtract(bigIntegerSubtract);
        }
        if (bigIntegerZzXz1.signum() == -1 && !bigIntegerSubtract.equals(zzYM2.ZERO)) {
            bigIntegerZzXz1 = bigIntegerZzXz1.add(zzYM2.ONE);
        }
        String string = bigIntegerZzXz1.toString();
        char[] cArr = new char[this.f51142aI];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.f51142aI - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = string2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public final zzYLN zzJ(BigInteger bigInteger) {
        return new zzYLN(this.f51141aH.subtract(bigInteger.shiftLeft(this.f51142aI)), this.f51142aI);
    }

    public final zzYLN zzX(zzYLN zzyln) {
        return zzY(zzyln.zzXz2());
    }

    public final BigInteger zzXz0() {
        return zzY(new zzYLN(zzYM2.ONE, 1).zzeJ(this.f51142aI)).zzXz1();
    }

    public final zzYLN zzY(zzYLN zzyln) {
        zzZ(zzyln);
        return new zzYLN(this.f51141aH.add(zzyln.f51141aH), this.f51142aI);
    }

    public final int zzZ9q() {
        return this.f51142aI;
    }
}
