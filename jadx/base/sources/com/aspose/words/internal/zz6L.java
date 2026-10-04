package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6L implements zzHS {
    private float zzPp;

    public zz6L(float f) {
        this.zzPp = f;
    }

    private zz0M zzF(zzP8 zzp8) {
        zz0M zz0m = new zz0M();
        for (zzP5 zzp5 : zzp8.zzO7()) {
            Iterator<zzOW> it = zzp5.zzNY().iterator();
            int count = 0;
            while (it.hasNext()) {
                count += ((zzOS) it.next()).zzNu().getCount();
            }
            zzD9 zzd9 = new zzD9(count);
            Iterator<zzOW> it2 = zzp5.zzNY().iterator();
            while (it2.hasNext()) {
                zzOS zzos = (zzOS) it2.next();
                for (int i = 0; i < zzos.zzNu().getCount(); i++) {
                    zzd9.add(zzZc(zzos.zzNu().get(i)));
                }
            }
            zz0m.add(zzd9);
        }
        return zz0m;
    }

    private zz0M zzM(zzZG zzzg) {
        return zzF(zzzg.zzZ0());
    }

    private zzZG zzV(zz0M zz0m) {
        return new zzZG(zzW(zz0m));
    }

    private zzP8 zzW(zz0M zz0m) {
        zzP8 zzp8 = new zzP8();
        for (zzD9 zzd9 : zz0m) {
            zzP5 zzp5 = new zzP5();
            zzp5.zze(true);
            zzOS zzos = new zzOS();
            zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), zzos);
            for (int i = 0; i < zzd9.getCount(); i++) {
                zzos.zzNu().add(zzZ(zzd9.get(i)));
            }
            zzZQG.zzZ(zzp8.zzO7(), zzp5);
        }
        return zzp8;
    }

    private long zzZ(zzDA zzda) {
        float f = this.zzPp;
        return f == 1.0f ? zzZPY.zzG(zzda.zzuS, zzda.zzuR) : zzZPY.zzG(zzda.zzuS / f, zzda.zzuR / f);
    }

    private zzDA zzZc(long j) {
        return this.zzPp == 1.0f ? new zzDA(zzAN.zzZG(Float.intBitsToFloat((int) j)), zzAN.zzZG(zzZPY.zzYC(j))) : new zzDA(zzAN.zzZG(Float.intBitsToFloat((int) j) * this.zzPp), zzAN.zzZG(zzZPY.zzYC(j) * this.zzPp));
    }

    @Override // com.aspose.words.internal.zzHS
    public final zzZG zzN(zzZG zzzg) {
        zzTK zztk = new zzTK();
        zztk.zzZ(zzM(zzzg), 0);
        zz0M zz0m = new zz0M();
        zztk.zzZ(1, zz0m, 2);
        zzZG zzzgZzV = zzV(zz0m);
        if (zzzg.zzZ1() != null) {
            zzzgZzV.zzY(zzzg.zzZ1().zzPI());
        }
        if (zzzg.zzZ2() != null) {
            zzzgZzV.zzX(zzzg.zzZ2().zzNQ());
        }
        return zzzgZzV;
    }

    public final zzP8 zzY(zzP8 zzp8, zzP8 zzp82) {
        zzTK zztk = new zzTK();
        zztk.zzZ(zzF(zzp8), 1);
        zztk.zzZ(zzF(zzp82), 0);
        zz0M zz0m = new zz0M();
        zztk.zzZ(0, zz0m, 2);
        return zzW(zz0m);
    }
}
