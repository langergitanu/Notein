package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1D;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMG implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: v */
    public static final zzZ1D.zzX f51208v = zzZ1D.zzWgx;

    /* JADX INFO: renamed from: z */
    public static final zzZ1D.zzX f51209z = zzZ1D.zzWgw;

    /* JADX INFO: renamed from: B */
    private final String f51210B;

    /* JADX INFO: renamed from: u */
    private final zzZ86 f51211u;
    private final AlgorithmParameterSpec zzVQy;
    private final int zzWiC;
    private byte[] zzWk3;

    public static final class zzZ {

        /* JADX INFO: renamed from: u */
        private zzZ86 f51212u;
        private AlgorithmParameterSpec zzVQy;
        private final String zzVZp;
        private final int zzWiC;
        private byte[] zzWk3;

        public zzZ(String str, int i) {
            this(str, i, (byte) 0);
        }

        public final zzZ zzP(zzZ86 zzz86) {
            this.f51212u = zzz86;
            return this;
        }

        public final zzYMG zzXzU() {
            return new zzYMG(this.zzVZp, this.zzWiC, this.zzVQy, this.f51212u, this.zzWk3, (byte) 0);
        }

        private zzZ(String str, int i, byte b) {
            this.zzVZp = str;
            this.zzWiC = i;
            this.f51212u = zzYMH.zzZ(zzYMG.f51209z.zzY(zzZ1D.zzZ.SHA256));
            this.zzWk3 = zzYMH.zzVP(null);
        }
    }

    public /* synthetic */ zzYMG(String str, int i, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr, byte b) {
        this(str, i, algorithmParameterSpec, zzz86, bArr);
    }

    public final int getKeySize() {
        return this.zzWiC;
    }

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.zzVQy;
    }

    public final String zzXA0() {
        return this.f51210B;
    }

    public final zzZ86 zzXzV() {
        return this.f51211u;
    }

    public final byte[] zzXzW() {
        return zzYGU.zzVI(this.zzWk3);
    }

    private zzYMG(String str, int i, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr) {
        this.f51210B = str;
        this.zzWiC = i;
        this.zzVQy = algorithmParameterSpec;
        this.f51211u = zzz86;
        this.zzWk3 = bArr;
    }
}
