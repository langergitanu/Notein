package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVE implements zzH2 {
    private float zzGD;
    private zzP5 zzly;
    private zzP8 zzlz;

    private static int zzE(long j, long j2) {
        int i = (int) j;
        int i2 = (int) j2;
        if (Float.intBitsToFloat(i) <= Float.intBitsToFloat(i2)) {
            return (Float.intBitsToFloat(i) != Float.intBitsToFloat(i2) || zzZPY.zzYC(j) >= zzZPY.zzYC(j2)) ? 1 : -1;
        }
        return -1;
    }

    public static zzZG zzF(zzZG zzzg) throws Exception {
        if (zzzg.zzZ2() == null) {
            return zzzg;
        }
        zzZVE zzzve = new zzZVE();
        zzzve.zzlz = new zzP8();
        zzzve.zzGD = zzzg.zzZ2().getWidth();
        zzzg.zzZ0().zzY(zzzve);
        zzZG zzzg2 = new zzZG(zzzve.zzlz);
        zzzg2.zzX(null);
        zzzg2.zzY(zzzg.zzZ2().zzZ1());
        return zzzg2;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        zzZQG.zzZ(this.zzlz.zzO7(), this.zzly);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        return true;
    }

    private ArrayList<zzOS> zzY(zzOS zzos, boolean z) {
        long j;
        float f = z ? 0.01f : this.zzGD;
        zzOS zzos2 = new zzOS();
        zzOS zzos3 = new zzOS();
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        float fZzE = 0.0f;
        long j3 = 0;
        while (i2 < zzos.zzNu().getCount()) {
            if (i2 == 0) {
                j2 = z ? zzos.zzNu().get(zzos.zzNu().getCount() - 1) : zzos.zzNu().get(1);
                j3 = zzos.zzNu().get(i);
            }
            long j4 = i2 == zzos.zzNu().getCount() - 1 ? z ? zzos.zzNu().get(i) : zzos.zzNu().get(i2 - 1) : zzos.zzNu().get(i2 + 1);
            int i3 = (z && (i2 == 0 || i2 == zzos.zzNu().getCount() - 1)) ? 1 : i;
            float fZzE2 = (((i2 != zzos.zzNu().getCount() - 1 || z) ? zzE(j3, j4) : zzE(j2, j3)) * f) / 2.0f;
            if (i2 == 0) {
                fZzE = (zzE(j2, j3) * f) / 2.0f;
            }
            int i4 = i;
            zzPG zzpg = new zzPG(j3, j4);
            zzPG zzpg2 = new zzPG(j2, j3);
            zzPG zzpgZzM = zzpg.zzM(fZzE2);
            zzPG zzpgZzM2 = zzpg.zzM(-fZzE2);
            float f2 = f;
            long[] jArr = new long[1];
            long[] jArr2 = new long[1];
            if (zzPG.zzZ(zzpg, zzpg2)) {
                zzPG zzpgZzt = zzpg.zzt(j3);
                zzPG.zzZ(zzpgZzt, zzpgZzM, jArr);
                zzPG.zzZ(zzpgZzt, zzpgZzM2, jArr2);
            } else {
                zzPG zzpgZzM3 = zzpg2.zzM(fZzE);
                zzPG zzpgZzM4 = zzpg2.zzM(-fZzE);
                zzPG.zzZ(zzpgZzM3, zzpgZzM, jArr);
                zzPG.zzZ(zzpgZzM4, zzpgZzM2, jArr2);
            }
            int i5 = i2;
            if (i3 == 0) {
                j = j4;
                if (zzJ6.zzO(jArr2[i4], jArr[i4]) > 30.0f * f2) {
                    zzPG zzpgZzt2 = new zzPG(jArr2[i4], jArr[i4]).zzt(j3);
                    zzPG.zzZ(zzpgZzt2, zzpgZzM, jArr);
                    zzPG.zzZ(zzpgZzt2, zzpgZzM2, jArr2);
                }
            } else {
                j = j4;
            }
            zzos2.zzNu().add(jArr[i4]);
            zzos3.zzNu().add(jArr2[i4]);
            i2 = i5 + 1;
            j2 = j3;
            fZzE = fZzE2;
            i = i4;
            f = f2;
            j3 = j;
        }
        ArrayList<zzOS> arrayList = new ArrayList<>();
        if (z) {
            zzZQG.zzZ(arrayList, zzos2);
            zzos3.zzNu().reverse();
            zzZQG.zzZ(arrayList, zzos3);
            return arrayList;
        }
        zzos3.zzNu().reverse();
        zzos2.zzNu().zzR(zzos3.zzNu());
        zzZQG.zzZ(arrayList, zzos2);
        return arrayList;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        zzP5 zzp52 = new zzP5();
        this.zzly = zzp52;
        zzp52.zze(zzp5.isClosed());
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        Iterator<zzOS> it = zzY(zzos, this.zzly.isClosed()).iterator();
        while (it.hasNext()) {
            zzZQG.zzZ((ArrayList<zzOS>) this.zzly.zzNY(), it.next());
        }
        return true;
    }
}
