package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYWQ;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ0T;
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
class zzYO2 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYO2";

    public static class zzY extends zzYQH {
        private final String zzVRt;
        private final zzZ4I zzVRx;
        private final zzZ5K zzW4W;

        public zzY(String str, zzZ4I zzz4i) {
            this(str, zzz4i, zzZ0P.zzZ.zzWdK);
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            zzZ4K zzz4kZzZ;
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec: ".concat(keySpec.getClass().getName()));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new zzYRE(pBEKeySpec.getPassword(), this.zzVRx);
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("Positive key length required: " + pBEKeySpec.getKeyLength());
            }
            zzZ5K zzz5kZzH = this.zzW4W;
            String strOooO0OO = this.zzVRt;
            if (pBEKeySpec instanceof zzYMD) {
                zzYMD zzymd = (zzYMD) pBEKeySpec;
                if (!zzymd.zzXJe()) {
                    zzz5kZzH = zzYO2.zzH(zzymd.zzXJd().zzXJk());
                    strOooO0OO = this.zzVRx == zzZ4I.UTF8 ? androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PBKDF2withHmac"), zzYO2.zzV(zzz5kZzH), "andUTF8") : androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PBKDF2withHmac"), zzYO2.zzV(zzz5kZzH), "and8BIT");
                }
            }
            if (zzz5kZzH instanceof zzZ1P) {
                zzZ0T.zzZ zzz = new zzZ0T.zzZ();
                zzZ0T.zzX zzx = zzZ0T.zzWfI;
                zzz4kZzZ = zzz.zzX(zzZ0T.zzX.zzZ((zzZ1J) zzz5kZzH, this.zzVRx, pBEKeySpec.getPassword()).zzWY(pBEKeySpec.getSalt()).zzfM(pBEKeySpec.getIterationCount()));
            } else {
                new zzYWQ.zzZ();
                zzz4kZzZ = zzYWQ.zzZ.zzZ(zzYWQ.zzW59.zzZ(zzz5kZzH, this.zzVRx, pBEKeySpec.getPassword()).zzWm(pBEKeySpec.getSalt()).zzfo(pBEKeySpec.getIterationCount()));
            }
            return new zzYPE(zzz4kZzZ.zzZ(zzZ4K.zzZ.CIPHER, (pBEKeySpec.getKeyLength() + 7) / 8), strOooO0OO, pBEKeySpec);
        }

        public zzY(String str, zzZ4I zzz4i, zzZ5K zzz5k) {
            this.zzVRt = str;
            this.zzVRx = zzz4i;
            this.zzW4W = zzz5k;
        }
    }

    public static class zzZ extends zzYQK {
        zzZ98 zzVRu;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
            }
            if (algorithmParameterSpec instanceof zzYMC) {
                zzYMC zzymc = (zzYMC) algorithmParameterSpec;
                this.zzVRu = new zzZ98(zzymc.getSalt(), zzymc.getIterationCount(), zzymc.getKeySize() / 8, zzymc.zzXJd());
            } else {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.zzVRu = new zzZ98(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "PBKDF2 Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            this.zzVRu = zzZ98.zzXJ(zzZD5.zzXo(bArr));
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return this.zzVRu.getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.zzVRu.getSalt(), this.zzVRu.zzXJh().intValue());
            }
            if (cls != zzYMC.class && cls != AlgorithmParameterSpec.class) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
            }
            int iIntValue = this.zzVRu.zzXJO() != null ? this.zzVRu.zzXJO().intValue() * 8 : 0;
            return this.zzVRu.zzXJe() ? new zzYMC(this.zzVRu.getSalt(), this.zzVRu.zzXJh().intValue(), iIntValue) : new zzYMC(this.zzVRu.getSalt(), this.zzVRu.zzXJh().intValue(), iIntValue, this.zzVRu.zzXJd());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ5K zzH(zzZDA zzzda) throws InvalidKeySpecException {
        if (zzzda.equals(zzZAE.zzWF0)) {
            return zzYW0.zzZ.zzW1T;
        }
        if (zzzda.equals(zzZ96.zzWy4)) {
            return zzZ0P.zzZ.zzWdK;
        }
        if (zzzda.equals(zzZ96.zzWy3)) {
            return zzZ0P.zzZ.zzWdI;
        }
        if (zzzda.equals(zzZ96.zzWy2)) {
            return zzZ0P.zzZ.zzWdG;
        }
        if (zzzda.equals(zzZ96.zzWy1)) {
            return zzZ0P.zzZ.zzWdE;
        }
        if (zzzda.equals(zzZ96.zzWy0)) {
            return zzZ0P.zzZ.zzWdC;
        }
        throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm " + zzzda);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzV(zzZ5W zzz5w) {
        String name = zzz5w.getName();
        int iIndexOf = name.indexOf(47);
        int iIndexOf2 = name.indexOf(45);
        if (iIndexOf2 <= 0) {
            return name.substring(0, iIndexOf);
        }
        return name.substring(0, iIndexOf2) + name.substring(iIndexOf2 + 1, iIndexOf);
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.PBKDF2", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParams"), new zzYPS() { // from class: com.aspose.words.internal.zzYO2.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        });
        zzyq8.zzZ("AlgorithmParameters", "PBKDF2", "PBKDF2WITHUTF8", "PBKDF2WITHASCII", "PBKDF2WITH8BIT");
        zzZDA zzzda = zzZ96.zzWyb;
        zzyq8.zzZ("AlgorithmParameters", "PBKDF2", zzzda);
        zzyq8.zzZ("SecretKeyFactory.PBKDF2", C21111o0ooOoO.OooO0Oo(str, "$PBKDF2withUTF8"), new zzYPS() { // from class: com.aspose.words.internal.zzYO2.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA1andUTF8", zzZ4I.UTF8);
            }
        });
        zzyq8.zzZ("SecretKeyFactory", "PBKDF2", "PBKDF2WITHUTF8");
        zzyq8.zzZ("SecretKeyFactory", "PBKDF2", zzzda);
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACSHA1", C21111o0ooOoO.OooO0Oo(str, "$PBKDF2withHMACSHA1andUTF8"), new zzYPS() { // from class: com.aspose.words.internal.zzYO2.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA1andUTF8", zzZ4I.UTF8, zzZ0P.zzZ.zzWdK);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACSHA224", str + "$PBKDF2withHMACSHA224andUTF8", new zzYPS() { // from class: com.aspose.words.internal.zzYO2.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA224andUTF8", zzZ4I.UTF8, zzZ0P.zzZ.zzWdI);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACSHA256", str + "$PBKDF2withHMACSHA256andUTF8", new zzYPS() { // from class: com.aspose.words.internal.zzYO2.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA256andUTF8", zzZ4I.UTF8, zzZ0P.zzZ.zzWdG);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACSHA384", str + "$PBKDF2withHMACSHA384andUTF8", new zzYPS() { // from class: com.aspose.words.internal.zzYO2.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA384andUTF8", zzZ4I.UTF8, zzZ0P.zzZ.zzWdE);
            }
        });
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACSHA512", str + "$PBKDF2withHMACSHA512andUTF8", new zzYPS() { // from class: com.aspose.words.internal.zzYO2.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA512andUTF8", zzZ4I.UTF8, zzZ0P.zzZ.zzWdC);
            }
        });
        if (!zzZ5L.zzXH0()) {
            zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHHMACGOST3411", C21111o0ooOoO.OooO0Oo(str, "$PBKDF2withHMACGOST3411andUTF8"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO2.8
                @Override // com.aspose.words.internal.zzYPS
                public final Object zzWL(Object obj) {
                    return new zzY("PBKDF2withHmacGOST3411andUTF8", zzZ4I.UTF8, zzYW0.zzZ.zzW1T);
                }
            }));
        }
        zzyq8.zzZ("SecretKeyFactory.PBKDF2WITHASCII", C21111o0ooOoO.OooO0Oo(str, "$PBKDF2withASCII"), new zzYPS() { // from class: com.aspose.words.internal.zzYO2.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY("PBKDF2withHmacSHA1and8BIT", zzZ4I.ASCII);
            }
        });
        zzyq8.zzZ("SecretKeyFactory", "PBKDF2WITHASCII", "PBKDF2WITH8BIT");
    }

    public static byte[] zzZ(SecretKey secretKey, PBEParameterSpec pBEParameterSpec, zzZ4K.zzZ zzz, int i) {
        zzZ0T.zzZ zzz2 = new zzZ0T.zzZ();
        zzZ0T.zzX zzx = zzZ0T.zzWfI;
        return zzz2.zzX(zzZ0T.zzX.zzZ(zzZ0P.zzZ.zzWdK, secretKey.getEncoded()).zzfM(pBEParameterSpec.getIterationCount()).zzWY(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8);
    }
}
