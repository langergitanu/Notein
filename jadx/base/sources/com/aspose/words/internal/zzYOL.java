package com.aspose.words.internal;

import com.aspose.words.internal.zzYYI;
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
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOL extends zzYQP {
    private static final zzYNG<zzZ3Q> zzVWs = new zzYNG<zzZ3Q>() { // from class: com.aspose.words.internal.zzYOL.1
        private static zzZ3Q zzU(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof zzYQY) {
                return publicKey instanceof zzYOJ ? ((zzYOJ) publicKey).zzXAJ() : new zzYOJ(zzz5w, (zzYQY) publicKey).zzXAJ();
            }
            try {
                return new zzZ3Q(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify ECGOST3410 public key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYNG
        public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            return zzU(zzz5w, publicKey);
        }
    };
    private static final zzYP5<zzZ3R> zzVWr = new zzYP5<zzZ3R>() { // from class: com.aspose.words.internal.zzYOL.2
        private static zzZ3R zzU(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof zzYQZ) {
                return privateKey instanceof zzYOK ? ((zzYOK) privateKey).zzXAK() : new zzYOK(zzz5w, (zzYQZ) privateKey).zzXAK();
            }
            try {
                return new zzZ3R(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
            } catch (Exception e) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify ECGOST3410 private key: ")), e);
            }
        }

        @Override // com.aspose.words.internal.zzYP5
        public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            return zzU(zzz5w, privateKey);
        }
    };

    public static class zzY extends KeyPairGenerator {
        private zzZ2Y<zzZ33> zzVSg;
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
            if (!(zzymm.zzXA3() instanceof zzYMV)) {
                throw new InvalidParameterException("GOST3410 KeyPairGenerator needs to be initialized with a GOST3410ParameterSpec<ECDomainParameterSpec>");
            }
            zzZ2Y<zzZ33> zzz2yZzY = zzYPR.zzY(zzymm);
            this.zzVSg = zzz2yZzY;
            this.zzVSw = new zzYYI.zzY(new zzYYI.zzZ(zzz2yZzY), secureRandom);
            this.zzW9m = true;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                zzZ(new zzYMM(new zzZ2Y(zzZAE.zzWEF, zzZAE.zzWF1)), this.zzWk5);
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYOJ((zzZ3Q) zzz3gZzXH4.zzXGw()), new zzYOK((zzZ3R) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            throw new InvalidParameterException("ECGOST3410 KeyPairGenerator needs to be initialized with a GOST3410ParameterSpec");
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            zzYMM zzymm;
            if (!(algorithmParameterSpec instanceof zzYMM) && !(algorithmParameterSpec instanceof ECGenParameterSpec)) {
                throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                zzymm = new zzYMM(new zzZ2Y(zzZAD.zzwM(((ECGenParameterSpec) algorithmParameterSpec).getName())));
            } else {
                zzymm = (zzYMM) algorithmParameterSpec;
            }
            zzZ(zzymm, secureRandom);
        }
    }

    public static class zzZ extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYMU ? new zzYOK(zzYYI.zzWb4, (zzYMU) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYMT ? new zzYOJ(zzYYI.zzWb4, (zzYMT) keySpec) : super.engineGeneratePublic(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(zzYMT.class) && (key instanceof zzYQY)) {
                zzYQY zzyqy = (zzYQY) key;
                if (zzyqy.zzXBG() != null) {
                    return new zzYMT(zzyqy.getW(), zzyqy.zzXBG());
                }
            } else if (cls.isAssignableFrom(zzYMU.class) && (key instanceof zzYQZ)) {
                zzYQZ zzyqz = (zzYQZ) key;
                if (zzyqz.zzXBG() != null) {
                    return new zzYMU(zzyqz.getS(), zzyqz.zzXBG());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYOJ((zzZ3Q) zzYOL.zzVWs.zzY(zzYYI.zzWb4, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOK((zzZ3R) zzYOL.zzVWr.zzZ(zzYYI.zzWb4, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYOJ(new zzZ3Q(zzYYI.zzWb4, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOK(new zzZ3R(zzYYI.zzWb4, zzz94));
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOL.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
        zzyq8.zzXp("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
        zzyq8.zzZ("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOL.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8);
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
        zzYQP.zzZ(zzyq8, zzZAE.zzWEQ, "ECGOST3410", new zzZ());
        zzYQP.zzZ(zzyq8, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.ECSignatureSpi", zzZAE.zzWEO, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOL.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYYI.zzX(), zzYOL.zzVWs, zzYOL.zzVWr, zzYYI.zzW83);
            }
        }));
        zzyq8.zzXp("Alg.Alias.Signature.ECGOST3410", "GOST3411WITHECGOST3410");
        zzyq8.zzXp("Alg.Alias.Signature.ECGOST-3410", "GOST3411WITHECGOST3410");
        zzyq8.zzXp("Alg.Alias.Signature.GOST-3410-2001", "GOST3411WITHECGOST3410");
    }
}
