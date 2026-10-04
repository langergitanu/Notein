package com.aspose.words.internal;

import com.aspose.words.internal.zzYYT;
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
final class zzYOP extends zzYQP {
    private static final zzYNG<zzZ3S> zzVWs = new zzYNG<zzZ3S>() { // from class: com.aspose.words.internal.zzYOP.1
        private static zzZ3S zzW(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof zzYR0) {
                return publicKey instanceof zzYON ? ((zzYON) publicKey).zzXAN() : new zzYON(zzz5w, (zzYR0) publicKey).zzXAN();
            }
            try {
                return new zzZ3S(zzz5w, zzZ7D.zzWZ(zzYNC.zzZ(publicKey)));
            } catch (InvalidKeyException e) {
                throw e;
            } catch (Exception e2) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Cannot identify DSTU4145 public key: ")), e2);
            }
        }

        @Override // com.aspose.words.internal.zzYNG
        public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
            return zzW(zzz5w, publicKey);
        }
    };
    private static final zzYP5<zzZ3T> zzVWr = new zzYP5<zzZ3T>() { // from class: com.aspose.words.internal.zzYOP.2
        private static zzZ3T zzW(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof zzYR1) {
                return privateKey instanceof zzYOO ? ((zzYOO) privateKey).zzXAO() : new zzYOO(zzz5w, (zzYR1) privateKey).zzXAO();
            }
            try {
                return new zzZ3T(zzz5w, zzZ94.zzXG(zzYNC.zzZ(privateKey)));
            } catch (InvalidKeyException e) {
                throw e;
            } catch (Exception e2) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Cannot identify DSTU4145 private key: ")), e2);
            }
        }

        @Override // com.aspose.words.internal.zzYP5
        public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
            return zzW(zzz5w, privateKey);
        }
    };

    public static class zzY extends KeyPairGenerator {
        private zzZ34 zzVSs;
        private zzZ5U zzVSw;
        private final zzYQ8 zzVWk;
        private boolean zzW9m;

        public zzY(zzYQ8 zzyq8) {
            super("DSTU4145");
            this.zzW9m = false;
            this.zzVWk = zzyq8;
        }

        private void zzZ(zzYMY zzymy, SecureRandom secureRandom) {
            zzZ34 zzz34ZzZ = zzYPX.zzZ(zzymy);
            this.zzVSs = zzz34ZzZ;
            this.zzVSw = new zzYYT.zzY(new zzYYT.zzZ(zzz34ZzZ), secureRandom);
            this.zzW9m = true;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                throw new IllegalStateException("DSTU Key Pair Generator not initialised");
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            return new KeyPair(new zzYON((zzZ3S) zzz3gZzXH4.zzXGw()), new zzYOO((zzZ3T) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            throw new InvalidParameterException("DSTU4145 KeyPairGenerator needs to be initialized with a DSTU4145ParameterSpec");
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVWk.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof zzYMY) {
                zzZ((zzYMY) algorithmParameterSpec, secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
        }
    }

    public static class zzZ extends zzYQG {
        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYMX ? new zzYOO(zzYYT.zzWb4, (zzYMX) keySpec) : super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof zzYMW ? new zzYON(zzYYT.zzWb4, (zzYMW) keySpec) : super.engineGeneratePublic(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("null spec is invalid");
            }
            if (cls.isAssignableFrom(zzYMW.class) && (key instanceof zzYR0)) {
                zzYR0 zzyr0 = (zzYR0) key;
                return new zzYMW(zzyr0.getW(), zzyr0.zzXBH());
            }
            if (!cls.isAssignableFrom(zzYMX.class) || !(key instanceof zzYR1)) {
                return super.engineGetKeySpec(key, cls);
            }
            zzYR1 zzyr1 = (zzYR1) key;
            return new zzYMX(zzyr1.getS(), zzyr1.zzXBH());
        }

        @Override // java.security.KeyFactorySpi
        public final Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                return new zzYON((zzZ3S) zzYOP.zzVWs.zzY(zzYYT.zzWb4, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                return new zzYOO((zzZ3T) zzYOP.zzVWr.zzZ(zzYYT.zzWb4, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            return new zzYON(new zzZ3S(zzYYT.zzWb4, zzz7d));
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            return new zzYOO(new zzZ3T(zzYYT.zzWb4, zzz94));
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu4145.KeyFactorySpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOP.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
        zzyq8.zzXp("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
        zzyq8.zzZ("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu4145.KeyPairGeneratorSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOP.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8);
            }
        }));
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
        zzyq8.zzXp("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
        zzZDA zzzda = zzZ8G.zzWta;
        zzYQP.zzZ(zzyq8, zzzda, "DSTU4145", new zzZ());
        zzZDA zzzda2 = zzZ8G.zzWt9;
        zzYQP.zzZ(zzyq8, zzzda2, "DSTU4145", new zzZ());
        zzyq8.zzZ("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu4145.SignatureSpi", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOP.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYYT.zzW(), zzYOP.zzVWs, zzYOP.zzVWr, zzYYT.zzW8t);
            }
        }));
        zzyq8.zzXp("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
        zzyq8.zzXp("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
        zzYQP.zzZ(zzyq8, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu4145.SignatureSpiLe", zzzda, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOP.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYYT.zzX(), zzYOP.zzVWs, zzYOP.zzVWr, zzYYT.zzW8t);
            }
        }));
        zzyq8.zzXp("Alg.Alias.Signature.DSTU4145LE", "GOST3411WITHDSTU4145LE");
        zzYQP.zzZ(zzyq8, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu4145.SignatureSpiBe", zzzda2, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOP.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYYT.zzW(), zzYOP.zzVWs, zzYOP.zzVWr, zzYYT.zzW8t);
            }
        }));
    }
}
