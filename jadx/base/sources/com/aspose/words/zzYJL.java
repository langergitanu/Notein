package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJL {
    public static void zzW(Shape shape, int i) {
        for (zzGK zzgk : zzZR(shape)) {
            int count = zzgk.zzZPj().getCount();
            if (i < count) {
                zzgk.zzZPj().removeAt(i);
                return;
            }
            i -= count;
        }
        throw new IllegalStateException();
    }

    public static int zzZ(Shape shape, ChartSeries chartSeries) {
        ArrayList<zzGK> arrayListZzZR = zzZR(shape);
        int count = 0;
        if (arrayListZzZR.size() == 1) {
            return arrayListZzZR.get(0).zzZPj().zzC(chartSeries);
        }
        for (zzGK zzgk : arrayListZzZR) {
            int iZzC = zzgk.zzZPj().zzC(chartSeries);
            if (iZzC != -1) {
                return iZzC + count;
            }
            count += zzgk.zzZPj().getCount();
        }
        return -1;
    }

    public static int zzZP(Shape shape) {
        ArrayList<zzGK> arrayListZzZR = zzZR(shape);
        int count = 0;
        if (arrayListZzZR.size() == 1) {
            return arrayListZzZR.get(0).zzZPj().getCount();
        }
        Iterator<zzGK> it = arrayListZzZR.iterator();
        while (it.hasNext()) {
            count += it.next().zzZPj().getCount();
        }
        return count;
    }

    public static ChartSeries[] zzZQ(Shape shape) {
        ArrayList<zzGK> arrayListZzZR = zzZR(shape);
        ArrayList arrayList = new ArrayList();
        if (arrayListZzZR.size() == 1) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) arrayListZzZR.get(0).zzZPj());
        } else {
            Iterator<zzGK> it = arrayListZzZR.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) it.next().zzZPj());
            }
        }
        return (ChartSeries[]) arrayList.toArray(new ChartSeries[0]);
    }

    private static ArrayList<zzGK> zzZR(Shape shape) {
        shape.hasChart();
        return ((zzD8) shape.zzY9i()).zzZHX().zz45().zzZJf();
    }

    public static Iterable<zzGK> zzZS(Shape shape) {
        return zzZR(shape);
    }
}
