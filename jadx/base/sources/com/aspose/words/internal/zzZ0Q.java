package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzYG2;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ3F;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ0Q {
    private static final zzZ1P zzWfA;
    private static final zzZ1P zzWfB;
    private static final zzYS0 zzWfc;
    private static final zzYS1 zzWfd;
    private static byte[] zzWfe;
    private static byte[] zzWff;
    private static BigInteger zzWfg;
    private static BigInteger zzWfh;
    private static BigInteger zzWfi;
    private static BigInteger zzWfj;
    private static BigInteger zzWfk;
    private static BigInteger zzWfl;
    private static BigInteger zzWfm;
    private static BigInteger zzWfn;
    private static final BigInteger zzWfo;
    private static final BigInteger zzWfp;
    public static final zzP zzWfq;
    public static final zzJ zzWfr;
    public static final zzO zzWfs;
    public static final zzN zzWft;
    public static final zzD zzWfu;
    public static final zzL zzWfv;
    public static final zzM zzWfw;
    private static final zzZ1P zzWfx;
    private static final zzZ1P zzWfy;
    private static final zzZ1P zzWfz;
    public static final zzZ1P zzWjd;
    static final zzZ1E<zzYVC> zzWje;

    public static final class zzD extends zzG {
        public zzD() {
            super(zzZ0Q.zzWfz, zzZ0P.zzZ.zzWdL);
        }

        public static zzD zzS(zzZ1J zzz1j) {
            return new zzD(zzz1j);
        }

        private zzD(zzZ1J zzz1j) {
            super(zzZ0Q.zzWfz, zzz1j);
        }
    }

    public static class zzE extends zzZ0S {
        public zzE(zzZ1P zzz1p) {
            super(zzz1p);
        }
    }

    public enum zzF {
        PKCS1v1_5,
        PSS,
        X931,
        OAEP,
        SVE
    }

    public static class zzG extends zzZ0S {
        private final zzZ1J zzWhV;

        public zzG(zzZ1P zzz1p, zzZ1J zzz1j) {
            super(zzz1p);
            if (zzz1j == null && zzZ5L.zzXH0()) {
                zzYZZ.checkPermission(zzYUM.zzVZw);
            }
            this.zzWhV = zzz1j;
        }

        public final zzZ1J zzXFo() {
            return this.zzWhV;
        }
    }

    public static final class zzH<T extends zzG> extends zzZ0M<T> {

        public class zzZ<P extends zzG> extends zzZ0W<P> {
            private final P zzWeB;
            private final zzYV3 zzWeC;
            final zzYUI zzWeD;
            private final SecureRandom zzWk5;

            public zzZ(P p, zzYV3 zzyv3, SecureRandom secureRandom) {
                this.zzWeB = p;
                this.zzWeC = zzyv3;
                this.zzWk5 = secureRandom;
                if (p instanceof zzM) {
                    if (p.zzXFo() == null) {
                        this.zzWeD = new zzQ((byte) 0);
                        return;
                    } else {
                        this.zzWeD = new zzYZU(zzZ0Q.zzWje.zzXFZ(), zzZ0P.zzU(p.zzXFo()));
                        return;
                    }
                }
                if (p instanceof zzL) {
                    this.zzWeD = zzZ0Q.zzZ((zzL) p);
                } else {
                    this.zzWeD = new zzYZC(zzZ0Q.zzWje.zzXFZ(), zzZ0P.zzU(p.zzXFo()));
                }
            }

            @Override // com.aspose.words.internal.zzZ4S
            public final byte[] getSignature() throws zzZ4H {
                try {
                    return this.zzWeD.zzXEp();
                } catch (Exception e) {
                    throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to create signature: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzZ0W, com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzU */
            public final zzZ0W<P> zzX(SecureRandom secureRandom) {
                return new zzZ(this.zzWeB, this.zzWeC, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ4S
            public final zzZ41 zzXGO() {
                SecureRandom secureRandom = this.zzWk5;
                if (secureRandom != null) {
                    this.zzWeD.zzZ(true, new zzYS3(this.zzWeC, secureRandom));
                } else {
                    this.zzWeD.zzZ(true, new zzYS3(this.zzWeC, zzZ5L.zzXGZ()));
                }
                return new zzYU4(this.zzWeB.zzXF4().getName(), this.zzWeD);
            }
        }

        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final zzZ0W<T> zzY(zzZ5S zzz5s, T t) {
            int iBitLength;
            zzZ3E zzz3e = (zzZ3E) zzz5s;
            if (!zzz3e.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
            }
            if (!zzZ5L.zzXH0() || (iBitLength = zzz3e.getModulus().bitLength()) >= 2048) {
                return new zzZ(t, zzZ0Q.zzZ(zzz3e), null);
            }
            throw new zzZ0H(C21532OooOOo.OooO0OO(iBitLength, "Attempt to use RSA key with non-approved size: "), zzz5s.zzXGV());
        }

        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final zzZ0V<T> zzZ(zzZ5R zzz5r, final T t) {
            final zzYUI zzyzc;
            int iBitLength;
            byte b = 0;
            if (t instanceof zzM) {
                if (t.zzXFo() == null) {
                    zzyzc = new zzQ(b);
                } else {
                    zzyzc = new zzYZU(zzZ0Q.zzWje.zzXFZ(), zzZ0P.zzU(t.zzXFo()));
                }
            } else if (t instanceof zzL) {
                zzyzc = zzZ0Q.zzZ((zzL) t);
            } else {
                zzyzc = new zzYZC(new zzYZX(), zzZ0P.zzU(t.zzXFo()));
            }
            zzZ3D zzz3d = (zzZ3D) zzz5r;
            if (zzz3d.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                if (zzZ5L.zzXH0() && (iBitLength = zzz3d.getModulus().bitLength()) < 2048 && iBitLength != 1024 && iBitLength != 1536) {
                    throw new zzZ0H(C21532OooOOo.OooO0OO(iBitLength, "Attempt to use RSA key with non-approved size: "), zzz5r.zzXGV());
                }
                zzyzc.zzZ(false, new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent()));
                return (zzZ0V<T>) new zzZ0V<T>() { // from class: com.aspose.words.internal.zzZ0Q.zzH.1
                    @Override // com.aspose.words.internal.zzZ4P
                    public final zzZ41 zzXGN() {
                        return new zzYU4(t.zzXF4().getName(), zzyzc);
                    }

                    @Override // com.aspose.words.internal.zzZ4P
                    public final boolean zzXh(byte[] bArr) throws zzZ5C {
                        try {
                            return zzyzc.zzWX(bArr);
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                };
            }
            throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
        }
    }

    public static class zzI implements zzZ4F {
        private final byte[] zzWeH;
        private final byte[] zzWfO;

        public zzI(byte[] bArr, byte[] bArr2) {
            this.zzWfO = zzYGU.zzVI(bArr);
            this.zzWeH = zzYGU.zzVI(bArr2);
        }

        @Override // com.aspose.words.internal.zzZ4F
        public final byte[] zzXGK() {
            return zzYGU.zzVI(this.zzWeH);
        }

        @Override // com.aspose.words.internal.zzZ4F
        public final byte[] zzXGL() {
            return zzYGU.zzVI(this.zzWfO);
        }
    }

    public static final class zzJ extends zzU {
        public zzJ() {
            super(zzZ0Q.zzWfx);
        }
    }

    public static final class zzK extends SecureRandom {
        public zzK() {
            super(null, new zzZ());
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void nextBytes(byte[] bArr) {
            for (int i = 0; i != bArr.length; i++) {
                bArr[i] = (byte) (i % 255);
            }
        }
    }

    public static final class zzL extends zzG {
        private final byte[] zzWAR;
        private final int zzWeI;
        private final zzZ1J zzWeJ;
        private final int zzWeK;

        /* JADX WARN: Illegal instructions before constructor call */
        public zzL() {
            zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
            this(zzz1j, zzz1j, 20, null, -68);
        }

        public final byte[] getSalt() {
            return zzYGU.zzVI(this.zzWAR);
        }

        public final int getSaltLength() {
            return this.zzWeK;
        }

        public final zzL zzT(zzZ1J zzz1j) {
            return new zzL(zzXFo(), zzz1j, this.zzWeK, this.zzWAR, this.zzWeI);
        }

        public final zzL zzU(zzZ1J zzz1j) {
            return new zzL(zzz1j, zzz1j, zzZ0P.zzU(zzz1j).zzQI(), null, this.zzWeI);
        }

        public final int zzXEl() {
            return this.zzWeI;
        }

        public final zzZ1J zzXEm() {
            return this.zzWeJ;
        }

        public final zzL zzfI(int i) {
            return new zzL(zzXFo(), this.zzWeJ, this.zzWeK, this.zzWAR, i);
        }

        public final zzL zzfJ(int i) {
            return new zzL(zzXFo(), this.zzWeJ, i, null, this.zzWeI);
        }

        private zzL(zzZ1J zzz1j, zzZ1J zzz1j2, int i, byte[] bArr, int i2) {
            super(zzZ0Q.zzWfA, zzz1j);
            this.zzWeJ = zzz1j2;
            this.zzWeK = i;
            this.zzWAR = bArr;
            this.zzWeI = i2;
        }
    }

    public static final class zzM extends zzG {
        public zzM() {
            super(zzZ0Q.zzWfB, zzZ0P.zzZ.zzWdL);
        }

        public static zzM zzV(zzZ1J zzz1j) {
            return new zzM(zzz1j);
        }

        private zzM(zzZ1J zzz1j) {
            super(zzZ0Q.zzWfB, zzz1j);
        }
    }

    public static final class zzN extends zzE {
        public zzN() {
            super(zzZ0Q.zzWfB);
        }
    }

    public static final class zzO extends zzE {
        private final byte[] zzWeL;
        private final zzZ1J zzWeM;
        private final zzZ1J zzWhV;

        /* JADX WARN: Illegal instructions before constructor call */
        public zzO() {
            zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
            this(zzz1j, zzz1j, null);
        }

        public final zzO zzWW(byte[] bArr) {
            return new zzO(this.zzWhV, this.zzWeM, zzYGU.zzVI(bArr));
        }

        private zzO(zzZ1J zzz1j, zzZ1J zzz1j2, byte[] bArr) {
            super(zzZ0Q.zzWfy);
            this.zzWhV = zzz1j;
            this.zzWeM = zzz1j2;
            this.zzWeL = zzYGU.zzVI(bArr);
        }

        public final zzO zzW(zzZ1J zzz1j) {
            return new zzO(this.zzWhV, zzz1j, this.zzWeL);
        }

        public final zzO zzX(zzZ1J zzz1j) {
            return new zzO(zzz1j, zzz1j, this.zzWeL);
        }
    }

    public static final class zzP extends zzU {
        private final int zzWeN;
        private final zzO zzWeO;
        private final int zzWiC;

        public zzP(zzO zzo) {
            this(zzo, 128, 0);
        }

        public final int zzXEn() {
            return this.zzWeN;
        }

        public final int zzXEo() {
            return this.zzWiC;
        }

        public final zzP zzfK(int i) {
            return new zzP(this.zzWeO, this.zzWiC, i);
        }

        public final zzP zzfL(int i) {
            return new zzP(this.zzWeO, i, this.zzWeN);
        }

        private zzP(zzO zzo, int i, int i2) {
            super(zzZ0Q.zzWfy);
            this.zzWeO = zzo;
            this.zzWiC = i;
            this.zzWeN = i2;
        }

        public final zzP zzZ(zzO zzo) {
            return new zzP(zzo, this.zzWiC, this.zzWeN);
        }
    }

    public static class zzQ implements zzYUI {
        ByteArrayOutputStream zzWeP;
        zzYVC zzWeQ;

        private zzQ() {
            this.zzWeQ = new zzYU8(zzZ0Q.zzWje.zzXFZ());
            this.zzWeP = new ByteArrayOutputStream();
        }

        @Override // com.aspose.words.internal.zzYUI
        public final void update(byte b) {
            this.zzWeP.write(b);
        }

        @Override // com.aspose.words.internal.zzYUI
        public final boolean zzWX(byte[] bArr) throws zzZ5C {
            byte[] byteArray = this.zzWeP.toByteArray();
            this.zzWeP.reset();
            try {
                return zzYRX.zzt(byteArray, this.zzWeQ.zzy(bArr, 0, bArr.length));
            } catch (zzYUT e) {
                throw new zzZ5C("Unable to process signature: " + e.getMessage(), e);
            }
        }

        @Override // com.aspose.words.internal.zzYUI
        public final byte[] zzXEp() throws zzYV0, zzYV2 {
            byte[] byteArray = this.zzWeP.toByteArray();
            this.zzWeP.reset();
            return this.zzWeQ.zzy(byteArray, 0, byteArray.length);
        }

        @Override // com.aspose.words.internal.zzYUI
        public final void zzZ(boolean z, zzYV3 zzyv3) {
            this.zzWeQ.zzZ(z, zzyv3);
        }

        @Override // com.aspose.words.internal.zzYUI
        public final void update(byte[] bArr, int i, int i2) {
            this.zzWeP.write(bArr, i, i2);
        }

        public /* synthetic */ zzQ(byte b) {
            this();
        }
    }

    public static final class zzR extends zzZ18<zzE, zzZ3F> {

        public class zzY extends zzZ16<zzE> {
            private final zzE zzWeS;
            private final zzZ3F zzWeT;
            private final zzYVC zzWeU;

            public zzY(zzZ3F zzz3f, zzE zze, SecureRandom secureRandom) {
                if (!zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                    throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
                }
                this.zzWeT = zzz3f;
                this.zzWeS = zze;
                if (secureRandom != null) {
                    this.zzWeU = zzZ0Q.zzZ(true, zzz3f, zze, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
            public zzZ53<zzE> zzX(SecureRandom secureRandom) {
                return zzR.this.new zzY(this.zzWeT, this.zzWeS, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ54
            public final byte[] zzg(byte[] bArr, int i) throws zzZ4H {
                zzYVC zzyvc = this.zzWeU;
                if (zzyvc == null) {
                    throw new IllegalStateException("KeyWrapper requires a SecureRandom");
                }
                try {
                    return zzyvc.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to wrap key: ")), e);
                }
            }
        }

        public class zzZ extends zzZ19<zzE> {
            private final zzE zzWeS;
            private final zzZ3F zzWeT;
            private final zzYVC zzWeU;

            public zzZ(zzZ3F zzz3f, zzE zze, SecureRandom secureRandom) {
                if (!zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                    throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
                }
                this.zzWeT = zzz3f;
                this.zzWeS = zze;
                if (secureRandom != null) {
                    this.zzWeU = zzZ0Q.zzZ(false, zzz3f, zze, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
            public zzZ19<zzE> zzX(SecureRandom secureRandom) {
                return zzR.this.new zzZ(this.zzWeT, this.zzWeS, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ57
            public final byte[] zzh(byte[] bArr, int i) throws zzZ5B {
                zzYVC zzyvc = this.zzWeU;
                if (zzyvc == null) {
                    throw new IllegalStateException("KeyUnwrapper requires a SecureRandom");
                }
                try {
                    return zzyvc.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ5B(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to unwrap key: ")), e);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        public zzZ19<zzE> zzY(zzZ3F zzz3f, zzE zze) {
            return new zzZ(zzz3f, zze, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ18, com.aspose.words.internal.zzZ55
        public zzZ16<zzE> zzZ(zzZ3F zzz3f, zzE zze) {
            return new zzY(zzz3f, zze, null);
        }
    }

    public static final class zzS extends zzZ1O<zzT, zzZ3D, zzZ3E> {
        private final zzYS2 zzWeV;
        private final zzYZT zzWeW;

        public zzS(zzT zzt, SecureRandom secureRandom) {
            super(zzt);
            zzYZT zzyzt = new zzYZT();
            this.zzWeW = zzyzt;
            int keySize = zzt.getKeySize();
            zzt.zztF();
            if (zzZ5L.zzXH0()) {
                zzYZF.zzY(secureRandom, zzYZF.zzfx(keySize), zzZ0Q.zzWjd);
            }
            zzYS2 zzys2 = new zzYS2(zzt.getPublicExponent(), secureRandom, keySize, zzt.zzXEq());
            this.zzWeV = zzys2;
            zzyzt.zzZ(zzys2);
        }

        @Override // com.aspose.words.internal.zzZ5U
        public final zzZ3G<zzZ3D, zzZ3E> zzXH4() {
            zzYVB zzyvbZzXG6 = this.zzWeW.zzXG6();
            zzYS1 zzys1 = (zzYS1) zzyvbZzXG6.zzXCP();
            zzYS0 zzys0 = (zzYS0) zzyvbZzXG6.zzXCO();
            zzZ1P zzz1pZzXF4 = zzXH6().zzXF4();
            zzZ0Q.zzW(zzyvbZzXG6);
            return new zzZ3G<>(new zzZ3D(zzz1pZzXF4, zzys1.getModulus(), zzys1.getExponent()), new zzZ3E(zzz1pZzXF4, zzys0.getModulus(), zzys0.getPublicExponent(), zzys0.getExponent(), zzys0.getP(), zzys0.getQ(), zzys0.zzXGu(), zzys0.zzXGt(), zzys0.zzXGs()));
        }
    }

    public static final class zzT extends zzZ0S {
        private int zzWEq;
        private int zzWjt;
        private BigInteger zzWwe;

        public zzT(BigInteger bigInteger, int i) {
            this(zzZ0Q.zzWjd, bigInteger, i, zzYUL.zzf4(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zztF() {
            if (!zzZ5L.zzXH0()) {
                if (this.zzWwe.testBit(0)) {
                    return;
                }
                throw new IllegalArgumentException("Public exponent must be an odd number: " + zzXF4().getName());
            }
            if (this.zzWEq < 2048) {
                throw new zzZ0H(C21023OooO0Oo.OooO0OO(" bits", this.zzWEq, new StringBuilder("Attempt to use RSA key size outside of accepted range - requested keySize ")), zzXF4());
            }
            if (this.zzWwe.compareTo(zzZ0Q.zzWfp) < 0) {
                throw new zzZ0H("Public exponent too small", zzXF4());
            }
            if (this.zzWwe.compareTo(zzZ0Q.zzWfo) > 0) {
                throw new zzZ0H("Public exponent too large", zzXF4());
            }
            if (!this.zzWwe.testBit(0)) {
                throw new zzZ0H("Public exponent must be an odd number", zzXF4());
            }
            if (this.zzWjt >= zzYUL.zzf4(this.zzWEq)) {
                return;
            }
            StringBuilder sb = new StringBuilder("Prime generation certainty ");
            sb.append(this.zzWjt);
            sb.append(" inadequate for key of  ");
            throw new zzZ0H(C21023OooO0Oo.OooO0OO(" bits", this.zzWEq, sb), zzXF4());
        }

        public final int getKeySize() {
            return this.zzWEq;
        }

        public final BigInteger getPublicExponent() {
            return this.zzWwe;
        }

        public final int zzXEq() {
            return this.zzWjt;
        }

        public zzT(BigInteger bigInteger, int i, int i2) {
            this(zzZ0Q.zzWjd, bigInteger, i, i2);
        }

        private zzT(zzZ1P zzz1p, BigInteger bigInteger, int i, int i2) {
            super(zzz1p);
            this.zzWwe = bigInteger;
            this.zzWEq = i;
            this.zzWjt = i2;
            zztF();
        }
    }

    public static class zzU extends zzZ0S {
        public zzU(zzZ1P zzz1p) {
            super(zzz1p);
        }
    }

    public static class zzV extends zzZ1B<zzU> {
        private final SecureRandom zzWk5;

        public zzV(SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                zzYZF.zzZ(secureRandom, "Attempt to create KTSOperatorFactory with unapproved RNG");
            }
            this.zzWk5 = secureRandom;
        }

        public final zzZ1G<zzU> zzY(zzZ58 zzz58, zzU zzu) {
            if (zzZ5L.zzXH0()) {
                zzYZF.zzZ(this.zzWk5, zzu.zzXF4(), "Attempt to create extractor with unapproved RNG");
            }
            return new zzX((zzZ3E) zzz58, zzu, this.zzWk5);
        }

        public final zzZ1F<zzU> zzZ(zzZ58 zzz58, zzU zzu) {
            if (zzZ5L.zzXH0()) {
                zzYZF.zzZ(this.zzWk5, zzu.zzXF4(), "Attempt to create generator with unapproved RNG");
            }
            return new zzW((zzZ3D) zzz58, zzu, this.zzWk5);
        }
    }

    public static class zzX extends zzZ1G<zzU> {
        private final zzU zzWeY;
        private final zzZ3E zzWeZ;
        private final SecureRandom zzWk5;

        public zzX(zzZ3E zzz3e, zzU zzu, SecureRandom secureRandom) {
            if (!zzz3e.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
            }
            this.zzWeZ = zzz3e;
            this.zzWeY = zzu;
            this.zzWk5 = secureRandom;
        }

        private static byte[] zzT(int i, byte[] bArr) {
            if (bArr.length >= i) {
                return bArr;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, i - bArr.length, bArr.length);
            zzYGU.fill(bArr, (byte) 0);
            return bArr2;
        }

        public static /* synthetic */ zzZ4F zzZ(zzX zzx, zzYS1 zzys1, zzYVC zzyvc, byte[] bArr, int i) throws zzZ5D {
            return zzx.zzZ(zzys1, zzyvc, bArr, 0, i);
        }

        @Override // com.aspose.words.internal.zzZ5I
        public final zzZ4F zzj(byte[] bArr, int i) throws zzZ5D {
            return zzZ(zzZ0Q.zzZ(this.zzWeZ), zzZ0Q.zzWje.zzXFZ(), bArr, 0, i);
        }

        private zzZ4F zzZ(zzYS1 zzys1, zzYVC zzyvc, byte[] bArr, int i, int i2) throws zzZ5D {
            if (this.zzWeY.zzXF4() != zzZ0Q.zzWfx) {
                zzO zzo = ((zzP) this.zzWeY).zzWeO;
                zzyvc = new zzYU9(zzyvc, zzZ0P.zzU(zzo.zzWhV), zzZ0P.zzU(zzo.zzWeM), zzo.zzWeL);
            }
            zzyvc.zzZ(false, new zzYS3(zzys1, this.zzWk5));
            try {
                byte[] bArrZzy = zzyvc.zzy(bArr, 0, i2);
                if (this.zzWeY.zzXF4() == zzZ0Q.zzWfx) {
                    bArrZzy = zzT((this.zzWeZ.getModulus().bitLength() + 7) / 8, bArrZzy);
                }
                return new zzI(bArrZzy, zzYGU.copyOfRange(bArr, 0, i2));
            } catch (zzYUT e) {
                throw new zzZ5D("Unable to extract secret: " + e.getMessage(), e);
            }
        }
    }

    public static final class zzY extends zzZ1E<zzYVC> {
        private static final BigInteger zzWf8 = new BigInteger("b259d2d6e627a768c94be36164c2d9fc79d97aab9253140e5bf17751197731d6f7540d2509e7b9ffee0a70a6e26d56e92d2edd7f85aba85600b69089f35f6bdbf3c298e05842535d9f064e6b0391cb7d306e0a2d20c4dfb4e7b49a9640bdea26c10ad69c3f05007ce2513cee44cfe01998e62b6c3637d3fc0391079b26ee36d5", 16);
        private static final BigInteger zzWf7 = new BigInteger("11", 16);
        private static final BigInteger zzWf6 = new BigInteger("92e08f83cc9920746989ca5034dcb384a094fb9c5a6288fcc4304424ab8f56388f72652d8fafc65a4b9020896f2cde297080f2a540e7b7ce5af0b3446e1258d1dd7f245cf54124b4c6e17da21b90a0ebd22605e6f45c9f136d7a13eaac1c0f7487de8bd6d924972408ebb58af71e76fd7b012a8d0e165f3ae2e5077a8648e619", 16);
        private static final BigInteger zzWl1 = new BigInteger("f75e80839b9b9379f1cf1128f321639757dba514642c206bbbd99f9a4846208b3e93fbbe5e0527cc59b1d4b929d9555853004c7c8b30ee6a213c3d1bb7415d03", 16);
        private static final BigInteger zzWl0 = new BigInteger("b892d9ebdbfc37e397256dd8a5d3123534d1f03726284743ddc6be3a709edb696fc40c7d902ed804c6eee730eee3d5b20bf6bd8d87a296813c87d3b3cc9d7947", 16);
        private static final BigInteger zzWf5 = new BigInteger("1d1a2d3ca8e52068b3094d501c9a842fec37f54db16e9a67070a8b3f53cc03d4257ad252a1a640eadd603724d7bf3737914b544ae332eedf4f34436cac25ceb5", 16);
        private static final BigInteger zzWf4 = new BigInteger("6c929e4e81672fef49d9c825163fec97c4b7ba7acb26c0824638ac22605d7201c94625770984f78a56e6e25904fe7db407099cad9b14588841b94f5ab498dded", 16);
        private static final BigInteger zzWf3 = new BigInteger("dae7651ee69ad1d081ec5e7188ae126f6004ff39556bde90e0b870962fa7b926d070686d8244fe5a9aa709a95686a104614834b0ada4b10f53197a5cb4c97339", 16);
        private static final byte[] zzWf2 = zzYGC.decode("ff6f77206973207468652074696d6520666f7220616c6c20676f6f64206d656e");
        private static final byte[] zzWf1 = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc3497a9fb17ba03d95f28fad91247d6f8ebc463fa8ada974f0f4e28961565a73a46a465369e0798ccbf7893cb9afaa7c426cc4fea6f429e67b6205b682a9831337f2548fd165c2dd7bf5b54be5894403d6e9f6283e65fb134cd4687bf86f95e7a");

        private zzY() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXEB, reason: merged with bridge method [inline-methods] */
        public final zzYVC zzXFZ() {
            return (zzYVC) zzYZG.zzZ(zzZ0Q.zzWjd, new zzYZX(), new zzYZD<zzYZX>() { // from class: com.aspose.words.internal.zzZ0Q.zzY.1
                private static void zzZ(zzYZX zzyzx) throws Exception {
                    zzYS1 zzys1 = new zzYS1(false, zzY.zzWf8, zzY.zzWf7);
                    zzYS0 zzys0 = new zzYS0(zzY.zzWf8, zzY.zzWf7, zzY.zzWf6, zzY.zzWl1, zzY.zzWl0, zzY.zzWf5, zzY.zzWf4, zzY.zzWf3);
                    byte[] bArrZzy = zzY.zzWf2;
                    zzyzx.zzZ(true, new zzYS3(zzys1, zzYZF.zzWbb));
                    try {
                        bArrZzy = zzyzx.zzy(bArrZzy, 0, bArrZzy.length);
                    } catch (Exception e) {
                        zzYZD.zzTQ(C22245OooO0oO.OooO0Oo(e, new StringBuilder("Self test failed: exception ")));
                    }
                    if (!zzYGU.zzp(zzY.zzWf1, bArrZzy)) {
                        zzYZD.zzTQ("Self test failed: input does not match decrypted output");
                    }
                    zzyzx.zzZ(false, new zzYS3(zzys0, zzYZF.zzWbb));
                    try {
                        bArrZzy = zzyzx.zzy(bArrZzy, 0, bArrZzy.length);
                    } catch (Exception e2) {
                        zzYZD.zzTQ(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("Self test failed: exception ")));
                    }
                    if (zzYGU.zzp(zzY.zzWf2, bArrZzy)) {
                        return;
                    }
                    zzYZD.zzTQ("Self test failed: input does not match decrypted output");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzYZX zzyzx) throws Exception {
                    zzZ(zzyzx);
                }
            });
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ extends Provider {
        public zzZ() {
            super("FipsRSA_TEST_RNG", 1.0d, "BCFIPS FipsRSA Test Provider");
        }
    }

    static {
        zzZ1P zzz1p = new zzZ1P(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA);
        zzWjd = zzz1p;
        zzWfB = new zzZ1P("RSA/PKCS1V1.5", zzF.PKCS1v1_5);
        zzWfA = new zzZ1P("RSA/PSS", zzF.PSS);
        zzWfz = new zzZ1P("RSA/X9.31", zzF.X931);
        zzWfy = new zzZ1P("RSA/OAEP", zzF.OAEP);
        zzWfx = new zzZ1P("RSA/SVE", zzF.SVE);
        zzWfw = new zzM();
        zzWfv = new zzL();
        zzWfu = new zzD();
        zzWft = new zzN();
        zzO zzo = new zzO();
        zzWfs = zzo;
        zzWfr = new zzJ();
        zzWfq = new zzP(zzo);
        zzWfp = BigInteger.valueOf(65537L);
        BigInteger bigInteger = BigInteger.ONE;
        zzWfo = bigInteger.shiftLeft(256).subtract(bigInteger);
        zzWfn = new BigInteger("10001", 16);
        zzWfm = new BigInteger("83ca29fa6f3da1a20a7d64c741c502def9dff5630c94ca0c674a7602aea3436d432c94e3fe9f8cea4a7975ffa5228cba39acb6d1262c3453280bd8352b0dc7fb0a343f62b2c1405baf44c0f6b37edc94f63de8f772dc30e3b5003ff9a35befa02540e08b128718870fab40dcd91575b6592bb143cc3f29aa82fce7ee72952601c0c815396a9ad382c0a79e494727478606bf92d7b1c445b73368b4d7480500091de498b365719ec9c9b76f37cc97d13d7ce830248f4df2cdc73433a9b5d3fe29122bfdb113be45444b15652059eb51085dfe354d0c87256e6a51c6902ce56d3967dcf32f3bc9464ab437ac4030d00c1e53b4da74b9e70c47a5842f3b4d4dd6c7", 16);
        zzWfl = new BigInteger("22b248d6fc0e77cd5781a7d4a5c61e7961c3cab0e7110d18b2e0f1acc7198898ed8481367d44b82ebea8b79e3475a2232d28018192d1347d681fa62e6945598f0822b54560d66c0137659c7fd6c5e180fe4b5258434f2137f1e13cf696419016d377ff25de1cdf223fc7d06dd46147fa58039ec9c0ae286411d44fa3815b2f040895344a413ba141b4228a704a75883caaa3e9d2ace0d28c179acb571ca8ce0d1c3a0cf9cda8b0088b919a4833f5b46ce556faa923ea5b852a48f153ca6fc26730496d7f06691e08edac984870517d2ef689a94ad23c16d471c9a477d82fd225382a4d1ae1b934bf79f2adf3353c557888e056822809dfb561bbef946c1404d1", 16);
        zzWfk = new BigInteger("df26154977b823cbee3e1861b239197310bc3115ee46e7e70bf6dd826aa834fcdafb8d940b77e43e63c073b2efceaa24805c232a3011fd8b2ac323442d89f246a024c843586174d28475fbf7eca079fae8bbe5263cdef074be0a9a07a37bdad3e72b4b44a39a70415db4b0f7f65515f6806ef88b97f935b8d6d5918feff69edd", 16);
        zzWfj = new BigInteger("9730fcb5f8e93cb4df58b80ab3e9b7f014a87b90953c26a29277771965bf2720e1808adf55aa5ac4702ba813eb2643d03a89dad3a3767beddd3fa98148057c8398a0106b086caef10603977e69ffe3e513531c7b456bb7079c57761a7eacde4218c08897ac17d4de7a5b19d192b5706694cbb162c9f95b0154232fc7bd0107f3", 16);
        zzWfi = new BigInteger("dba3666c6bb40937de85ac05ed201a9691304ab82552114bef10cb3264bcaf7afa278350e680d95d375de40389da46c9aab605beae95e6932641efe259585fe97812fc329d393f7d3df7cb4c59d2127e0eb97270d29534e41371e7ee00d215af60e7d22bfb44359d81182adfc5cc35d3ecd24d3d491677f43930f9174dbfd6d9", 16);
        zzWfh = new BigInteger("82d8a47ca054ca7306b07366dfd9af94996c4eb40c53a8641e3a41dabb11b9bd5d2bb00424d170087dc36a8d027f7544eac48f9b85e66ecea7220782996016289598415d40473f07dcda92eb96b51cf80dc769e8cd65b15b66d4d2a38f69f05867af89072aaadd5145b73e1affcb02e1e4787ca630821b5e850086c36831523d", 16);
        zzWfg = new BigInteger("c6ae6a9ff4614a08e1e501e3dd7586c7cd2e70b9e2581185194b7984452325558f576b54b177df38f6d98e2ffce835608d1d3c81fab9f3696796bd5faacf9870b5ad12868eebccb2f55cc398d70ad6197eaeb4ead5cb0415913f18306bc0327f31db0f04910aea237a657634f1ac82b03bd5b2bc30b5f89077677bd3cab0d255", 16);
        zzWff = zzYGC.decode("48656c6c6f20776f726c6421");
        zzWfe = zzYGC.decode("1669b752b409a66ca38ba7e34ae2d5da4303c091255989a4369885ecbb25db3ec05b06fdb4b1be46f6ab347bad9dbbbc9facf0beb4be70bd5f2ee2760c76f0a55932dd7fb4fe5c7b18226796f955215ec6354da9b3808a0df8c2a328abdd67d537f967ea5147bb85dcd80fdcee250b9bc7cec84a08afcde82afa4e62d80bbaf00bcdaf6bbac2b4a4bd394ee223ea3ee100fd233dd40514ea7a9717bfb52370eb4157e7bd25396e9dd3e3782ec2c64db71cf8380c05d3941481af3a08003737456a00cb265efc1d0987acae40776fa497681cb987a508419cbe1e4601a5e5aef66329288453003101a375ad3ec6e4b9a82f49a0748eb024fe1ce2de910d823938");
        zzWfd = new zzYS1(false, zzWfm, zzWfn);
        zzWfc = new zzYS0(zzWfm, zzWfn, zzWfl, zzWfk, zzWfj, zzWfi, zzWfh, zzWfg);
        zzY zzy = new zzY((byte) 0);
        zzZ(zzy);
        zzY(zzy);
        zzX(zzy);
        zzWje = zzy;
        zzYXY.zzZ(zzz1p, zzy);
    }

    private zzZ0Q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYZG.zzZ(zzWjd, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ0Q.3
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzYZX zzyzx = new zzYZX();
                zzyzx.zzZ(true, zzyvb2.zzXCP());
                byte[] bArrZzy = zzyzx.zzy(bArrDecode, 0, bArrDecode.length);
                if (zzYGU.zzp(bArrDecode, bArrZzy)) {
                    return false;
                }
                zzyzx.zzZ(false, new zzYS3(zzyvb2.zzXCO(), zzYZF.zzWbb));
                if (zzYGU.zzp(zzyzx.zzy(bArrDecode, 0, bArrDecode.length), bArrDecode)) {
                    return false;
                }
                return zzYGU.zzp(bArrDecode, zzyzx.zzy(bArrZzy, 0, bArrZzy.length));
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    private static void zzX(final zzY zzy) {
        zzZ1P zzz1p = zzWfy;
        zzYZG.zzZ(zzz1p, new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0Q.6
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArrDecode = zzYGC.decode("4458cce0f94ebd79d275a134d224f95ef4126034e5d979359703b466096fcc15b71b78df4d4a68033112dfcfad7611cc0458475ab4a66b815f87fcb16a8aa1133441b9d61ed846c4856c5d42059fab7505bd8ffa5281a2bb187c6c853f298c98d5752a40be905f85e5ccb27d59415f09ac12a1788d654c675d98f412e6481e6f1159f1736dd96b29c99b411b4e5420b56b07be2885dbc397fa091f66877c41e502cb4afeba460a2ebcdec7d09d933e630b98a4510ad6f32ca7ffc1bdb43e46fff709819d3a69d9b62b774cb12c9dc176a6911bf370ab5029719dc1b4c13e23e57e46a7cd8ba5ee54c954ed460835ddab0086fa36ac110a5790e82c929bc7ca86");
                zzYU9 zzyu9 = new zzYU9(zzy.zzXFZ(), new zzYZR());
                zzyu9.zzZ(true, new zzYS3(zzZ0Q.zzWfd, new zzYG0("18b776ea21069d69776a33e96bad48e1dda0a5ef")));
                if (!zzYGU.zzp(bArrDecode, zzyu9.zzy(zzZ0Q.zzWff, 0, zzZ0Q.zzWff.length))) {
                    zzYZE.zzTQ("Self test OAEP transport encrypt failed.");
                }
                zzyu9.zzZ(false, new zzYS3(zzZ0Q.zzWfc, zzYZF.zzWbb));
                if (zzYGU.zzp(zzZ0Q.zzWff, zzyu9.zzy(bArrDecode, 0, bArrDecode.length))) {
                    return;
                }
                zzYZE.zzTQ("Self test OAEP transport decrypt failed.");
            }
        });
        zzZ1P zzz1p2 = zzWfB;
        zzYZG.zzZ(zzz1p2, new zzYZE(zzz1p2) { // from class: com.aspose.words.internal.zzZ0Q.7
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArrDecode = zzYGC.decode("300603e8d5fdb52e4f9d1dea9cac60ef3500700f03f53b1437fee040ef2713ddd0419b69f5ffe92703999895ea4a111f9bb1333c8d5e115f70a41eb9e4a4ee4d20d7781e0c0765b1b3eb51bd96e9a1715c9be703e3dfa9c4195c001a64239709dfb135921ae6de5960d3e13abdf7cb54580db9922e969a9c4f3a35ac1d5c14958159a0e9259556c19daa793892151370012a215fb7a3d2f8daed098e47e9674edbebeba4bbb6c6b9f37d2bdaa218d0cbc1a70030ccb47f72a25168b0e1ef5a5570920db23f092db0be3dbfbee4babf4bd0e4a1355f45bc9e2a3947ed530d0fc66f77ba4167f16ea12f7ace82950de600ef555fb54bea15be1ec3d93e61af1e97");
                zzYU8 zzyu8 = new zzYU8(zzy.zzXFZ());
                zzyu8.zzZ(true, (zzYV3) new zzYS3(zzZ0Q.zzWfd, new zzK()));
                if (!zzYGU.zzp(bArrDecode, zzyu8.zzy(zzZ0Q.zzWff, 0, zzZ0Q.zzWff.length))) {
                    zzYZE.zzTQ("Self test PKCS#1.5 transport encrypt failed.");
                }
                zzyu8.zzZ(false, (zzYV3) new zzYS3(zzZ0Q.zzWfc, zzYZF.zzWbb));
                if (zzYGU.zzp(zzZ0Q.zzWff, zzyu8.zzy(bArrDecode, 0, bArrDecode.length))) {
                    return;
                }
                zzYZE.zzTQ("Self test PKCS#1.5 transport decrypt failed.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUI zzZ(zzL zzl) {
        byte[] salt = zzl.getSalt();
        return salt != null ? new zzZ01(new zzYZX(), zzZ0P.zzU(zzl.zzXFo()), zzZ0P.zzU(zzl.zzXEm()), salt, zzl.zzXEl()) : new zzZ01(new zzYZX(), zzZ0P.zzU(zzl.zzXFo()), zzZ0P.zzU(zzl.zzXEm()), zzl.getSaltLength(), zzl.zzXEl());
    }

    private static void zzY(final zzY zzy) {
        zzZ1P zzz1p = zzWfx;
        zzYZG.zzZ(zzz1p, new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0Q.5
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                byte[] bArrDecode = zzYGC.decode("ce4cf74c1caef7e0455f4210e13fde6847f56c939aedfed9d24c2e6a7c661c461b436ade0a9afd6457be92af33c2626b319e060e9435612215099f9369aaca72351dad4dc14a4c418dbe7fd3b273e91d45fa615c15be8d5e0b97b6aca713cbc549ed4ef2d82f5f8e03b0d0d95d6ce7c7695f8bba938746eff19b70d2c2d56fab");
                byte[] bArrDecode2 = zzYGC.decode("697140a15ddcb8dc01b7f97d929c20c99f9b1348fa80d67350183e44ca9a90d958758d0299b95fb442338e7c3d3595076f05c51b0152bc8a68a1d0b9eb4077ad716a357f72b10130669eeeb4c7454afe742c14dbcfd469c1f2171b59d2c5b3ebb704157b7df5b8bd68ab15b003355dd3ec033bee5e3d418a8b3dd357d14914143b40b0a6e1900bd1f1bf238f75cbba9a93144bd9ec6ddfe500de2318730d0f55e4ee05cd58201c1993500ff1396a4e66fe868f3eaa8cf09752d48426da24186e7870e610efecc9dc02f959c258d8bbdbc354d652c68e778bb6e523fcd08677d48afbed4f15af72f82b870e4d4b658456dea6f581deb9e6d19a9baa0e30f46023");
                zzZ4F zzz4fZzZ = new zzW(new zzYS1(false, zzZ0Q.zzWfm, zzZ0Q.zzWfn), new zzU(zzZ0Q.zzWfx), new zzYG2(new zzYG2.zzZ(bArrDecode2, (byte) 0), new zzYG2.zzY(bArrDecode))).zzZ(zzy.zzXFZ());
                byte[] bArrZzXGK = zzz4fZzZ.zzXGK();
                if (!zzYGU.zzp(zzYGC.decode("2dc23f549cedbc83b5efa8c0c666010ea8d59d8c860a473f6f32347b53a7a62b47a63b3f306f03b648aec8defa00414d3a24f422384decd3f147967789f5e7e79a927ec59398f3397d3e930489adbd3f213cebfc29715771f30f38335c4ac6dc8632e0be5649a881d551f9a883925be2f5aed67a09ea8257ca832f9240fc345d64b9d3d0522f533fd2f230803516f359376bdd1df899d8fa793cacae1d84c68a974fa554e88e8d182496c502babf4306c055c05b4f6ff4c9af8b74d20bc564bb9b238b9d16309ed20bc290b615d0cfab69dbf49d594fe256e44ad29025c0d811a63e1fe361ea3d106461069d00981a9c013aded45277ef19e1dba7d18a2249b9"), bArrZzXGK)) {
                    zzYZE.zzTQ("Self test SVE encryption KAT failed.");
                }
                byte[] bArrZzXGL = zzX.zzZ(new zzX(new zzZ3E(zzZ0Q.zzWfx, zzZ0Q.zzWfc.getModulus(), zzZ0Q.zzWfc.getExponent()), new zzU(zzZ0Q.zzWfx), zzYZF.zzWbb), zzZ0Q.zzWfc, zzy.zzXFZ(), bArrZzXGK, bArrZzXGK.length).zzXGL();
                if (!zzYGU.zzp(bArrDecode2, bArrZzXGL)) {
                    zzYZE.zzTQ("Self test SVE decryption KAT failed.");
                }
                if (zzYGU.zzp(zzz4fZzZ.zzXGL(), bArrZzXGL)) {
                    return;
                }
                zzYZE.zzTQ("Self test SVE failed.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYVC zzZ(boolean z, zzZ3F zzz3f, zzE zze, SecureRandom secureRandom) {
        zzYS1 zzys1ZzZ;
        final zzYVC zzyvcZzXFZ = zzWje.zzXFZ();
        if (zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
            if (zzz3f instanceof zzZ3D) {
                zzZ3D zzz3d = (zzZ3D) zzz3f;
                zzys1ZzZ = new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent());
            } else {
                zzys1ZzZ = zzZ((zzZ3E) zzz3f);
            }
            if (zze.zzXF4().equals(zzWfy)) {
                zzO zzo = (zzO) zze;
                zzyvcZzXFZ = new zzYU9(zzyvcZzXFZ, zzZ0P.zzU(zzo.zzWhV), zzZ0P.zzU(zzo.zzWeM), zzo.zzWeL);
            } else if (zze.zzXF4().equals(zzWfB)) {
                zzyvcZzXFZ = (zzYVC) AccessController.doPrivileged(new PrivilegedAction<zzYU8>() { // from class: com.aspose.words.internal.zzZ0Q.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.security.PrivilegedAction
                    /* JADX INFO: renamed from: zzXED, reason: merged with bridge method [inline-methods] */
                    public zzYU8 run() {
                        if (zzZ5L.zzXH0()) {
                            zzYZF.checkPermission(zzYUM.zzVZv);
                        }
                        return new zzYU8(zzyvcZzXFZ);
                    }
                });
            }
            zzyvcZzXFZ.zzZ(z, new zzYS3(zzys1ZzZ, secureRandom));
            return zzyvcZzXFZ;
        }
        throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
    }

    public static class zzW extends zzZ1F<zzU> {
        private static final BigInteger zzWkF = BigInteger.valueOf(2);
        private final zzYS1 zzWeX;
        private final zzU zzWeY;
        private final SecureRandom zzWk5;

        public zzW(zzZ3D zzz3d, zzU zzu, SecureRandom secureRandom) {
            if (!zzz3d.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
            }
            this.zzWeX = new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent());
            this.zzWeY = zzu;
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzZ5H
        public final zzZ4F zzXGY() throws zzZ4H {
            return zzZ(zzZ0Q.zzWje.zzXFZ());
        }

        @Override // com.aspose.words.internal.zzZ50
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public final zzZ5H<zzU> zzX(SecureRandom secureRandom) {
            return new zzW(this.zzWeX, this.zzWeY, secureRandom);
        }

        public final zzZ4F zzZ(zzYVC zzyvc) throws zzZ4H {
            byte[] bArrZzU;
            if (this.zzWeY.zzXF4() == zzZ0Q.zzWfx) {
                int iBitLength = (this.zzWeX.getModulus().bitLength() + 7) / 8;
                BigInteger bigInteger = zzWkF;
                bArrZzU = zzYGT.zzU(iBitLength, zzYGT.zzX(bigInteger, this.zzWeX.getModulus().subtract(bigInteger), this.zzWk5));
                zzyvc.zzZ(true, new zzYS3(this.zzWeX, this.zzWk5));
            } else {
                zzP zzp = (zzP) this.zzWeY;
                zzO zzo = zzp.zzWeO;
                zzYU9 zzyu9 = new zzYU9(zzyvc, zzZ0P.zzU(zzo.zzWhV), zzZ0P.zzU(zzo.zzWeM), zzo.zzWeL);
                zzyu9.zzZ(true, new zzYS3(this.zzWeX, this.zzWk5));
                int iZzXEn = ((zzp.zzXEn() + 7) / 8) + ((zzp.zzXEo() + 7) / 8);
                if (iZzXEn > zzyu9.zzXDY()) {
                    throw new IllegalArgumentException("Key material size too large for cipher");
                }
                bArrZzU = new byte[iZzXEn];
                this.zzWk5.nextBytes(bArrZzU);
                zzyvc = zzyu9;
            }
            try {
                return new zzI(bArrZzU, zzyvc.zzy(bArrZzU, 0, bArrZzU.length));
            } catch (Exception e) {
                throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to wrap secret: ")), e);
            }
        }

        public zzW(zzYS1 zzys1, zzU zzu, SecureRandom secureRandom) {
            this.zzWeX = zzys1;
            this.zzWeY = zzu;
            this.zzWk5 = secureRandom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYS1 zzZ(final zzZ3E zzz3e) {
        return (zzYS1) AccessController.doPrivileged(new PrivilegedAction<zzYS1>() { // from class: com.aspose.words.internal.zzZ0Q.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXEC, reason: merged with bridge method [inline-methods] */
            public zzYS1 run() {
                return zzz3e.getPublicExponent().equals(BigInteger.ZERO) ? new zzYS1(true, zzz3e.getModulus(), zzz3e.getPrivateExponent()) : new zzYS0(zzz3e.getModulus(), zzz3e.getPublicExponent(), zzz3e.getPrivateExponent(), zzz3e.getP(), zzz3e.getQ(), zzz3e.zzXGu(), zzz3e.zzXGt(), zzz3e.zzXGs());
            }
        });
    }

    private static void zzZ(final zzY zzy) {
        zzZ1P zzz1p = zzWjd;
        zzYZG.zzZ(zzz1p, new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ0Q.4
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                zzYZU zzyzu = new zzYZU(zzy.zzXFZ(), zzZ0P.zzU(zzZ0P.zzZ.zzWdH));
                zzyzu.zzZ(false, new zzYS1(false, zzZ0Q.zzWfm, zzZ0Q.zzWfn));
                zzyzu.update(zzZ0Q.zzWff, 0, zzZ0Q.zzWff.length);
                if (!zzyzu.zzWX(zzZ0Q.zzWfe)) {
                    zzYZE.zzTQ("Self test signature verify failed.");
                }
                zzyzu.zzZ(true, new zzYS3(zzZ0Q.zzWfc, zzYZF.zzWbb));
                zzyzu.update(zzZ0Q.zzWff, 0, zzZ0Q.zzWff.length);
                if (zzYGU.zzp(zzZ0Q.zzWfe, zzyzu.zzXEp())) {
                    return;
                }
                zzYZE.zzTQ("Self test signature generate failed.");
            }
        });
    }
}
