package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz27 extends zz21 implements zzFW {
    private zzZQ4 zzg8;
    private zzZ8 zzg9;
    private String zzkn;

    public zz27(zz4W zz4w, String str, zzZ8 zzz8) throws Exception {
        super(zz4w);
        this.zzg9 = zzz8;
        this.zzkn = str;
        this.zzg8 = zzW(zzz8);
    }

    private static zzZQ4 zzW(zzZ8 zzz8) {
        if (zzz8.zzYO().size() == 0) {
            return zzZQ4.zz2T;
        }
        zzZQ4 zzzq4ZzZv = zzz8.zzYO().get(0).zzZv();
        Iterator<zzZ7> it = zzz8.zzYO().iterator();
        while (it.hasNext()) {
            zzzq4ZzZv = zzZQ4.zzT(zzzq4ZzZv, it.next().zzZv());
        }
        return zzzq4ZzZv;
    }

    private void zzZ(zzXZ zzxz, zzZ6 zzz6) throws Exception {
        short sZzW = zzW(Float.intBitsToFloat((int) zzz6.zzYK()), this.zzg8.zzZm(), this.zzg8.zzkw());
        short sZzW2 = zzW(zzZPY.zzYC(zzz6.zzYK()), this.zzg8.zzZo(), this.zzg8.zzZn());
        zzxz.writeByte((byte) 0);
        zzxz.zzi(sZzW & 65535);
        zzxz.zzi(sZzW2 & 65535);
        zzxz.writeByte((byte) zzz6.zzZy().zzPC());
        zzxz.writeByte((byte) zzz6.zzZy().zzPB());
        zzxz.writeByte((byte) zzz6.zzZy().zzPA());
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzM("/ShadingType", 4);
        zzfy.zzH("/ColorSpace", zz57.zzvK().zzwE());
        zzfy.zzM("/BitsPerCoordinate", 16);
        zzfy.zzM("/BitsPerComponent", 8);
        zzfy.zzM("/BitsPerFlag", 8);
        zzfy.zzZ("/Decode", new float[]{this.zzg8.zzZm(), this.zzg8.zzkw(), this.zzg8.zzZo(), this.zzg8.zzZn(), 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f});
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        zzXZ zzxz = new zzXZ(zzq());
        for (zzZ7 zzz7 : this.zzg9.zzYO()) {
            zzZ(zzxz, zzz7.zzYN());
            zzZ(zzxz, zzz7.zzYM());
            zzZ(zzxz, zzz7.zzYL());
        }
    }

    private static short zzW(float f, float f2, float f3) {
        return (short) zzAN.zzZE(((f - f2) / (f3 - f2)) * 65535.0f);
    }
}
