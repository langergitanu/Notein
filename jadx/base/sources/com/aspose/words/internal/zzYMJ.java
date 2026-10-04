package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1D;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMJ extends zzYMH {
    private final byte[] zzWeH;
    private final PrivateKey zzZWV;

    public static final class zzZ {

        /* JADX INFO: renamed from: u */
        private zzZ86 f51218u = zzYMH.zzZ(zzYMH.f51214z.zzY(zzZ1D.zzZ.SHA256));
        private AlgorithmParameterSpec zzVQy;
        private String zzVXe;
        private final String zzVZp;
        private final byte[] zzWeH;
        private int zzWeN;
        private final int zzWiC;
        private final byte[] zzWk3;
        private final PrivateKey zzZWV;

        public zzZ(PrivateKey privateKey, byte[] bArr, String str, int i, byte[] bArr2) {
            this.zzZWV = privateKey;
            this.zzVZp = str;
            this.zzWiC = i;
            this.zzWeH = zzYGU.zzVI(bArr);
            this.zzWk3 = zzYMH.zzVP(bArr2);
        }

        public final zzZ zzR(zzZ86 zzz86) {
            this.f51218u = zzz86;
            return this;
        }

        public final zzZ zzX(AlgorithmParameterSpec algorithmParameterSpec) {
            this.zzVQy = algorithmParameterSpec;
            return this;
        }

        public final zzYMJ zzXA2() {
            return new zzYMJ(this.zzZWV, this.zzWeH, this.zzVZp, this.zzWiC, this.zzVXe, this.zzWeN, this.zzVQy, this.f51218u, this.zzWk3, (byte) 0);
        }

        public final zzZ zzYM(String str, int i) {
            this.zzVXe = str;
            this.zzWeN = i;
            if (str == null || i > 0) {
                return this;
            }
            throw new IllegalArgumentException("macKeySizeInBits must be greater than zero");
        }
    }

    public /* synthetic */ zzYMJ(PrivateKey privateKey, byte[] bArr, String str, int i, String str2, int i2, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr2, byte b) {
        this(privateKey, bArr, str, i, str2, i2, algorithmParameterSpec, zzz86, bArr2);
    }

    public final PrivateKey getPrivateKey() {
        return this.zzZWV;
    }

    public final byte[] zzXGK() {
        return zzYGU.zzVI(this.zzWeH);
    }

    private zzYMJ(PrivateKey privateKey, byte[] bArr, String str, int i, String str2, int i2, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr2) {
        super(str, i, str2, i2, algorithmParameterSpec, zzz86, bArr2);
        this.zzZWV = privateKey;
        this.zzWeH = bArr;
    }
}
