package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYO1;
import com.aspose.words.internal.zzYO3;
import com.aspose.words.internal.zzYQ9;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYWH;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ4K;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNY extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYNY";
    private Class[] zzVVU = {RC2ParameterSpec.class, IvParameterSpec.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYNY.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return new zzYP7() { // from class: com.aspose.words.internal.zzYNY.1.1
                /* JADX WARN: Type inference failed for: r2v13, types: [com.aspose.words.internal.zzYXO, com.aspose.words.internal.zzZ4M] */
                /* JADX WARN: Type inference failed for: r2v24, types: [com.aspose.words.internal.zzYXO, com.aspose.words.internal.zzZ4M] */
                /* JADX WARN: Type inference failed for: r2v33, types: [com.aspose.words.internal.zzYXO, com.aspose.words.internal.zzZ4M] */
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                    if (algorithmParameterSpec instanceof IvParameterSpec) {
                        return zzYNC.zzT(zzz4m.zzXGV()) ? ((zzYWH.zzY) zzz4m).zzXg(((IvParameterSpec) algorithmParameterSpec).getIV()) : ((zzYWH.zzS) zzz4m).zzXg(((IvParameterSpec) algorithmParameterSpec).getIV());
                    }
                    if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                        return (z && zzz4m.zzXGV().zzXH5()) ? zzYNC.zzT(zzz4m.zzXGV()) ? ((zzYWH.zzY) zzz4m).zzW(secureRandom) : ((zzYWH.zzS) zzz4m).zzW(secureRandom) : zzz4m;
                    }
                    RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                    if (zzYNC.zzT(zzz4m.zzXGV())) {
                        zzYWH.zzY zzyZzfm = ((zzYWH.zzY) zzz4m).zzfm(rC2ParameterSpec.getEffectiveKeyBits());
                        return rC2ParameterSpec.getIV() != null ? zzyZzfm.zzXg(rC2ParameterSpec.getIV()) : zzyZzfm;
                    }
                    zzYWH.zzS zzsZzfl = ((zzYWH.zzS) zzz4m).zzfl(rC2ParameterSpec.getEffectiveKeyBits());
                    return rC2ParameterSpec.getIV() != null ? zzsZzfl.zzXg(rC2ParameterSpec.getIV()) : zzsZzfl;
                }
            };
        }
    };

    public static class zzY extends zzYQK {

        /* JADX INFO: renamed from: iv */
        private byte[] f51248iv;
        private int zzVR1 = 58;
        private static final short[] zzVR3 = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        private static final short[] zzVR2 = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f51248iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            }
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
            if (effectiveKeyBits != -1) {
                if (effectiveKeyBits < 256) {
                    this.zzVR1 = zzVR3[effectiveKeyBits];
                } else {
                    this.zzVR1 = effectiveKeyBits;
                }
            }
            this.f51248iv = rC2ParameterSpec.getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "RC2 Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArr);
            if (zzzd5ZzXo instanceof zzZD9) {
                this.f51248iv = zzZD9.zzYz(zzzd5ZzXo).zzXL5();
            } else {
                if (!(zzzd5ZzXo instanceof zzZD4)) {
                    throw new IOException("Unable to recognize parameters");
                }
                zzZ93 zzz93ZzXF = zzZ93.zzXF(zzzd5ZzXo);
                this.f51248iv = zzz93ZzXF.getIV();
                this.zzVR1 = zzz93ZzXF.zzXJ4().intValue();
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            int i = this.zzVR1;
            return i == -1 ? new zzZ93(this.f51248iv).getEncoded() : new zzZ93(i, this.f51248iv).getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            int i;
            if ((cls == RC2ParameterSpec.class || cls == AlgorithmParameterSpec.class) && (i = this.zzVR1) != -1) {
                return i < 256 ? new RC2ParameterSpec(zzVR2[this.zzVR1], this.f51248iv) : new RC2ParameterSpec(this.zzVR1, this.f51248iv);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f51248iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public static class zzZ extends zzYQL {
        public zzZ(zzYQ8 zzyq8) {
            super(zzyq8, 128);
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.zzWk5 == null) {
                this.zzWk5 = this.zzVWk.zzXBp();
            }
            this.zzWk5.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("RC2", this.zzVWk);
                algorithmParameters.init(new RC2ParameterSpec(this.zzWk4, bArr));
                return algorithmParameters;
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
            }
            this.zzWk4 = ((RC2ParameterSpec) algorithmParameterSpec).getEffectiveKeyBits();
            this.zzWk5 = secureRandom;
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameterGenerator.RC2", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.11
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8);
            }
        }));
        zzZDA zzzda = zzZ96.zzWy9;
        zzyq8.zzZ("AlgorithmParameterGenerator", "RC2", zzzda);
        zzyq8.zzZ("KeyGenerator.RC2", C21111o0ooOoO.OooO0Oo(str, "$KeyGenerator"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.12
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "RC2", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYNY.12.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYWH.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzZDA zzzda2 = zzZ96.zzWwt;
        zzyq8.zzZ("KeyGenerator", "RC2", zzzda, zzzda2);
        zzyq8.zzZ("AlgorithmParameters.RC2", C21111o0ooOoO.OooO0Oo(str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.13
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "RC2", zzzda);
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.RC2", C21111o0ooOoO.OooO0Oo(str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.14
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4g, zzYWH.zzW4h, zzYWH.zzW4f, zzYWH.zzW4d, zzYWH.zzW4c, zzYWH.zzW4e, zzYWH.zzW4b, zzYWH.zzW4a, zzYWH.zzW49, zzYWH.zzW47, zzYWH.zzW46, zzYWH.zzW48, zzYWH.zzW45, zzYWH.zzW44, zzYWH.zzW43, zzYWH.zzW41, zzYWH.zzW42, zzYWH.zzW40, zzYWH.zzW3Z, zzYWH.zzW3Y).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), new zzYWH.zzZ()).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$CBC");
        zzyq8.zzZ("Cipher.RC2WRAP", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.15
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4a).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), (zzZ5Z) null).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        })), str, "$Wrap"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.16
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQ9.zzZ(zzyq8, zzYWH.zzW3U).zzZ(zzYNY.this.zzVU0, new zzYWH.zzV()).zzU(zzYNY.this.zzVVU).zzXBu();
            }
        }));
        zzyq8.zzZ("Cipher", "RC2WRAP", zzzda2);
        zzyq8.zzZ("Mac.RC2MAC", C21111o0ooOoO.OooO0Oo(str, "$CBCMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.17
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWH.zzY zzy = zzYWH.zzW3X;
                return new zzYQE(zzy, new zzYWH.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.RC2", "RC2MAC");
        zzyq8.zzZ("Mac.RC2MAC/CFB8", str + "$CFB8MAC", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.18
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYWH.zzY zzy = zzYWH.zzW3W;
                return new zzYQE(zzy, new zzYWH.zzU(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND128BITRC2-CBC", str + "$PBEWithSHAAnd128BitRC2", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4a).zzeZ(128).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), (zzZ5Z) null).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO2.append("$PBEWithSHAAnd40BitRC2");
        StringBuilder sbOooO0OO3 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHSHAAND40BITRC2-CBC", sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4a).zzeZ(40).zzeY(zzYPF.PKCS12$3a317ada).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), (zzZ5Z) null).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO3.append("$PBEWithMD5");
        StringBuilder sbOooO0OO4 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.PBEWITHMD5ANDRC2-CBC", sbOooO0OO3.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4a).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), (zzZ5Z) null).zzeZ(64).zzeY(zzYPF.PBKDF1$3a317ada).zzQ(zzYW0.zzZ.zzW1W).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO4.append("$PBEWithSHA1");
        zzyq8.zzZ("Cipher.PBEWITHSHA1ANDRC2-CBC", sbOooO0OO4.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYWH.zzW4a).zzZ(zzYNY.this.zzVU0, new zzYWH.zzT(), (zzZ5Z) null).zzeZ(64).zzeY(zzYPF.PBKDF1$3a317ada).zzQ(zzZ0P.zzZ.zzWdL).zzW(zzYNY.this.zzVVU).zzXBD();
            }
        }));
        zzyq8.zzZ("Cipher", "PBEWITHMD5ANDRC2-CBC", zzZ96.zzWyf);
        zzyq8.zzZ("Cipher", "PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        zzyq8.zzZ("Cipher", "PBEWITHSHA1ANDRC2-CBC", zzZ96.zzWyd);
        zzyq8.zzZ("Cipher", "PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        zzZDA zzzda3 = zzZ96.zzWwx;
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND128BITRC2-CBC", zzzda3);
        zzZDA zzzda4 = zzZ96.zzWww;
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND40BITRC2-CBC", zzzda4);
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND128BITRC2-CBC", "PBEWITHSHA1AND128BITRC2-CBC");
        zzyq8.zzZ("Cipher", "PBEWITHSHAAND40BITRC2-CBC", "PBEWITHSHA1AND40BITRC2-CBC");
        StringBuilder sbOooO0OO5 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.RC2", C21111o0ooOoO.OooO0Oo(str, "$RC2KFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("RC2", zzYWH.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYNY.6.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 8 || length > 1024) {
                            throw new InvalidKeySpecException("Provided key data wrong size for RC2");
                        }
                        return bArr;
                    }
                });
            }
        }), str);
        sbOooO0OO5.append("PBEMD5RC2");
        StringBuilder sbOooO0OO6 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "SecretKeyFactory.PBEWITHMD5ANDRC2", sbOooO0OO5.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO3.zzY("RC2", zzZ4I.ASCII, zzYW0.zzZ.zzW1W);
            }
        }), str);
        sbOooO0OO6.append("PBESHARC2");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAANDRC2", sbOooO0OO6.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO3.zzY("RC2", zzZ4I.ASCII, zzZ0P.zzZ.zzWdL);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAANDRC2", "PBEWITHSHA1ANDRC2", "PBEWITHSHA-1ANDRC2");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND128BITRC2", C21111o0ooOoO.OooO0Oo(str, "PBE128RC2"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("RC2", zzZ4K.zzZ.CIPHER, 128);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND128BITRC2", "PBEWITHSHA1AND128BITRC2", "PBEWITHSHA-1AND128BITRC2");
        zzyq8.zzZ("SecretKeyFactory.PBEWITHSHAAND40BITRC2", C21111o0ooOoO.OooO0Oo(str, "PBE40RC2"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYNY.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYO1.zzT("RC2", zzZ4K.zzZ.CIPHER, 40);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory", "PBEWITHSHAAND40BITRC2", "PBEWITHSHA1AND40BITRC2", "PBEWITHSHA-1AND40BITRC2");
        zzyq8.zzZ("AlgorithmParameters", "PBKDF-PKCS12", zzzda4, zzzda3);
    }
}
