package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzND extends zzM6 {
    public zzND(String str, boolean z) {
        super(str, z);
    }

    @Override // com.aspose.words.zzM6
    public zzPS zzZ(zzL2 zzl2, boolean z, boolean z2) {
        if (zzl2.getCount() == 0) {
            return null;
        }
        zzPR zzpr = new zzPR();
        ArrayList<zzYBI> arrayListZzV = com.aspose.words.internal.zzZQG.zzV(zzZXv());
        int i = 0;
        while (i < zzl2.getCount()) {
            boolean z3 = false;
            int i2 = i;
            int i3 = 0;
            while (i3 < arrayListZzV.size() && !z3) {
                zzYBI zzybi = (zzYBI) arrayListZzV.get(i3);
                RefInt refInt = new RefInt(0);
                zzL2 zzl22 = zzl2;
                boolean z4 = z;
                boolean z5 = z2;
                zzPS zzpsZzY = zzybi.zzY(zzl22, i2, z4, z5, refInt);
                int i4 = refInt.get();
                if (zzpsZzY != null) {
                    zzpr.zzO(zzpsZzY);
                    arrayListZzV.remove(i3);
                    i2 += i4;
                    z3 = true;
                }
                i3++;
                zzl2 = zzl22;
                z = z4;
                z2 = z5;
            }
            zzL2 zzl23 = zzl2;
            boolean z6 = z;
            boolean z7 = z2;
            if (!z3) {
                return null;
            }
            zzl2 = zzl23;
            i = i2;
            z = z6;
            z2 = z7;
        }
        boolean z8 = z;
        if (zzpr.getCount() == 0) {
            return null;
        }
        for (zzYBI zzybi2 : arrayListZzV) {
            if (zzybi2.zzY84()) {
                return null;
            }
            zzPS zzpsZzQL = zzybi2.zzQL(z8);
            if (zzpsZzQL != null) {
                zzpr.zzO(zzpsZzQL);
            }
        }
        return zzpr.zzZWe();
    }
}
