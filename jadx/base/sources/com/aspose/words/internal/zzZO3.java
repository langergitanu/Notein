package com.aspose.words.internal;

import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZO3 {
    protected final zzZO0 zzMW;
    protected final CharsetEncoder zzZWA;
    protected int zzZWB = 0;
    protected zzZO2 zzZWz = null;
    protected zzZO1 zzZWy = null;

    public zzZO3(zzZO0 zzzo0) {
        this.zzMW = zzzo0;
        this.zzZWA = zzzo0.zzhO();
    }

    public abstract int zzZ(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4);

    public abstract int zzZ(char[] cArr, int i, byte[] bArr);

    public final void zzZ(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, RefInt refInt, RefInt refInt2, RefBoolean refBoolean) {
        int iZzZ = zzZ(cArr, i, i2, bArr, i3, i4);
        refInt.set(this.zzZWB);
        refInt2.set(iZzZ);
        refBoolean.set(iZzZ > 0);
    }

    public final CharsetEncoder zzi5() {
        return this.zzZWA;
    }
}
