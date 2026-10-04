package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8I extends zzZDB {
    private static final byte[] zzWtf = {-87, -42, -21, 69, -15, 60, 112, -126, UnsignedBytes.MAX_POWER_OF_TWO, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, PatternStyle.Weave, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private byte[] zzWtc;
    private zzZ8K zzWtd;
    private zzZDA zzWte;

    private zzZ8I(zzZDA zzzda) {
        this.zzWtc = zzWtf;
        this.zzWte = zzzda;
    }

    public static byte[] zzXIv() {
        return zzYGU.zzVI(zzWtf);
    }

    public static zzZ8I zzXs(Object obj) {
        if (obj instanceof zzZ8I) {
            return (zzZ8I) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        zzZD4 zzzd4ZzYy = zzZD4.zzYy(obj);
        zzZ8I zzz8i = zzzd4ZzYy.zzg6(0) instanceof zzZDA ? new zzZ8I(zzZDA.zzYA(zzzd4ZzYy.zzg6(0))) : new zzZ8I(zzZ8K.zzXt(zzzd4ZzYy.zzg6(0)));
        if (zzzd4ZzYy.size() == 2) {
            byte[] bArrZzXL5 = zzZD9.zzYz(zzzd4ZzYy.zzg6(1)).zzXL5();
            zzz8i.zzWtc = bArrZzXL5;
            if (bArrZzXL5.length != zzWtf.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return zzz8i;
    }

    public final zzZDA zzXIu() {
        return this.zzWte;
    }

    public final byte[] zzXIw() {
        return zzYGU.zzVI(this.zzWtc);
    }

    public final zzZ8K zzXIx() {
        return this.zzWtd;
    }

    public final boolean zzXIy() {
        return this.zzWte != null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZDA zzzda = this.zzWte;
        if (zzzda != null) {
            zzzdj.zzZ(zzzda);
        } else {
            zzzdj.zzZ(this.zzWtd);
        }
        if (!zzYGU.zzp(this.zzWtc, zzWtf)) {
            zzzdj.zzZ(new zzZC6(this.zzWtc));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ8I(zzZDA zzzda, byte[] bArr) {
        this.zzWtc = zzWtf;
        this.zzWte = zzzda;
        this.zzWtc = zzYGU.zzVI(bArr);
    }

    public zzZ8I(zzZ8K zzz8k) {
        this.zzWtc = zzWtf;
        this.zzWtd = zzz8k;
    }
}
