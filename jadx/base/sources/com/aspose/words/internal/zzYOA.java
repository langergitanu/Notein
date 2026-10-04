package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.internal.zzYXT;
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
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOA extends zzYQP {
    private static final zzYNG<zzZ3H> zzVWs = new zzYNG<zzZ3H>() { // from class: com.aspose.words.internal.zzYOA.1
        private static zzZ3H zzT(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof zzYQU) {
                return publicKey instanceof zzYO8 ? ((zzYO8) publicKey).zzXAC() : new zzYO8(zzz5w, (zzYQU) publicKey).zzXAC();
            }
            try {
                return new zzZ3H(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify GOST3410 public key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYNG
        public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            return zzT(zzz5w, publicKey);
        }
    };
    private static final zzYP5<zzZ3I> zzVWr = new zzYP5<zzZ3I>() { // from class: com.aspose.words.internal.zzYOA.2
        private static zzZ3I zzT(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof zzYQV) {
                return privateKey instanceof zzYO9 ? ((zzYO9) privateKey).zzXAD() : new zzYO9(zzz5w, (zzYQV) privateKey).zzXAD();
            }
            try {
                return new zzZ3I(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify GOST3410 private key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYP5
        public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            return zzT(zzz5w, privateKey);
        }
    };

    public static class zzY extends KeyPairGenerator {
        private zzZ2Y<zzZ2Z> zzVSg;
        private zzZ5U zzVSw;
        private final zzYQ8 zzVWk;
        private boolean zzW9m;
        private SecureRandom zzWk5;

        public zzY(zzYQ8 zzyq8) {
            super("GOST3410");
            this.zzW9m = false;
            this.zzVWk = zzyq8;
            this.zzWk5 = zzyq8.zzXBp();
        }

        private void zzZ(zzYMM zzymm, SecureRandom secureRandom) {
            if (!(zzymm.zzXA3() instanceof zzYMN)) {
                throw new InvalidParameterException("GOST3410 KeyPairGenerator needs to be initialized with a GOST3410ParameterSpec<GOST3410DomainParameterSpec>");
            }
            zzZ2Y<zzZ2Z> zzz2yZzZ = zzYPR.zzZ(zzymm);
            this.zzVSg = zzz2yZzZ;
            this.zzVSw = new zzYXT.zzY(new zzYXT.zzZ(zzz2yZzZ), secureRandom);
            this.zzW9m = true;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                zzZ(new zzYMM(new zzZ2Y(zzZAE.zzWEM, zzZAE.zzWF1)), this.zzWk5);
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYO8((zzZ3H) zzz3gZzXH4.zzXGw()), new zzYO9((zzZ3I) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            throw new InvalidParameterException("GOST3410 KeyPairGenerator needs to be initialized with a GOST3410ParameterSpec");
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof zzYMM) {
                zzZ((zzYMM) algorithmParameterSpec, secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzZ extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYML ? new zzYO9(zzYXT.zzWb4, (zzYML) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYMK ? new zzYO8(zzYXT.zzWb4, (zzYMK) keySpec) : super.engineGeneratePublic(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(zzYMK.class) && (key instanceof zzYQU)) {
                zzYQU zzyqu = (zzYQU) key;
                return new zzYMK(zzyqu.getY(), zzyqu.zzXBG());
            }
            if (!cls.isAssignableFrom(zzYML.class) || !(key instanceof zzYQV)) {
                return super.engineGetKeySpec(key, cls);
            }
            zzYQV zzyqv = (zzYQV) key;
            return new zzYML(zzyqv.getX(), zzyqv.zzXBG());
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYO8((zzZ3H) zzYOA.zzVWs.zzY(zzYXT.zzWb4, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYO9((zzZ3I) zzYOA.zzVWr.zzZ(zzYXT.zzWb4, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYO8(new zzZ3H(zzYXT.zzWb4, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYO9(new zzZ3I(zzYXT.zzWb4, zzz94));
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyPairGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOA.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8);
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
        zzyq8.zzZ("KeyFactory.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOA.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
        zzyq8.zzXp("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
        zzYQP.zzZ(zzyq8, zzZAE.zzWER, "GOST3410", new zzZ());
        zzyq8.zzZ("Signature.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.SignatureSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOA.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYXT.zzX(), zzYOA.zzVWs, zzYOA.zzVWr, zzYXT.zzW6j);
            }
        }));
        zzyq8.zzZ(RequestParameters.SIGNATURE, "GOST3410", "GOST3411WITHGOST3410", "GOST-3410", "GOST-3410-94");
        zzyq8.zzZ(RequestParameters.SIGNATURE, "GOST3410", zzZAE.zzWEP);
    }
}
