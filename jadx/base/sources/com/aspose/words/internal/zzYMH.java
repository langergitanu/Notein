package com.aspose.words.internal;

import com.aspose.words.internal.zzZ1D;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMH implements KeySpec {

    /* JADX INFO: renamed from: v */
    public static final zzZ1D.zzX f51213v = zzZ1D.zzWgx;

    /* JADX INFO: renamed from: z */
    public static final zzZ1D.zzX f51214z = zzZ1D.zzWgw;

    /* JADX INFO: renamed from: A */
    private final String f51215A;

    /* JADX INFO: renamed from: u */
    private final zzZ86 f51216u;
    private final AlgorithmParameterSpec zzVQy;
    private final String zzVXe;
    private final int zzWEq;
    private final int zzWeN;
    private byte[] zzWk3;

    public zzYMH(String str, int i, String str2, int i2, AlgorithmParameterSpec algorithmParameterSpec, zzZ86 zzz86, byte[] bArr) {
        this.f51215A = str;
        this.zzWEq = i;
        this.zzVXe = str2;
        this.zzWeN = i2;
        this.zzVQy = algorithmParameterSpec;
        this.f51216u = zzz86;
        this.zzWk3 = bArr;
    }

    public static byte[] zzVP(byte[] bArr) {
        return bArr == null ? new byte[0] : zzYGU.zzVI(bArr);
    }

    public static zzZ86 zzZ(zzZ1D.zzX zzx) {
        if (zzx.zzXF4().getName().startsWith(f51213v.zzXF4().getName())) {
            return new zzZ86(zzZ6W.zzWnk, new zzZ86(zzYMB.zzQ(zzx.zzXF3().zzXF4())));
        }
        if (zzx.zzXF4().getName().startsWith(f51214z.zzXF4().getName())) {
            return new zzZ86(zzZ6W.zzWnj, new zzZ86(zzYMB.zzQ(zzx.zzXF3().zzXF4())));
        }
        throw new IllegalArgumentException("kdfAlgorithm must be one of KDF2 or KDF3");
    }

    public final int getKeySize() {
        return this.zzWEq;
    }

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.zzVQy;
    }

    public final String zzXA0() {
        return this.f51215A;
    }

    public final byte[] zzXzW() {
        return zzYGU.zzVI(this.zzWk3);
    }

    public final zzZ86 zzXzX() {
        return this.f51216u;
    }

    public final int zzXzY() {
        return this.zzWeN;
    }

    public final String zzXzZ() {
        return this.zzVXe;
    }
}
