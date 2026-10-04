package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6F implements zzH2 {
    private boolean zzlv;
    private zzP5 zzly;
    private zzP8 zzlz = new zzP8();
    private long zzlu = 0;
    private long zzlt = 0;

    public static zzP8 zzD(zzP8 zzp8) throws Exception {
        zz6F zz6f = new zz6F();
        zzp8.zzY(zz6f);
        return zz6f.zzlz;
    }

    private static zzPZ zzG(long j, long j2) {
        zzPB zzpb = new zzPB(j, j2);
        long jZzL = zzpb.zzL(zzpb.getLength() * 0.5f);
        return new zzPZ(j, jZzL, jZzL, j2);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (this.zzly.isClosed() && this.zzlv) {
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzly.zzNY(), zzG(this.zzlt, this.zzlu));
        }
        zzZQG.zzZ(this.zzlz.zzO7(), this.zzly);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        zzP5 zzp52 = new zzP5();
        this.zzly = zzp52;
        zzp52.zze(zzp5.isClosed());
        this.zzlv = false;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        if (zzos.zzNu().getCount() == 0) {
            return true;
        }
        long j = zzos.zzNu().get(0);
        if (!this.zzlv) {
            this.zzlu = j;
            this.zzlv = true;
        }
        int i = 1;
        while (i < zzos.zzNu().getCount()) {
            long j2 = zzos.zzNu().get(i);
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzly.zzNY(), zzG(j, j2));
            i++;
            j = j2;
        }
        this.zzlt = j;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        if (!this.zzlv) {
            this.zzlu = zzpz.zzPX();
            this.zzlv = true;
        }
        zzZQG.zzZ((ArrayList<zzPZ>) this.zzly.zzNY(), zzpz);
        this.zzlt = zzpz.zzPW();
        return true;
    }
}
