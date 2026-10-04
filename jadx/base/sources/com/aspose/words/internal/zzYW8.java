package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ0Q;
import com.aspose.words.internal.zzZ3F;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYW8 {
    public static final zzYXR zzWb4 = new zzYXR(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzK.RAW);
    private static final zzYXR zzW7i = new zzYXR("RSA/OAEP", zzK.OAEP);
    private static final zzYXR zzW3K = new zzYXR("RSA/PKCS1V1.5", zzK.PKCS1v1_5);
    private static final zzYXR zzW3J = new zzYXR("RSA/X9.31", zzK.X931);
    private static final zzYXR zzW3I = new zzYXR("RSA/PSS", zzK.PSS);
    private static final zzYXR zzW3H = new zzYXR("RSA/ISO9796-2", zzK.ISO9796d2);
    private static final zzYXR zzW3G = new zzYXR("RSA/ISO9796-2PSS", zzK.ISO9796d2PSS);
    public static final zzO zzW3F = new zzO();
    public static final zzY zzW3E = new zzY();
    public static final zzZ zzW3D = new zzZ();
    public static final zzT zzW3C = new zzT();
    public static final zzQ zzW3B = new zzQ();
    public static final zzR zzW3A = new zzR();
    public static final zzI zzW3z = new zzI();

    public static final class zzI extends zzM<zzI> {
        public zzI() {
            super(zzYW8.zzW3J, zzZ0P.zzZ.zzWdL);
        }

        public zzI(zzZ5K zzz5k) {
            super(zzYW8.zzW3J, zzz5k);
        }
    }

    public static class zzJ extends zzP {
        public zzJ(zzYXR zzyxr) {
            super(zzyxr);
        }
    }

    public enum zzK {
        RAW,
        PKCS1v1_5,
        PSS,
        X931,
        ISO9796d2,
        ISO9796d2PSS,
        OAEP
    }

    public static class zzM<T extends zzM> extends zzYXO {
        private final zzZ5K zzW8y;

        public zzM(zzYXR zzyxr, zzZ5K zzz5k) {
            super(zzyxr);
            this.zzW8y = zzz5k;
        }

        public final zzZ5K zzXDF() {
            return this.zzW8y;
        }
    }

    public static final class zzO extends zzP {
        public zzO() {
            super(zzYW8.zzWb4);
        }
    }

    public static class zzP extends zzYXO<zzYXR> {
        public zzP(zzYXR zzyxr) {
            super(zzyxr);
        }
    }

    public static final class zzQ extends zzM<zzQ> {
        public zzQ() {
            super(zzYW8.zzW3K, zzZ0P.zzZ.zzWdL);
        }

        public static zzQ zzR(zzZ5K zzz5k) {
            return new zzQ(zzz5k);
        }

        private zzQ(zzZ5K zzz5k) {
            super(zzYW8.zzW3K, zzz5k);
        }
    }

    public static final class zzR extends zzJ {
        public zzR() {
            super(zzYW8.zzW3K);
        }
    }

    public static final class zzS extends zzYXC<zzP> {

        public class zzZ implements zzZ4A<zzP> {
            private final zzP zzW3s;
            private final zzZ5V zzW5V;
            private zzYVC zzWeQ;

            public zzZ(zzZ5V zzz5v, zzP zzp, SecureRandom secureRandom) {
                this.zzW5V = zzz5v;
                this.zzW3s = zzp;
                if (secureRandom != null) {
                    this.zzWeQ = zzS.zzZ(false, zzz5v, zzp, secureRandom);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
            public zzZ4A<zzP> zzX(SecureRandom secureRandom) {
                zzYVO.zzX(this.zzW3s.zzXGV());
                return zzS.this.new zzZ(this.zzW5V, this.zzW3s, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ4C
            public final int zzXGI() {
                zzYVO.zzX(this.zzW3s.zzXGV());
                zzYVC zzyvc = this.zzWeQ;
                if (zzyvc != null) {
                    return zzyvc.zzXDX();
                }
                throw new IllegalStateException("RSA BlockDecryptor requires a SecureRandom");
            }

            @Override // com.aspose.words.internal.zzZ4C
            public final int zzXGJ() {
                zzYVO.zzX(this.zzW3s.zzXGV());
                zzYVC zzyvc = this.zzWeQ;
                if (zzyvc != null) {
                    return zzYXC.zzY(zzyvc) ? this.zzWeQ.zzXDY() + 1 : this.zzWeQ.zzXDY();
                }
                throw new IllegalStateException("RSA BlockDecryptor requires a SecureRandom");
            }

            @Override // com.aspose.words.internal.zzZ4B
            public final byte[] zzf(byte[] bArr, int i) throws zzZ5D {
                if (this.zzWeQ == null) {
                    throw new IllegalStateException("RSA BlockDecryptor requires a SecureRandom");
                }
                zzYVO.zzX(this.zzW3s.zzXGV());
                try {
                    zzYVO.zzX(this.zzW3s.zzXGV());
                    return this.zzWeQ.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ5D(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to decrypt block: ")), e);
                }
            }
        }

        @Override // com.aspose.words.internal.zzYXC
        public final /* bridge */ /* synthetic */ zzYVC zzZ(zzZ5V zzz5v, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(true, zzz5v, (zzP) zzz4m, secureRandom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5T
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4B<zzP> zzY(zzZ5V zzz5v, zzP zzp) {
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", zzp.zzXGV());
            }
            return new zzZ(zzz5v, zzp, null);
        }

        public static zzYVC zzZ(boolean z, zzZ5V zzz5v, zzP zzp, SecureRandom secureRandom) {
            return zzYW8.zzZ(z, (zzZ3F) zzz5v, zzp, secureRandom);
        }
    }

    public static final class zzT extends zzJ {
        private final zzZ5K zzW7a;
        private final zzZ5K zzW8y;
        private final byte[] zzWeL;

        /* JADX WARN: Illegal instructions before constructor call */
        public zzT() {
            zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
            this(zzz1j, zzz1j, null);
        }

        public final zzT zzS(zzZ5K zzz5k) {
            return new zzT(this.zzW8y, zzz5k, this.zzWeL);
        }

        public final zzT zzT(zzZ5K zzz5k) {
            return new zzT(zzz5k, zzz5k, this.zzWeL);
        }

        public final zzT zzWj(byte[] bArr) {
            return new zzT(this.zzW8y, this.zzW7a, zzYGU.zzVI(bArr));
        }

        private zzT(zzZ5K zzz5k, zzZ5K zzz5k2, byte[] bArr) {
            super(zzYW8.zzW7i);
            this.zzW8y = zzz5k;
            this.zzW7a = zzz5k2;
            this.zzWeL = zzYGU.zzVI(bArr);
        }
    }

    public static class zzU implements zzYUI {
        ByteArrayOutputStream zzWeP;
        zzYVC zzWeQ;

        private zzU() {
            this.zzWeQ = new zzYU8((zzYVC) zzYXY.zzS(zzZ0Q.zzWjd).zzXFZ());
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

        public /* synthetic */ zzU(byte b) {
            this();
        }
    }

    public static final class zzV implements zzZ55<zzJ, zzZ3F> {

        public class zzY implements zzZ53<zzJ> {
            private final zzJ zzW3u;
            private final zzZ3F zzWeT;
            private final zzYVC zzWeU;

            public zzY(zzZ3F zzz3f, zzJ zzj, SecureRandom secureRandom) {
                if (!zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                    throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
                }
                if (zzj == null) {
                    throw new NullPointerException("Null parameters object");
                }
                this.zzWeT = zzz3f;
                this.zzW3u = zzj;
                if (secureRandom != null) {
                    this.zzWeU = zzYW8.zzZ(true, zzz3f, zzj, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
            public zzZ53<zzJ> zzX(SecureRandom secureRandom) {
                return zzV.this.new zzY(this.zzWeT, this.zzW3u, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ54
            public final byte[] zzg(byte[] bArr, int i) throws zzZ4H {
                if (this.zzWeU == null) {
                    throw new IllegalStateException("KeyWrapper requires a SecureRandom");
                }
                zzYVO.zzX(this.zzW3u.zzXGV());
                try {
                    return this.zzWeU.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to wrap key: ")), e);
                }
            }
        }

        public class zzZ implements zzZ56<zzJ> {
            private final zzJ zzW3u;
            private final zzZ3F zzWeT;
            private final zzYVC zzWeU;

            public zzZ(zzZ3F zzz3f, zzJ zzj, SecureRandom secureRandom) {
                if (!zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
                    throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
                }
                this.zzWeT = zzz3f;
                this.zzW3u = zzj;
                if (secureRandom != null) {
                    this.zzWeU = zzYW8.zzZ(false, zzz3f, zzj, secureRandom);
                } else {
                    this.zzWeU = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public zzZ56<zzJ> zzX(SecureRandom secureRandom) {
                return zzV.this.new zzZ(this.zzWeT, this.zzW3u, secureRandom);
            }

            @Override // com.aspose.words.internal.zzZ57
            public final byte[] zzh(byte[] bArr, int i) throws zzZ5B {
                if (this.zzWeU == null) {
                    throw new IllegalStateException("KeyUnwrapper requires a SecureRandom");
                }
                zzYVO.zzX(this.zzW3u.zzXGV());
                try {
                    return this.zzWeU.zzy(bArr, 0, i);
                } catch (Exception e) {
                    throw new zzZ5B(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to unwrap key: ")), e);
                }
            }
        }

        public zzV() {
            zzZ0L.isReady();
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ55
        public zzZ56<zzJ> zzY(zzZ3F zzz3f, zzJ zzj) {
            return new zzZ(zzz3f, zzj, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ55
        public zzZ53<zzJ> zzZ(zzZ3F zzz3f, zzJ zzj) {
            return new zzY(zzz3f, zzj, null);
        }
    }

    public static final class zzW extends zzYXD<zzX, zzZ3D, zzZ3E> {
        private final zzZ0Q.zzS zzW3y;

        public zzW(zzX zzx, SecureRandom secureRandom) {
            super(zzx);
            this.zzW3y = new zzZ0Q.zzS(new zzZ0Q.zzT(zzx.zzWwe, zzx.zzWEq, zzx.zzWjt), secureRandom);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G<zzZ3D, zzZ3E> zzXDI() {
            zzZ3G<zzZ3D, zzZ3E> zzz3gZzXH4 = this.zzW3y.zzXH4();
            final zzZ3D zzz3d = (zzZ3D) zzz3gZzXH4.zzXGw();
            final zzZ3E zzz3e = (zzZ3E) zzz3gZzXH4.zzXGv();
            final zzYXR zzyxrZzXGV = zzXH6().zzXGV();
            return (zzZ3G) AccessController.doPrivileged(new PrivilegedAction<zzZ3G<zzZ3D, zzZ3E>>() { // from class: com.aspose.words.internal.zzYW8.zzW.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXDB, reason: merged with bridge method [inline-methods] */
                public zzZ3G<zzZ3D, zzZ3E> run() {
                    return new zzZ3G<>(new zzZ3D(zzyxrZzXGV, zzz3d.getModulus(), zzz3d.getPublicExponent()), new zzZ3E(zzyxrZzXGV, zzz3e.getModulus(), zzz3e.getPublicExponent(), zzz3e.getPrivateExponent(), zzz3e.getP(), zzz3e.getQ(), zzz3e.zzXGu(), zzz3e.zzXGt(), zzz3e.zzXGs()));
                }
            });
        }
    }

    public static final class zzX extends zzYXO<zzYXR> {
        private int zzWEq;
        private int zzWjt;
        private BigInteger zzWwe;

        public zzX(BigInteger bigInteger, int i) {
            this(zzYW8.zzWb4, bigInteger, i, zzYUL.zzf4(i));
        }

        private zzX(zzZ5W zzz5w, BigInteger bigInteger, int i, int i2) {
            super((zzYXR) zzz5w);
            this.zzWwe = bigInteger;
            this.zzWEq = i;
            this.zzWjt = i2;
        }
    }

    public static final class zzY extends zzM<zzY> {
        public zzY() {
            super(zzYW8.zzW3H, zzZ0P.zzZ.zzWdL);
        }

        public static zzY zzU(zzZ5K zzz5k) {
            return new zzY(zzz5k);
        }

        private zzY(zzZ5K zzz5k) {
            super(zzYW8.zzW3H, zzz5k);
        }
    }

    public static final class zzZ extends zzM<zzZ> {
        private final byte[] zzWAR;
        private final int zzWeK;

        public zzZ() {
            this(zzZ0P.zzZ.zzWdL, 20);
        }

        public static zzZ zzV(zzZ5K zzz5k) {
            return new zzZ(zzz5k);
        }

        public final byte[] getSalt() {
            return zzYGU.zzVI(this.zzWAR);
        }

        public final int getSaltLength() {
            return this.zzWeK;
        }

        private zzZ(zzZ5K zzz5k) {
            this(zzz5k, zzYW6.zzZ(zzz5k).zzQI());
        }

        private zzZ(zzZ5K zzz5k, int i) {
            super(zzYW8.zzW3G, zzz5k);
            this.zzWeK = i;
            this.zzWAR = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYVC zzZ(boolean z, zzZ3F zzz3f, zzP zzp, SecureRandom secureRandom) {
        zzYV3 zzyv3ZzZ;
        zzYVC zzyu8;
        zzYVC zzyvc = (zzYVC) zzYXY.zzS(zzZ0Q.zzWjd).zzXFZ();
        if (!zzz3f.zzZ(zzZ3F.zzY.ENCRYPT_OR_DECRYPT)) {
            throw new zzZ5E("Attempt to encrypt/decrypt with RSA modulus already used for sign/verify.");
        }
        if (zzz3f instanceof zzZ3D) {
            zzZ3D zzz3d = (zzZ3D) zzz3f;
            zzyv3ZzZ = new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent());
        } else {
            zzyv3ZzZ = zzZ((zzZ3E) zzz3f);
        }
        if (!zzp.zzXGV().equals(zzW7i)) {
            if (zzp.zzXGV().equals(zzW3K)) {
                zzyu8 = new zzYU8(zzyvc);
            }
            if (secureRandom != null) {
                zzyv3ZzZ = new zzYS3(zzyv3ZzZ, secureRandom);
            }
            zzyvc.zzZ(z, zzyv3ZzZ);
            return zzyvc;
        }
        zzT zzt = (zzT) zzp;
        zzyu8 = new zzYU9(zzyvc, zzYW6.zzZ(zzt.zzW8y), zzYW6.zzZ(zzt.zzW7a), zzt.zzWeL);
        zzyvc = zzyu8;
        if (secureRandom != null) {
        }
        zzyvc.zzZ(z, zzyv3ZzZ);
        return zzyvc;
    }

    public static final class zzN<T extends zzM> extends zzYX7<T> {

        public class zzZ<P extends zzM> implements zzZ4R<P> {
            private final P zzW3n;
            private final zzYV3 zzWeC;
            private final zzYUI zzWeD;
            private SecureRandom zzWk5;

            public zzZ(P p, zzYV3 zzyv3, SecureRandom secureRandom) {
                this.zzW3n = p;
                this.zzWeC = zzyv3;
                this.zzWk5 = secureRandom;
                zzYUI zzyuiZzZ = zzN.zzZ(p);
                this.zzWeD = zzyuiZzZ;
                if (secureRandom != null) {
                    zzyuiZzZ.zzZ(true, new zzYS3(zzyv3, secureRandom));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
            public zzZ4R<P> zzX(SecureRandom secureRandom) {
                return new zzZ(this.zzW3n, this.zzWeC, secureRandom);
            }

            private void zzXD8() {
                if (this.zzWk5 == null) {
                    SecureRandom secureRandomZzXGZ = zzZ5L.zzXGZ();
                    this.zzWk5 = secureRandomZzXGZ;
                    this.zzWeD.zzZ(true, new zzYS3(this.zzWeC, secureRandomZzXGZ));
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

            @Override // com.aspose.words.internal.zzZ4S
            public final zzZ41 zzXGO() {
                zzXD8();
                return new zzYU4(this.zzW3n.zzXGV().getName(), this.zzWeD);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4R<T> zzU(zzZ5S zzz5s, T t) {
            zzZ3E zzz3e = (zzZ3E) zzz5s;
            if (zzz3e.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                return new zzZ(t, zzYW8.zzZ(zzz3e), null);
            }
            throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzYUI zzZ(zzM zzm) {
            if (zzm.zzXGV() == zzYW8.zzW3K) {
                if (zzm.zzXDF() == null) {
                    return new zzU((byte) 0);
                }
                return new zzYW5(zzYW6.zzZ(zzm.zzW8y));
            }
            if (zzm.zzXGV() == zzYW8.zzW3J) {
                return new zzYVD(zzYW6.zzZ(zzm.zzW8y));
            }
            throw new IllegalArgumentException("Algorithm " + zzm.zzXGV().getName() + " not recognized");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4P<T> zzX(zzZ5R zzz5r, final zzM zzm) {
            zzZ3D zzz3d = (zzZ3D) zzz5r;
            if (zzz3d.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                zzYS1 zzys1 = new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent());
                final zzYUI zzyuiZzZ = zzZ(zzm);
                zzyuiZzZ.zzZ(false, zzys1);
                return (zzZ4P<T>) new zzZ4P<T>() { // from class: com.aspose.words.internal.zzYW8.zzN.1
                    @Override // com.aspose.words.internal.zzZ4P
                    public final zzZ41 zzXGN() {
                        return new zzYU4(zzm.zzXGV().getName(), zzyuiZzZ);
                    }

                    @Override // com.aspose.words.internal.zzZ4P
                    public final boolean zzXh(byte[] bArr) throws zzZ5C {
                        return zzyuiZzZ.zzWX(bArr);
                    }
                };
            }
            throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
        }
    }

    public static final class zzL<T extends zzM> extends zzYX5<T> {

        public class zzZ<T extends zzM> implements zzZ4Q<T>, zzZ50<zzL<T>.zzZ<T>> {
            private final zzYUH zzW3k;
            private final T zzW3n;
            private final zzYV3 zzWeC;
            private SecureRandom zzWk5;

            public zzZ(T t, zzYV3 zzyv3, SecureRandom secureRandom) {
                this.zzW3n = t;
                this.zzWeC = zzyv3;
                this.zzWk5 = secureRandom;
                zzYUH zzyuhZzW = zzL.zzW(t);
                this.zzW3k = zzyuhZzW;
                if (secureRandom != null) {
                    zzyuhZzW.zzZ(true, new zzYS3(zzyv3, secureRandom));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.aspose.words.internal.zzZ50
            /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
            public zzL<T>.zzZ<T> zzX(SecureRandom secureRandom) {
                return new zzZ<>(this.zzW3n, this.zzWeC, secureRandom);
            }

            private void zzXD8() {
                if (this.zzWk5 == null) {
                    SecureRandom secureRandomZzXGZ = zzZ5L.zzXGZ();
                    this.zzWk5 = secureRandomZzXGZ;
                    this.zzW3k.zzZ(true, new zzYS3(this.zzWeC, secureRandomZzXGZ));
                }
            }

            @Override // com.aspose.words.internal.zzZ4S
            public final byte[] getSignature() throws zzZ4H {
                try {
                    return this.zzW3k.zzXEp();
                } catch (Exception e) {
                    throw new zzZ4H(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to create signature: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzZ4S
            public final zzZ41 zzXGO() {
                zzXD8();
                return new zzYU4(this.zzW3n.zzXGV().getName(), this.zzW3k);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzYUH zzW(zzM zzm) {
            if (zzm.zzXGV() == zzYW8.zzW3H) {
                return new zzYWX(zzYW6.zzZ(zzm.zzW8y));
            }
            if (zzm.zzXGV() == zzYW8.zzW3G) {
                zzZ zzz = (zzZ) zzm;
                zzYUX zzyuxZzZ = zzYW6.zzZ(zzm.zzW8y);
                byte[] salt = zzz.getSalt();
                return salt != null ? new zzYWY(zzyuxZzZ, salt) : new zzYWY(zzyuxZzZ, zzz.getSaltLength());
            }
            throw new IllegalArgumentException("Algorithm " + zzm.zzXGV().getName() + " not recognized");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX5
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public zzZ4Q<T> zzR(zzZ5S zzz5s, T t) {
            zzZ3E zzz3e = (zzZ3E) zzz5s;
            if (zzz3e.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                return new zzZ(t, zzYW8.zzZ(zzz3e), null);
            }
            throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX5
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public zzZ4O<T> zzV(zzZ5R zzz5r, final zzM zzm) {
            zzZ3D zzz3d = (zzZ3D) zzz5r;
            if (zzz3d.zzZ(zzZ3F.zzY.SIGN_OR_VERIFY)) {
                zzYS1 zzys1 = new zzYS1(false, zzz3d.getModulus(), zzz3d.getPublicExponent());
                final zzYUH zzyuhZzW = zzW(zzm);
                zzyuhZzW.zzZ(false, zzys1);
                return (zzZ4O<T>) new zzZ4O<T>() { // from class: com.aspose.words.internal.zzYW8.zzL.1
                    @Override // com.aspose.words.internal.zzZ4P
                    public final zzZ41 zzXGN() {
                        return new zzYU4(zzm.zzXGV().getName(), zzyuhZzW);
                    }

                    @Override // com.aspose.words.internal.zzZ4P
                    public final boolean zzXh(byte[] bArr) throws zzZ5C {
                        return zzyuhZzW.zzWX(bArr);
                    }
                };
            }
            throw new zzZ5E("Attempt to sign/verify with RSA modulus already used for encrypt/decrypt.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYS1 zzZ(final zzZ3E zzz3e) {
        return (zzYS1) AccessController.doPrivileged(new PrivilegedAction<zzYS1>() { // from class: com.aspose.words.internal.zzYW8.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXEC, reason: merged with bridge method [inline-methods] */
            public zzYS1 run() {
                return zzz3e.getPublicExponent().equals(BigInteger.ZERO) ? new zzYS1(true, zzz3e.getModulus(), zzz3e.getPrivateExponent()) : new zzYS0(zzz3e.getModulus(), zzz3e.getPublicExponent(), zzz3e.getPrivateExponent(), zzz3e.getP(), zzz3e.getQ(), zzz3e.zzXGu(), zzz3e.zzXGt(), zzz3e.zzXGs());
            }
        });
    }
}
