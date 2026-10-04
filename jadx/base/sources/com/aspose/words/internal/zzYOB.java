package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYQC;
import com.aspose.words.internal.zzYQJ;
import com.aspose.words.internal.zzYXX;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYOB extends zzYQR {
    private static final String PREFIX = "com.aspose.words.internal.zzYOB";
    private Class[] zzVVU = {IvParameterSpec.class, zzYMO.class};
    private zzYP6<zzZ4M> zzVU0 = new zzYP6<zzZ4M>() { // from class: com.aspose.words.internal.zzYOB.1
        @Override // com.aspose.words.internal.zzYP6
        public final zzYP7 zzW(final zzZ4M zzz4m) {
            return new zzYP7() { // from class: com.aspose.words.internal.zzYOB.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v24, types: [com.aspose.words.internal.zzYXO, com.aspose.words.internal.zzZ4M] */
                @Override // com.aspose.words.internal.zzYP7
                public final zzZ4M zzY(boolean z, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
                    if (algorithmParameterSpec instanceof IvParameterSpec) {
                        return zzYNC.zzT(zzz4m.zzXGV()) ? ((zzYXX.zzY) zzz4m).zzXg(((IvParameterSpec) algorithmParameterSpec).getIV()) : ((zzYXX.zzT) zzz4m).zzXg(((IvParameterSpec) algorithmParameterSpec).getIV());
                    }
                    if (algorithmParameterSpec instanceof zzYMO) {
                        zzYMO zzymo = (zzYMO) algorithmParameterSpec;
                        return zzYNC.zzT(zzz4m.zzXGV()) ? ((zzYXX.zzY) ((zzYXX.zzY) zzz4m).zzXg(zzymo.getIV())).zzWB(zzymo.zzXDo()) : ((zzYXX.zzT) zzz4m).zzXg(zzymo.getIV()).zzWz(zzymo.zzXDo());
                    }
                    zzZ4L zzz4l = (zzZ4L) zzz4m;
                    return (z && zzz4l.zzXGV().zzXH5()) ? zzz4l.zzW(secureRandom) : zzz4l;
                }
            };
        }
    };

    public static class zzY extends zzYQK {

        /* JADX INFO: renamed from: iv */
        private byte[] f51250iv;
        private zzZDA zzVRK = zzZAE.zzWEV;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f51250iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof zzYMO)) {
                    throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.f51250iv = ((zzYMO) algorithmParameterSpec).getIV();
                try {
                    this.zzVRK = zzYXX.zzWC(((zzYMO) algorithmParameterSpec).zzXDo());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "IV Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArr);
            if (zzzd5ZzXo instanceof zzZD9) {
                this.f51250iv = zzZD9.zzYz(zzzd5ZzXo).zzXL5();
            } else {
                if (!(zzzd5ZzXo instanceof zzZD4)) {
                    throw new IOException("Unable to recognize parameters");
                }
                zzZAC zzzacZzY4 = zzZAC.zzY4(zzzd5ZzXo);
                this.zzVRK = zzzacZzY4.zzXJx();
                this.f51250iv = zzzacZzY4.getIV();
            }
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return new zzZAC(this.f51250iv, this.zzVRK).getEncoded();
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f51250iv);
            }
            if (cls == zzYMO.class || cls == AlgorithmParameterSpec.class) {
                return new zzYMO(this.zzVRK, this.f51250iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public static class zzZ extends zzYQL {
        private zzZDA zzVRK;

        public zzZ(zzYQ8 zzyq8) {
            super(zzyq8, 0);
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            this.zzWk5.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("GOST28147", this.zzVWk);
                zzZDA zzzda = this.zzVRK;
                if (zzzda == null) {
                    algorithmParameters.init(new IvParameterSpec(bArr));
                    return algorithmParameters;
                }
                algorithmParameters.init(new zzYMO(zzzda, bArr));
                return algorithmParameters;
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof zzYMP)) {
                throw new InvalidAlgorithmParameterException("GOST28147 requires a GOST28147GenParameterSpec for initialization");
            }
            String strZzXA4 = ((zzYMP) algorithmParameterSpec).zzXA4();
            try {
                this.zzVRK = zzYXX.zzwB(strZzXA4);
            } catch (IllegalArgumentException unused) {
                throw new InvalidAlgorithmParameterException(C20593OooO0Oo.OooO0O0("Name ", strZzXA4, " does not map to a GOST28147 parameter set"));
            }
        }
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        StringBuilder sb = new StringBuilder();
        String str = PREFIX;
        zzyq8.zzZ("Cipher.GOST28147", androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, "$ECB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYXX.zzW6Z, zzYXX.zzW70, zzYXX.zzW6Y, zzYXX.zzW6W, zzYXX.zzW6V, zzYXX.zzW6X, zzYXX.zzW6U, zzYXX.zzW6T, zzYXX.zzW6S, zzYXX.zzW6Q, zzYXX.zzW6P, zzYXX.zzW6R, zzYXX.zzW6O, zzYXX.zzW6N, zzYXX.zzW6M, zzYXX.zzW6I, zzYXX.zzW6L, zzYXX.zzW6K, zzYXX.zzW6J, zzYXX.zzW6H, zzYXX.zzW6F, zzYXX.zzW6E).zzZ(zzYOB.this.zzVU0, new zzYXX.zzU(), new zzYXX.zzZ()).zzW(zzYOB.this.zzVVU).zzXBD();
            }
        }));
        zzyq8.zzXp("Alg.Alias.Cipher.GOST", "GOST28147");
        zzyq8.zzXp("Alg.Alias.Cipher.GOST-28147", "GOST28147");
        zzZDA zzzda = zzZAE.zzWEX;
        StringBuilder sbOooO0OO = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "KeyGenerator.GOST28147", androidx.concurrent.futures.OooO00o.OooO0OO(androidx.recyclerview.widget.OooO0o.OooO0O0(zzyq8, "Cipher", zzzda, C21111o0ooOoO.OooO0Oo(str, "$GCFB"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQJ.zzZ(zzyq8, 64, zzYXX.zzW6F).zzZ(zzYOB.this.zzVU0, new zzYXX.zzU(), (zzZ5Z) null).zzW(zzYOB.this.zzVVU).zzXBD();
            }
        })), str, "$KeyGen"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQF(zzyq8, "GOST28147", 256, true, new zzYPL() { // from class: com.aspose.words.internal.zzYOB.4.1
                    @Override // com.aspose.words.internal.zzYPL
                    public final zzZ45 zzX(int i, SecureRandom secureRandom) {
                        return new zzYXX.zzW(secureRandom);
                    }
                });
            }
        }), str);
        sbOooO0OO.append("$AlgParams");
        StringBuilder sbOooO0OO2 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "AlgorithmParameters.GOST28147", sbOooO0OO.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY();
            }
        }), str);
        sbOooO0OO2.append("$AlgParamGen");
        StringBuilder sbOooO0OO3 = androidx.concurrent.futures.OooO0o.OooO0OO(zzyq8, "AlgorithmParameterGenerator.GOST28147", sbOooO0OO2.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8);
            }
        }), str);
        sbOooO0OO3.append("$GOST28147KFACT");
        zzyq8.zzZ("SecretKeyFactory.GOST28147", sbOooO0OO3.toString(), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzYQC("GOST28147", zzYXX.zzWb4, new zzYQC.zzZ() { // from class: com.aspose.words.internal.zzYOB.7.1
                    @Override // com.aspose.words.internal.zzYQC.zzZ
                    public final byte[] zzVT(byte[] bArr) throws InvalidKeySpecException {
                        if (bArr.length * 8 == 256) {
                            return bArr;
                        }
                        throw new InvalidKeySpecException("Provided key data wrong size for GOST28147");
                    }
                });
            }
        }));
        zzyq8.zzZ("KeyGenerator", "GOST28147", zzzda);
        zzyq8.zzZ("Mac.GOST28147MAC", C21111o0ooOoO.OooO0Oo(str, "$Mac"), new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYOB.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                zzYXX.zzY zzy = zzYXX.zzW6D;
                return new zzYQE(zzy, new zzYXX.zzV(), new zzYQN(zzy));
            }
        }));
        zzyq8.zzXp("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
    }
}
