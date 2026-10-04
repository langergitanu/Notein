package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.internal.zzYYX;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1K;
import com.aspose.words.internal.zzZ5L;
import java.io.IOException;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOS extends zzYQP {
    private static zzZ4E zzVSB;
    private static final zzZ4E zzVSC;
    private static final zzZDA[] zzVSD;
    private static final Map<String, String> zzVSE;
    private static final zzYP5<zzZ3W> zzVWr;
    private static final zzYNG<zzZ3V> zzVWs;

    public static class zzV extends KeyPairGenerator {
        zzZ5U zzVSw;
        private final zzYQ8 zzVWk;
        boolean zzW9m;
        int zzWk4;
        private SecureRandom zzWk5;

        public zzV(zzYQ8 zzyq8) {
            super("DSA");
            this.zzWk4 = 2048;
            this.zzW9m = false;
            this.zzVWk = zzyq8;
            this.zzWk5 = zzyq8.zzXBp();
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                int i = this.zzWk4;
                if (i < 2048) {
                    zzZ36 zzz36ZzXFq = (zzZ36) zzZ5L.zzZ(zzZ5L.zzZ.zzWlF, i);
                    if (zzz36ZzXFq == null) {
                        zzz36ZzXFq = new zzYYX.zzY(new zzYYX.zzZ(this.zzWk4), this.zzWk5).zzXFq();
                    }
                    this.zzVSw = new zzYYX.zzW(new zzYYX.zzX(zzz36ZzXFq), this.zzWk5);
                } else {
                    zzZ36 zzz36ZzXFq2 = (zzZ36) zzZ5L.zzZ(zzZ5L.zzZ.zzWlF, i);
                    if (zzz36ZzXFq2 == null) {
                        zzz36ZzXFq2 = new zzZ1K.zzY(new zzZ1K.zzZ(this.zzWk4), this.zzWk5).zzXFq();
                    }
                    this.zzVSw = new zzZ1K.zzV(new zzZ1K.zzW(zzz36ZzXFq2), this.zzWk5);
                }
                this.zzW9m = true;
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYOQ((zzZ3V) zzz3gZzXH4.zzXGw()), new zzYOR((zzZ3W) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                if (i != 2048 && i != 3072) {
                    throw new InvalidParameterException("strength must be 2048 or 3072");
                }
            } else if (i < 512 || i > 4096 || i % 64 != 0) {
                throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 64");
            }
            this.zzWk4 = i;
            this.zzWk5 = secureRandom;
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof DSAParameterSpec) {
                DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
                try {
                    if (dSAParameterSpec.getP().bitLength() < 2048) {
                        this.zzVSw = new zzYYX.zzW(new zzYYX.zzX(new zzZ36(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG())), secureRandom);
                    } else {
                        this.zzVSw = new zzZ1K.zzV(new zzZ1K.zzW(new zzZ36(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG())), secureRandom);
                    }
                    this.zzW9m = true;
                    return;
                } catch (zzZ0H e) {
                    throw new InvalidAlgorithmParameterException(e.getMessage(), e);
                }
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzW extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DSAPrivateKeySpec ? new zzYOR(zzZ1K.zzWjd, (DSAPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof DSAPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            try {
                return new zzYOQ(zzZ1K.zzWjd, (DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("invalid KeySpec: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
                DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
                return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
            }
            if (!cls.isAssignableFrom(DSAPrivateKeySpec.class) || !(key instanceof DSAPrivateKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYOQ((zzZ3V) zzYOS.zzVWs.zzY(zzZ1K.zzWjd, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOR((zzZ3W) zzYOS.zzVWr.zzZ(zzZ1K.zzWjd, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYOQ(new zzZ3V(zzZ1K.zzWjd, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOR(new zzZ3W(zzZ1K.zzWjd, zzz94));
        }
    }

    public static class zzX extends zzYNB {
        zzYN0 zzVSx;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
                throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
            }
            if (algorithmParameterSpec instanceof zzYN0) {
                this.zzVSx = (zzYN0) algorithmParameterSpec;
            } else {
                DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
                this.zzVSx = new zzYN0(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "DSA Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ7Y zzz7yZzXf = zzZ7Y.zzXf(zzZD5.zzXo(bArr));
            this.zzVSx = new zzYN0(zzz7yZzXf.getP(), zzz7yZzXf.getQ(), zzz7yZzXf.getG());
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZ7Y(this.zzVSx.getP(), this.zzVSx.getQ(), this.zzVSx.getG()).getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == DSAParameterSpec.class || cls == zzYN0.class || cls == AlgorithmParameterSpec.class) {
                return this.zzVSx;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // com.aspose.words.internal.zzYQK
        public final boolean zzwy(String str) {
            return str == null || str.equals("ASN.1");
        }
    }

    public static class zzZ<T extends zzZ4M> implements zzZ4E<zzZ1K.zzT> {
        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzZ4E
        public final /* bridge */ /* synthetic */ zzZ4S zzY(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzY(zzz5s, (zzZ1K.zzT) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ4E
        public final /* synthetic */ zzZ4P zzZ(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzY(zzz5r, (zzZ1K.zzT) zzz4m);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        private static zzZ4R zzY(zzZ5S zzz5s, zzZ1K.zzT zzt) {
            if (zzZ5L.zzXH0()) {
                return (zzZ4R) zzYOS.zzVSC.zzY(zzz5s, zzt);
            }
            int iBitLength = ((zzZ3W) zzz5s).zzXGC().getP().bitLength();
            if (iBitLength >= 2048 && iBitLength <= 3072) {
                return (zzZ4R) zzYOS.zzVSC.zzY(zzz5s, zzt);
            }
            return (zzZ4R) zzYOS.zzXAX().zzY(zzz5s, zzYYX.zzW8D.zzZ(zzt.zzXFo()));
        }

        private static zzZ4P zzY(zzZ5R zzz5r, zzZ1K.zzT zzt) {
            if (zzZ5L.zzXH0()) {
                return zzYOS.zzVSC.zzZ(zzz5r, zzt);
            }
            int iBitLength = ((zzZ3V) zzz5r).zzXGC().getP().bitLength();
            if (iBitLength >= 2048 && iBitLength <= 3072) {
                return zzYOS.zzVSC.zzZ(zzz5r, zzt);
            }
            return zzYOS.zzXAX().zzZ(zzz5r, zzYYX.zzW8D.zzZ(zzt.zzXFo()));
        }
    }

    static {
        HashMap map = new HashMap();
        zzVSE = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.DSAPublicKey|java.security.interfaces.DSAPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
        zzVSD = new zzZDA[]{zzZ6W.zzWnD, zzZ6W.zzWnC, zzZ9K.zzWyV};
        zzVSC = new zzZ1K.zzU();
        zzVWs = new zzYNG<zzZ3V>() { // from class: com.aspose.words.internal.zzYOS.1
            private static zzZ3V zzX(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                if (publicKey instanceof DSAPublicKey) {
                    return publicKey instanceof zzYOQ ? ((zzYOQ) publicKey).zzXAR() : new zzYOQ(zzz5w, (DSAPublicKey) publicKey).zzXAR();
                }
                try {
                    return new zzZ3V(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("cannot identify DSA public key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYNG
            public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                return zzX(zzz5w, publicKey);
            }
        };
        zzVWr = new zzYP5<zzZ3W>() { // from class: com.aspose.words.internal.zzYOS.12
            private static zzZ3W zzX(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                if (privateKey instanceof DSAPrivateKey) {
                    return privateKey instanceof zzYOR ? ((zzYOR) privateKey).zzXAS() : new zzYOR(zzz5w, (DSAPrivateKey) privateKey).zzXAS();
                }
                try {
                    return new zzZ3W(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("cannot identify DSA private key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYP5
            public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                return zzX(zzz5w, privateKey);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ4E zzXAX() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (zzVSB == null) {
            zzVSB = new zzYYX.zzV();
        }
        return zzVSB;
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("AlgorithmParameters.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOS.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX();
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOS.25
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOS.26
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzV(zzyq8);
            }
        });
        zzyq8.zzZ("KeyFactory.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOS.27
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW();
            }
        });
        Map<String, String> map = zzVSE;
        zzyq8.zzZ("Signature.SHA1WITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA", map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.28
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzZ((byte) 0), zzYOS.zzVWs, zzYOS.zzVWr, zzZ1K.zzWhc);
            }
        });
        zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA1WITHDSA", "DSA", "SHA1/DSA");
        zzyq8.zzZ("Signature.NONEWITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA", map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.29
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ((zzZ1J) null));
            }
        });
        zzyq8.zzZ(RequestParameters.SIGNATURE, "NONEWITHDSA", "RAWDSA");
        zzYQP.zzZ(zzyq8, "SHA224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", zzZ9O.zzWA4, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.30
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdJ));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", zzZ9O.zzWA3, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdH));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", zzZ9O.zzWA2, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdF));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", zzZ9O.zzWA1, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdD));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512(224)", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512_224", null, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdB));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512(256)", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512_256", null, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdz));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa3_224", zzZ9O.zzWA0, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdx));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa3_256", zzZ9O.zzWzZ, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdv));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa3_384", zzZ9O.zzWzY, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdt));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa3_512", zzZ9O.zzWzX, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOS.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYQ8 zzyq82 = zzyq8;
                zzZ zzz = new zzZ((byte) 0);
                zzYNG zzyng = zzYOS.zzVWs;
                zzYP5 zzyp5 = zzYOS.zzVWr;
                zzZ1P zzz1p = zzZ1K.zzWjd;
                return new zzYQB(zzyq82, zzz, zzyng, zzyp5, zzZ1K.zzT.zzZ(zzZ0P.zzZ.zzWdr));
            }
        });
        if (!zzZ5L.zzXH0()) {
            zzyq8.zzZ("Signature.DDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$ecDetDSA", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.11
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdL));
                }
            }));
            zzyq8.zzZ("Signature.SHA1WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.13
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdL));
                }
            }));
            zzyq8.zzZ("Signature.SHA224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA224", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.14
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdJ));
                }
            }));
            zzyq8.zzZ("Signature.SHA256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA256", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.15
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdH));
                }
            }));
            zzyq8.zzZ("Signature.SHA384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA384", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.16
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdF));
                }
            }));
            zzyq8.zzZ("Signature.SHA512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA512", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.17
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdD));
                }
            }));
            zzyq8.zzZ("Signature.SHA512(224)WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA512_224", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.18
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdB));
                }
            }));
            zzyq8.zzZ("Signature.SHA512(256)WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA512_256", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.19
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdz));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA3_224", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.20
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdx));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA3_256", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.21
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdv));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA3_384", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.22
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdt));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.SignatureSpi$DetDSA3_512", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOS.24
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOS.zzXAX(), zzYOS.zzVWs, zzYOS.zzVWr, zzYYX.zzW8C.zzZ(zzZ0P.zzZ.zzWdr));
                }
            }));
            zzyq8.zzZ(RequestParameters.SIGNATURE, "DDSA", "DETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA1WITHDDSA", "SHA1WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA224WITHDDSA", "SHA224WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA256WITHDDSA", "SHA256WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA384WITHDDSA", "SHA384WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA512WITHDDSA", "SHA512WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA512(224)WITHDDSA", "SHA512(224)WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA512(256)WITHDDSA", "SHA512(256)WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA3-224WITHDDSA", "SHA3-224WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA3-256WITHDDSA", "SHA3-256WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA3-384WITHDDSA", "SHA3-384WITHDETDSA");
            zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA3-512WITHDDSA", "SHA3-512WITHDETDSA");
        }
        zzW zzw = new zzW();
        zzyq8.zzZ(RequestParameters.SIGNATURE, "SHA1WITHDSA", zzVSD);
        int i = 0;
        while (true) {
            zzZDA[] zzzdaArr = zzVSD;
            if (i == zzzdaArr.length) {
                return;
            }
            zzYQP.zzZ(zzyq8, zzzdaArr[i], "DSA", zzw);
            zzYQP.zzZ(zzyq8, zzzdaArr[i], "DSA");
            i++;
        }
    }

    public static class zzY extends AlgorithmParameterGeneratorSpi {
        private zzZ1K.zzY zzVSy;
        private zzYYX.zzY zzVSz;
        private final zzYQ8 zzVWk;
        protected int zzWk4 = 1024;
        protected SecureRandom zzWk5;

        public zzY(zzYQ8 zzyq8) {
            this.zzVWk = zzyq8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final AlgorithmParameters engineGenerateParameters() {
            zzZ36 zzz36ZzXFq;
            if (this.zzWk5 == null) {
                this.zzWk5 = this.zzVWk.zzXBp();
            }
            zzZ1K.zzY zzy = this.zzVSy;
            if (zzy != null) {
                zzz36ZzXFq = zzy.zzXFq();
            } else {
                zzYYX.zzY zzy2 = this.zzVSz;
                if (zzy2 != null) {
                    zzz36ZzXFq = zzy2.zzXFq();
                } else {
                    zzZ1K.zzY zzy3 = new zzZ1K.zzY(new zzZ1K.zzZ(this.zzWk4), this.zzWk5);
                    this.zzVSy = zzy3;
                    zzz36ZzXFq = zzy3.zzXFq();
                }
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("DSA", this.zzVWk);
                algorithmParameters.init(new zzYN0(zzz36ZzXFq.getP(), zzz36ZzXFq.getQ(), zzz36ZzXFq.getG(), zzz36ZzXFq.zzXGo()));
                return algorithmParameters;
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(int i, SecureRandom secureRandom) {
            if (i < 512 || i > 3072) {
                throw new InvalidParameterException("strength must be from 512 - 3072");
            }
            if (i <= 1024 && i % 64 != 0) {
                throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
            }
            if (i > 1024 && i % 1024 != 0) {
                throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
            }
            this.zzWk4 = i;
            this.zzWk5 = secureRandom;
            if (i >= 2048) {
                this.zzVSy = new zzZ1K.zzY(new zzZ1K.zzZ(i), secureRandom);
                this.zzVSz = null;
            } else {
                if (zzZ5L.zzXH0()) {
                    throw new InvalidParameterException("Attempt to create unapproved parameters in approved only mode");
                }
                this.zzVSz = new zzYYX.zzY(new zzYYX.zzZ(i), secureRandom);
                this.zzVSy = null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof zzYMZ)) {
                if (algorithmParameterSpec != null) {
                    throw new InvalidAlgorithmParameterException("Unknown AlgorithmParameterSpec passed to DSA parameters generator: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                throw new InvalidAlgorithmParameterException("null AlgorithmParameterSpec passed to DSA parameters generator");
            }
            zzYMZ zzymz = (zzYMZ) algorithmParameterSpec;
            if (zzymz.zzXDF() instanceof zzZ1P) {
                if (zzymz.getP() != null) {
                    this.zzVSy = new zzZ1K.zzY((zzZ1J) zzymz.zzXDF(), new zzZ1K.zzZ(zzymz.getP(), zzymz.getQ(), zzymz.getSeed(), zzymz.zzXGn()), secureRandom);
                } else {
                    this.zzVSy = new zzZ1K.zzY((zzZ1J) zzymz.zzXDF(), new zzZ1K.zzZ(zzymz.getL(), zzymz.zzXCn(), zzymz.zzXEq(), zzymz.zzXGn()), secureRandom);
                }
                this.zzVSz = null;
                return;
            }
            throw new InvalidAlgorithmParameterException("Digest algorithm must be a FIPS algorithm");
        }
    }
}
