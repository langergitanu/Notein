package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0.C20856OooooOo;
import Oooo0oO.C21111o0ooOoO;
import androidx.appcompat.widget.C21532OooOOo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.internal.zzYMG;
import com.aspose.words.internal.zzYMJ;
import com.aspose.words.internal.zzYQA;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYW8;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ0Q;
import com.aspose.words.internal.zzZ1D;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNX extends zzYQP {
    private static final Map<String, String> zzVQR;
    private static final Map<zzZDA, String> zzVQS;
    private static final Map<zzZDA, zzZ1D.zzZ> zzVQT;
    private zzZ55 zzVQW;
    private zzZ5T zzVQX;
    private static final zzYPK zzVWu = new zzYPK();
    private static final zzYNG<zzZ3D> zzVWs = new zzYNG<zzZ3D>() { // from class: com.aspose.words.internal.zzYNX.1
        private static zzZ3D zzS(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof RSAPublicKey) {
                return publicKey instanceof zzYNU ? ((zzYNU) publicKey).zzXAn() : new zzYNU(zzz5w, (RSAPublicKey) publicKey).zzXAn();
            }
            try {
                return new zzZ3D(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify RSA public key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYNG
        public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            return zzS(zzz5w, publicKey);
        }
    };
    private static final zzYP5<zzZ3E> zzVWr = new zzYP5<zzZ3E>() { // from class: com.aspose.words.internal.zzYNX.12
        private static zzZ3E zzS(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof RSAPrivateCrtKey) {
                return privateKey instanceof zzYNW ? ((zzYNW) privateKey).zzXAo() : new zzYNW(zzz5w, (RSAPrivateCrtKey) privateKey).zzXAo();
            }
            if (privateKey instanceof RSAPrivateKey) {
                return privateKey instanceof zzYNV ? ((zzYNV) privateKey).zzXAo() : new zzYNV(zzz5w, (RSAPrivateKey) privateKey).zzXAo();
            }
            try {
                return new zzZ3E(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify RSA private key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYP5
        public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            return zzS(zzz5w, privateKey);
        }
    };
    private final zzZ4E zzVR0 = new zzZ0Q.zzH();
    private zzZ4E zzVQZ = zzXAw();
    private zzZ4D zzVQY = zzXAv();
    private final zzZ1P[] zzVQV = {zzZ0Q.zzWft.zzXF4(), zzZ0Q.zzWfs.zzXF4()};
    private final zzYXR[] zzVQU = {zzYW8.zzWb4, zzYW8.zzW3A.zzXGV(), zzYW8.zzW3C.zzXGV()};

    public static class zzR extends zzYQG {
        private final zzZ5W zzWlz;

        public zzR(zzZ5W zzz5w) {
            this.zzWlz = zzz5w;
        }

        private PrivateKey zzVR(byte[] bArr) throws IOException {
            return zzW(zzZ94.zzXG(bArr));
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PKCS8EncodedKeySpec) {
                try {
                    return zzVR(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.getMessage(), e);
                }
            }
            if (keySpec instanceof RSAPrivateCrtKeySpec) {
                return new zzYNW(zzYNX.zzXAu(), (RSAPrivateCrtKeySpec) keySpec);
            }
            if (keySpec instanceof RSAPrivateKeySpec) {
                return new zzYNV(zzYNX.zzXAu(), (RSAPrivateKeySpec) keySpec);
            }
            if (keySpec != null) {
                throw new InvalidKeySpecException("Unknown KeySpec type: ".concat(keySpec.getClass().getName()));
            }
            throw new InvalidKeySpecException("null keySpec passed for PrivateKey");
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof RSAPublicKeySpec ? new zzYNU(zzYNX.zzXAu(), (RSAPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(RSAPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
                return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
            }
            if (cls.isAssignableFrom(RSAPrivateKeySpec.class) && (key instanceof RSAPrivateKey)) {
                RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
                return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
            }
            if (!cls.isAssignableFrom(RSAPrivateCrtKeySpec.class) || !(key instanceof RSAPrivateCrtKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYNU((zzZ3D) zzYNX.zzVWs.zzY(zzYNX.zzXAu(), (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return zzW((zzZ3E) zzYNX.zzVWr.zzZ(zzYNX.zzXAu(), (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYNU(new zzZ3D(zzYNX.zzXAu(), zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return zzW(new zzZ3E(zzYNX.zzXAu(), zzz94));
        }

        private static RSAPrivateKey zzW(zzZ3E zzz3e) {
            return zzz3e.getP().equals(BigInteger.ZERO) ? new zzYNV(zzz3e) : new zzYNW(zzz3e);
        }
    }

    public static class zzS extends zzYNB {
        PSSParameterSpec zzVQu;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS AlgorithmParameters object");
            }
            this.zzVQu = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "PSS Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ8Z zzz8zZzXB = zzZ8Z.zzXB(bArr);
            this.zzVQu = new PSSParameterSpec(zzYM5.zzC(zzz8zZzXB.zzXJ3().zzXJk()), zzYNX.zzF(zzz8zZzXB.zzXJ2().zzXJk()), new MGF1ParameterSpec(zzYM5.zzC(zzZ86.zzXm(zzz8zZzXB.zzXJ2().zzXJj()).zzXJk())), zzz8zZzXB.zzXIV().intValue(), zzz8zZzXB.zzXIU().intValue());
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.zzVQu;
            zzZDA zzzdaZzwM = zzYPU.zzwM(pSSParameterSpec.getDigestAlgorithm());
            zzZC8 zzzc8 = zzZC8.zzWHS;
            return new zzZ8Z(new zzZ86(zzzdaZzwM, zzzc8), new zzZ86(zzZ96.zzWyu, new zzZ86(zzYPU.zzwM(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), zzzc8)), new zzZDD(pSSParameterSpec.getSaltLength()), new zzZDD(pSSParameterSpec.getTrailerField())).getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.zzVQu;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public static class zzT extends zzYNB {
        OAEPParameterSpec zzVQv;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP AlgorithmParameters object");
            }
            this.zzVQv = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "OAEP Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ92 zzz92ZzXE = zzZ92.zzXE(bArr);
            this.zzVQv = new OAEPParameterSpec(zzYM5.zzC(zzz92ZzXE.zzXJ3().zzXJk()), zzYNX.zzF(zzz92ZzXE.zzXJ2().zzXJk()), new MGF1ParameterSpec(zzYM5.zzC(zzZ86.zzXm(zzz92ZzXE.zzXJ2().zzXJj()).zzXJk())), new PSource.PSpecified(zzZD9.zzYz(zzz92ZzXE.zzXJ1().zzXJj()).zzXL5()));
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            zzZDA zzzdaZzwM = zzYPU.zzwM(this.zzVQv.getDigestAlgorithm());
            zzZC8 zzzc8 = zzZC8.zzWHS;
            return new zzZ92(new zzZ86(zzzdaZzwM, zzzc8), new zzZ86(zzZ96.zzWyu, new zzZ86(zzYPU.zzwM(((MGF1ParameterSpec) this.zzVQv.getMGFParameters()).getDigestAlgorithm()), zzzc8)), new zzZ86(zzZ96.zzWyt, new zzZC6(((PSource.PSpecified) this.zzVQv.getPSource()).getValue()))).getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.zzVQv;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public static class zzU extends zzYNB {
        private zzZAM zzVQw;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            zzZDA zzzda;
            if (!(algorithmParameterSpec instanceof zzYMG)) {
                throw new InvalidParameterSpecException("KTSParameterSpec required to initialise a KTS AlgorithmParameters object");
            }
            zzYMG zzymg = (zzYMG) algorithmParameterSpec;
            int keySize = zzymg.getKeySize();
            int iZzwA = 16;
            if (zzymg.zzXA0().equalsIgnoreCase(AES256KeyLoader.AES_ALGORITHM)) {
                if (keySize == 128) {
                    zzzda = zzZ9O.zzWAq;
                } else if (keySize == 192) {
                    zzzda = zzZ9O.zzWAi;
                    iZzwA = 24;
                } else {
                    if (keySize != 256) {
                        throw new InvalidParameterSpecException(C21532OooOOo.OooO0OO(keySize, "Unknown key size for AES: "));
                    }
                    zzzda = zzZ9O.zzWAa;
                    iZzwA = 32;
                }
            } else if (!zzymg.zzXA0().equalsIgnoreCase("Camellia")) {
                iZzwA = zzYNX.zzVWu.zzwA(zzymg.zzXA0());
                try {
                    zzzda = new zzZDA(zzymg.zzXA0());
                } catch (IllegalArgumentException unused) {
                    throw new InvalidParameterSpecException("Cannot recognise key algorithm: " + zzymg.zzXA0());
                }
            } else if (keySize == 128) {
                zzzda = zzZ9M.zzWz8;
            } else if (keySize == 192) {
                zzzda = zzZ9M.zzWz7;
                iZzwA = 24;
            } else {
                if (keySize != 256) {
                    throw new InvalidParameterSpecException(C21532OooOOo.OooO0OO(keySize, "Unknown key size for Camellia: "));
                }
                zzzda = zzZ9M.zzWz6;
                iZzwA = 32;
            }
            if (iZzwA < 0) {
                throw new InvalidParameterSpecException("Unavailable key length for algorithm: " + zzymg.zzXA0());
            }
            if (iZzwA * 8 != keySize) {
                throw new InvalidParameterSpecException(C20856OooooOo.OooO0O0("Expected key size and key length do not match: ", keySize, " != (8 * ", ")", iZzwA));
            }
            this.zzVQw = new zzZAM(new zzZ86(zzZ9Y.zzWBA, new zzZAK(zzymg.zzXzV(), iZzwA)), new zzZ86(zzzda));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "KTS AlgParams";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            this.zzVQw = zzZAM.zzYb(bArr);
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return this.zzVQw.getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls != zzYMG.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
            }
            zzZAK zzzakZzY9 = zzZAK.zzY9(this.zzVQw.zzXJS().zzXJj());
            String id = (String) zzYNX.zzVQS.get(this.zzVQw.zzXJT().zzXJk());
            if (id == null) {
                id = this.zzVQw.zzXJT().zzXJk().getId();
            }
            return new zzYMG.zzZ(id, zzzakZzY9.zzXJO().intValue() * 8).zzP(zzzakZzY9.zzXJP()).zzXzU();
        }
    }

    public static class zzV extends KeyPairGenerator {
        static final BigInteger zzVQx = BigInteger.valueOf(65537);
        zzZ5U zzVSw;
        private final zzYQ8 zzVWk;

        private zzV(zzYQ8 zzyq8, String str) {
            super(str);
            this.zzVWk = zzyq8;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (this.zzVSw == null) {
                this.zzVSw = new zzZ0Q.zzS(new zzZ0Q.zzT(zzVQx, 2048), this.zzVWk.zzXBp());
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYNU((zzZ3D) zzz3gZzXH4.zzXGw()), new zzYNW((zzZ3E) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            if (i < 2048) {
                this.zzVSw = new zzYW8.zzW(new zzYW8.zzX(zzVQx, i), secureRandom);
            } else {
                this.zzVSw = new zzZ0Q.zzS(new zzZ0Q.zzT(zzVQx, i), secureRandom);
            }
        }

        public zzV(zzYQ8 zzyq8) {
            this(zzyq8, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA);
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
                RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
                if (rSAKeyGenParameterSpec.getKeysize() < 2048) {
                    if (!zzZ5L.zzXH0()) {
                        this.zzVSw = new zzYW8.zzW(new zzYW8.zzX(rSAKeyGenParameterSpec.getPublicExponent(), rSAKeyGenParameterSpec.getKeysize()), secureRandom);
                        return;
                    }
                    throw new InvalidAlgorithmParameterException("RSA key size too small for FIPS mode operation");
                }
                this.zzVSw = new zzZ0Q.zzS(new zzZ0Q.zzT(rSAKeyGenParameterSpec.getPublicExponent(), rSAKeyGenParameterSpec.getKeysize()), secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzW extends SecretKeyFactorySpi {
        private final zzYQ8 zzVWk;
        private final zzYP7 zzVWq;
        private final zzYP5 zzVWr;
        private final zzYNG zzVWs;

        public zzW(zzYP7 zzyp7, zzYQ8 zzyq8, zzYNG zzyng, zzYP5 zzyp5) {
            this.zzVWq = zzyp7;
            this.zzVWk = zzyq8;
            this.zzVWs = zzyng;
            this.zzVWr = zzyp5;
        }

        private static zzZ1D.zzZ zzD(zzZDA zzzda) throws InvalidKeySpecException {
            zzZ1D.zzZ zzz = (zzZ1D.zzZ) zzYNX.zzVQT.get(zzzda);
            if (zzz != null) {
                return zzz;
            }
            throw new InvalidKeySpecException("Unrecognized digest in KDF: " + zzzda);
        }

        private static byte[] zzZ(zzZ0Q.zzU zzu, zzZ86 zzz86, byte[] bArr, int i, byte[] bArr2) throws InvalidKeySpecException {
            zzZ5A<zzZ1D.zzY> zzz5aZzY;
            if (zzu instanceof zzZ0Q.zzP) {
                return bArr;
            }
            zzZ86 zzz86ZzXm = zzZ86.zzXm(zzz86.zzXJj());
            if (zzYNC.zzU(zzz86ZzXm.zzXJj())) {
                throw new InvalidKeySpecException("Digest algorithm identifier cannot have parameters");
            }
            if (zzZ5L.zzXH0() && (bArr2 == null || bArr2.length == 0)) {
                throw new zzZ0H("OtherInfo/IV for KDF must be present in approved mode");
            }
            if (zzZ6W.zzWnk.equals(zzz86.zzXJk())) {
                zzz5aZzY = new zzZ1D.zzW().zzY(zzZ1D.zzWgx.zzY(zzD(zzz86ZzXm.zzXJk())).zzX1(bArr).zzX2(bArr2));
            } else {
                if (!zzZ6W.zzWnj.equals(zzz86.zzXJk())) {
                    throw new InvalidKeySpecException("Unrecognized KDF: " + zzz86.zzXJk());
                }
                zzz5aZzY = new zzZ1D.zzW().zzY(zzZ1D.zzWgw.zzY(zzD(zzz86ZzXm.zzXJk())).zzX1(bArr).zzX2(bArr2));
            }
            byte[] bArr3 = new byte[(i + 7) / 8];
            zzz5aZzY.zzXi(bArr3);
            zzYGU.fill(bArr, (byte) 0);
            return bArr3;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            zzZ0Q.zzV zzv = new zzZ0Q.zzV(this.zzVWk.zzXBp());
            try {
                if (keySpec instanceof zzYMI) {
                    zzYMI zzymi = (zzYMI) keySpec;
                    zzZ0Q.zzU zzu = (zzZ0Q.zzU) this.zzVWq.zzY(true, new zzY(zzymi.getKeySize(), zzymi.zzXzY(), zzymi.getParameterSpec()), zzymi.zzXGZ());
                    zzZ5H zzz5hZzZ = zzv.zzZ(this.zzVWs.zzY(zzu.zzXF4(), zzymi.getPublicKey()), zzu);
                    if (zzymi.zzXGZ() != null) {
                        zzz5hZzZ = zzz5hZzZ.zzX(zzymi.zzXGZ());
                    }
                    try {
                        zzZ4F zzz4fZzXGY = zzz5hZzZ.zzXGY();
                        byte[] bArrZzXGL = zzz4fZzXGY.zzXGL();
                        if (zzymi.zzXzZ() == null) {
                            return new zzYRG(new SecretKeySpec(zzZ(zzu, zzymi.zzXzX(), bArrZzXGL, zzymi.getKeySize(), zzymi.zzXzW()), zzymi.zzXA0()), zzz4fZzXGY.zzXGK());
                        }
                        int iZzXzY = (zzymi.zzXzY() + 7) / 8;
                        byte[] bArr = new byte[iZzXzY];
                        if (iZzXzY > bArrZzXGL.length) {
                            throw new InvalidKeySpecException("MAC key length larger than available key material");
                        }
                        int length = bArrZzXGL.length - iZzXzY;
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArrZzXGL, 0, bArr, 0, iZzXzY);
                        System.arraycopy(bArrZzXGL, iZzXzY, bArr2, 0, length);
                        zzYGU.fill(bArrZzXGL, (byte) 0);
                        return new zzYRG(new zzYRK(new SecretKeySpec(zzZ(zzu, zzymi.zzXzX(), bArr2, zzymi.getKeySize(), zzymi.zzXzW()), zzymi.zzXA0()), zzymi.zzXzZ(), bArr), zzz4fZzXGY.zzXGK());
                    } catch (zzZ4H e) {
                        throw new InvalidKeySpecException("Unable to create secret: " + e.getMessage(), e);
                    }
                }
                if (!(keySpec instanceof zzYMJ)) {
                    throw new InvalidKeySpecException("Unknown KeySpec passed");
                }
                zzYMJ zzymj = (zzYMJ) keySpec;
                zzZ0Q.zzU zzu2 = (zzZ0Q.zzU) this.zzVWq.zzY(true, new zzY(zzymj.getKeySize(), zzymj.zzXzY(), zzymj.getParameterSpec()), null);
                zzZ1G<zzZ0Q.zzU> zzz1gZzY = zzv.zzY(this.zzVWr.zzZ(zzu2.zzXF4(), zzymj.getPrivateKey()), zzu2);
                byte[] bArrZzXGK = zzymj.zzXGK();
                try {
                    byte[] bArrZzXGL2 = zzz1gZzY.zzj(bArrZzXGK, bArrZzXGK.length).zzXGL();
                    if (zzymj.zzXzZ() == null) {
                        return new zzYRG(new SecretKeySpec(zzZ(zzu2, zzymj.zzXzX(), bArrZzXGL2, zzymj.getKeySize(), zzymj.zzXzW()), zzymj.zzXA0()), bArrZzXGK);
                    }
                    int iZzXzY2 = (zzymj.zzXzY() + 7) / 8;
                    byte[] bArr3 = new byte[iZzXzY2];
                    if (iZzXzY2 > bArrZzXGL2.length) {
                        throw new InvalidKeySpecException("MAC key length larger than available key material");
                    }
                    int length2 = bArrZzXGL2.length - iZzXzY2;
                    byte[] bArr4 = new byte[length2];
                    System.arraycopy(bArrZzXGL2, 0, bArr3, 0, iZzXzY2);
                    System.arraycopy(bArrZzXGL2, iZzXzY2, bArr4, 0, length2);
                    zzYGU.fill(bArrZzXGL2, (byte) 0);
                    return new zzYRG(new zzYRK(new SecretKeySpec(zzZ(zzu2, zzymj.zzXzX(), bArr4, zzymj.getKeySize(), zzymj.zzXzW()), zzymj.zzXA0()), zzymj.zzXzZ(), bArr3), bArrZzXGK);
                } catch (zzZ5D e2) {
                    throw new InvalidKeySpecException("Unable to extract secret: " + e2.getMessage(), e2);
                }
            } catch (IllegalArgumentException e3) {
                throw new InvalidKeySpecException("Unable to process KDF AlgorithmIdentifier: " + e3.getMessage(), e3);
            } catch (InvalidAlgorithmParameterException e4) {
                throw new InvalidKeySpecException("Unable to process RSA key: " + e4.getMessage(), e4);
            } catch (InvalidKeyException e5) {
                throw new InvalidKeySpecException("Unable to process RSA key: " + e5.getMessage(), e5);
            }
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("Operation not supported");
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
            throw new InvalidKeyException("Operation not supported");
        }
    }

    public static class zzX extends SecretKeyFactorySpi {
        private final zzYQ8 zzVWk;

        public zzX(zzYQ8 zzyq8) {
            this.zzVWk = zzyq8;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            try {
                if (!(keySpec instanceof zzYMF)) {
                    throw new InvalidKeySpecException("Unknown KeySpec passed");
                }
                zzYMF zzymf = (zzYMF) keySpec;
                zzYMH zzymhZzXzT = zzymf.zzXzT();
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("RSA-KAS-KEM", this.zzVWk);
                if (zzymhZzXzT instanceof zzYMI) {
                    zzYRG zzyrg = (zzYRG) secretKeyFactory.generateSecret(zzymhZzXzT);
                    KeyGenerator keyGenerator = KeyGenerator.getInstance(zzymf.zzXzS(), this.zzVWk);
                    keyGenerator.init(zzymf.zzXzR(), ((zzYMI) zzymhZzXzT).zzXGZ());
                    Cipher cipher = Cipher.getInstance(zzymhZzXzT.zzXA0(), this.zzVWk);
                    cipher.init(3, zzyrg, ((zzYMI) zzymhZzXzT).zzXGZ());
                    SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                    zzYR3 zzyr3ZzXC1 = zzyrg.zzXC1();
                    byte[] bArrZzn = zzYGU.zzn(zzyrg.zzXGK(), cipher.wrap(secretKeyGenerateKey));
                    return zzyr3ZzXC1 != null ? new zzYRG(new zzYRK(secretKeyGenerateKey, zzyr3ZzXC1.getAlgorithm(), zzyr3ZzXC1.getEncoded()), bArrZzn) : new zzYRG(secretKeyGenerateKey, bArrZzn);
                }
                zzYMJ zzymj = (zzYMJ) zzymhZzXzT;
                byte[] bArrZzXGK = zzymj.zzXGK();
                int iBitLength = (((RSAPrivateKey) zzymj.getPrivateKey()).getModulus().bitLength() + 7) / 8;
                byte[] bArr = new byte[iBitLength];
                System.arraycopy(bArrZzXGK, 0, bArr, 0, iBitLength);
                zzYRG zzyrg2 = (zzYRG) secretKeyFactory.generateSecret(new zzYMJ.zzZ(zzymj.getPrivateKey(), bArr, zzymj.zzXA0(), zzymj.getKeySize(), zzymj.zzXzW()).zzR(zzymj.zzXzX()).zzYM(zzymj.zzXzZ(), zzymj.zzXzY()).zzXA2());
                Cipher cipher2 = Cipher.getInstance(zzymj.zzXA0(), this.zzVWk);
                cipher2.init(4, zzyrg2);
                int length = bArrZzXGK.length - iBitLength;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArrZzXGK, iBitLength, bArr2, 0, length);
                SecretKey secretKey = (SecretKey) cipher2.unwrap(bArr2, zzymf.zzXzS(), 3);
                zzYR3 zzyr3ZzXC12 = zzyrg2.zzXC1();
                int length2 = secretKey.getEncoded().length;
                if (length2 == (zzymf.zzXzR() + 7) / 8) {
                    return zzyr3ZzXC12 != null ? new zzYRG(new zzYRK(secretKey, zzyr3ZzXC12.getAlgorithm(), zzyr3ZzXC12.getEncoded()), bArr) : new zzYRG(secretKey, bArr);
                }
                throw new InvalidKeySpecException("KEM transported key the incorrect size: found " + length2 + " bytes");
            } catch (IllegalArgumentException e) {
                throw new InvalidKeySpecException("Unable to process KDF AlgorithmIdentifier: " + e.getMessage(), e);
            } catch (InvalidKeySpecException e2) {
                throw e2;
            } catch (GeneralSecurityException e3) {
                throw new InvalidKeySpecException("Unable to process RSA key: " + e3.getMessage(), e3);
            }
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            throw new InvalidKeySpecException("Operation not supported");
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
            throw new InvalidKeyException("Operation not supported");
        }
    }

    public static class zzY implements AlgorithmParameterSpec {
        private final AlgorithmParameterSpec zzVQy;
        private final int zzVQz;
        private final int zzWEq;

        public zzY(int i, int i2, AlgorithmParameterSpec algorithmParameterSpec) {
            this.zzWEq = i;
            this.zzVQz = i2;
            this.zzVQy = algorithmParameterSpec;
        }
    }

    public class zzZ<T extends zzZ4M> implements zzZ4E<zzZ0Q.zzM> {
        private zzZ() {
        }

        public /* synthetic */ zzZ(zzYNX zzynx, byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4E
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4S zzY(zzZ5S zzz5s, zzZ0Q.zzM zzm) {
            if (zzZ5L.zzXH0()) {
                return zzYNX.this.zzVR0.zzY(zzz5s, zzm);
            }
            if (((zzZ3E) zzz5s).getModulus().bitLength() >= 2048) {
                return zzYNX.this.zzVR0.zzY(zzz5s, zzm);
            }
            zzYXR zzyxr = zzYW8.zzWb4;
            return zzYNX.this.zzXAw().zzY(zzz5s, zzYW8.zzQ.zzR(zzm.zzXFo()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ4E
        public zzZ4P zzZ(zzZ5R zzz5r, zzZ0Q.zzM zzm) {
            if (zzZ5L.zzXH0()) {
                return zzYNX.this.zzVR0.zzZ(zzz5r, zzm);
            }
            if (((zzZ3D) zzz5r).getModulus().bitLength() < 1024) {
                zzYXR zzyxr = zzYW8.zzWb4;
                return zzYNX.this.zzXAw().zzZ(zzz5r, zzYW8.zzQ.zzR(zzm.zzXFo()));
            }
            return zzYNX.this.zzVR0.zzZ(zzz5r, zzm);
        }
    }

    static {
        HashMap map = new HashMap();
        zzVQT = map;
        HashMap map2 = new HashMap();
        zzVQS = map2;
        HashMap map3 = new HashMap();
        zzVQR = map3;
        map.put(zzZ9K.zzWyW, zzZ1D.zzZ.SHA1);
        map.put(zzZ9O.zzWAI, zzZ1D.zzZ.SHA224);
        map.put(zzZ9O.zzWAL, zzZ1D.zzZ.SHA256);
        map.put(zzZ9O.zzWAK, zzZ1D.zzZ.SHA384);
        map.put(zzZ9O.zzWAJ, zzZ1D.zzZ.SHA512);
        map2.put(zzZ9O.zzWAq, AES256KeyLoader.AES_ALGORITHM);
        map2.put(zzZ9O.zzWAi, AES256KeyLoader.AES_ALGORITHM);
        map2.put(zzZ9O.zzWAa, AES256KeyLoader.AES_ALGORITHM);
        map2.put(zzZ9M.zzWz8, "Camellia");
        map2.put(zzZ9M.zzWz7, "Camellia");
        map2.put(zzZ9M.zzWz6, "Camellia");
        map3.put("SupportedKeyClasses", "java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey");
        map3.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzF(zzZDA zzzda) {
        return zzZ96.zzWyu.equals(zzzda) ? IDevicePopManager.MGF_1 : zzzda.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ5W zzXAu() {
        return zzZ5L.zzXH0() ? zzZ0Q.zzWjd : zzYW8.zzWb4;
    }

    private zzZ4D zzXAv() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVQY == null) {
            this.zzVQY = new zzYW8.zzL();
        }
        return this.zzVQY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZ4E zzXAw() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVQZ == null) {
            this.zzVQZ = new zzYW8.zzN();
        }
        return this.zzVQZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZ55 zzXAx() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVQW == null) {
            this.zzVQW = new zzYW8.zzV();
        }
        return this.zzVQW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZ5T zzXAy() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVQX == null) {
            this.zzVQX = new zzYW8.zzS();
        }
        return this.zzVQX;
    }

    private void zzX(final zzYQ8 zzyq8, String str, final zzZ5K zzz5k) {
        zzyq8.zzZ(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/ISO9796-2PSS"), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("org.bouncycastle.jcajce.provider.asymmetric.rsa.ISO9796-2PSSSignatureSpi$", str), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ4D zzz4d = zzYNX.this.zzVQY;
                zzYNG zzyng = zzYNX.zzVWs;
                zzYP5 zzyp5 = zzYNX.zzVWr;
                zzYXR zzyxr = zzYW8.zzWb4;
                return new zzYQB(zzyq82, zzz4d, zzyng, zzyp5, zzYW8.zzZ.zzV(zzz5k));
            }
        }));
        zzyq8.zzV(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Signature."), str, "WITHRSA/ISO9796-2PSS"), zzVQR);
        zzyq8.zzXp("Alg.Alias.Signature." + str + "WITHRSAANDMGF1/ISO9796-2", str + "WITHRSA/ISO9796-2PSS");
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        String str;
        String str2;
        zzZ1J zzz1j;
        zzZ1J zzz1j2;
        zzyq8.zzZ("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzT();
            }
        });
        zzZDA zzzda = zzZ96.zzWyv;
        zzyq8.zzZ("AlgorithmParameters", "OAEP", zzzda);
        zzyq8.zzZ("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzS();
            }
        });
        zzyq8.zzZ("AlgorithmParameters", "PSS", "RSAPSS", "RSA-PSS", "RSASSA-PSS");
        zzZDA zzzda2 = zzZ96.zzWys;
        zzyq8.zzZ("AlgorithmParameters", "PSS", zzzda2);
        zzYPS zzyps = new zzYPS() { // from class: com.aspose.words.internal.zzYNX.21
            private zzYQA zzZ(zzZ5W[] zzz5wArr) {
                return new zzYQA.zzY(zzyq8, zzz5wArr).zzOF(zzZ5L.zzXH0()).zzZ(new zzZ0Q.zzR()).zzZ(zzYNX.this.zzXAy(), zzYNX.this.zzXAx()).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.21.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(final zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.21.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                                if (zzZ5L.zzXH0()) {
                                    return zzz4m.zzXGV() == zzZ0Q.zzWfs.zzXF4() ? zzYNX.zzZ((OAEPParameterSpec) algorithmParameterSpec) : zzZ0Q.zzWft;
                                }
                                zzZ5W zzz5wZzXGV = zzz4m.zzXGV();
                                zzYW8.zzT zzt = zzYW8.zzW3C;
                                if (zzz5wZzXGV == zzt.zzXGV()) {
                                    OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                                    return zzt.zzT(zzYNC.zzVOz.get(oAEPParameterSpec.getDigestAlgorithm())).zzS(zzYNC.zzVOz.get(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())).zzWj(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                                }
                                zzZ5W zzz5wZzXGV2 = zzz4m.zzXGV();
                                zzYW8.zzR zzr = zzYW8.zzW3A;
                                return zzz5wZzXGV2 == zzr.zzXGV() ? zzr : zzYW8.zzW3F;
                            }
                        };
                    }
                }).zzXBv();
            }

            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzZ5L.zzXH0() ? zzZ(zzYNX.this.zzVQV) : zzZ(zzYNX.this.zzVQU);
            }
        };
        zzYPP zzypp = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.22
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQA.zzY(zzyq8, zzYW8.zzW3A).zzZ(zzYNX.this.zzXAy(), zzYNX.this.zzXAx()).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.22.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.22.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                                return zzYW8.zzW3A;
                            }
                        };
                    }
                }).zzXBv();
            }
        });
        zzYPP zzypp2 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQA.zzY(zzyq8, zzYW8.zzW3A).zzZ(zzYNX.this.zzXAy(), zzYNX.this.zzXAx()).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzXBw().zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.23.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.23.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                                return zzYW8.zzW3A;
                            }
                        };
                    }
                }).zzXBv();
            }
        });
        zzYPP zzypp3 = new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.24
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQA.zzY(zzyq8, zzYW8.zzW3A).zzZ(zzYNX.this.zzXAy(), zzYNX.this.zzXAx()).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzXBx().zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.24.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.24.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                                return zzYW8.zzW3A;
                            }
                        };
                    }
                }).zzXBv();
            }
        });
        zzyq8.zzZ("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding", zzyps);
        Map<String, String> map = zzVQR;
        zzyq8.zzV("Cipher.RSA", map);
        if (zzZ5L.zzXH0()) {
            str = "Signature.NONEWITHRSA";
        } else {
            zzZDA zzzda3 = zzZ96.zzWyA;
            str = "Signature.NONEWITHRSA";
            zzyq8.zzZ("Cipher", zzzda3, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding", zzypp);
            zzyq8.zzZ("Cipher", zzzda3, map);
            zzZDA zzzda4 = zzZ79.zzWpc;
            zzyq8.zzZ("Cipher", zzzda4, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding", zzypp);
            zzyq8.zzZ("Cipher", zzzda4, map);
            zzyq8.zzZ("Cipher.RSA/1/PKCS1PADDING", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly", zzypp2);
            zzyq8.zzZ("Cipher.RSA/2/PKCS1PADDING", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly", zzypp3);
        }
        zzyq8.zzZ("Cipher", zzzda, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.25
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return zzZ5L.zzXH0() ? new zzYQA.zzY(zzyq8, zzZ0Q.zzWfs).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzOF(true).zzV(new Class[]{OAEPParameterSpec.class}).zzZ(new zzZ0Q.zzR()).zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.25.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.25.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                                return algorithmParameterSpec == null ? zzZ0Q.zzWfs : zzYNX.zzZ((OAEPParameterSpec) algorithmParameterSpec);
                            }
                        };
                    }
                }).zzXBv() : new zzYQA.zzY(zzyq8, zzYW8.zzW3C).zzZ(zzYNX.zzVWs).zzZ(zzYNX.zzVWr).zzV(new Class[]{OAEPParameterSpec.class}).zzZ(zzYNX.this.zzXAy(), new zzYW8.zzV()).zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYNX.25.2
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYNX.25.2.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                                if (algorithmParameterSpec == null) {
                                    return zzYW8.zzW3C;
                                }
                                if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                                    throw new InvalidAlgorithmParameterException("OAEP can only accept OAEPParameterSpec");
                                }
                                OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                                zzZ5K zzz5k = zzYNC.zzVOz.get(oAEPParameterSpec.getDigestAlgorithm());
                                return zzYW8.zzW3C.zzT(zzz5k).zzS(zzYNC.zzVOz.get(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())).zzWj(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                            }
                        };
                    }
                }).zzXBv();
            }
        });
        zzyq8.zzZ("Cipher", zzzda, map);
        zzyq8.zzZ("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzR(zzYNX.zzXAu());
            }
        });
        zzyq8.zzZ("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzV(zzyq8);
            }
        });
        zzR zzr = new zzR(zzXAu());
        zzYQP.zzZ(zzyq8, zzZ96.zzWyA, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzr);
        zzYQP.zzZ(zzyq8, zzZ79.zzWpc, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzr);
        zzYQP.zzZ(zzyq8, zzzda, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzr);
        zzYQP.zzZ(zzyq8, zzzda2, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzr);
        zzZDA zzzda5 = zzZ96.zzWxq;
        zzYQP.zzZ(zzyq8, zzzda5, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, zzr);
        zzyq8.zzZ("SecretKeyFactory.RSA-KAS-KEM", "org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAKTSKEM", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW(new zzYP7() { // from class: com.aspose.words.internal.zzYNX.4.1
                    @Override // com.aspose.words.internal.zzYP7
                    public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        if (((zzY) algorithmParameterSpec).zzVQy == null) {
                            return zzZ0Q.zzWfr;
                        }
                        throw new InvalidAlgorithmParameterException("RSA-KAS-KEM does not accept an AlgorithmParameterSpec");
                    }
                }, zzyq8, zzYNX.zzVWs, zzYNX.zzVWr);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.RSA-KTS-KEM-KWS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAKTSKEMKWS", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8);
            }
        });
        zzyq8.zzZ("Cipher.RSA-KTS-KEM-KWS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherRSAKTSKEM", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                return new zzYPI(zzyq8, "RSA-KTS-KEM-KWS");
            }
        });
        zzyq8.zzV("Cipher.RSA-KTS-KEM-KWS", map);
        zzyq8.zzZ("Cipher", "RSA-KTS-KEM-KWS", zzzda5);
        zzyq8.zzZ("AlgorithmParameters.RSA-KTS-KEM-KWS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgParamsRSAKTSKEM", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) throws NoSuchAlgorithmException {
                return new zzU();
            }
        });
        zzyq8.zzZ("AlgorithmParameters", "RSA-KTS-KEM-KWS", zzzda5);
        zzyq8.zzZ("SecretKeyFactory.RSA-KTS-OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAKTSOEAP", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW(new zzYP7() { // from class: com.aspose.words.internal.zzYNX.8.1
                    @Override // com.aspose.words.internal.zzYP7
                    public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                        zzY zzy = (zzY) algorithmParameterSpec;
                        if (zzy.zzVQy == null) {
                            return zzZ0Q.zzWfq.zzfL(zzy.zzWEq).zzfK(zzy.zzVQz);
                        }
                        if (!(zzy.zzVQy instanceof OAEPParameterSpec)) {
                            throw new InvalidAlgorithmParameterException("KTS-OAEP can only accept OAEPParameterSpec");
                        }
                        return zzZ0Q.zzWfq.zzZ(zzYNX.zzZ((OAEPParameterSpec) zzy.zzVQy)).zzfL(zzy.zzWEq).zzfK(zzy.zzVQz);
                    }
                }, zzyq8, zzYNX.zzVWs, zzYNX.zzVWr);
            }
        });
        zzyq8.zzZ("Signature.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYNX.this.zzVR0, zzYNX.zzVWs, zzYNX.zzVWr, zzZ0Q.zzWfv, PSSParameterSpec.DEFAULT);
            }
        });
        zzyq8.zzV("Signature.PSS", map);
        zzyq8.zzZ(RequestParameters.SIGNATURE, "PSS", zzzda2);
        zzyq8.zzZ(RequestParameters.SIGNATURE, "PSS", "RSAPSS", "RSA-PSS", "RSASSA-PSS");
        String str3 = str;
        zzyq8.zzZ(str3, "org.bouncycastle.jcajce.provider.asymmetric.rsa.SignatureSpi$NONEwithRSA", new zzYPS() { // from class: com.aspose.words.internal.zzYNX.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ4E zzz4e = zzYNX.this.zzVR0;
                zzYNG zzyng = zzYNX.zzVWs;
                zzYP5 zzyp5 = zzYNX.zzVWr;
                zzZ1P zzz1p = zzZ0Q.zzWjd;
                return new zzYQB(zzyq82, zzz4e, zzyng, zzyp5, zzZ0Q.zzM.zzV(null));
            }
        });
        zzyq8.zzV(str3, map);
        zzyq8.zzXp("Alg.Alias.Signature.RAWRSA", "NONEWITHRSA");
        zzZ1J zzz1j3 = zzZ0P.zzZ.zzWdL;
        zzZ(zzyq8, "SHA1", zzz1j3, new PSSParameterSpec(IDevicePopManager.SHA_1, IDevicePopManager.MGF_1, new MGF1ParameterSpec(IDevicePopManager.SHA_1), 20, 1));
        zzZ1J zzz1j4 = zzZ0P.zzZ.zzWdJ;
        zzZ(zzyq8, "SHA224", zzz1j4, new PSSParameterSpec("SHA-224", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-224"), 28, 1));
        zzZ1J zzz1j5 = zzZ0P.zzZ.zzWdH;
        zzZ(zzyq8, "SHA256", zzz1j5, new PSSParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM, IDevicePopManager.MGF_1, new MGF1ParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM), 32, 1));
        zzZ1J zzz1j6 = zzZ0P.zzZ.zzWdF;
        zzZ(zzyq8, "SHA384", zzz1j6, new PSSParameterSpec("SHA-384", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-384"), 48, 1));
        zzZ1J zzz1j7 = zzZ0P.zzZ.zzWdD;
        zzZ(zzyq8, "SHA512", zzz1j7, new PSSParameterSpec("SHA-512", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-512"), 64, 1));
        zzZ1J zzz1j8 = zzZ0P.zzZ.zzWdB;
        zzZ(zzyq8, "SHA512(224)", zzz1j8, new PSSParameterSpec("SHA-512(224)", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        zzZ1J zzz1j9 = zzZ0P.zzZ.zzWdz;
        zzZ(zzyq8, "SHA512(256)", zzz1j9, new PSSParameterSpec("SHA-512(256)", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        zzZ1J zzz1j10 = zzZ0P.zzZ.zzWdx;
        zzZ(zzyq8, "SHA3-224", zzz1j10, new PSSParameterSpec("SHA3-224", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-224"), 28, 1));
        zzZ1J zzz1j11 = zzZ0P.zzZ.zzWdv;
        zzZ(zzyq8, "SHA3-256", zzz1j11, new PSSParameterSpec("SHA3-256", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-256"), 32, 1));
        zzZ1J zzz1j12 = zzZ0P.zzZ.zzWdt;
        zzZ(zzyq8, "SHA3-384", zzz1j12, new PSSParameterSpec("SHA3-384", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-384"), 48, 1));
        zzZ1J zzz1j13 = zzZ0P.zzZ.zzWdr;
        zzZ(zzyq8, "SHA3-512", zzz1j13, new PSSParameterSpec("SHA3-512", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-512"), 64, 1));
        zzZ(zzyq8, "SHA1", zzz1j3);
        zzZ(zzyq8, "SHA224", zzz1j4);
        zzZ(zzyq8, "SHA256", zzz1j5);
        zzZ(zzyq8, "SHA384", zzz1j6);
        zzZ(zzyq8, "SHA512", zzz1j7);
        zzZ(zzyq8, "SHA512(224)", zzz1j8);
        zzZ(zzyq8, "SHA512(256)", zzz1j9);
        if (zzZ5L.zzXH0()) {
            str2 = "RIPEMD160";
        } else {
            zzZ(zzyq8, "RIPEMD128", zzYW0.zzZ.zzW1S);
            zzZ(zzyq8, "RIPEMD160", zzYW0.zzZ.zzW1Q);
            str2 = "RIPEMD160";
            zzZ(zzyq8, "WHIRLPOOL", zzYW0.zzZ.zzW1I);
        }
        if (zzZ5L.zzXH0()) {
            zzz1j = zzz1j8;
            zzz1j2 = zzz1j9;
        } else {
            zzY(zzyq8, "MD5", zzYW0.zzZ.zzW1W);
            zzY(zzyq8, "SHA1", zzz1j3);
            zzY(zzyq8, "SHA224", zzz1j4);
            zzY(zzyq8, "SHA256", zzz1j5);
            zzY(zzyq8, "SHA384", zzz1j6);
            zzY(zzyq8, "SHA512", zzz1j7);
            zzY(zzyq8, "SHA512(224)", zzz1j8);
            zzz1j2 = zzz1j9;
            zzY(zzyq8, "SHA512(256)", zzz1j2);
            zzZ5K zzz5k = zzYW0.zzZ.zzW1S;
            zzY(zzyq8, "RIPEMD128", zzz5k);
            zzZ5K zzz5k2 = zzYW0.zzZ.zzW1Q;
            String str4 = str2;
            zzY(zzyq8, str4, zzz5k2);
            zzX(zzyq8, "SHA1", zzz1j3);
            zzX(zzyq8, "SHA224", zzz1j4);
            zzX(zzyq8, "SHA256", zzz1j5);
            zzX(zzyq8, "SHA384", zzz1j6);
            zzX(zzyq8, "SHA512", zzz1j7);
            zzz1j = zzz1j8;
            zzX(zzyq8, "SHA512(224)", zzz1j);
            zzX(zzyq8, "SHA512(256)", zzz1j2);
            zzX(zzyq8, "RIPEMD128", zzz5k);
            zzX(zzyq8, str4, zzz5k2);
        }
        zzZ1P zzz1p = zzZ0Q.zzWjd;
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j3), "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", zzZ96.zzWyx);
        zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA1WITHRSA", zzZ9K.zzWyU);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j4), "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", zzZ96.zzWyo);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j5), "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", zzZ96.zzWyr);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j6), "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", zzZ96.zzWyq);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j7), "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", zzZ96.zzWyp);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j), "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", zzZ96.zzWyn);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j2), "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", zzZ96.zzWym);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j10), "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", zzZ9O.zzWzS);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j11), "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", zzZ9O.zzWzR);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j12), "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", zzZ9O.zzWzQ);
        zzZ(zzyq8, zzZ0Q.zzM.zzV(zzz1j13), "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", zzZ9O.zzWzP);
        if (zzZ5L.zzXH0()) {
            return;
        }
        zzYXR zzyxr = zzYW8.zzWb4;
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzYW0.zzZ.zzW1W), "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", zzZ96.zzWyy);
        zzyq8.zzZ(RequestParameters.SIGNATURE, "MD5WITHRSA", zzZ9K.zzWz3);
        zzYXP zzyxp = zzYW0.zzZ.zzW1S;
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp), "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", zzZ8R.zzWu1);
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp), "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (zzZDA) null);
        zzYXP zzyxp2 = zzYW0.zzZ.zzW1Q;
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp2), "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", zzZ8R.zzWu2);
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp2), "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (zzZDA) null);
        zzYXP zzyxp3 = zzYW0.zzZ.zzW1O;
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp3), "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", zzZ8R.zzWu0);
        zzZ(zzyq8, zzYW8.zzQ.zzR(zzyxp3), "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (zzZDA) null);
    }

    private void zzY(final zzYQ8 zzyq8, String str, final zzZ5K zzz5k) {
        zzyq8.zzZ(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/ISO9796-2"), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("org.bouncycastle.jcajce.provider.asymmetric.rsa.ISO9796-2SignatureSpi$", str), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ4D zzz4d = zzYNX.this.zzVQY;
                zzYNG zzyng = zzYNX.zzVWs;
                zzYP5 zzyp5 = zzYNX.zzVWr;
                zzYXR zzyxr = zzYW8.zzWb4;
                return new zzYQB(zzyq82, zzz4d, zzyng, zzyp5, zzYW8.zzY.zzU(zzz5k));
            }
        }));
        zzyq8.zzV(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Signature."), str, "WITHRSA/ISO9796-2"), zzVQR);
    }

    private void zzZ(final zzYQ8 zzyq8, String str, final zzZ5W zzz5w, final PSSParameterSpec pSSParameterSpec) {
        zzyq8.zzZ(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/PSS"), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$", str), new zzYPS() { // from class: com.aspose.words.internal.zzYNX.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYNX.this.zzVR0, zzYNX.zzVWs, zzYNX.zzVWr, zzZ0Q.zzWfv.zzU((zzZ1J) zzz5w), pSSParameterSpec);
            }
        });
        zzyq8.zzV(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Signature."), str, "WITHRSA/PSS"), zzVQR);
        zzyq8.zzZ(RequestParameters.SIGNATURE, str + "WITHRSA/PSS", C21111o0ooOoO.OooO0Oo(str, "WITHRSAANDMGF1"));
        zzyq8.zzZ("AlgorithmParameters", "PSS", C21111o0ooOoO.OooO0Oo(str, "WITHRSA/PSS"), C21111o0ooOoO.OooO0Oo(str, "WITHRSAANDMGF1"));
    }

    private void zzZ(final zzYQ8 zzyq8, String str, final zzZ5K zzz5k) {
        if (zzz5k instanceof zzZ1P) {
            zzyq8.zzZ(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/X9.31"), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$", str), new zzYPS() { // from class: com.aspose.words.internal.zzYNX.13
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    zzYQ8 zzyq82 = zzyq8;
                    zzZ4E zzz4e = zzYNX.this.zzVR0;
                    zzYNG zzyng = zzYNX.zzVWs;
                    zzYP5 zzyp5 = zzYNX.zzVWr;
                    zzZ1P zzz1p = zzZ0Q.zzWjd;
                    return new zzYQB(zzyq82, zzz4e, zzyng, zzyp5, zzZ0Q.zzD.zzS((zzZ1J) zzz5k));
                }
            });
        } else {
            zzyq8.zzZ(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/X9.31"), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$", str), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.14
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYNX.this.zzVQZ, zzYNX.zzVWs, zzYNX.zzVWr, new zzYW8.zzI(zzz5k));
                }
            }));
        }
        zzyq8.zzV(C20593OooO0Oo.OooO0O0("Signature.", str, "WITHRSA/X9.31"), zzVQR);
    }

    private void zzZ(final zzYQ8 zzyq8, final zzZ4M zzz4m, String str, String str2, zzZDA zzzda) {
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, "WITHRSA");
        String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(str, "/RSA");
        String strOooO0Oo3 = C21111o0ooOoO.OooO0Oo(str, "WITHRSAENCRYPTION");
        if (zzz4m instanceof zzZ0S) {
            zzyq8.zzZ(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Signature.", strOooO0Oo), str2, new zzYPS() { // from class: com.aspose.words.internal.zzYNX.17
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, new zzZ(zzYNX.this, (byte) 0), zzYNX.zzVWs, zzYNX.zzVWr, zzz4m);
                }
            });
        } else {
            zzyq8.zzZ(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Signature.", strOooO0Oo), str2, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNX.18
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYNX.this.zzXAw(), zzYNX.zzVWs, zzYNX.zzVWr, zzz4m);
                }
            }));
        }
        zzyq8.zzV(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Signature.", strOooO0Oo), zzVQR);
        zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, strOooO0Oo2, strOooO0Oo3);
        if (zzzda != null) {
            zzyq8.zzZ(RequestParameters.SIGNATURE, strOooO0Oo, zzzda);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ0Q.zzO zzZ(OAEPParameterSpec oAEPParameterSpec) {
        zzZ1J zzz1j = (zzZ1J) zzYNC.zzVOz.get(oAEPParameterSpec.getDigestAlgorithm());
        return zzZ0Q.zzWfs.zzX(zzz1j).zzW((zzZ1J) zzYNC.zzVOz.get(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())).zzWW(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
    }
}
