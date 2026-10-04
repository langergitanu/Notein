package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.OooOOO;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYYJ;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1D;
import com.aspose.words.internal.zzZ1H;
import com.aspose.words.internal.zzZ5L;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class zzYOM extends zzYQP {
    private static final String PREFIX;
    private static zzZ4E zzVSB;
    private static final zzZ4E zzVSC;
    private static final zzZ5X zzVSN;
    private static final zzZ5X zzVSO;
    private static final zzZ5X zzVSP;
    private static final Map<String, String> zzVSp;
    private static final zzYP5<zzZ3O> zzVWr;
    private static final zzYNG<zzZ3N> zzVWs;

    public static class zzX extends KeyPairGenerator {
        private static Hashtable zzVSi;
        private final zzZ5W zzVSj;
        private zzZ5U zzVSw;
        private final zzYQ8 zzVWk;
        private boolean zzW9m;
        private final zzZ4M zzWil;
        private int zzWk4;

        static {
            Hashtable hashtable = new Hashtable();
            zzVSi = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            zzVSi.put(239, new ECGenParameterSpec("prime239v1"));
            zzVSi.put(256, new ECGenParameterSpec("prime256v1"));
            zzVSi.put(224, new ECGenParameterSpec("P-224"));
            zzVSi.put(384, new ECGenParameterSpec("P-384"));
            zzVSi.put(521, new ECGenParameterSpec("P-521"));
        }

        public zzX(zzYQ8 zzyq8, zzZ5W zzz5w) {
            this(zzyq8, zzz5w, null);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                initialize(this.zzWk4, this.zzVWk.zzXBp());
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYOH((zzZ3N) zzz3gZzXH4.zzXGw()), new zzYOI((zzZ3O) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        public zzX(zzYQ8 zzyq8, zzZ4M zzz4m) {
            this(zzyq8, zzz4m.zzXGV(), zzz4m);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            this.zzWk4 = i;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) zzVSi.get(Integer.valueOf(i));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException(o0Oo0oo.OooO0O0(i, "Key size ", " bits not available"));
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        private zzX(zzYQ8 zzyq8, zzZ5W zzz5w, zzZ4M zzz4m) {
            super(zzz5w.getName());
            this.zzWk4 = 224;
            this.zzW9m = false;
            this.zzVWk = zzyq8;
            this.zzVSj = zzz5w;
            this.zzWil = zzz4m;
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            zzZ33 zzz30;
            zzZ33 zzz33ZzZ;
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                zzz33ZzZ = zzYPT.zzZ((ECParameterSpec) algorithmParameterSpec);
            } else {
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
                    zzz30 = zzYOM.zzZ(eCGenParameterSpec);
                    if (zzz30 == null) {
                        throw new InvalidAlgorithmParameterException("unknown curve ID: " + eCGenParameterSpec.getName());
                    }
                } else if (algorithmParameterSpec == null) {
                    zzZ33 zzz33 = (zzZ33) zzZ5L.zzZ(zzZ5L.zzZ.zzWlH);
                    if (zzz33 != null) {
                        zzz30 = new zzZ30(zzz33);
                    } else {
                        throw new InvalidAlgorithmParameterException("null AlgorithmParameterSpec passed but no implicit CA set");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                zzz33ZzZ = zzz30;
            }
            if (this.zzVSj instanceof zzZ1P) {
                zzZ4M zzz4m = this.zzWil;
                if (zzz4m != null) {
                    if (zzz4m instanceof zzZ1H.zzT) {
                        this.zzVSw = new zzZ1H.zzN(new zzZ1H.zzO((zzZ1H.zzT) zzz4m, zzz33ZzZ), secureRandom);
                    } else if (zzz4m instanceof zzZ1H.zzZ) {
                        this.zzVSw = new zzZ1H.zzN(new zzZ1H.zzO((zzZ1H.zzZ) zzz4m, zzz33ZzZ), secureRandom);
                    } else {
                        this.zzVSw = new zzZ1H.zzN(new zzZ1H.zzO(zzz33ZzZ, (byte) 0), secureRandom);
                    }
                } else {
                    this.zzVSw = new zzZ1H.zzN(new zzZ1H.zzO(zzz33ZzZ), secureRandom);
                }
            } else {
                zzZ4M zzz4m2 = this.zzWil;
                if (zzz4m2 != null) {
                    this.zzVSw = new zzYYJ.zzW(new zzYYJ.zzX((zzYYJ.zzY) zzz4m2, zzz33ZzZ), secureRandom);
                } else {
                    this.zzVSw = new zzYYJ.zzW(new zzYYJ.zzX(zzz33ZzZ), secureRandom);
                }
            }
            this.zzW9m = true;
        }
    }

    public static class zzZ extends zzYNB {
        private zzZ33 zzWlm = zzZ31.zzN(zzZ8T.zzWuH);

        private static zzZ33 zzVS(byte[] bArr) throws IOException {
            zzZ74 zzz74ZzWS = zzZ74.zzWS(bArr);
            if (zzz74ZzWS.zzXIy()) {
                return zzZ31.zzN((zzZDA) zzz74ZzWS.zzXHx());
            }
            if (!zzz74ZzWS.zzXHy()) {
                zzZ72 zzz72ZzWR = zzZ72.zzWR(zzz74ZzWS.zzXHx());
                return new zzZ33(zzz72ZzWR.zzXHv(), zzz72ZzWR.zzXHu(), zzz72ZzWR.zzXIz(), zzz72ZzWR.zzXHt(), zzz72ZzWR.getSeed());
            }
            zzZ33 zzz33 = (zzZ33) zzZ5L.zzZ(zzZ5L.zzZ.zzWlH);
            if (zzz33 != null) {
                return new zzZ30(zzz33);
            }
            throw new IOException("Encoding indicates implicitlyCA but CryptoServicesRegistrar.getProperty(CryptoServicesRegistrar.Property.EC_IMPLICITLY_CA) returns null");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
                if (algorithmParameterSpec instanceof zzYMV) {
                    this.zzWlm = ((zzYMV) algorithmParameterSpec).zzXGy();
                    return;
                } else {
                    if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                        throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                    }
                    this.zzWlm = zzYPT.zzZ((ECParameterSpec) algorithmParameterSpec);
                    return;
                }
            }
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
            zzZ33 zzz33ZzZ = zzYOM.zzZ(eCGenParameterSpec);
            this.zzWlm = zzz33ZzZ;
            if (zzz33ZzZ != null) {
                return;
            }
            throw new InvalidParameterSpecException("EC AlgorithmParameters cannot recognize curve " + eCGenParameterSpec.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "EC AlgorithmParameters " + this.zzWlm;
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            this.zzWlm = zzVS(bArr);
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            zzZ33 zzz33 = this.zzWlm;
            return (zzz33 instanceof zzZ2W ? new zzZ74(((zzZ2W) zzz33).zzXGj()) : zzz33 instanceof zzZ30 ? new zzZ74((zzZDC) zzZC8.zzWHS) : new zzZ74(new zzZ72(this.zzWlm.zzXHv(), this.zzWlm.zzXHu(), this.zzWlm.zzXIz(), this.zzWlm.zzXHt(), this.zzWlm.getSeed()))).getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
                return zzYPT.zzP(this.zzWlm);
            }
            if (!ECGenParameterSpec.class.isAssignableFrom(cls)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
            }
            zzZ33 zzz33 = this.zzWlm;
            if (zzz33 instanceof zzZ2W) {
                return new ECGenParameterSpec(((zzZ2W) this.zzWlm).zzXGj().getId());
            }
            zzZDA zzzdaZzY = zzZ31.zzY(zzz33);
            if (zzzdaZzY != null) {
                return new ECGenParameterSpec(zzzdaZzY.getId());
            }
            throw new InvalidParameterSpecException("Cannot identify curve in AlgorithmParameters by name");
        }
    }

    static {
        HashMap map = new HashMap();
        zzVSp = map;
        PREFIX = zzYOM.class.getName().concat(".");
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
        if (zzYGM.zzwd("org.bouncycastle.ec.disable")) {
            zzVSP = null;
            zzVSO = null;
            zzVSN = null;
            zzVSC = null;
        } else {
            zzVSP = new zzZ1H.zzY();
            zzVSO = new zzZ1H.zzX();
            zzVSN = zzYGM.zzwd("org.bouncycastle.ec.disable_mqv") ? null : new zzZ1H.zzM();
            zzVSC = new zzZ1H.zzU();
        }
        zzVWs = new zzYNG<zzZ3N>() { // from class: com.aspose.words.internal.zzYOM.1
            private static zzZ3N zzV(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                if (publicKey instanceof ECPublicKey) {
                    return publicKey instanceof zzYOH ? ((zzYOH) publicKey).zzXAH() : new zzYOH(zzz5w, (ECPublicKey) publicKey).zzXAH();
                }
                try {
                    return new zzZ3N(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify EC public key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYNG
            public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                return zzV(zzz5w, publicKey);
            }
        };
        zzVWr = new zzYP5<zzZ3O>() { // from class: com.aspose.words.internal.zzYOM.12
            private static zzZ3O zzV(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                if (privateKey instanceof ECPrivateKey) {
                    return privateKey instanceof zzYOI ? ((zzYOI) privateKey).zzXAI() : new zzYOI(zzz5w, (ECPrivateKey) privateKey).zzXAI();
                }
                try {
                    return new zzZ3O(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify EC private key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYP5
            public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                return zzV(zzz5w, privateKey);
            }
        };
    }

    private void zzW(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECMQVWITH", str, "CKDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.47
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSN, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    private void zzX(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECCDHUWITH", str, "CKDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.44
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSO, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ4E zzXAX() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (zzVSB == null) {
            zzVSB = new zzYYJ.zzZ();
        }
        return zzVSB;
    }

    private static zzZ2W zzwo(final String str) {
        return zzZ31.zzZ(new zzZ32() { // from class: com.aspose.words.internal.zzYOM.48
            @Override // com.aspose.words.internal.zzZ32
            public final String zzXGl() {
                return str;
            }
        });
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.EC", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, "AlgorithmParametersSpi$EC"), new zzYPS() { // from class: com.aspose.words.internal.zzYOM.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        });
        final zzYP7 zzyp7 = new zzYP7() { // from class: com.aspose.words.internal.zzYOM.34
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof zzYMA)) {
                    return zzZ1H.zzWh2;
                }
                throw new InvalidAlgorithmParameterException("ECDH can only take a UserKeyingMaterialSpec");
            }
        };
        final zzYP7 zzyp72 = new zzYP7() { // from class: com.aspose.words.internal.zzYOM.45
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof zzYMA)) {
                    return zzZ1H.zzWh1;
                }
                throw new InvalidAlgorithmParameterException("ECCDH can only take a UserKeyingMaterialSpec");
            }
        };
        zzYP7 zzyp73 = new zzYP7() { // from class: com.aspose.words.internal.zzYOM.49
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                try {
                    if (!(algorithmParameterSpec instanceof zzYN1)) {
                        throw new InvalidAlgorithmParameterException("ECCDHU can only take an MQVParameterSpec");
                    }
                    zzYN1 zzyn1 = (zzYN1) algorithmParameterSpec;
                    if (zzyn1.zzXA7() != null) {
                        zzZ1P zzz1p = zzZ1H.zzWjd;
                        zzYNG zzyng = zzYOM.zzVWs;
                        zzZ1H.zzV zzv = zzZ1H.zzWgZ;
                        return zzZ1H.zzV.zzZ((zzZ3N) zzyng.zzY(zzv.zzXF4(), zzyn1.zzXA7()), (zzZ3O) zzYOM.zzVWr.zzZ(zzv.zzXF4(), zzyn1.zzXA8()), (zzZ3N) zzYOM.zzVWs.zzY(zzv.zzXF4(), zzyn1.zzXA6()));
                    }
                    zzZ1P zzz1p2 = zzZ1H.zzWjd;
                    zzYP5 zzyp5 = zzYOM.zzVWr;
                    zzZ1H.zzV zzv2 = zzZ1H.zzWgZ;
                    return zzZ1H.zzV.zzZ((zzZ3O) zzyp5.zzZ(zzv2.zzXF4(), zzyn1.zzXA8()), (zzZ3N) zzYOM.zzVWs.zzY(zzv2.zzXF4(), zzyn1.zzXA6()));
                } catch (InvalidKeyException e) {
                    throw new InvalidAlgorithmParameterException("Unable to convert keys in MQVParameterSpec: " + e.getMessage(), e);
                }
            }
        };
        zzyq8.zzZ("KeyFactory.EC", C21111o0ooOoO.OooO0Oo(str2, "KeyFactorySpi$EC"), new zzYPS() { // from class: com.aspose.words.internal.zzYOM.50
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzZ1H.zzWjd);
            }
        });
        zzyq8.zzZ("KeyFactory.ECDSA", str2 + "KeyFactorySpi$ECDSA", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.51
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzZ1H.zzWh3);
            }
        });
        zzyq8.zzZ("KeyFactory.ECDH", str2 + "KeyFactorySpi$ECDH", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.52
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzZ1H.zzWh2);
            }
        });
        zzyq8.zzZ("KeyFactory.ECCDH", str2 + "KeyFactorySpi$ECCDH", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzZ1H.zzWh1);
            }
        });
        zzyq8.zzZ("KeyFactory.ECMQV", str2 + "KeyFactorySpi$ECMQV", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzZ1H.zzWh0);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.EC", str2 + "KeyPairGeneratorSpi$EC", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8, zzZ1H.zzWjd);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.ECDSA", str2 + "KeyPairGeneratorSpi$ECDSA", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8, zzZ1H.zzWh3);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.ECDH", str2 + "KeyPairGeneratorSpi$ECDH", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8, zzZ1H.zzWh2);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.ECCDH", str2 + "KeyPairGeneratorSpi$ECCDH", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8, zzZ1H.zzWh1);
            }
        });
        zzyq8.zzZ("KeyPairGenerator.ECMQV", str2 + "KeyPairGeneratorSpi$ECMQV", new zzYPS() { // from class: com.aspose.words.internal.zzYOM.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8, zzZ1H.zzWh0);
            }
        });
        zzYQP.zzZ(zzyq8, zzZ6W.zzWoc, "EC", new zzY(zzZ1H.zzWh3.zzXF4()));
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str2, "KeyAgreementSpi$DH");
        Map<String, String> map = zzVSp;
        zzYQP.zzZ(zzyq8, "ECDH", strOooO0Oo, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSP, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7);
            }
        });
        zzYQP.zzZ(zzyq8, "ECCDH", C21111o0ooOoO.OooO0Oo(str2, "KeyAgreementSpi$CDH"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSP, zzYOM.zzVWs, zzYOM.zzVWr, zzyp72);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyAgreement.ECDHC", "ECCDH");
        zzY zzy = new zzY(zzZ1H.zzWh2);
        zzZ1D.zzZ zzz = zzZ1D.zzZ.SHA1;
        zzZ(zzyq8, "SHA1", zzz, zzZ6W.zzWnA, zzy, zzyp7);
        zzZ1D.zzZ zzz2 = zzZ1D.zzZ.SHA224;
        zzZ(zzyq8, "SHA224", zzz2, zzZ8T.zzWuz, zzy, zzyp7);
        zzZ1D.zzZ zzz3 = zzZ1D.zzZ.SHA256;
        zzZ(zzyq8, "SHA256", zzz3, zzZ8T.zzWuy, zzy, zzyp7);
        zzZ1D.zzZ zzz4 = zzZ1D.zzZ.SHA384;
        zzZ(zzyq8, "SHA384", zzz4, zzZ8T.zzWux, zzy, zzyp7);
        zzZ1D.zzZ zzz5 = zzZ1D.zzZ.SHA512;
        zzZ(zzyq8, "SHA512", zzz5, zzZ8T.zzWuw, zzy, zzyp7);
        zzY zzy2 = new zzY(zzZ1H.zzWh1);
        zzY(zzyq8, "SHA1", zzz, zzZ6W.zzWnz, zzy2, zzyp72);
        zzY(zzyq8, "SHA224", zzz2, zzZ8T.zzWuv, zzy2, zzyp72);
        zzY(zzyq8, "SHA256", zzz3, zzZ8T.zzWuu, zzy2, zzyp72);
        zzY(zzyq8, "SHA384", zzz4, zzZ8T.zzWut, zzy2, zzyp72);
        zzY(zzyq8, "SHA512", zzz5, zzZ8T.zzWus, zzy2, zzyp72);
        zzZ1D.zzZ zzz6 = zzZ1D.zzZ.SHA512_224;
        zzY(zzyq8, "SHA512(224)", zzz6, null, zzy2, zzyp72);
        zzZ1D.zzZ zzz7 = zzZ1D.zzZ.SHA512_256;
        zzY(zzyq8, "SHA512(256)", zzz7, null, zzy2, zzyp72);
        zzZ(zzyq8, "SHA1", zzz, zzyp72);
        zzZ(zzyq8, "SHA224", zzz2, zzyp72);
        zzZ(zzyq8, "SHA256", zzz3, zzyp72);
        zzZ(zzyq8, "SHA384", zzz4, zzyp72);
        zzZ(zzyq8, "SHA512", zzz5, zzyp72);
        zzZ(zzyq8, "SHA512(224)", zzz6, zzyp72);
        zzZ(zzyq8, "SHA512(256)", zzz7, zzyp72);
        zzZ1D.zzZ zzz8 = zzZ1D.zzZ.SHA3_224;
        zzZ(zzyq8, "SHA3-224", zzz8, zzyp72);
        zzZ1D.zzZ zzz9 = zzZ1D.zzZ.SHA3_256;
        zzZ(zzyq8, "SHA3-256", zzz9, zzyp72);
        zzZ1D.zzZ zzz10 = zzZ1D.zzZ.SHA3_384;
        zzZ(zzyq8, "SHA3-384", zzz10, zzyp72);
        zzZ1D.zzZ zzz11 = zzZ1D.zzZ.SHA3_512;
        zzZ(zzyq8, "SHA3-512", zzz11, zzyp72);
        zzY(zzyq8, "SHA1", zzz, zzyp73);
        zzY(zzyq8, "SHA224", zzz2, zzyp73);
        zzY(zzyq8, "SHA256", zzz3, zzyp73);
        zzY(zzyq8, "SHA384", zzz4, zzyp73);
        zzY(zzyq8, "SHA512", zzz5, zzyp73);
        zzY(zzyq8, "SHA512(224)", zzz6, zzyp73);
        zzY(zzyq8, "SHA512(256)", zzz7, zzyp73);
        zzX(zzyq8, "SHA1", zzz, zzyp73);
        zzX(zzyq8, "SHA224", zzz2, zzyp73);
        zzX(zzyq8, "SHA256", zzz3, zzyp73);
        zzX(zzyq8, "SHA384", zzz4, zzyp73);
        zzX(zzyq8, "SHA512", zzz5, zzyp73);
        zzX(zzyq8, "SHA512(224)", zzz6, zzyp73);
        zzX(zzyq8, "SHA512(256)", zzz7, zzyp73);
        zzX(zzyq8, "SHA3-224", zzz8, zzyp73);
        zzX(zzyq8, "SHA3-256", zzz9, zzyp73);
        zzX(zzyq8, "SHA3-384", zzz10, zzyp73);
        zzX(zzyq8, "SHA3-512", zzz11, zzyp73);
        zzyq8.zzZ("Signature.NONEWITHECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSAwithNONE"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(null));
            }
        });
        zzyq8.zzZ(RequestParameters.SIGNATURE, "NONEWITHECDSA", "RAWECDSA");
        if (zzZ5L.zzXH0()) {
            str = RequestParameters.SIGNATURE;
        } else {
            String strOooO0Oo2 = C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDetDSA");
            str = RequestParameters.SIGNATURE;
            zzyq8.zzZ("Signature.SHA1WITHECDDSA", strOooO0Oo2, map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.13
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdL));
                }
            }));
            zzyq8.zzZ("Signature.SHA224WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA224"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.14
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdJ));
                }
            }));
            zzyq8.zzZ("Signature.SHA256WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA256"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.15
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdH));
                }
            }));
            zzyq8.zzZ("Signature.SHA384WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA384"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.16
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdF));
                }
            }));
            zzyq8.zzZ("Signature.SHA512WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA512"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.17
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdD));
                }
            }));
            zzyq8.zzZ("Signature.SHA512(224)WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA512_224"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.18
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdB));
                }
            }));
            zzyq8.zzZ("Signature.SHA512(256)WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA512_256"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.19
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdz));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-224WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA3_224"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.20
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdx));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-256WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA3_256"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.21
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdv));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-384WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA3_384"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.22
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdt));
                }
            }));
            zzyq8.zzZ("Signature.SHA3-512WITHECDDSA", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str2, "SignatureSpi$ecDetDSA3_512"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.24
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq8, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8b.zzY(zzZ0P.zzZ.zzWdr));
                }
            }));
            zzyq8.zzXp("Alg.Alias.Signature.ECDDSA", "SHA1WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.DETECDSA", "SHA1WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA1WITHDETECDSA", "SHA1WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA224WITHDETECDSA", "SHA224WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA256WITHDETECDSA", "SHA256WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA384WITHDETECDSA", "SHA384WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA512WITHDETECDSA", "SHA512WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA512(224)WITHDETECDSA", "SHA512(224)WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA512(256)WITHDETECDSA", "SHA512(256)WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA3-224WITHDETECDSA", "SHA3-224WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA3-256WITHDETECDSA", "SHA3-256WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA3-384WITHDETECDSA", "SHA3-384WITHECDDSA");
            zzyq8.zzXp("Alg.Alias.Signature.SHA3-512WITHDETECDSA", "SHA3-512WITHECDDSA");
        }
        String str3 = str;
        zzYQP.zzZ(zzyq8, "SHA1", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA1"), zzZ6W.zzWoe, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.25
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdL));
            }
        });
        zzyq8.zzZ(str3, "SHA1WITHECDSA", "ECDSA");
        zzyq8.zzZ(str3, "SHA1WITHECDSA", zzZ8R.zzWtY);
        zzYQP.zzZ(zzyq8, "SHA224", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA224"), zzZ6W.zzWoa, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.26
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdJ));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA256", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA256"), zzZ6W.zzWo9, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.27
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdH));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA384", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA384"), zzZ6W.zzWo8, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.28
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdF));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA512"), zzZ6W.zzWo7, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.29
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdD));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512(224)", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA512_224"), null, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.30
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdB));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA512(256)", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA512_256"), null, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.31
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdz));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-224", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA3_224"), zzZ9O.zzWzW, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.32
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdx));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-256", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA3_256"), zzZ9O.zzWzV, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.33
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdv));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-384", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA3_384"), zzZ9O.zzWzU, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.35
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdt));
            }
        });
        zzYQP.zzZ(zzyq8, "SHA3-512", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSA3_512"), zzZ9O.zzWzT, map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.36
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, zzYOM.zzVSC, zzYOM.zzVWs, zzYOM.zzVWr, zzZ1H.zzWh3.zzY(zzZ0P.zzZ.zzWdr));
            }
        });
        final zzYQ8 zzyq82 = zzyq8;
        if (!zzZ5L.zzXH0()) {
            zzYQP.zzZ(zzyq8, "RIPEMD160", "ECDSA", C21111o0ooOoO.OooO0Oo(str2, "SignatureSpi$ecDSARipeMD160"), zzZ8R.zzWtX, map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOM.37
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQB(zzyq82, zzYOM.zzXAX(), zzYOM.zzVWs, zzYOM.zzVWr, zzYYJ.zzW8c.zzY(zzYW0.zzZ.zzW1Q));
                }
            }));
            zzyq82 = zzyq8;
        }
        if (zzYGM.zzwd("org.bouncycastle.ec.disable_mqv")) {
            return;
        }
        zzY zzy3 = new zzY(zzZ1H.zzWh0.zzXF4());
        final zzYP7 zzyp74 = new zzYP7() { // from class: com.aspose.words.internal.zzYOM.38
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                try {
                    if (!(algorithmParameterSpec instanceof zzYME)) {
                        throw new InvalidAlgorithmParameterException("ECMQV can only take an MQVParameterSpec");
                    }
                    zzYME zzyme = (zzYME) algorithmParameterSpec;
                    if (zzyme.zzXA7() != null) {
                        zzZ1P zzz1p = zzZ1H.zzWjd;
                        zzYNG zzyng = zzYOM.zzVWs;
                        zzZ1H.zzK zzk = zzZ1H.zzWh0;
                        return zzZ1H.zzK.zzY((zzZ3N) zzyng.zzY(zzk.zzXF4(), zzyme.zzXA7()), (zzZ3O) zzYOM.zzVWr.zzZ(zzk.zzXF4(), zzyme.zzXA8()), (zzZ3N) zzYOM.zzVWs.zzY(zzk.zzXF4(), zzyme.zzXA6()));
                    }
                    zzZ1P zzz1p2 = zzZ1H.zzWjd;
                    zzYP5 zzyp5 = zzYOM.zzVWr;
                    zzZ1H.zzK zzk2 = zzZ1H.zzWh0;
                    return zzZ1H.zzK.zzY((zzZ3O) zzyp5.zzZ(zzk2.zzXF4(), zzyme.zzXA8()), (zzZ3N) zzYOM.zzVWs.zzY(zzk2.zzXF4(), zzyme.zzXA6()));
                } catch (InvalidKeyException e) {
                    throw new InvalidAlgorithmParameterException("Unable to convert keys in MQVParameterSpec: " + e.getMessage(), e);
                }
            }
        };
        zzYQP.zzZ(zzyq82, "ECMQV", C21111o0ooOoO.OooO0Oo(str2, "KeyAgreementSpi$ECMQV"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.39
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSN, zzYOM.zzVWs, zzYOM.zzVWr, zzyp74);
            }
        });
        zzX(zzyq82, "SHA1", zzz, zzZ6W.zzWny, zzy3, zzyp74);
        zzX(zzyq8, "SHA224", zzz2, zzZ8T.zzWur, zzy3, zzyp74);
        zzX(zzyq8, "SHA256", zzz3, zzZ8T.zzWuq, zzy3, zzyp74);
        zzX(zzyq8, "SHA384", zzz4, zzZ8T.zzWup, zzy3, zzyp74);
        zzX(zzyq8, "SHA512", zzz5, zzZ8T.zzWuo, zzy3, zzyp74);
        zzX(zzyq8, "SHA512(224)", zzz6, null, zzy3, zzyp74);
        zzX(zzyq8, "SHA512(256)", zzz7, null, zzy3, zzyp74);
        zzW(zzyq8, "SHA1", zzz, zzyp74);
        zzW(zzyq8, "SHA224", zzz2, zzyp74);
        zzW(zzyq8, "SHA256", zzz3, zzyp74);
        zzW(zzyq8, "SHA384", zzz4, zzyp74);
        zzW(zzyq8, "SHA512", zzz5, zzyp74);
        zzW(zzyq8, "SHA512(224)", zzz6, zzyp74);
        zzW(zzyq8, "SHA512(256)", zzz7, zzyp74);
    }

    public static class zzY extends zzYQG implements zzYQO {
        private final zzZ5W zzWlz;

        public zzY(zzZ5W zzz5w) {
            this.zzWlz = zzz5w;
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof ECPrivateKeySpec)) {
                return super.engineGeneratePrivate(keySpec);
            }
            try {
                return new zzYOI(this.zzWlz, (ECPrivateKeySpec) keySpec);
            } catch (IllegalArgumentException e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof ECPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            try {
                return new zzYOH(this.zzWlz, (ECPublicKeySpec) keySpec);
            } catch (IllegalArgumentException e) {
                throw new InvalidKeySpecException(e.getMessage(), e);
            }
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
                ECPublicKey eCPublicKey = (ECPublicKey) key;
                if (eCPublicKey.getParams() != null) {
                    return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
                }
            } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
                ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
                if (eCPrivateKey.getParams() != null) {
                    return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYOH((zzZ3N) zzYOM.zzVWs.zzY(this.zzWlz, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOI((zzZ3O) zzYOM.zzVWr.zzZ(this.zzWlz, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYOH(new zzZ3N(this.zzWlz, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOI(new zzZ3O(this.zzWlz, zzz94));
        }

        public zzY(zzZ4M zzz4m) {
            this.zzWlz = zzz4m.zzXGV();
        }
    }

    private void zzY(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, zzZDA zzzda, zzYQO zzyqo, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECCDHWITH", str, "KDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.41
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSP, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgx.zzY(zzz));
            }
        });
        if (zzzda != null) {
            zzyq8.zzZ("KeyAgreement", strOooO0O0, zzzda);
            zzYQP.zzZ(zzyq8, zzzda, "ECCDH", zzyqo);
            zzyq8.zzZ("AlgorithmParameters", "EC", zzzda);
        }
    }

    private void zzX(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, zzZDA zzzda, zzYQO zzyqo, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECMQVWITH", str, "KDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.46
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSN, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgx.zzY(zzz));
            }
        });
        if (zzzda != null) {
            zzyq8.zzZ("KeyAgreement", strOooO0O0, zzzda);
            zzYQP.zzZ(zzyq8, zzzda, "EC", zzyqo);
            zzyq8.zzZ("AlgorithmParameters", "EC", zzzda);
        }
    }

    private void zzY(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECCDHUWITH", str, "KDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.43
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSO, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgx.zzY(zzz));
            }
        });
    }

    private void zzZ(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, zzZDA zzzda, zzYQO zzyqo, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECDHWITH", str, "KDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.40
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSP, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgx.zzY(zzz));
            }
        });
        if (zzzda != null) {
            zzyq8.zzZ("KeyAgreement", strOooO0O0, zzzda);
            zzYQP.zzZ(zzyq8, zzzda, "ECDH", zzyqo);
            zzyq8.zzZ("AlgorithmParameters", "EC", zzzda);
        }
    }

    private void zzZ(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz, final zzYP7 zzyp7) {
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("ECCDHWITH", str, "CKDF");
        zzYQP.zzZ(zzyq8, strOooO0O0, OooOOO.OooO0O0(new StringBuilder(), PREFIX, "KeyAgreementSpi$", strOooO0O0), zzVSp, new zzYPS() { // from class: com.aspose.words.internal.zzYOM.42
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOM.zzVSP, zzYOM.zzVWs, zzYOM.zzVWr, zzyp7, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ33 zzZ(ECGenParameterSpec eCGenParameterSpec) {
        String name = eCGenParameterSpec.getName();
        try {
            if (name.charAt(0) >= '0' && name.charAt(0) <= '2') {
                return zzZ31.zzN(new zzZDA(name));
            }
            if (name.indexOf(32) > 0) {
                return zzwo(name.substring(name.indexOf(32) + 1));
            }
            return zzwo(name);
        } catch (IllegalArgumentException unused) {
            return zzwo(name);
        }
    }
}
