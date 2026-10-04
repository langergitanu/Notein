package com.aspose.words.internal;

import com.aspose.words.internal.zzYWQ;
import com.aspose.words.internal.zzZ4K;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYO3 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYO3";

    public static class zzY extends zzYQH {
        private final zzZ5K zzVRw;
        private final zzZ4I zzVRx;
        private final String zzVWA;
        private final int zzWiC = 64;

        public zzY(String str, zzZ4I zzz4i, zzZ5K zzz5k) {
            this.zzVWA = str;
            this.zzVRx = zzz4i;
            this.zzVRw = zzz5k;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec: ".concat(keySpec.getClass().getName()));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new zzYRF(pBEKeySpec.getPassword(), this.zzVRx);
            }
            new zzYWQ.zzZ();
            return new zzYPE(zzYWQ.zzZ.zzZ(zzYWQ.zzW5a.zzZ(this.zzVRw, this.zzVRx, pBEKeySpec.getPassword()).zzWm(pBEKeySpec.getSalt()).zzfo(pBEKeySpec.getIterationCount())).zzZ(zzZ4K.zzZ.CIPHER, (this.zzWiC + 7) / 8), this.zzVWA, pBEKeySpec);
        }
    }

    public static class zzZ extends zzYQK {
        zzZ9A zzVRy;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            try {
                this.zzVRy = new zzZ9A(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            } catch (Exception e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "PBKDF1 Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            this.zzVRy = zzZ9A.zzXL(bArr);
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return this.zzVRy.getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.zzVRy.getSalt(), this.zzVRy.zzXJh().intValue());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(zzYQ8 zzyq8) {
        zzyq8.zzZ("AlgorithmParameters.PBKDF1", androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), PREFIX, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO3.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
    }

    public static byte[] zzZ(SecretKey secretKey, PBEParameterSpec pBEParameterSpec, zzZ5K zzz5k, zzZ4K.zzZ zzz, int i) {
        new zzYWQ.zzZ();
        return zzYWQ.zzZ.zzZ(zzYWQ.zzW5a.zzZ(zzz5k, secretKey.getEncoded()).zzfo(pBEParameterSpec.getIterationCount()).zzWm(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8);
    }

    public static byte[][] zzZ(SecretKey secretKey, PBEParameterSpec pBEParameterSpec, zzZ5K zzz5k, zzZ4K.zzZ zzz, int i, int i2) {
        new zzYWQ.zzZ();
        return zzYWQ.zzZ.zzZ(zzYWQ.zzW5a.zzZ(zzz5k, secretKey.getEncoded()).zzfo(pBEParameterSpec.getIterationCount()).zzWm(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8, (i2 + 7) / 8);
    }
}
