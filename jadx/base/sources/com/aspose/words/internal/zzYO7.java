package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYX0;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYO7 extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYO7";
    private Class[] zzVVU = {IvParameterSpec.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYO7.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(zzZ4M zzz4m) {
            return zzYNC.zzT(zzz4m.zzXGV()) ? new zzYQN((zzZ5P) zzz4m) : new zzYPM((zzZ4L) zzz4m);
        }
    };

    public static class zzZ extends zzYQK {

        /* JADX INFO: renamed from: iv */
        private byte[] f51249iv;

        private zzZ() {
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.f51249iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "IDEA Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArr);
            if (zzzd5ZzXo instanceof zzZD4) {
                this.f51249iv = zzYGU.zzVI(zzZ9V.zzXX(zzzd5ZzXo).getIV());
            } else {
                if (!(zzzd5ZzXo instanceof zzZD9)) {
                    throw new IOException("Unable to recognize parameters");
                }
                this.f51249iv = zzYGU.zzVI(zzZD9.zzYz(zzzd5ZzXo).zzXL5());
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZ9V(zzYGU.zzVI(this.f51249iv)).getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.f51249iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzZDA zzzda = zzZ9U.zzWB8;
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("AlgorithmParameters.IDEA", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "AlgorithmParameterGenerator", zzzda, androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$AlgParamGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYPO(zzyq8, "IDEA", 8);
            }
        })), str, "$AlgParams"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ((byte) 0);
            }
        }));
        zzyq8.zzZ("AlgorithmParameters", "IDEA", zzzda);
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "Cipher.IDEA", C21111o0ooOoO.OooO0Oo(str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYX0.zzW5H, zzYX0.zzW5I, zzYX0.zzW5G, zzYX0.zzW5E, zzYX0.zzW5D, zzYX0.zzW5F, zzYX0.zzW5C, zzYX0.zzW5B, zzYX0.zzW5A, zzYX0.zzW5y, zzYX0.zzW5x, zzYX0.zzW5z, zzYX0.zzW5w, zzYX0.zzW5v, zzYX0.zzW5u, zzYX0.zzW5s, zzYX0.zzW5t, zzYX0.zzW5r, zzYX0.zzW5p, zzYX0.zzW5n, zzYX0.zzW5q).zzZ(zzYO7.this.zzVU0, new zzYX0.zzU(), new zzYX0.zzZ()).zzW(zzYO7.this.zzVVU).zzXBD();
            }
        }), str);
        sbOooO0OO.append("$CBC");
        zzyq8.zzZ("KeyGenerator.IDEA", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYX0.zzW5B).zzZ(zzYO7.this.zzVU0, new zzYX0.zzU(), (zzZ5Z) null).zzW(zzYO7.this.zzVVU).zzXBD();
            }
        })), str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "IDEA", 128, false, new zzYPL() { // from class: com.aspose.words.internal.zzYO7.7.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYX0.zzW(i, secureRandom);
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "IDEA", zzzda);
        zzyq8.zzZ("Mac.IDEAMAC", C21111o0ooOoO.OooO0Oo(str, "$Mac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYX0.zzY zzy = zzYX0.zzW5m;
                return new zzYQE(zzy, new zzYX0.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.IDEA", "IDEAMAC");
        zzyq8.zzZ("Mac.IDEAMAC/CFB8", str + "$CFB8MAC", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.9
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYX0.zzY zzy = zzYX0.zzW5l;
                return new zzYQE(zzy, new zzYX0.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        zzyq8.zzZ("Mac.IDEACMAC", str + "$CMAC", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.10
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYX0.zzY zzy = zzYX0.zzW5k;
                return new zzYQE(zzy, new zzYX0.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzZ("Mac", "IDEACMAC", "IDEA-CMAC");
        zzyq8.zzZ("SecretKeyFactory.IDEA", C21111o0ooOoO.OooO0Oo(str, "$IDEAKFACT"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO7.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("IDEA", zzYX0.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYO7.2.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        int length = bArr.length * 8;
                        if (length < 40 || length > 128) {
                            throw new InvalidKeySpecException("IDEA key must be of length 40 to 128 bits");
                        }
                        return bArr;
                    }
                });
            }
        }));
    }
}
