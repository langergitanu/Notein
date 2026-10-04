package com.aspose.words.internal;

import com.aspose.words.internal.zzYQA;
import com.aspose.words.internal.zzYY4;
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
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOD extends zzYQP {
    private static final Map<String, String> zzVSQ;

    public static class zzX extends KeyPairGenerator {
        zzYY4.zzY zzVRT;
        zzYY4.zzZ zzVRU;
        private final zzYQ8 zzVS0;
        boolean zzW9m;
        int zzWk4;
        SecureRandom zzWk5;

        public zzX(zzYQ8 zzyq8) {
            super("ElGamal");
            this.zzWk4 = 2048;
            this.zzW9m = false;
            this.zzVS0 = zzyq8;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                zzZ38 zzz38 = (zzZ38) zzZ5L.zzZ(zzZ5L.zzZ.zzWlG, this.zzWk4);
                if (zzz38 != null) {
                    this.zzVRU = new zzYY4.zzZ(zzz38);
                } else {
                    this.zzVRU = new zzYY4.zzZ(new zzZ1M.zzR(new zzZ1M.zzS(this.zzWk4), this.zzWk5).zzXFH());
                }
                this.zzVRT = new zzYY4.zzY(this.zzVRU, this.zzWk5);
                this.zzW9m = true;
            }
            zzZ3G<zzZ3Y, zzZ3Z> zzz3gZzXH4 = this.zzVRT.zzXH4();
            return new KeyPair(new zzYOT((zzZ3Y) zzz3gZzXH4.zzXGw()), new zzYOU((zzZ3Z) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVS0.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            this.zzWk4 = i;
            this.zzWk5 = secureRandom;
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVS0.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                zzYY4.zzZ zzz = new zzYY4.zzZ(new zzZ38(dHParameterSpec.getP(), null, dHParameterSpec.getG(), dHParameterSpec.getL()));
                this.zzVRU = zzz;
                this.zzVRT = new zzYY4.zzY(zzz, secureRandom);
                this.zzW9m = true;
                return;
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzY extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DHPrivateKeySpec ? new zzYOU(zzYY4.zzWb4, (DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DHPublicKeySpec ? new zzYOT(zzYY4.zzWb4, (DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
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
                return new zzYOT((zzZ3Y) zzYOV.zzVWs.zzY(zzYY4.zzWb4, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOU((zzZ3Z) zzYOV.zzVWr.zzZ(zzYY4.zzWb4, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYOT(new zzZ3Y(zzYY4.zzWb4, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOU(new zzZ3Z(zzYY4.zzWb4, zzz94));
        }
    }

    public static class zzZ extends zzYQ0 {
        public zzZ() {
            super("ELGAMAL");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "ElGamal Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZ9L zzz9lZzXV = zzZ9L.zzXV(bArr);
            this.zzVUy = new zzYN4(zzz9lZzXV.getP(), zzz9lZzXV.getG());
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZ9L(this.zzVUy.getP(), this.zzVUy.getG()).getEncoded("DER");
        }
    }

    static {
        HashMap map = new HashMap();
        zzVSQ = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOD.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ1(zzyq8, "ELGAMAL");
            }
        }));
        zzyq8.zzZ("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOD.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzZ("Cipher.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi", zzVSQ, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOD.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQA.zzY(zzyq8, zzYY4.zzWb4, zzYY4.zzW7f.zzXGV(), zzYY4.zzW7g.zzXGV()).zzZ(new zzYY4.zzV(), new zzYY4.zzX()).zzZ(zzYOV.zzVWs).zzZ(zzYOV.zzVWr).zzZ(new zzYP6() { // from class: com.aspose.words.internal.zzYOD.3.1
                    @Override // com.aspose.words.internal.zzYP6
                    public final zzYP7 zzW(final zzZ4M zzz4m) {
                        return new zzYP7() { // from class: com.aspose.words.internal.zzYOD.3.1.1
                            @Override // com.aspose.words.internal.zzYP7
                            public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                                zzZ5W zzz5wZzXGV = zzz4m.zzXGV();
                                zzYY4.zzW zzw = zzYY4.zzW7g;
                                if (zzz5wZzXGV != zzw.zzXGV()) {
                                    zzZ5W zzz5wZzXGV2 = zzz4m.zzXGV();
                                    zzYY4.zzU zzu = zzYY4.zzW7f;
                                    return zzz5wZzXGV2 == zzu.zzXGV() ? zzu : zzYY4.zzW7h;
                                }
                                if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                                    throw new InvalidAlgorithmParameterException("OAEP can only accept OAEPParameterSpec");
                                }
                                OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                                return zzw.zzX(zzYNC.zzVOz.get(oAEPParameterSpec.getDigestAlgorithm())).zzW(zzYNC.zzVOz.get(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())).zzWD(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                            }
                        };
                    }
                }).zzXBv();
            }
        }));
        zzZDA zzzda = zzZ9K.zzWyT;
        zzyq8.zzZ("Cipher", "ELGAMAL", zzzda);
        zzyq8.zzZ("KeyFactory.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOD.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOD.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8);
            }
        }));
        zzYQP.zzZ(zzyq8, zzzda, "ELGAMAL", new zzY());
        zzYQP.zzZ(zzyq8, zzzda, "ELGAMAL");
    }
}
