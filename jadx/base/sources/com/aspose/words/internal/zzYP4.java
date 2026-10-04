package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO1;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZB;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1T;
import com.aspose.words.internal.zzZ4K;
import com.google.android.gms.stats.CodePackage;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP4 extends zzYND {
    private static final String PREFIX;
    private static final Map<String, String> zzVU7;
    private zzYZB.zzZ zzVU2;
    private zzYZB.zzW zzVU3;
    private zzYP6<zzZ0S> zzVU1 = new zzYP6<zzZ0S>() { // from class: com.aspose.words.internal.zzYP4.1
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.words.internal.zzYP6
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public zzYP7 zzW(final zzZ0S zzz0s) {
            return zzYNC.zzT(zzz0s.zzXF4()) ? new zzYQN((zzZ5P) zzz0s) : (zzz0s.zzXF4().equals(zzZ1T.zzWiP.zzXF4()) || zzz0s.zzXF4().equals(zzZ1T.zzWiO.zzXF4())) ? new zzYP7() { // from class: com.aspose.words.internal.zzYP4.1.1
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
                    return algorithmParameterSpec instanceof zzYM9 ? ((zzZ1T.zzR) zzz0s).zzOM(((zzYM9) algorithmParameterSpec).zzXzQ()) : zzz0s;
                }
            } : new zzYPM((zzZ4L) zzz0s);
        }
    };
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYP4.12
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };
    private final zzZ1T.zzT zzVU6 = new zzZ1T.zzT();
    private final zzZ1T.zzZ zzVU5 = new zzZ1T.zzZ();
    private final zzZ1T.zzV zzVU4 = new zzZ1T.zzV();

    public static class zzZ extends zzYQL {
        private final String zzVTO;
        private int zzVUs;

        public zzZ(zzYQ8 zzyq8, String str, int i) {
            super(zzyq8, i);
            this.zzVUs = 12;
            this.zzVTO = str;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.zzVUs];
            if (zzZ5L.zzXH0()) {
                SecureRandom secureRandom = this.zzWk5;
                if ((secureRandom instanceof zzZ0O) || (secureRandom.getProvider() instanceof zzYQ8)) {
                    this.zzWk5.nextBytes(bArr);
                } else {
                    this.zzVWk.zzXBp().nextBytes(bArr);
                }
            } else {
                this.zzWk5.nextBytes(bArr);
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.zzVTO, this.zzVWk);
                algorithmParameters.init(new zzZAN(bArr, this.zzWk4 / 8).getEncoded());
                return algorithmParameters;
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!zzYPQ.zzXBc()) {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for parameter generation");
            }
            if (!zzYPQ.zzZ(algorithmParameterSpec)) {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for parameter generation");
            }
            try {
                zzZAN zzzanZzY = zzYPQ.zzY(algorithmParameterSpec);
                this.zzVUs = zzzanZzY.zzXJY().length;
                this.zzWk4 = zzzanZzY.zzXJX() * 8;
                this.zzWk5 = secureRandom;
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot process GCMParameterSpec: ")), e);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        zzVU7 = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
        PREFIX = zzYP4.class.getName();
    }

    public zzYP4() {
        if (zzZ5L.zzXH0()) {
            return;
        }
        this.zzVU3 = new zzYZB.zzW();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZ5Z zzXB9() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVU2 == null) {
            this.zzVU2 = new zzYZB.zzZ();
        }
        return this.zzVU2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzYZB.zzW zzXBa() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (this.zzVU3 == null) {
            this.zzVU3 = new zzYZB.zzW();
        }
        return this.zzVU3;
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final Class[] clsArrZzXBb = zzYPQ.zzXBb();
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.AES", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParams"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.23
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS(AES256KeyLoader.AES_ALGORITHM);
            }
        });
        zzZDA zzzda = zzZ9O.zzWAt;
        zzZDA zzzda2 = zzZ9O.zzWAl;
        zzZDA zzzda3 = zzZ9O.zzWAd;
        zzZDA zzzda4 = zzZ9O.zzWAr;
        zzZDA zzzda5 = zzZ9O.zzWAj;
        zzZDA zzzda6 = zzZ9O.zzWAb;
        zzZDA zzzda7 = zzZ9O.zzWAs;
        zzZDA zzzda8 = zzZ9O.zzWAk;
        zzZDA zzzda9 = zzZ9O.zzWAc;
        zzyq8.zzZ("AlgorithmParameters", AES256KeyLoader.AES_ALGORITHM, zzzda, zzzda2, zzzda3, zzzda4, zzzda5, zzzda6, zzzda7, zzzda8, zzzda9);
        zzyq8.zzZ("AlgorithmParameters.GCM", C21111o0ooOoO.OooO0Oo(str, "$AlgParamsGCM"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.34
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS(CodePackage.GCM);
            }
        });
        zzZDA zzzda10 = zzZ9O.zzWAp;
        zzZDA zzzda11 = zzZ9O.zzWAh;
        zzZDA zzzda12 = zzZ9O.zzWA9;
        zzyq8.zzZ("AlgorithmParameters", CodePackage.GCM, zzzda10, zzzda11, zzzda12);
        zzyq8.zzZ("AlgorithmParameters.CCM", C21111o0ooOoO.OooO0Oo(str, "$AlgParamsCCM"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.45
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQS("CCM");
            }
        });
        zzZDA zzzda13 = zzZ9O.zzWAo;
        zzZDA zzzda14 = zzZ9O.zzWAg;
        zzZDA zzzda15 = zzZ9O.zzWA8;
        zzyq8.zzZ("AlgorithmParameters", "CCM", zzzda13, zzzda14, zzzda15);
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda, C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.56
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, AES256KeyLoader.AES_ALGORITHM, 16);
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator", zzzda.getId(), zzzda2, zzzda3, zzzda4, zzzda5, zzzda6, zzzda7, zzzda8, zzzda9);
        zzyq8.zzZ("AlgorithmParameterGenerator.GCM", C21111o0ooOoO.OooO0Oo(str, "$AlgParamGenGCM"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.59
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8, CodePackage.GCM, 128);
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator", CodePackage.GCM, zzzda10, zzzda11, zzzda12);
        zzyq8.zzZ("AlgorithmParameterGenerator.CCM", C21111o0ooOoO.OooO0Oo(str, "$AlgParamGenCCM"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.60
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8, "CCM", 64);
            }
        });
        zzyq8.zzZ("AlgorithmParameterGenerator", "CCM", zzzda13, zzzda14, zzzda15);
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, "$ECB");
        Map<String, String> map = zzVU7;
        zzyq8.zzZ("Cipher.AES", strOooO0Oo, map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.61
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWjb, zzZ1T.zzWjc, zzZ1T.zzWja, zzZ1T.zzWj8, zzZ1T.zzWj7, zzZ1T.zzWj9, zzZ1T.zzWj6, zzZ1T.zzWj5, zzZ1T.zzWj4, zzZ1T.zzWj2, zzZ1T.zzWj1, zzZ1T.zzWj3, zzZ1T.zzWiW, zzZ1T.zzWiX, zzZ1T.zzWj0, zzZ1T.zzWiZ, zzZ1T.zzWiY, zzZ1T.zzWiV, zzZ1T.zzWiU, zzZ1T.zzWiT, zzZ1T.zzWiS, zzZ1T.zzWiR, zzYZB.zzWb7, zzYZB.zzWb6, zzYZB.zzWb8).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) zzYP4.this.zzVU5).zzZ(zzYP4.this.zzVU0, zzYP4.this.zzXBa(), zzYP4.this.zzXB9()).zzW(clsArrZzXBb).zzXBD();
            }
        });
        zzZDA zzzda16 = zzZ9O.zzWAu;
        zzyq8.zzZ("Cipher", zzzda16, C21111o0ooOoO.OooO0Oo(str, "ECB128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWjb).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(128).zzXBD();
            }
        });
        zzZDA zzzda17 = zzZ9O.zzWAm;
        zzyq8.zzZ("Cipher", zzzda17, C21111o0ooOoO.OooO0Oo(str, "ECB192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWjb).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(192).zzXBD();
            }
        });
        zzZDA zzzda18 = zzZ9O.zzWAe;
        zzyq8.zzZ("Cipher", zzzda18, C21111o0ooOoO.OooO0Oo(str, "ECB256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWjb).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda, C21111o0ooOoO.OooO0Oo(str, "CBC128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(128).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda2, C21111o0ooOoO.OooO0Oo(str, "CBC192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(192).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda3, C21111o0ooOoO.OooO0Oo(str, "CBC256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda7, C21111o0ooOoO.OooO0Oo(str, "OFB128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiV).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(128).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda8, C21111o0ooOoO.OooO0Oo(str, "OFB192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiV).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(192).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda9, C21111o0ooOoO.OooO0Oo(str, "OFB256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiV).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda4, C21111o0ooOoO.OooO0Oo(str, "CFB128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiW).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(128).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda5, C21111o0ooOoO.OooO0Oo(str, "CFB192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiW).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(192).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda6, C21111o0ooOoO.OooO0Oo(str, "CFB256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiW).zzW(clsArr).zzZ(zzYP4.this.zzVU1, zzYP4.this.zzVU6).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher.AESWRAP", C21111o0ooOoO.OooO0Oo(str, "$Wrap"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiP).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzXBu();
            }
        });
        zzyq8.zzXp("Alg.Alias.Cipher.AESKW", "AESWRAP");
        if (!zzZ5L.zzXH0()) {
            zzyq8.zzZ("Cipher.AESRFC3211WRAP", C21111o0ooOoO.OooO0Oo(str, "$RFC3211Wrap"), map, new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.16
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQ9.zzZ(zzyq8, zzYZB.zzWb5).zzZ(zzYP4.this.zzVU0, new zzYZB.zzX()).zzU(clsArr).zzXBu();
                }
            }));
        }
        zzZDA zzzda19 = zzZ9O.zzWAq;
        zzyq8.zzZ("Cipher", zzzda19, C21111o0ooOoO.OooO0Oo(str, "$WRAP128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiP).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(128).zzXBu();
            }
        });
        zzZDA zzzda20 = zzZ9O.zzWAi;
        zzyq8.zzZ("Cipher", zzzda20, C21111o0ooOoO.OooO0Oo(str, "$WRAP192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiP).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(192).zzXBu();
            }
        });
        zzZDA zzzda21 = zzZ9O.zzWAa;
        zzyq8.zzZ("Cipher", zzzda21, C21111o0ooOoO.OooO0Oo(str, "$WRAP256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.19
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiP).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(256).zzXBu();
            }
        });
        zzyq8.zzZ("Cipher", zzZ9O.zzWAn, C21111o0ooOoO.OooO0Oo(str, "$WRAPPAD128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.20
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiO).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(128).zzXBu();
            }
        });
        zzyq8.zzZ("Cipher", zzZ9O.zzWAf, C21111o0ooOoO.OooO0Oo(str, "$WRAPPAD192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.21
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiO).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(192).zzXBu();
            }
        });
        zzyq8.zzZ("Cipher", zzZ9O.zzWA7, C21111o0ooOoO.OooO0Oo(str, "$WRAPPAD256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.22
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiO).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzeW(256).zzXBu();
            }
        });
        zzyq8.zzZ("Cipher.AESWRAPPAD", C21111o0ooOoO.OooO0Oo(str, "$WrapWithPad"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.24
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzZ1T.zzWiO).zzZ(zzYP4.this.zzVU1, (zzZ18) zzYP4.this.zzVU4).zzU(new Class[]{zzYM9.class}).zzXBu();
            }
        });
        zzyq8.zzZ("Cipher", "AESWRAPPAD", "AESKWP");
        zzyq8.zzZ("Cipher.GCM", C21111o0ooOoO.OooO0Oo(str, "$GCM"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.25
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiT).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda10, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$GCM128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.26
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiT).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(128).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda11, C21111o0ooOoO.OooO0Oo(str, "$GCM192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.27
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiT).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(192).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda12, C21111o0ooOoO.OooO0Oo(str, "$GCM256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.28
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiT).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher.CCM", C21111o0ooOoO.OooO0Oo(str, "$CCM"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.29
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiS).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda13, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), str, "$CCM128"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.30
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiS).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(128).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda14, C21111o0ooOoO.OooO0Oo(str, "$CCM192"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.31
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiS).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(192).zzXBD();
            }
        });
        zzyq8.zzZ("Cipher", zzzda15, C21111o0ooOoO.OooO0Oo(str, "$CCM256"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.32
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWiS).zzW(clsArrZzXBb).zzZ(zzYP4.this.zzVU1, (zzZ0J) null, (zzZ1U) zzYP4.this.zzVU5).zzeZ(256).zzXBD();
            }
        });
        zzyq8.zzZ("KeyGenerator.AES", C21111o0ooOoO.OooO0Oo(str, "$KeyGen"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.33
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, AES256KeyLoader.AES_ALGORITHM, 128, new zzYPL() { // from class: com.aspose.words.internal.zzYP4.33.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ1T.zzW(i, secureRandom);
                    }
                });
            }
        });
        zzZDA zzzda22 = zzZ9O.zzWAv;
        zzyq8.zzZ("KeyGenerator", AES256KeyLoader.AES_ALGORITHM, zzzda22);
        zzYND.zzY(zzyq8, str, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.35
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, AES256KeyLoader.AES_ALGORITHM, 128, true, new zzYPL() { // from class: com.aspose.words.internal.zzYP4.35.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ1T.zzW(128, secureRandom);
                    }
                });
            }
        }, zzzda16, zzzda, zzzda7, zzzda4, zzzda10, zzzda13, zzzda19);
        zzYND.zzY(zzyq8, str, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.36
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, AES256KeyLoader.AES_ALGORITHM, 192, true, new zzYPL() { // from class: com.aspose.words.internal.zzYP4.36.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ1T.zzW(192, secureRandom);
                    }
                });
            }
        }, zzzda17, zzzda2, zzzda8, zzzda5, zzzda11, zzzda14, zzzda20);
        zzYND.zzY(zzyq8, str, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.37
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, AES256KeyLoader.AES_ALGORITHM, 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYP4.37.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzZ1T.zzW(256, secureRandom);
                    }
                });
            }
        }, zzzda18, zzzda3, zzzda9, zzzda6, zzzda12, zzzda15, zzzda21);
        zzyq8.zzZ("SecretKeyFactory.AES", C21111o0ooOoO.OooO0Oo(str, "$AESKFACT"), new zzYPS() { // from class: com.aspose.words.internal.zzYP4.38
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC(AES256KeyLoader.AES_ALGORITHM, zzZ1T.zzWjd, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYP4.38.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length == 128 || length == 192 || length == 256) {
                            return bArr;
                        }
                        throw new InvalidKeySpecException("Provided key data wrong size for AES");
                    }
                });
            }
        });
        zzyq8.zzZ("SecretKeyFactory", AES256KeyLoader.AES_ALGORITHM, zzzda22);
        if (!zzZ5L.zzXH0()) {
            StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND128BITAES-BC", C21111o0ooOoO.OooO0Oo(str, "$PBEWithAES126CBC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.39
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(128).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO.append("$PBEWithAES192CBC");
            StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND192BITAES-BC", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.40
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(192).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO2.append("$PBEWithAES256CBC");
            StringBuilder sbOooO0OO3 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND256BITAES-BC", sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.41
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(256).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO3.append("$PBESHA256WithAES126CBC");
            StringBuilder sbOooO0OO4 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHA256AND128BITAES-BC", sbOooO0OO3.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.42
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(128).zzeY(zzYPF.PKCS12$3a317ada).zzQ(zzZ0P.zzZ.zzWdH).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO4.append("$PBESHA256WithAES192CBC");
            StringBuilder sbOooO0OO5 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHA256AND192BITAES-BC", sbOooO0OO4.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.43
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(192).zzeY(zzYPF.PKCS12$3a317ada).zzQ(zzZ0P.zzZ.zzWdH).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }), str);
            sbOooO0OO5.append("$PBESHA256WithAES256CBC");
            zzyq8.zzZ("Cipher.PBEWITHSHA256AND256BITAES-BC", sbOooO0OO5.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.44
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYQJ.zzZ(zzyq8, 128, zzZ1T.zzWj5).zzeZ(256).zzeY(zzYPF.PKCS12$3a317ada).zzQ(zzZ0P.zzZ.zzWdH).zzZ(zzYP4.this.zzVU1, (zzZ0J) zzYP4.this.zzVU6, (zzZ1U) null).zzW(new Class[]{PBEParameterSpec.class}).zzXBD();
                }
            }));
            zzZDA zzzda23 = zzZB9.zzWHi;
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND128BITAES-BC", zzzda23);
            zzZDA zzzda24 = zzZB9.zzWHh;
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND192BITAES-BC", zzzda24);
            zzZDA zzzda25 = zzZB9.zzWHg;
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND256BITAES-BC", zzzda25);
            zzZDA zzzda26 = zzZB9.zzWHf;
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND128BITAES-BC", zzzda26);
            zzZDA zzzda27 = zzZB9.zzWHe;
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND192BITAES-BC", zzzda27);
            zzZDA zzzda28 = zzZB9.zzWHd;
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND256BITAES-BC", zzzda28);
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND128BITAES-BC", "PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHA-1AND128BITAES-BC");
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND192BITAES-BC", "PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHA-1AND192BITAES-BC");
            zzyq8.zzZ("Cipher", "PBEWITHSHAAND256BITAES-BC", "PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHA-1AND256BITAES-BC");
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA-256AND128BITAES-BC");
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA-256AND192BITAES-BC");
            zzyq8.zzZ("Cipher", "PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA-256AND256BITAES-BC");
            StringBuilder sbOooO0OO6 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHSHAAND128BITAES-BC", C21111o0ooOoO.OooO0Oo(str, "$PBEWithSHAAnd128BitAESBC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.46
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ4K.zzZ.CIPHER, 128);
                }
            }), str);
            sbOooO0OO6.append("$PBEWithSHAAnd192BitAESBC");
            StringBuilder sbOooO0OO7 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHSHAAND192BITAES-BC", sbOooO0OO6.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.47
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ4K.zzZ.CIPHER, 192);
                }
            }), str);
            sbOooO0OO7.append("$PBEWithSHAAnd256BitAESBC");
            StringBuilder sbOooO0OO8 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHSHAAND256BITAES-BC", sbOooO0OO7.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.48
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ4K.zzZ.CIPHER, 256);
                }
            }), str);
            sbOooO0OO8.append("$PBEWithSHA256And128BitAESBC");
            StringBuilder sbOooO0OO9 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHSHA256AND128BITAES-BC", sbOooO0OO8.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.49
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ0P.zzZ.zzWdH, zzZ4K.zzZ.CIPHER, 128);
                }
            }), str);
            sbOooO0OO9.append("$PBEWithSHA256And192BitAESBC");
            StringBuilder sbOooO0OO10 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHSHA256AND192BITAES-BC", sbOooO0OO9.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.50
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ0P.zzZ.zzWdH, zzZ4K.zzZ.CIPHER, 192);
                }
            }), str);
            sbOooO0OO10.append("$PBEWithSHA256And256BitAESBC");
            zzyq8.zzZ("SecretKeyFactory.PBEWITHSHA256AND256BITAES-BC", sbOooO0OO10.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP4.51
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzYO1.zzT(AES256KeyLoader.AES_ALGORITHM, zzZ0P.zzZ.zzWdH, zzZ4K.zzZ.CIPHER, 256);
                }
            }));
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-BC");
            zzyq8.zzXp("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-BC");
            zzyq8.zzZ("AlgorithmParameters", "PBKDF-PKCS12", zzzda23, zzzda24, zzzda25, zzzda26, zzzda27, zzzda28);
        }
        zzyq8.zzZ("Mac.GMAC", C21111o0ooOoO.OooO0Oo(str, "$AESGMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.52
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiQ;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy));
            }
        });
        zzyq8.zzZ("Mac", "GMAC", "AESGMAC", "AES-GMAC");
        zzyq8.zzZ("Mac.CMAC", C21111o0ooOoO.OooO0Oo(str, "$AESCMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.53
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiR;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy));
            }
        });
        zzyq8.zzZ("Mac", "CMAC", "AESCMAC", "AES-CMAC");
        zzyq8.zzZ("Mac.CCMMAC", C21111o0ooOoO.OooO0Oo(str, "$AESCCMMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.54
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiS;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy.zzg1(128)));
            }
        });
        zzyq8.zzZ("Mac", "CCMMAC", "CCM", "AESCCMMAC", "AES-CCMMAC");
        zzyq8.zzZ("Mac", zzzda13, C21111o0ooOoO.OooO0Oo(str, "$AES128CCMMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.55
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiS;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy.zzg1(128)), 128);
            }
        });
        zzyq8.zzZ("Mac", zzzda14, C21111o0ooOoO.OooO0Oo(str, "$AES192CCMMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.57
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiS;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy.zzg1(128)), 192);
            }
        });
        zzyq8.zzZ("Mac", zzzda15, C21111o0ooOoO.OooO0Oo(str, "$AES256CCMMAC"), map, new zzYPS() { // from class: com.aspose.words.internal.zzYP4.58
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzZ1T.zzY zzy = zzZ1T.zzWiS;
                return new zzYQE(zzy, new zzZ1T.zzU(), new zzYQN(zzy.zzg1(128)), 256);
            }
        });
    }
}
