package com.aspose.words.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.words.internal.zzYY5;
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
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOE extends zzYQP {
    private static final zzYP5<zzZ3B> zzVS4;
    private static final zzYNG<zzZ3A> zzVS5;
    private static final zzYP5<zzZ3L> zzVS6;
    private static final zzYNG<zzZ3K> zzVS7;
    private static final Map<String, String> zzVS8;
    private static final Map<String, String> zzVS9;

    public static class zzX implements zzYP7 {
        private final zzYY5.zzW zzVRY;

        public zzX(zzYY5.zzW zzw) {
            this.zzVRY = zzw;
        }

        @Override // com.aspose.words.internal.zzYP7
        public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null) {
                return this.zzVRY;
            }
            throw new InvalidAlgorithmParameterException("unable to take parameter specs");
        }
    }

    public static class zzY extends KeyPairGenerator {
        private zzYY5.zzW zzVRY;
        private final boolean zzVRZ;
        private final zzYQ8 zzVS0;
        private zzZ5U zzVSw;
        private boolean zzW9m;
        private SecureRandom zzWk5;

        public zzY(zzYQ8 zzyq8, boolean z, zzYY5.zzW zzw) {
            super(zzw != null ? zzw.zzXGV().getName() : z ? "XDH" : "EdDSA");
            this.zzW9m = false;
            this.zzVRY = zzw;
            this.zzVS0 = zzyq8;
            this.zzVRZ = z;
        }

        private zzYY5.zzW zzwn(String str) throws InvalidAlgorithmParameterException {
            if (this.zzVRZ) {
                if (str.equalsIgnoreCase("X448") || str.equals(zzZA7.zzWDU.getId())) {
                    return zzYY5.zzW7G;
                }
                if (str.equalsIgnoreCase("X25519") || str.equals(zzZA7.zzWDV.getId())) {
                    return zzYY5.zzW7F;
                }
                throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(str));
            }
            if (str.equalsIgnoreCase("Ed448") || str.equals(zzZA7.zzWDS.getId())) {
                return zzYY5.zzW7I;
            }
            if (str.equalsIgnoreCase("Ed25519") || str.equals(zzZA7.zzWDT.getId())) {
                return zzYY5.zzW7H;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(str));
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final KeyPair generateKeyPair() {
            if (!this.zzW9m) {
                if (this.zzVRY == null) {
                    throw new IllegalStateException("generator not correctly initialized");
                }
                if (this.zzWk5 == null) {
                    this.zzWk5 = this.zzVS0.zzXBp();
                }
                if (this.zzVRZ) {
                    this.zzVSw = new zzYY5.zzT(this.zzVRY, this.zzWk5);
                } else {
                    this.zzVSw = new zzYY5.zzY(this.zzVRY, this.zzWk5);
                }
                this.zzW9m = true;
            }
            zzZ3G zzz3gZzXH4 = this.zzVSw.zzXH4();
            if (this.zzVRZ) {
                return new KeyPair(new zzYNH((zzZ3A) zzz3gZzXH4.zzXGw()), new zzYNI((zzZ3B) zzz3gZzXH4.zzXGv()));
            }
            return new KeyPair(new zzYOF((zzZ3K) zzz3gZzXH4.zzXGw()), new zzYOG((zzZ3L) zzz3gZzXH4.zzXGv()));
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(int i) {
            initialize(i, this.zzVS0.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(int i, SecureRandom secureRandom) {
            this.zzWk5 = secureRandom;
            if (i == 255 || i == 256) {
                if (this.zzVRZ) {
                    zzYY5.zzW zzw = this.zzVRY;
                    if (zzw != null && zzw != zzYY5.zzW7F) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                    this.zzVRY = zzYY5.zzW7F;
                    return;
                }
                zzYY5.zzW zzw2 = this.zzVRY;
                if (zzw2 != null && zzw2 != zzYY5.zzW7H) {
                    throw new InvalidParameterException("key size not configurable");
                }
                this.zzVRY = zzYY5.zzW7H;
                return;
            }
            if (i != 448) {
                throw new InvalidParameterException("unknown key size.");
            }
            if (this.zzVRZ) {
                zzYY5.zzW zzw3 = this.zzVRY;
                if (zzw3 != null && zzw3 != zzYY5.zzW7G) {
                    throw new InvalidParameterException("key size not configurable");
                }
                this.zzVRY = zzYY5.zzW7G;
                return;
            }
            zzYY5.zzW zzw4 = this.zzVRY;
            if (zzw4 != null && zzw4 != zzYY5.zzW7I) {
                throw new InvalidParameterException("key size not configurable");
            }
            this.zzVRY = zzYY5.zzW7I;
        }

        @Override // java.security.KeyPairGenerator
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
            initialize(algorithmParameterSpec, this.zzVS0.zzXBp());
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public final void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                this.zzVRY = zzwn(((ECGenParameterSpec) algorithmParameterSpec).getName());
            } else {
                boolean z = this.zzVRZ;
                if (!z && (algorithmParameterSpec instanceof zzYMQ)) {
                    this.zzVRY = zzwn(((zzYMQ) algorithmParameterSpec).zzXGl());
                } else {
                    if (!z || !(algorithmParameterSpec instanceof zzYM8)) {
                        if (algorithmParameterSpec == null) {
                            throw new InvalidAlgorithmParameterException("parameterSpec cannot be null");
                        }
                        throw new InvalidAlgorithmParameterException("AlgorithmParameterSpec not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                    }
                    this.zzVRY = zzwn(((zzYM8) algorithmParameterSpec).zzXGl());
                }
            }
            this.zzWk5 = secureRandom;
        }
    }

    public static class zzZ extends zzYQG {
        private final int zzVS1;
        private final boolean zzVS2;
        String zzVWA;

        public static class zzU extends zzZ {
            public zzU() {
                super("XDH", true, 0);
            }
        }

        public static class zzV extends zzZ {
            public zzV() {
                super("X448", true, 111);
            }
        }

        public static class zzW extends zzZ {
            public zzW() {
                super("X25519", true, 110);
            }
        }

        public static class zzX extends zzZ {
            public zzX() {
                super("EdDSA", false, 0);
            }
        }

        public static class zzY extends zzZ {
            public zzY() {
                super("Ed448", false, 113);
            }
        }

        /* JADX INFO: renamed from: com.aspose.words.internal.zzYOE$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19090zzZ extends zzZ {
            public C19090zzZ() {
                super("Ed25519", false, 112);
            }
        }

        public zzZ(String str, boolean z, int i) {
            this.zzVWA = str;
            this.zzVS2 = z;
            this.zzVS1 = i;
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
            return super.engineGeneratePrivate(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof X509EncodedKeySpec) {
                byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
                int i = this.zzVS1;
                if (i == 0 || i == encoded[8]) {
                    switch (encoded[8]) {
                        case 110:
                            return new zzYNH(encoded);
                        case 111:
                            return new zzYNH(encoded);
                        case 112:
                            return new zzYOF(encoded);
                        case 113:
                            return new zzYOF(encoded);
                        default:
                            return super.engineGeneratePublic(keySpec);
                    }
                }
            }
            return super.engineGeneratePublic(keySpec);
        }

        @Override // com.aspose.words.internal.zzYQG, java.security.KeyFactorySpi
        public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
            if (cls != null) {
                return super.engineGetKeySpec(key, cls);
            }
            throw new InvalidKeySpecException("null spec is invalid");
        }

        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            if (key instanceof PublicKey) {
                if (this.zzVS2) {
                    return new zzYNH((zzZ3A) zzYOE.zzVS5.zzY(key.getAlgorithm().equals("X448") ? zzYY5.zzZ.zzW7t : zzYY5.zzZ.zzW7s, (PublicKey) key));
                }
                return new zzYOF((zzZ3K) zzYOE.zzVS7.zzY(key.getAlgorithm().equals("Ed448") ? zzYY5.zzZ.zzW7v : zzYY5.zzZ.zzW7u, (PublicKey) key));
            }
            if (key instanceof PrivateKey) {
                if (this.zzVS2) {
                    return new zzYNI((zzZ3B) zzYOE.zzVS4.zzZ(key.getAlgorithm().equals("X448") ? zzYY5.zzZ.zzW7t : zzYY5.zzZ.zzW7s, (PrivateKey) key));
                }
                return new zzYOG((zzZ3L) zzYOE.zzVS6.zzZ(key.getAlgorithm().equals("Ed448") ? zzYY5.zzZ.zzW7v : zzYY5.zzZ.zzW7u, (PrivateKey) key));
            }
            if (key != null) {
                throw new InvalidKeyException("Key type unrecognized: ".concat(key.getClass().getName()));
            }
            throw new InvalidKeyException("Key is null");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PublicKey zzV(zzZ7D zzz7d) throws IOException {
            zzZDA zzzdaZzXJk = zzz7d.zzXHJ().zzXJk();
            if (this.zzVS2) {
                int i = this.zzVS1;
                if ((i == 0 || i == 111) && zzzdaZzXJk.equals(zzZA7.zzWDU)) {
                    return new zzYNH(zzz7d.getEncoded());
                }
                int i2 = this.zzVS1;
                if ((i2 == 0 || i2 == 110) && zzzdaZzXJk.equals(zzZA7.zzWDV)) {
                    return new zzYNH(zzz7d.getEncoded());
                }
            } else {
                zzZDA zzzda = zzZA7.zzWDS;
                if (zzzdaZzXJk.equals(zzzda) || zzzdaZzXJk.equals(zzZA7.zzWDT)) {
                    int i3 = this.zzVS1;
                    if ((i3 == 0 || i3 == 113) && zzzdaZzXJk.equals(zzzda)) {
                        return new zzYOF(zzz7d.getEncoded());
                    }
                    int i4 = this.zzVS1;
                    if ((i4 == 0 || i4 == 112) && zzzdaZzXJk.equals(zzZA7.zzWDT)) {
                        return new zzYOF(zzz7d.getEncoded());
                    }
                }
            }
            throw new IOException("algorithm identifier " + zzzdaZzXJk + " in key not recognized");
        }

        @Override // com.aspose.words.internal.zzYQO
        public final PrivateKey zzW(zzZ94 zzz94) throws IOException {
            zzZDA zzzdaZzXJk = zzz94.zzXJ8().zzXJk();
            if (this.zzVS2) {
                int i = this.zzVS1;
                if ((i == 0 || i == 111) && zzzdaZzXJk.equals(zzZA7.zzWDU)) {
                    return new zzYNI(zzz94);
                }
                int i2 = this.zzVS1;
                if ((i2 == 0 || i2 == 110) && zzzdaZzXJk.equals(zzZA7.zzWDV)) {
                    return new zzYNI(zzz94);
                }
            } else {
                zzZDA zzzda = zzZA7.zzWDS;
                if (zzzdaZzXJk.equals(zzzda) || zzzdaZzXJk.equals(zzZA7.zzWDT)) {
                    int i3 = this.zzVS1;
                    if ((i3 == 0 || i3 == 113) && zzzdaZzXJk.equals(zzzda)) {
                        return new zzYOG(zzz94);
                    }
                    int i4 = this.zzVS1;
                    if ((i4 == 0 || i4 == 112) && zzzdaZzXJk.equals(zzZA7.zzWDT)) {
                        return new zzYOG(zzz94);
                    }
                }
            }
            throw new IOException("algorithm identifier " + zzzdaZzXJk + " in key not recognized");
        }
    }

    static {
        HashMap map = new HashMap();
        zzVS9 = map;
        HashMap map2 = new HashMap();
        zzVS8 = map2;
        map.put("SupportedKeyClasses", "org.bouncycastle.interfaces.EdDSAKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
        map2.put("SupportedKeyClasses", "org.bouncycastle.interfaces.XDHKey");
        map2.put("SupportedKeyFormats", "PKCS#8|X.509");
        zzVS7 = new zzYNG<zzZ3K>() { // from class: com.aspose.words.internal.zzYOE.1
            @Override // com.aspose.words.internal.zzYNG
            public final /* bridge */ /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                return zzY(publicKey);
            }

            private static zzZ3K zzY(PublicKey publicKey) throws InvalidKeyException {
                if (publicKey instanceof zzYOF) {
                    return ((zzYOF) publicKey).zzXAF();
                }
                try {
                    return new zzZ3K(zzYNC.zzZ(publicKey));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify EdDSA public key: ")), e);
                }
            }
        };
        zzVS6 = new zzYP5<zzZ3L>() { // from class: com.aspose.words.internal.zzYOE.12
            private static zzZ3L zzY(PrivateKey privateKey) throws InvalidKeyException {
                if (privateKey instanceof zzYOG) {
                    return ((zzYOG) privateKey).zzXAG();
                }
                try {
                    return new zzZ3L(zzZ94.zzXG(zzYNC.zzZ(privateKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify EdDSA private key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYP5
            public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                return zzY(privateKey);
            }
        };
        zzVS5 = new zzYNG<zzZ3A>() { // from class: com.aspose.words.internal.zzYOE.16
            private static zzZ3A zzX(PublicKey publicKey) throws InvalidKeyException {
                if (publicKey instanceof zzYNH) {
                    return ((zzYNH) publicKey).zzXAd();
                }
                try {
                    return new zzZ3A(zzYNC.zzZ(publicKey));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify XDH public key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYNG
            public final /* synthetic */ zzZ5R zzY(zzZ5W zzz5w, PublicKey publicKey) throws InvalidKeyException {
                return zzX(publicKey);
            }
        };
        zzVS4 = new zzYP5<zzZ3B>() { // from class: com.aspose.words.internal.zzYOE.17
            private static zzZ3B zzX(PrivateKey privateKey) throws InvalidKeyException {
                if (privateKey instanceof zzYNI) {
                    return ((zzYNI) privateKey).zzXAe();
                }
                try {
                    return new zzZ3B(zzZ94.zzXG(zzYNC.zzZ(privateKey)));
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot identify XDH private key: ")), e);
                }
            }

            @Override // com.aspose.words.internal.zzYP5
            public final /* synthetic */ zzZ5S zzZ(zzZ5W zzz5w, PrivateKey privateKey) throws InvalidKeyException {
                return zzX(privateKey);
            }
        };
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyFactory.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.zzU();
            }
        }));
        zzyq8.zzZ("KeyFactory.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.zzV();
            }
        }));
        zzyq8.zzZ("KeyFactory.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.zzW();
            }
        }));
        zzyq8.zzZ("KeyFactory.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EdDH", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.21
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.zzX();
            }
        }));
        zzyq8.zzZ("KeyFactory.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed448", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.22
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.zzY();
            }
        }));
        zzyq8.zzZ("KeyFactory.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$Ed25519", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ.C19090zzZ();
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, false, null);
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, false, zzYY5.zzW7I);
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, false, zzYY5.zzW7H);
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, true, null);
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, true, zzYY5.zzW7G);
            }
        }));
        zzyq8.zzZ("KeyPairGenerator.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8, true, zzYY5.zzW7F);
            }
        }));
        zzyq8.zzZ("Signature.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.Signature$EDDSA", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYY5.zzX(), zzYOE.zzVS7, zzYOE.zzVS6, zzYY5.zzW7J);
            }
        }));
        zzyq8.zzZ("Signature.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.Signature$Ed448", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYY5.zzX(), zzYOE.zzVS7, zzYOE.zzVS6, zzYY5.zzW7I);
            }
        }));
        zzZDA zzzda = zzZA7.zzWDS;
        zzyq8.zzZ(RequestParameters.SIGNATURE, "ED448", zzzda);
        zzyq8.zzZ("Signature.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.Signature$Ed25519", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQB(zzyq8, new zzYY5.zzX(), zzYOE.zzVS7, zzYOE.zzVS6, zzYY5.zzW7H);
            }
        }));
        zzZDA zzzda2 = zzZA7.zzWDT;
        zzyq8.zzZ(RequestParameters.SIGNATURE, "ED25519", zzzda2);
        Map<String, String> map = zzVS8;
        zzYQP.zzZ(zzyq8, "XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(new zzYY5.zzU(), zzYOE.zzVS5, zzYOE.zzVS4, new zzX(zzYY5.zzW7G));
            }
        }));
        zzYQP.zzZ(zzyq8, "X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(new zzYY5.zzU(), zzYOE.zzVS5, zzYOE.zzVS4, new zzX(zzYY5.zzW7G));
            }
        }));
        zzZDA zzzda3 = zzZA7.zzWDU;
        zzyq8.zzZ("KeyAgreement", "X448", zzzda3);
        zzYQP.zzZ(zzyq8, "X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519", map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOE.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQM(new zzYY5.zzU(), zzYOE.zzVS5, zzYOE.zzVS4, new zzX(zzYY5.zzW7F));
            }
        }));
        zzZDA zzzda4 = zzZA7.zzWDV;
        zzyq8.zzZ("KeyAgreement", "X25519", zzzda4);
        zzYQP.zzZ(zzyq8, zzzda3, "X448", new zzZ.zzV());
        zzYQP.zzZ(zzyq8, zzzda4, "X25519", new zzZ.zzW());
        zzYQP.zzZ(zzyq8, zzzda, "ED448", new zzZ.zzY());
        zzYQP.zzZ(zzyq8, zzzda2, "ED25519", new zzZ.C19090zzZ());
    }
}
