package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGR {

    /* JADX INFO: renamed from: eG */
    private static char[] f50825eG = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: eH */
    private final byte[] f50826eH;

    public zzYGR(byte[] bArr) {
        this(bArr, 160);
    }

    private static byte[] zzZO(byte[] bArr, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        zzZ0U zzz0uZzY = new zzZ0P.zzN().zzY(zzZ0P.zzWea);
        try {
            zzZ41 zzz41ZzXGM = zzz0uZzY.zzXGM();
            zzz41ZzXGM.write(bArr);
            zzz41ZzXGM.close();
            return zzz0uZzY.zzfX(i / 8);
        } catch (IOException unused) {
            throw new IllegalStateException("finger print calculation failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYGR) {
            return zzYGU.zzp(((zzYGR) obj).f50826eH, this.f50826eH);
        }
        return false;
    }

    public final int hashCode() {
        return zzYGU.hashCode(this.f50826eH);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != this.f50826eH.length; i++) {
            if (i > 0) {
                sb.append(C18241k5.f55433h);
            }
            sb.append(f50825eG[(this.f50826eH[i] >>> 4) & 15]);
            sb.append(f50825eG[this.f50826eH[i] & 15]);
        }
        return sb.toString();
    }

    public zzYGR(byte[] bArr, int i) {
        this.f50826eH = zzZO(bArr, i);
    }
}
