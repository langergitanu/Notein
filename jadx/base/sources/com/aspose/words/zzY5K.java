package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5K {
    private static void zzM(Shading shading) {
        if (shading != null) {
            shading.zzTe("");
            shading.zzTd("");
            shading.zzBb("");
            shading.zzB9("");
            shading.zzB8("");
            shading.zzBa("");
        }
    }

    public static void zze(Row row) {
        zzM(row.zzZYf().getShading());
        Iterator<Integer> it = zzY6G.zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            zzw((Border) row.zzZYf().get(it.next().intValue()));
        }
    }

    public static void zzj(Cell cell) {
        zzM(cell.zz6G().getShading());
        for (int i : zzWP.zzZzT) {
            zzw((Border) cell.zz6G().get(i));
        }
    }

    private static void zzw(Border border) {
        if (border != null) {
            border.zzTe("");
            border.zzTd("");
            border.zzTf("");
        }
    }
}
