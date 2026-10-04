package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6G implements zzH2 {
    private zzOS zzGe;
    private zzP5 zzly;
    private zzP8 zzlz = new zzP8();
    private float zzlx = 0.15f;
    private float zzlw = 0.1f;

    public static zzP8 zzY(zzP8 zzp8, boolean z) throws Exception {
        zz6G zz6g = new zz6G();
        if (z) {
            zz6g.zzlx = 0.025f;
            zz6g.zzlw = 0.025f;
        } else {
            zz6g.zzlx = 0.15f;
            zz6g.zzlw = 0.1f;
        }
        zz6g.zzlx = zzAN.zzZ(zz6g.zzlx, 0.01f, 0.5f);
        float fZzZ = zzAN.zzZ(zz6g.zzlw, 0.01f, 0.5f);
        zz6g.zzlw = fZzZ;
        float f = zz6g.zzlx;
        if (fZzZ > f) {
            zz6g.zzlw = f;
        }
        zzp8.zzY(zz6g);
        zz6g.zzlz.zzY1(zzp8.zzO6());
        return zz6g.zzlz;
    }

    public static zzZG zzZ(zzZG zzzg, boolean z) throws Exception {
        zzZG zzzg2 = new zzZG(zzY(zzzg.zzZ0(), z));
        zzzg2.zzX(zzzg.zzZ2());
        zzzg2.zzY(zzzg.zzZ1());
        return zzzg2;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        zzP5 zzp52 = new zzP5();
        this.zzly = zzp52;
        zzp52.zze(zzp5.isClosed());
        this.zzGe = new zzOS();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        this.zzGe.zzNu().zzR(zzos.zzNu());
        this.zzGe.zzNv();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzZ(zzpz, this.zzlx, this.zzlw);
        this.zzGe.zzNv();
        return true;
    }

    private void zzZ(zzPZ zzpz, float f, float f2) {
        if (zzpz == null) {
            return;
        }
        zzPB zzpb = new zzPB(zzpz.zzPX(), zzpz.zzPW());
        float fZzY = (zzpb.zzq(zzpz.zzPL()) && zzpb.zzq(zzpz.zzPK())) ? 1.0f : zzY(zzpz, f, f2);
        float f3 = f;
        float f4 = 0.0f;
        while (f4 <= (fZzY / 2.0f) + 1.0f) {
            f3 += fZzY;
            if (zzpz.zzT(f4) > 0.003d || f3 >= f || f4 >= 1.0f) {
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                this.zzGe.zzNu().add(zzpz.zzU(f4));
                f3 = 0.0f;
            }
            f4 += fZzY;
        }
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        zzZQG.zzZ((ArrayList<zzOS>) this.zzly.zzNY(), this.zzGe);
        zzZQG.zzZ(this.zzlz.zzO7(), this.zzly);
        return true;
    }

    private static float zzY(zzPZ zzpz, float f, float f2) {
        float fZzPO = f / (((int) ((zzpz.zzPO() - 5.0d) / 10.0d)) + 1);
        return fZzPO < f2 ? f2 : fZzPO;
    }
}
