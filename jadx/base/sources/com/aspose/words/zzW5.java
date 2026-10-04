package com.aspose.words;

import com.aspose.words.zzFU;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzW5 {
    private boolean zzZye;
    private ChartSeries zzZyw;

    public zzW5(ChartSeries chartSeries, boolean z) {
        this.zzZyw = chartSeries;
        this.zzZye = z;
    }

    private zzKJ[] zzNU(int i) {
        this.zzZyw.zz2z();
        zzCE zzceZzZN4 = this.zzZyw.zz2z().zzZN4();
        zzCE zzceZzZN42 = this.zzZyw.zz2y().zzZN4();
        zzEA zzea = (zzEA) zzceZzZN4.zzKg(i);
        zzFU.zzZ zzzZzY = zzFU.zzY(zzceZzZN4, zzceZzZN42, i);
        if (zzzZzY == null) {
            return new zzKJ[0];
        }
        return new zzKJ[]{new zzKJ(this.zzZye ? zzzZzY.getCategoryCount() - 1 : zzzZzY.zzZNT(), i, zzea.zzZLe().size() - 1, !zzzZzY.zzZNQ())};
    }

    private zzKJ[] zzNV(int i) {
        zzFU.zzZ zzZ = zzFU.zzZ(this.zzZyw.zz2z().zzZN4(), this.zzZyw.zz2y().zzZN4(), i);
        zzKJ[] zzkjArr = new zzKJ[5];
        int i2 = 0;
        zzkjArr[0] = new zzKJ((zzZ.zzZNT() * 4) + zzZ.zzZNS(), i, 0, false);
        int iZzZNT = (zzZ.zzZNT() * 4) + zzZ.zzZNR() + 1;
        while (i2 < 4) {
            int i3 = i2 + 1;
            zzkjArr[i3] = new zzKJ(i2 + iZzZNT, i, -1, !zzZ.zzZNQ());
            i2 = i3;
        }
        return zzkjArr;
    }

    private zzKJ[] zzr(int i, boolean z) {
        ArrayList<zzFU.zzT> arrayListZzY = this.zzZyw.zz2f().zzY(this.zzZyw.zz2z().zzZN4());
        ArrayList arrayList = new ArrayList();
        int iZzZNL = i;
        for (zzFU.zzT zzt : arrayListZzY) {
            if (zzt.zzZNL() >= iZzZNL) {
                if (zzt.zzZNL() > iZzZNL) {
                    if (!z || iZzZNL > i) {
                        break;
                    }
                    iZzZNL = zzt.zzZNL();
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzKJ>) arrayList, new zzKJ(zzt.getIndex(), iZzZNL, zzt.zzZNM(), false));
            }
        }
        return (zzKJ[]) arrayList.toArray(new zzKJ[0]);
    }

    public final zzKJ[] zzs(int i, boolean z) {
        switch (this.zzZyw.zz6y()) {
            case 0:
                return zzNV(i);
            case 1:
                return this.zzZyw.zz2k().zzZI8() ? zzNU(i) : new zzKJ[0];
            case 2:
            case 4:
            case 7:
                return new zzKJ[]{new zzKJ(i, i, 0, false)};
            case 3:
                return new zzKJ[0];
            case 5:
            case 6:
                return zzr(i, z);
            default:
                return new zzKJ[]{new zzKJ(i, i, 0, false)};
        }
    }
}
