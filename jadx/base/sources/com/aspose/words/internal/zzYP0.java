package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYZ6;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP0 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYP0";
    private Class[] zzVVU = {IvParameterSpec.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYP0.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };

    public static class zzY extends zzYQK {

        /* JADX INFO: renamed from: iv */
        private byte[] f51251iv;
        private int zzVTj = 128;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
            this.f51251iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "CAST5 Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArr);
            if (zzzd5ZzXo instanceof zzZD9) {
                this.f51251iv = zzZD9.zzYz(zzzd5ZzXo).zzXL5();
            } else {
                if (!(zzzd5ZzXo instanceof zzZD4)) {
                    throw new IOException("Unable to recognize parameters");
                }
                zzZ9W zzz9wZzXY = zzZ9W.zzXY(zzzd5ZzXo);
                this.f51251iv = zzz9wZzXY.getIV();
                this.zzVTj = zzz9wZzXY.getKeyLength();
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZ9W(this.f51251iv, this.zzVTj).getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.f51251iv);
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
            this.zzWk5.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("CAST5", this.zzVWk);
                algorithmParameters.init(new zzZ9W(bArr, this.zzWk4).zzXL0().getEncoded());
                return algorithmParameters;
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation");
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        final Class[] clsArr = {IvParameterSpec.class};
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.CAST5", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        }));
        zzZDA zzzda = zzZ9U.zzWB9;
        zzyq8.zzZ("AlgorithmParameters", "CAST5", zzzda);
        zzyq8.zzZ("AlgorithmParameterGenerator.CAST5", C21111o0ooOoO.OooO0Oo(str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8);
            }
        }));
        zzyq8.zzZ("AlgorithmParameterGenerator", "CAST5", zzzda);
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.CAST5", C21111o0ooOoO.OooO0Oo(str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYZ6.zzWam, zzYZ6.zzWan, zzYZ6.zzWal, zzYZ6.zzWaj, zzYZ6.zzWai, zzYZ6.zzWak, zzYZ6.zzWah, zzYZ6.zzWag, zzYZ6.zzWaf, zzYZ6.zzWad, zzYZ6.zzWac, zzYZ6.zzWae, zzYZ6.zzWab, zzYZ6.zzWaa, zzYZ6.zzWa9, zzYZ6.zzWa5, zzYZ6.zzWa7, zzYZ6.zzWa8, zzYZ6.zzWa6, zzYZ6.zzWa3, zzYZ6.zzWa4).zzZ(zzYP0.this.zzVU0, new zzYZ6.zzU(), new zzYZ6.zzZ()).zzW(zzYP0.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$CBC");
        zzyq8.zzZ("Mac.CAST5CMAC", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYZ6.zzWag).zzW(clsArr).zzZ(zzYP0.this.zzVU0, new zzYZ6.zzU(), new zzYZ6.zzZ()).zzW(zzYP0.this.zzVVU).zzXBD();
            }
        })), str, "$CMAC"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYZ6.zzY zzy = zzYZ6.zzWa2;
                return new zzYQE(zzy, new zzYZ6.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "CAST5CMAC", "CAST5-CMAC");
        zzyq8.zzZ("KeyGenerator.CAST5", C21111o0ooOoO.OooO0Oo(str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "CAST5", 128, new zzYPL() { // from class: com.aspose.words.internal.zzYP0.7.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYZ6.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "CAST5", zzzda);
        zzyq8.zzZ("SecretKeyFactory.CAST5", C21111o0ooOoO.OooO0Oo(str, "$CAST5KFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP0.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("CAST5", zzYZ6.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYP0.8.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 40 || length > 128) {
                            throw new InvalidKeySpecException("CAST5 key must be of length 40-128 bits");
                        }
                        return bArr;
                    }
                });
            }
        }));
    }
}
