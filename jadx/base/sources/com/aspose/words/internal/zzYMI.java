package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1D;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMI extends zzYMH {
    private final PublicKey zzVX5;
    private final SecureRandom zzWk5;

    public static final class zzZ {

        /* JADX INFO: renamed from: u */
        private zzZ86 f51217u = zzYMH.zzZ(zzYMH.f51214z.zzY(zzZ1D.zzZ.SHA256));
        private AlgorithmParameterSpec zzVQy;
        private final PublicKey zzVX5;
        private String zzVXe;
        private final String zzVZp;
        private int zzWeN;
        private final int zzWiC;
        private byte[] zzWk3;
        private SecureRandom zzWk5;

        public zzZ(PublicKey publicKey, String str, int i, byte[] bArr) {
            this.zzVX5 = publicKey;
            this.zzVZp = str;
            this.zzWiC = i;
            this.zzWk3 = zzYMH.zzVP(bArr);
        }

        public final zzZ zzQ(zzZ86 zzz86) {
            this.f51217u = zzz86;
            return this;
        }

        public final zzZ zzW(AlgorithmParameterSpec algorithmParameterSpec) {
            this.zzVQy = algorithmParameterSpec;
            return this;
        }

        public final zzYMI zzXA1() {
            return new zzYMI(this.zzVX5, this.zzVZp, this.zzWiC, this.zzWk5, this.zzVXe, this.zzWeN, this.zzVQy, this.f51217u, this.zzWk3, (byte) 0);
        }

        public final zzZ zzw(SecureRandom secureRandom) {
            this.zzWk5 = secureRandom;
            return this;
        }
    }

    public /* synthetic */ zzYMI(PublicKey publicKey, String str, int i, SecureRandom secureRandom, String str2, int i2, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr, byte b) {
        this(publicKey, str, i, secureRandom, str2, i2, algorithmParameterSpec, zzz86, bArr);
    }

    public final PublicKey getPublicKey() {
        return this.zzVX5;
    }

    public final SecureRandom zzXGZ() {
        return this.zzWk5;
    }

    private zzYMI(PublicKey publicKey, String str, int i, SecureRandom secureRandom, String str2, int i2, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr) {
        super(str, i, str2, i2, algorithmParameterSpec, zzz86, bArr);
        this.zzVX5 = publicKey;
        this.zzWk5 = secureRandom;
    }
}
