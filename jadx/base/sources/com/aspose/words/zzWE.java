package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzWE extends zzYNE {
    private int zzZz9;
    private boolean zzZza;

    public zzWE(zzYN8 zzyn8, int i) {
        super(zzyn8);
        this.zzZz9 = i;
        this.zzZza = !zzyn8.zzYqk();
    }

    private boolean zzZ(zzZNO zzzno) {
        if (!zzzno.zzZ8G().zzYMe()) {
            return true;
        }
        int iZzYMd = zzzno.zzZ8G().zzYMd();
        int verticalAlignment = zzzno.zzZ8G().getVerticalAlignment();
        if (iZzYMd == 5) {
            return false;
        }
        if (iZzYMd == 1 && verticalAlignment == 3) {
            return false;
        }
        if (iZzYMd == 7 && this.zzZza) {
            return false;
        }
        return (iZzYMd == 6 && this.zzZza) ? false : true;
    }

    public static boolean zzv(ArrayList<zzUZ> arrayList) {
        Iterator<zzUZ> it = zzw(arrayList).iterator();
        while (it.hasNext()) {
            if (!zzYNE.zzx(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<zzUZ> zzw(ArrayList<zzUZ> arrayList) {
        ArrayList<zzUZ> arrayList2 = new ArrayList<>();
        Iterator<zzUZ> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList2, (Iterable) it.next().zz0c());
        }
        return arrayList2;
    }

    @Override // com.aspose.words.zzYNE
    public final void zz4x() throws Exception {
        ArrayList<zzUZ> arrayListZzw = zzw(zzYqD());
        int iMax = 0;
        for (zzUZ zzuz : arrayListZzw) {
            iMax = Math.max(zzZ(zzuz) + zzuz.getY(), iMax);
        }
        int y = (zzZ8m().zzYql().getY() + zzZ8m().zzYql().getHeight()) - iMax;
        if (y <= 0) {
            return;
        }
        if (this.zzZz9 == 1) {
            y /= 2;
        }
        for (zzUZ zzuz2 : arrayListZzw) {
            zzuz2.zzMG(y);
            if (zzuz2.zz09() != null) {
                zzuz2.zz09().zzMG(y);
            }
            if (zzuz2.zz08() != null) {
                zzuz2.zz08().zzMG(y);
            }
        }
        for (zzZNO zzzno : zzYqE()) {
            if (zzZ(zzzno)) {
                zzzno.zzMG(y);
            }
        }
    }

    private int zzZ(zzUZ zzuz) throws Exception {
        if (zzuz.isEmpty()) {
            return 0;
        }
        zzYMD zzymdZzY = zzYNE.zzY(zzuz.zz6w(), zzuz.zz6w().zz5Y());
        int bottom = zzymdZzY != null ? zzymdZzY.getBottom() : 0;
        com.aspose.words.internal.zzZQ5 zzzq5ZzV = zzYNE.zzV(zzuz, zzuz.getBottom());
        return Math.max(bottom, zzL(zzzq5ZzV) - zzzq5ZzV.getY()) + zzYNE.zzy(zzuz);
    }
}
