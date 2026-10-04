package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.internal.zzZ1D;
import com.aspose.words.internal.zzZ1M;
import com.aspose.words.internal.zzZ5L;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOV extends zzYQP {
    private static final zzYP7 zzVSL;
    private static final zzYP7 zzVSM;
    private static final zzZ5X zzVSN;
    private static final zzZ5X zzVSO;
    private static final zzZ5X zzVSP;
    private static final Map<String, String> zzVSQ;
    private static final zzYP7 zzVWq;
    static final zzYP5<zzZ3Z> zzVWr;
    static final zzYNG<zzZ3Y> zzVWs;

    public static class zzW extends zzYQ0 {
        public zzW() {
            super("MQV");
        }

        @Override // com.aspose.words.internal.zzYQ0, java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof zzYN4)) {
                throw new InvalidParameterSpecException("DHDomainParameterSpec required to initialise a MQV/X9 AlgorithmParameters");
            }
            this.zzVUy = (zzYN4) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "MQV/X9 DH Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ78 zzz78ZzWU = zzZ78.zzWU(bArr);
            if (zzz78ZzWU.zzXHA() != null) {
                this.zzVUy = new zzYN4(zzz78ZzWU.getP(), zzz78ZzWU.getQ(), zzz78ZzWU.getG(), zzz78ZzWU.zzXHB(), 0, new zzZ37(zzz78ZzWU.zzXHA().getSeed(), zzz78ZzWU.zzXHA().zzXHz().intValue()));
            } else {
                this.zzVUy = new zzYN4(zzz78ZzWU.getP(), zzz78ZzWU.getQ(), zzz78ZzWU.getG(), zzz78ZzWU.zzXHB(), 0, null);
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            zzYN4 zzyn4 = this.zzVUy;
            zzZ37 zzz37ZzXGq = zzyn4.zzXGq();
            try {
                return (zzz37ZzXGq != null ? new zzZ78(this.zzVUy.getP(), this.zzVUy.getG(), zzyn4.getQ(), zzyn4.zzXHB(), new zzZ76(zzz37ZzXGq.getSeed(), zzz37ZzXGq.zzXGp())) : new zzZ78(this.zzVUy.getP(), this.zzVUy.getG(), zzyn4.getQ(), zzyn4.zzXHB(), null)).zzXL0().getEncoded("DER");
            } catch (Exception e) {
                throw new zzYO6(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Exception creating parameters: ")), e);
            }
        }
    }

    public static class zzX extends KeyPairGenerator {
        private zzZ1M.zzP zzVSH;
        private zzZ1M.zzQ zzVSI;
        private final zzYQ8 zzVWk;
        private boolean zzW9m;
        private int zzWk4;
        private SecureRandom zzWk5;

        public zzX(zzYQ8 zzyq8) {
            super("DH");
            this.zzWk4 = 2048;
            this.zzWk5 = null;
            this.zzW9m = false;
            this.zzVWk = zzyq8;
            this.zzWk5 = zzyq8.zzXBp();
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                zzZ38 zzz38 = (zzZ38) zzZ5L.zzZ(zzZ5L.zzZ.zzWlG, this.zzWk4);
                if (zzz38 != null) {
                    this.zzVSI = new zzZ1M.zzQ(zzz38);
                } else {
                    this.zzVSI = new zzZ1M.zzQ(new zzZ1M.zzR(new zzZ1M.zzS(this.zzWk4), this.zzWk5).zzXFH());
                }
                this.zzVSH = new zzZ1M.zzP(this.zzVSI, this.zzWk5);
                this.zzW9m = true;
            }
            zzZ3G<zzZ3Y, zzZ3Z> zzz3gZzXH4 = this.zzVSH.zzXH4();
            return new KeyPair(new zzYOT((zzZ3Y) zzz3gZzXH4.zzXGw()), new zzYOU((zzZ3Z) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            this.zzWk4 = i;
            this.zzWk5 = secureRandom;
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                if (dHParameterSpec instanceof zzYN4) {
                    this.zzVSI = new zzZ1M.zzQ(new zzZ38(dHParameterSpec.getP(), ((zzYN4) dHParameterSpec).getQ(), dHParameterSpec.getG(), dHParameterSpec.getL()));
                } else {
                    this.zzVSI = new zzZ1M.zzQ(new zzZ38(dHParameterSpec.getP(), null, dHParameterSpec.getG(), dHParameterSpec.getL()));
                }
                try {
                    this.zzVSH = new zzZ1M.zzP(this.zzVSI, secureRandom);
                    this.zzW9m = true;
                    return;
                } catch (zzZ0H e) {
                    throw new InvalidAlgorithmParameterException(e.getMessage(), e);
                }
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzY extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DHPrivateKeySpec ? new zzYOU(zzZ1M.zzWjd, (DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof DHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            try {
                return new zzYOT(zzZ1M.zzWjd, (DHPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("invalid KeySpec: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
                DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
                return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
            }
            if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYOT((zzZ3Y) zzYOV.zzVWs.zzY(zzZ1M.zzWjd, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOU((zzZ3Z) zzYOV.zzVWr.zzZ(zzZ1M.zzWjd, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYOT(new zzZ3Y(zzZ1M.zzWjd, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOU(new zzZ3Z(zzZ1M.zzWjd, zzz94));
        }
    }

    public static class zzZ extends zzYQ0 {
        public zzZ(String str) {
            super(str);
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "DH Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ9G zzz9gZzXR = zzZ9G.zzXR(bArr);
            if (zzz9gZzXR.zzXJm() == null) {
                this.zzVUy = new zzYN4(zzz9gZzXR.getP(), zzz9gZzXR.getG());
            } else {
                this.zzVUy = new zzYN4(zzz9gZzXR.getP(), zzz9gZzXR.getG(), zzz9gZzXR.zzXJm().intValue());
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZ9G(this.zzVUy.getP(), this.zzVUy.getG(), this.zzVUy.getL()).zzXL0().getEncoded("DER");
        }
    }

    static {
        HashMap map = new HashMap();
        zzVSQ = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
        zzVWs = new zzYNG<zzZ3Y>() { // from class: com.aspose.words.internal.zzYOV.1
            private static zzZ3Y zzZ(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                if (publicKey instanceof DHPublicKey) {
                    return publicKey instanceof zzYOT ? ((zzYOT) publicKey).zzXAY() : new zzYOT(zzz5w, (DHPublicKey) publicKey).zzXAY();
                }
                try {
                    return new zzZ3Y(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify DH public key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYNG
            public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                return zzZ(zzz5w, publicKey);
            }
        };
        zzVWr = new zzYP5<zzZ3Z>() { // from class: com.aspose.words.internal.zzYOV.12
            private static zzZ3Z zzY(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                if (privateKey instanceof DHPrivateKey) {
                    return privateKey instanceof zzYOU ? ((zzYOU) privateKey).zzXAZ() : new zzYOU(zzz5w, (DHPrivateKey) privateKey).zzXAZ();
                }
                try {
                    return new zzZ3Z(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify DH private key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYP5
            public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                return zzY(zzz5w, privateKey);
            }
        };
        zzVSP = new zzZ1M.zzX();
        zzVSO = new zzZ1M.zzW();
        zzVSN = new zzZ1M.zzO();
        zzVSM = new zzYP7() { // from class: com.aspose.words.internal.zzYOV.14
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                try {
                    if (!(algorithmParameterSpec instanceof zzYME)) {
                        throw new InvalidAlgorithmParameterException("MQV can only take an MQVParameterSpec");
                    }
                    zzYME zzyme = (zzYME) algorithmParameterSpec;
                    if (zzyme.zzXA7() != null) {
                        zzZ1P zzz1p = zzZ1M.zzWjd;
                        zzYNG<zzZ3Y> zzyng = zzYOV.zzVWs;
                        zzZ1M.zzM zzm = zzZ1M.zzWid;
                        return zzZ1M.zzM.zzY((zzZ3Y) zzyng.zzY(zzm.zzXF4(), zzyme.zzXA7()), (zzZ3Z) zzYOV.zzVWr.zzZ(zzm.zzXF4(), zzyme.zzXA8()), (zzZ3Y) zzyng.zzY(zzm.zzXF4(), zzyme.zzXA6()));
                    }
                    zzZ1P zzz1p2 = zzZ1M.zzWjd;
                    zzYP5<zzZ3Z> zzyp5 = zzYOV.zzVWr;
                    zzZ1M.zzM zzm2 = zzZ1M.zzWid;
                    return zzZ1M.zzM.zzY((zzZ3Z) zzyp5.zzZ(zzm2.zzXF4(), zzyme.zzXA8()), (zzZ3Y) zzYOV.zzVWs.zzY(zzm2.zzXF4(), zzyme.zzXA6()));
                } catch (InvalidKeyException e) {
                    throw new InvalidAlgorithmParameterException("Unable to convert keys in MQVParameterSpec: " + e.getMessage(), e);
                }
            }
        };
        zzVSL = new zzYP7() { // from class: com.aspose.words.internal.zzYOV.15
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                try {
                    if (!(algorithmParameterSpec instanceof zzYN1)) {
                        throw new InvalidAlgorithmParameterException("DHU can only take an DHUParameterSpec");
                    }
                    zzYN1 zzyn1 = (zzYN1) algorithmParameterSpec;
                    if (zzyn1.zzXA7() != null) {
                        zzZ1P zzz1p = zzZ1M.zzWjd;
                        zzYNG<zzZ3Y> zzyng = zzYOV.zzVWs;
                        zzZ1M.zzU zzu = zzZ1M.zzWic;
                        return zzZ1M.zzU.zzZ((zzZ3Y) zzyng.zzY(zzu.zzXF4(), zzyn1.zzXA7()), (zzZ3Z) zzYOV.zzVWr.zzZ(zzu.zzXF4(), zzyn1.zzXA8()), (zzZ3Y) zzyng.zzY(zzu.zzXF4(), zzyn1.zzXA6()));
                    }
                    zzZ1P zzz1p2 = zzZ1M.zzWjd;
                    zzYP5<zzZ3Z> zzyp5 = zzYOV.zzVWr;
                    zzZ1M.zzU zzu2 = zzZ1M.zzWic;
                    return zzZ1M.zzU.zzZ((zzZ3Z) zzyp5.zzZ(zzu2.zzXF4(), zzyn1.zzXA8()), (zzZ3Y) zzYOV.zzVWs.zzY(zzu2.zzXF4(), zzyn1.zzXA6()));
                } catch (InvalidKeyException e) {
                    throw new InvalidAlgorithmParameterException("Unable to convert keys in MQVParameterSpec: " + e.getMessage(), e);
                }
            }
        };
        zzVWq = new zzYP7() { // from class: com.aspose.words.internal.zzYOV.16
            @Override // com.aspose.words.internal.zzYP7
            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof zzYMA)) {
                    return zzZ1M.zzWie;
                }
                throw new InvalidAlgorithmParameterException("DH can only take a UserKeyingMaterialSpec");
            }
        };
    }

    private void zzU(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("MQVWITH", str, "CKDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQV", str, "CKDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSN, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVSM, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    private void zzV(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("DHUWITH", str, "CKDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHU", str, "CKDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSO, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVSL, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    private void zzW(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("DHWITH", str, "CKDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DH", str, "CKDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSP, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVWq, zzZ1D.zzWgw.zzY(zzz));
            }
        });
    }

    private void zzX(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("MQVWITH", str, "KDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQV", str, "KDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSN, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVSM, zzZ1D.zzWgx.zzY(zzz));
            }
        });
    }

    private void zzY(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("DHUWITH", str, "KDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHU", str, "KDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSO, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVSL, zzZ1D.zzWgx.zzY(zzz));
            }
        });
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        Map<String, String> map = zzVSQ;
        zzyq8.zzZ("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi", map, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.MQV", "DH");
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.DHU", "DH");
        zzyq8.zzZ("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi", map, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(new zzZ1M.zzX(), zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVWq);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        zzyq8.zzZ("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        zzyq8.zzXp("Alg.Alias.KeyFactory.MQV", "DH");
        zzY zzy = new zzY();
        zzYQP.zzZ(zzyq8, zzZ6W.zzWnw, "DH", zzy);
        zzYQP.zzZ(zzyq8, zzZ96.zzWyk, "DH", zzy);
        zzyq8.zzZ("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ("DH");
            }
        });
        zzyq8.zzXp("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        zzyq8.zzZ("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ1(zzyq8, "DH");
            }
        });
        zzyq8.zzXp("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        zzyq8.zzZ("AlgorithmParameters.MQV", "org.bouncycastle.jcajce.provider.asymmetric.dh.MQVAlgorithmParametersSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW();
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator.MQV", "org.bouncycastle.jcajce.provider.asymmetric.dh.MQVAlgorithmParameterGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ1(zzyq8, "MQV");
            }
        });
        zzyq8.zzZ("AlgorithmParameters.DHU", "org.bouncycastle.jcajce.provider.asymmetric.dh.DHUAlgorithmParametersSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ("DHU");
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator.DHU", "org.bouncycastle.jcajce.provider.asymmetric.dh.DHUAlgorithmParameterGeneratorSpi", new zzYPS() { // from class: com.aspose.words.internal.zzYOV.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ1(zzyq8, "MQV");
            }
        });
        zzZ1D.zzZ zzz = zzZ1D.zzZ.SHA1;
        zzZ(zzyq8, "SHA1", zzz);
        zzZ1D.zzZ zzz2 = zzZ1D.zzZ.SHA224;
        zzZ(zzyq8, "SHA224", zzz2);
        zzZ1D.zzZ zzz3 = zzZ1D.zzZ.SHA256;
        zzZ(zzyq8, "SHA256", zzz3);
        zzZ1D.zzZ zzz4 = zzZ1D.zzZ.SHA384;
        zzZ(zzyq8, "SHA384", zzz4);
        zzZ1D.zzZ zzz5 = zzZ1D.zzZ.SHA512;
        zzZ(zzyq8, "SHA512", zzz5);
        zzZ1D.zzZ zzz6 = zzZ1D.zzZ.SHA512_224;
        zzZ(zzyq8, "SHA512(224)", zzz6);
        zzZ1D.zzZ zzz7 = zzZ1D.zzZ.SHA512_256;
        zzZ(zzyq8, "SHA512(256)", zzz7);
        zzY(zzyq8, "SHA1", zzz);
        zzY(zzyq8, "SHA224", zzz2);
        zzY(zzyq8, "SHA256", zzz3);
        zzY(zzyq8, "SHA384", zzz4);
        zzY(zzyq8, "SHA512", zzz5);
        zzY(zzyq8, "SHA512(224)", zzz6);
        zzY(zzyq8, "SHA512(256)", zzz7);
        zzX(zzyq8, "SHA1", zzz);
        zzX(zzyq8, "SHA224", zzz2);
        zzX(zzyq8, "SHA256", zzz3);
        zzX(zzyq8, "SHA384", zzz4);
        zzX(zzyq8, "SHA512", zzz5);
        zzX(zzyq8, "SHA512(224)", zzz6);
        zzX(zzyq8, "SHA512(256)", zzz7);
        zzW(zzyq8, "SHA1", zzz);
        zzW(zzyq8, "SHA224", zzz2);
        zzW(zzyq8, "SHA256", zzz3);
        zzW(zzyq8, "SHA384", zzz4);
        zzW(zzyq8, "SHA512", zzz5);
        zzW(zzyq8, "SHA512(224)", zzz6);
        zzW(zzyq8, "SHA512(256)", zzz7);
        zzZ1D.zzZ zzz8 = zzZ1D.zzZ.SHA3_224;
        zzW(zzyq8, "SHA3-224", zzz8);
        zzZ1D.zzZ zzz9 = zzZ1D.zzZ.SHA3_256;
        zzW(zzyq8, "SHA3-256", zzz9);
        zzZ1D.zzZ zzz10 = zzZ1D.zzZ.SHA3_384;
        zzW(zzyq8, "SHA3-384", zzz10);
        zzZ1D.zzZ zzz11 = zzZ1D.zzZ.SHA3_512;
        zzW(zzyq8, "SHA3-512", zzz11);
        zzV(zzyq8, "SHA1", zzz);
        zzV(zzyq8, "SHA224", zzz2);
        zzV(zzyq8, "SHA256", zzz3);
        zzV(zzyq8, "SHA384", zzz4);
        zzV(zzyq8, "SHA512", zzz5);
        zzV(zzyq8, "SHA512(224)", zzz6);
        zzV(zzyq8, "SHA512(256)", zzz7);
        zzV(zzyq8, "SHA3-224", zzz8);
        zzV(zzyq8, "SHA3-256", zzz9);
        zzV(zzyq8, "SHA3-384", zzz10);
        zzV(zzyq8, "SHA3-512", zzz11);
        zzU(zzyq8, "SHA1", zzz);
        zzU(zzyq8, "SHA224", zzz2);
        zzU(zzyq8, "SHA256", zzz3);
        zzU(zzyq8, "SHA384", zzz4);
        zzU(zzyq8, "SHA512", zzz5);
        zzU(zzyq8, "SHA512(224)", zzz6);
        zzU(zzyq8, "SHA512(256)", zzz7);
    }

    private void zzZ(zzYQ8 zzyq8, String str, final zzZ1D.zzZ zzz) {
        zzYQP.zzZ(zzyq8, C20593OooO0Oo.OooO0O0("DHWITH", str, "KDF"), C20593OooO0Oo.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DH", str, "KDF"), zzVSQ, new zzYPS() { // from class: com.aspose.words.internal.zzYOV.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(zzYOV.zzVSP, zzYOV.zzVWs, zzYOV.zzVWr, zzYOV.zzVWq, zzZ1D.zzWgx.zzY(zzz));
            }
        });
    }
}
