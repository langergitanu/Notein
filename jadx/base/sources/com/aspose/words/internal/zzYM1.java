package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;
import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYM1 {

    /* JADX INFO: renamed from: O */
    protected zzYIB f51168O;

    /* JADX INFO: renamed from: P */
    protected zzYM0 f51169P;

    /* JADX INFO: renamed from: Q */
    protected zzYM0 f51170Q;

    /* JADX INFO: renamed from: R */
    protected BigInteger f51171R;

    /* JADX INFO: renamed from: S */
    protected BigInteger f51172S;

    /* JADX INFO: renamed from: T */
    protected int f51173T = 0;

    /* JADX INFO: renamed from: U */
    protected zzYIM f51174U = null;

    /* JADX INFO: renamed from: V */
    protected zzYLY f51175V = null;

    public static class zzV extends zzY {

        /* JADX INFO: renamed from: ah */
        BigInteger f51180ah;

        /* JADX INFO: renamed from: ai */
        zzYLX.zzW f51181ai;
        BigInteger zzWl0;

        public zzV(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            if (bigInteger4 == null) {
                throw new NullPointerException("order");
            }
            if (bigInteger5 == null) {
                throw new NullPointerException("cofactor");
            }
            this.zzWl0 = bigInteger;
            this.f51180ah = zzYM0.zzW.zzO(bigInteger);
            this.f51181ai = new zzYLX.zzW(this, null, null);
            this.f51169P = zzP(bigInteger2);
            this.f51170Q = zzP(bigInteger3);
            this.f51171R = bigInteger4;
            this.f51172S = bigInteger5;
            this.f51173T = 4;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final int getFieldSize() {
            return this.zzWl0.bitLength();
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM0 zzP(BigInteger bigInteger) {
            return new zzYM0.zzW(this.zzWl0, this.f51180ah, bigInteger);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzW(zzYLX zzylx) {
            int iZzXzH;
            return (this == zzylx.zzXHv() || zzXzH() != 2 || zzylx.zzXzd() || !((iZzXzH = zzylx.zzXHv().zzXzH()) == 2 || iZzXzH == 3 || iZzXzH == 4)) ? super.zzW(zzylx) : new zzYLX.zzW(this, zzP(zzylx.f51157an.toBigInteger()), zzP(zzylx.f51158ao.toBigInteger()), new zzYM0[]{zzP(zzylx.f51159ap[0].toBigInteger())});
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzXzM() {
            return this.f51181ai;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM1 zzXzO() {
            return new zzV(this.zzWl0, this.f51180ah, this.f51169P, this.f51170Q, this.f51171R, this.f51172S);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
            return new zzYLX.zzW(this, zzym0, zzym02);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final boolean zzeT(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            return new zzYLX.zzW(this, zzym0, zzym02, zzym0Arr);
        }

        private zzV(BigInteger bigInteger, BigInteger bigInteger2, zzYM0 zzym0, zzYM0 zzym02, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            if (bigInteger3 == null) {
                throw new NullPointerException("order");
            }
            if (bigInteger4 != null) {
                this.zzWl0 = bigInteger;
                this.f51180ah = bigInteger2;
                this.f51181ai = new zzYLX.zzW(this, null, null);
                this.f51169P = zzym0;
                this.f51170Q = zzym02;
                this.f51171R = bigInteger3;
                this.f51172S = bigInteger4;
                this.f51173T = 4;
                return;
            }
            throw new NullPointerException("cofactor");
        }
    }

    public static class zzW extends zzZ {

        /* JADX INFO: renamed from: ac */
        private zzYLX.zzX f51182ac;
        private int zzW4q;
        private int zzW4r;
        private int zzW4s;
        private int zzWtq;

        public zzW(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        private boolean zzXzB() {
            return this.zzW4r == 0 && this.zzW4q == 0;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final int getFieldSize() {
            return this.zzWtq;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM0 zzP(BigInteger bigInteger) {
            return new zzYM0.zzX(this.zzWtq, this.zzW4s, this.zzW4r, this.zzW4q, bigInteger);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzXzM() {
            return this.f51182ac;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLY zzXzN() {
            return zzXzD() ? new zzYLH() : super.zzXzN();
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM1 zzXzO() {
            return new zzW(this.zzWtq, this.zzW4s, this.zzW4r, this.zzW4q, this.f51169P, this.f51170Q, this.f51171R, this.f51172S);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final boolean zzeT(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        public zzW(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            if (bigInteger3 == null) {
                throw new NullPointerException("order");
            }
            if (bigInteger4 == null) {
                throw new NullPointerException("cofactor");
            }
            this.zzWtq = i;
            this.zzW4s = i2;
            this.zzW4r = i3;
            this.zzW4q = i4;
            this.f51171R = bigInteger3;
            this.f51172S = bigInteger4;
            this.f51182ac = new zzYLX.zzX(this, null, null);
            this.f51169P = zzP(bigInteger);
            this.f51170Q = zzP(bigInteger2);
            this.f51173T = 6;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02) {
            return new zzYLX.zzX(this, zzym0, zzym02);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
            return new zzYLX.zzX(this, zzym0, zzym02, zzym0Arr);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
            final int i2 = (this.zzWtq + 63) >>> 6;
            final int[] iArr = zzXzB() ? new int[]{this.zzW4s} : new int[]{this.zzW4s, this.zzW4r, this.zzW4q};
            final long[] jArr = new long[i * i2 * 2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                zzYLX zzylx = zzylxArr[i4];
                ((zzYM0.zzX) zzylx.zzXzj()).f51167al.zzS(jArr, i3);
                int i5 = i3 + i2;
                ((zzYM0.zzX) zzylx.zzXzi()).f51167al.zzS(jArr, i5);
                i3 = i5 + i2;
            }
            return new zzYLZ() { // from class: com.aspose.words.internal.zzYM1.zzW.1
                @Override // com.aspose.words.internal.zzYLZ
                public final int getSize() {
                    return i;
                }

                @Override // com.aspose.words.internal.zzYLZ
                public final zzYLX zzeS(int i6) {
                    int i7;
                    int i8 = i2;
                    long[] jArr2 = new long[i8];
                    long[] jArr3 = new long[i8];
                    int i9 = 0;
                    for (int i10 = 0; i10 < i; i10++) {
                        long j = ((i10 ^ i6) - 1) >> 31;
                        int i11 = 0;
                        while (true) {
                            i7 = i2;
                            if (i11 < i7) {
                                long j2 = jArr2[i11];
                                long[] jArr4 = jArr;
                                jArr2[i11] = j2 ^ (jArr4[i9 + i11] & j);
                                jArr3[i11] = jArr3[i11] ^ (jArr4[(i7 + i9) + i11] & j);
                                i11++;
                            }
                        }
                        i9 += i7 * 2;
                    }
                    zzW zzw = zzW.this;
                    return zzw.zzZ(new zzYM0.zzX(zzw.zzWtq, iArr, new zzYLR(jArr2)), new zzYM0.zzX(zzW.this.zzWtq, iArr, new zzYLR(jArr3)));
                }
            };
        }

        private zzW(int i, int i2, int i3, int i4, zzYM0 zzym0, zzYM0 zzym02, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            if (bigInteger == null) {
                throw new NullPointerException("order");
            }
            if (bigInteger2 != null) {
                this.zzWtq = i;
                this.zzW4s = i2;
                this.zzW4r = i3;
                this.zzW4q = i4;
                this.f51171R = bigInteger;
                this.f51172S = bigInteger2;
                this.f51182ac = new zzYLX.zzX(this, null, null);
                this.f51169P = zzym0;
                this.f51170Q = zzym02;
                this.f51173T = 6;
                return;
            }
            throw new NullPointerException("cofactor");
        }
    }

    public class zzX {

        /* JADX INFO: renamed from: T */
        protected int f51188T;

        /* JADX INFO: renamed from: U */
        protected zzYIM f51189U;

        /* JADX INFO: renamed from: V */
        protected zzYLY f51190V;

        public zzX(int i, zzYIM zzyim, zzYLY zzyly) {
            this.f51188T = i;
            this.f51189U = zzyim;
            this.f51190V = zzyly;
        }

        public final zzYM1 zzXzC() {
            if (!zzYM1.this.zzeT(this.f51188T)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            zzYM1 zzym1ZzXzO = zzYM1.this.zzXzO();
            if (zzym1ZzXzO == zzYM1.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (zzym1ZzXzO) {
                zzym1ZzXzO.f51173T = this.f51188T;
                zzym1ZzXzO.f51174U = this.f51189U;
                zzym1ZzXzO.f51175V = this.f51190V;
            }
            return zzym1ZzXzO;
        }

        public final zzX zzZ(zzYIM zzyim) {
            this.f51189U = zzyim;
            return this;
        }
    }

    public static abstract class zzY extends zzYM1 {
        public zzY(BigInteger bigInteger) {
            super(zzYIA.zzB(bigInteger));
        }

        private static BigInteger zzZ(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger bigIntegerZzW = zzYGT.zzW(bigInteger.bitLength(), secureRandom);
                if (bigIntegerZzW.signum() > 0 && bigIntegerZzW.compareTo(bigInteger) < 0) {
                    return bigIntegerZzW;
                }
            }
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzY(int i, BigInteger bigInteger) {
            zzYM0 zzym0ZzP = zzP(bigInteger);
            zzYM0 zzym0ZzXzw = zzym0ZzP.zzXzy().zzW(this.f51169P).zzU(zzym0ZzP).zzW(this.f51170Q).zzXzw();
            if (zzym0ZzXzw == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (zzym0ZzXzw.zzXzu() != (i == 1)) {
                zzym0ZzXzw = zzym0ZzXzw.zzXzz();
            }
            return zzZ(zzym0ZzP, zzym0ZzXzw);
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM0 zzv(SecureRandom secureRandom) {
            BigInteger bigIntegerZzXyD = zzXzL().zzXyD();
            return zzP(zzZ(secureRandom, bigIntegerZzXyD)).zzU(zzP(zzZ(secureRandom, bigIntegerZzXyD)));
        }
    }

    public zzYM1(zzYIB zzyib) {
        this.f51168O = zzyib;
    }

    private void zzV(zzYLX zzylx) {
        if (zzylx == null || this != zzylx.zzXHv()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zzYM1) && zzV((zzYM1) obj);
        }
        return true;
    }

    public abstract int getFieldSize();

    public final BigInteger getOrder() {
        return this.f51171R;
    }

    public int hashCode() {
        return (this.f51168O.hashCode() ^ Integer.rotateLeft(this.f51169P.toBigInteger().hashCode(), 8)) ^ Integer.rotateLeft(this.f51170Q.toBigInteger().hashCode(), 16);
    }

    public abstract zzYM0 zzP(BigInteger bigInteger);

    public final zzYLX zzVO(byte[] bArr) {
        zzYLX zzylxZzXzM;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                zzylxZzXzM = zzY(b & 1, zzYGT.zzo(bArr, 1, fieldSize));
                if (!zzylxZzXzM.zzu(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerZzo = zzYGT.zzo(bArr, 1, fieldSize);
                BigInteger bigIntegerZzo2 = zzYGT.zzo(bArr, fieldSize + 1, fieldSize);
                if (bigIntegerZzo2.testBit(0) != (b == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                zzylxZzXzM = zzY(bigIntegerZzo, bigIntegerZzo2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                zzylxZzXzM = zzY(zzYGT.zzo(bArr, 1, fieldSize), zzYGT.zzo(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            zzylxZzXzM = zzXzM();
        }
        if (b == 0 || !zzylxZzXzM.zzXzd()) {
            return zzylxZzXzM;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public zzYLX zzW(zzYLX zzylx) {
        if (this == zzylx.zzXHv()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return zzXzM();
        }
        zzYLX zzylxZzXze = zzylx.zzXze();
        return zzX(zzylxZzXze.zzXzl().toBigInteger(), zzylxZzXze.zzXzk().toBigInteger());
    }

    public zzYLX zzX(BigInteger bigInteger, BigInteger bigInteger2) {
        return zzZ(zzP(bigInteger), zzP(bigInteger2));
    }

    public final synchronized zzYLY zzXzF() {
        try {
            if (this.f51175V == null) {
                this.f51175V = zzXzN();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f51175V;
    }

    public final zzYIM zzXzG() {
        return this.f51174U;
    }

    public final int zzXzH() {
        return this.f51173T;
    }

    public final BigInteger zzXzI() {
        return this.f51172S;
    }

    public final zzYM0 zzXzJ() {
        return this.f51170Q;
    }

    public final zzYM0 zzXzK() {
        return this.f51169P;
    }

    public final zzYIB zzXzL() {
        return this.f51168O;
    }

    public abstract zzYLX zzXzM();

    public zzYLY zzXzN() {
        zzYIM zzyim = this.f51174U;
        return zzyim instanceof zzYIL ? new zzYLS(this, (zzYIL) zzyim) : new zzYLK();
    }

    public abstract zzYM1 zzXzO();

    public final synchronized zzX zzXzP() {
        return new zzX(this.f51173T, this.f51174U, this.f51175V);
    }

    public abstract zzYLX zzY(int i, BigInteger bigInteger);

    public final zzYLX zzY(BigInteger bigInteger, BigInteger bigInteger2) {
        zzYLX zzylxZzX = zzX(bigInteger, bigInteger2);
        if (zzylxZzX.zzu(false, true)) {
            return zzylxZzX;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public final zzYLP zzZ(zzYLX zzylx, String str) {
        Map<String, zzYLP> map;
        zzYLP zzylp;
        zzV(zzylx);
        synchronized (zzylx) {
            map = zzylx.f51160aq;
        }
        if (map == null) {
            return null;
        }
        synchronized (map) {
            zzylp = map.get(str);
        }
        return zzylp;
    }

    public abstract zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02);

    public abstract zzYLX zzZ(zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr);

    public boolean zzeT(int i) {
        return i == 0;
    }

    public abstract zzYM0 zzv(SecureRandom secureRandom);

    public final boolean zzV(zzYM1 zzym1) {
        if (this != zzym1) {
            return zzym1 != null && this.f51168O.equals(zzym1.f51168O) && this.f51169P.toBigInteger().equals(zzym1.f51169P.toBigInteger()) && this.f51170Q.toBigInteger().equals(zzym1.f51170Q.toBigInteger());
        }
        return true;
    }

    public static abstract class zzZ extends zzYM1 {

        /* JADX INFO: renamed from: ab */
        private BigInteger[] f51192ab;

        public zzZ(int i, int i2, int i3, int i4) {
            super(zzd(i, i2, i3, i4));
            this.f51192ab = null;
            if (zzYGM.zzwd("org.bouncycastle.ec.disable")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable\"");
            }
            if (zzYGM.zzwd("org.bouncycastle.ec.disable_f2m")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
            }
        }

        private static BigInteger zzZ(SecureRandom secureRandom, int i) {
            BigInteger bigIntegerZzW;
            do {
                bigIntegerZzW = zzYGT.zzW(i, secureRandom);
            } while (bigIntegerZzW.signum() <= 0);
            return bigIntegerZzW;
        }

        private static zzYIB zzd(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    return zzYIA.zzZH(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i4 > i3) {
                return zzYIA.zzZH(new int[]{0, i2, i3, i4, i});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzX(BigInteger bigInteger, BigInteger bigInteger2) {
            zzYM0 zzym0ZzP = zzP(bigInteger);
            zzYM0 zzym0ZzP2 = zzP(bigInteger2);
            int iZzXzH = zzXzH();
            if (iZzXzH == 5 || iZzXzH == 6) {
                if (!zzym0ZzP.isZero()) {
                    zzym0ZzP2 = zzym0ZzP2.zzT(zzym0ZzP).zzW(zzym0ZzP);
                } else if (!zzym0ZzP2.zzXzy().equals(zzXzJ())) {
                    throw new IllegalArgumentException();
                }
            }
            return zzZ(zzym0ZzP, zzym0ZzP2);
        }

        public boolean zzXzD() {
            if (this.f51171R == null || this.f51172S == null || !this.f51170Q.zzXzv()) {
                return false;
            }
            return this.f51169P.isZero() || this.f51169P.zzXzv();
        }

        public final synchronized BigInteger[] zzXzE() {
            try {
                if (this.f51192ab == null) {
                    this.f51192ab = zzYLM.zzZ(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f51192ab;
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYLX zzY(int i, BigInteger bigInteger) {
            zzYM0 zzym0ZzW;
            zzYM0 zzym0ZzP = zzP(bigInteger);
            if (zzym0ZzP.isZero()) {
                zzym0ZzW = zzXzJ().zzXzw();
            } else {
                zzYM0 zzym0ZzX = zzX(zzym0ZzP.zzXzy().zzXzx().zzU(zzXzJ()).zzW(zzXzK()).zzW(zzym0ZzP));
                if (zzym0ZzX != null) {
                    if (zzym0ZzX.zzXzu() != (i == 1)) {
                        zzym0ZzX = zzym0ZzX.zzXzA();
                    }
                    int iZzXzH = zzXzH();
                    zzym0ZzW = (iZzXzH == 5 || iZzXzH == 6) ? zzym0ZzX.zzW(zzym0ZzP) : zzym0ZzX.zzU(zzym0ZzP);
                } else {
                    zzym0ZzW = null;
                }
            }
            if (zzym0ZzW != null) {
                return zzZ(zzym0ZzP, zzym0ZzW);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // com.aspose.words.internal.zzYM1
        public final zzYM0 zzv(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return zzP(zzZ(secureRandom, fieldSize)).zzU(zzP(zzZ(secureRandom, fieldSize)));
        }

        public final zzYM0 zzX(zzYM0 zzym0) {
            zzYM0 zzym0ZzP;
            zzYM0 zzym0ZzW;
            zzYM0 zzym0ZzXzt;
            if (zzym0.isZero()) {
                return zzym0;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                zzym0ZzXzt = ((zzYM0.zzZ) zzym0).zzXzt();
            } else {
                Random random = new Random();
                do {
                    zzYM0 zzym0ZzP2 = zzP(new BigInteger(fieldSize, random));
                    zzym0ZzP = zzP(zzYM2.ZERO);
                    zzym0ZzW = zzym0ZzP2;
                    for (int i = 1; i < fieldSize; i++) {
                        zzYM0 zzym0ZzXzy = zzym0ZzW.zzXzy();
                        zzym0ZzP = zzym0ZzP.zzXzy().zzW(zzym0ZzXzy.zzU(zzym0));
                        zzym0ZzW = zzym0ZzXzy.zzW(zzym0ZzP2);
                    }
                } while (zzym0ZzW.isZero());
                zzym0ZzXzt = zzym0ZzP;
            }
            if (zzym0.equals(zzym0ZzXzt.zzXzy().zzW(zzym0ZzXzt))) {
                return zzym0ZzXzt;
            }
            return null;
        }
    }

    public final zzYLP zzZ(zzYLX zzylx, String str, zzYLQ zzylq) {
        Map map;
        zzYLP zzylpZzZ;
        zzV(zzylx);
        synchronized (zzylx) {
            try {
                map = zzylx.f51160aq;
                if (map == null) {
                    map = new HashMap(4);
                    zzylx.f51160aq = map;
                }
            } finally {
            }
        }
        synchronized (map) {
            try {
                zzYLP zzylp = (zzYLP) map.get(str);
                zzylpZzZ = zzylq.zzZ(zzylp);
                if (zzylpZzZ != zzylp) {
                    map.put(str, zzylpZzZ);
                }
            } finally {
            }
        }
        return zzylpZzZ;
    }

    public final void zzZ(zzYLX[] zzylxArr) {
        zzZ(zzylxArr, 0, zzylxArr.length, null);
    }

    public final void zzZ(zzYLX[] zzylxArr, int i, int i2, zzYM0 zzym0) {
        zzZ(zzylxArr, i, i2);
        int i3 = this.f51173T;
        if (i3 == 0 || i3 == 5) {
            if (zzym0 != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        zzYM0[] zzym0Arr = new zzYM0[i2];
        int[] iArr = new int[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i + i5;
            zzYLX zzylx = zzylxArr[i6];
            if (zzylx != null && (zzym0 != null || !zzylx.zzXzf())) {
                zzym0Arr[i4] = zzylx.zzeQ(0);
                iArr[i4] = i6;
                i4++;
            }
        }
        if (i4 == 0) {
            return;
        }
        zzYM3.zzZ(zzym0Arr, i4, zzym0);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = iArr[i7];
            zzylxArr[i8] = zzylxArr[i8].zzR(zzym0Arr[i7]);
        }
    }

    public zzYLZ zzZ(zzYLX[] zzylxArr, final int i) {
        final int fieldSize = (getFieldSize() + 7) >>> 3;
        final byte[] bArr = new byte[i * fieldSize * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            zzYLX zzylx = zzylxArr[i3];
            byte[] byteArray = zzylx.zzXzj().toBigInteger().toByteArray();
            byte[] byteArray2 = zzylx.zzXzi().toBigInteger().toByteArray();
            int i4 = 1;
            int i5 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i5;
            if (byteArray2.length <= fieldSize) {
                i4 = 0;
            }
            int length2 = byteArray2.length - i4;
            int i6 = i2 + fieldSize;
            System.arraycopy(byteArray, i5, bArr, i6 - length, length);
            i2 = i6 + fieldSize;
            System.arraycopy(byteArray2, i4, bArr, i2 - length2, length2);
        }
        return new zzYLZ() { // from class: com.aspose.words.internal.zzYM1.1
            @Override // com.aspose.words.internal.zzYLZ
            public final int getSize() {
                return i;
            }

            @Override // com.aspose.words.internal.zzYLZ
            public final zzYLX zzeS(int i7) {
                int i8;
                int i9 = fieldSize;
                byte[] bArr2 = new byte[i9];
                byte[] bArr3 = new byte[i9];
                int i10 = 0;
                for (int i11 = 0; i11 < i; i11++) {
                    int i12 = ((i11 ^ i7) - 1) >> 31;
                    int i13 = 0;
                    while (true) {
                        i8 = fieldSize;
                        if (i13 < i8) {
                            byte b = bArr2[i13];
                            byte[] bArr4 = bArr;
                            bArr2[i13] = (byte) (b ^ (bArr4[i10 + i13] & i12));
                            bArr3[i13] = (byte) ((bArr4[(i8 + i10) + i13] & i12) ^ bArr3[i13]);
                            i13++;
                        }
                    }
                    i10 += i8 * 2;
                }
                zzYM1 zzym1 = zzYM1.this;
                return zzym1.zzZ(zzym1.zzP(new BigInteger(1, bArr2)), zzYM1.this.zzP(new BigInteger(1, bArr3)));
            }
        };
    }

    private void zzZ(zzYLX[] zzylxArr, int i, int i2) {
        if (zzylxArr != null) {
            if (i < 0 || i2 < 0 || i > zzylxArr.length - i2) {
                throw new IllegalArgumentException("invalid range specified for 'points'");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                zzYLX zzylx = zzylxArr[i + i3];
                if (zzylx != null && this != zzylx.zzXHv()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            return;
        }
        throw new IllegalArgumentException("'points' cannot be null");
    }
}
